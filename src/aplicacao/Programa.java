package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//para apagar pessoas da base de dados � necessario monitorar o objecto pessoa
		//ou seja, ou � uma pessoa acabada de inserir ou ent�o tem de ser fazer um find
		//da pessoa.
		Pessoa p = em.find(Pessoa.class, 1);
		em.getTransaction().begin(); //para realizar altera��es na base de dados � 
									 //preciso iniciar e comitar a transa��o
		em.remove(p);
		em.getTransaction().commit();//commit da transa��o
		System.out.println(p);
		
		System.out.println("FEITO!");
		em.close();
		emf.close();
		
		

		
	}

}
