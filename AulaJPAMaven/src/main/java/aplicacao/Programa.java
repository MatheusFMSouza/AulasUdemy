package aplicacao;


import introducao.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);

        em.getTransaction().begin();
        em.remove(p);
        System.out.println("Apagado");
        em.getTransaction().commit();
        System.out.println("Pronto!");
        em.close();
        emf.close();

    }
}
