package br.com.matheusudemy.kafka.ibgewrapper.gateway.listener;

import br.com.matheusudemy.kafka.ibgewrapper.gateway.json.EstadoJSON;
import br.com.matheusudemy.kafka.ibgewrapper.gateway.json.EstadoList;
import br.com.matheusudemy.kafka.ibgewrapper.services.estado.ConsultarEstadoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoListener {

    @Autowired
    private ConsultarEstadoService consultarEstadoService;

    @KafkaListener(topics = "${kafka.topic.request-topic}")
    public Message<String> execute(@Header(KafkaHeaders.REPLY_TOPIC) byte[] replyTo,
                                   @Header(KafkaHeaders.CORRELATION_ID) byte[] correlation) throws JsonProcessingException {

        long tempoInicial = System.currentTimeMillis();

        ObjectMapper mapper = new ObjectMapper();

        List<EstadoJSON> listEstados = consultarEstadoService.execute();

        String jsonReturn = mapper.writeValueAsString(EstadoList.builder().list(listEstados).build());

        System.out.printf("Dentro do Listener de estado: %.3f ms%n", (System.currentTimeMillis() - tempoInicial) / 1000d);

        return MessageBuilder.withPayload(jsonReturn)
                .setHeader(KafkaHeaders.TOPIC, replyTo)
                .setHeader(KafkaHeaders.CORRELATION_ID, correlation)
                .build();

    }

}