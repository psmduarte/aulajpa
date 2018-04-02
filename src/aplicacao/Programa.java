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
		
		//para apagar pessoas da base de dados é necessario monitorar o objecto pessoa
		//ou seja, ou é uma pessoa acabada de inserir ou então tem de monitorizar (por exem atravez de um find
		//dessa pessoa).
		Pessoa p = em.find(Pessoa.class, 1);
		em.getTransaction().begin(); //para realizar alterações na base de dados é 
									 //preciso iniciar e comitar a transação
		em.remove(p);
		em.getTransaction().commit();//commit da transação
		System.out.println(p);
		
		System.out.println("FEITO!");
		em.close();
		emf.close();
		
		

		
	}

}
