package br.com.teste.microOne.serivce;

import br.com.teste.microOne.model.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProdutoService {


    public Produto find(Integer id) {
        RestTemplate restTemplate = new RestTemplate();

        Produto p = restTemplate.getForObject("http://localhost:8081/produto/"+id, Produto.class);

        return p;
    }

}
