package br.com.aplicacao;

import br.com.introducao.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(1,"Matheus Fideles","matheuss.fideles@hotmail.com");
        Pessoa p2 = new Pessoa(2,"Fideles","matheuss.fideles@hotmail.com");
        Pessoa p3 = new Pessoa(3,"Matheus","matheuss.fideles@hotmail.com");

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }
}
