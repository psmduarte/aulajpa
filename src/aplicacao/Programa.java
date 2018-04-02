package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa(null,"Paulo Duarte", "psmduarte@live.com");
		Pessoa p2 = new Pessoa(null,"Daniela Chambel", "danielachambel@hotmail.com");
		Pessoa p3 = new Pessoa(null,"Maria Duarte","não tem email");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("FEITO!");
		
		em.close();
		emf.close();
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
