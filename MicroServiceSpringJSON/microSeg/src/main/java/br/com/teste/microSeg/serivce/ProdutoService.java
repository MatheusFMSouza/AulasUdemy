package br.com.teste.microSeg.serivce;

import br.com.teste.microSeg.model.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProdutoService {


    public Produto find(Integer id) {
        RestTemplate restTemplate = new RestTemplate();

        Produto p = restTemplate.getForObject("http://localhost:3030/products/"+id, Produto.class);

        return p;
    }

}
