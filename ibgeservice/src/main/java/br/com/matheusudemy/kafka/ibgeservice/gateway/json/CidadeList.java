package br.com.matheusudemy.kafka.ibgeservice.gateway.json;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CidadeList implements Serializable {
    private List<CidadeJSON> list;
}