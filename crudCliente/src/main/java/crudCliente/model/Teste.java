package crudCliente.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Teste {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static void main(String[] args) {
		
		/* Find
		Cliente cliente = entityManager.find(Cliente.class, 1);		
		System.out.println("Nome do cliente:" + cliente.getNome());*/
		
		/* Insert 
		Cliente cliente = new Cliente();
		cliente.setNome("GOOGLE");
		
		entityManager.getTransaction().begin();		
		entityManager.persist(cliente);
		entityManager.getTransaction().commit(); */
		
		/* DELETE
		Cliente cliente = entityManager.find(Cliente.class, 2);
		entityManager.getTransaction().begin();		
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();*/
		
		// UPDATE
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("FACEBOOK INC.");
		entityManager.getTransaction().begin();		
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		
	}

}
