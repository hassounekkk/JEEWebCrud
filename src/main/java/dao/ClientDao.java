package dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.fstt.presistence.Client;
import ma.fstt.presistence.Etudiant;

public class ClientDao implements DAO<Client> {
	
	EntityManagerFactory emf;
	EntityManager em;
	public ClientDao() {
		// TODO Auto-generated constructor stub
		 this.emf =Persistence.createEntityManagerFactory("unit-me");
		 this.em = emf.createEntityManager();
	}



	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		 Query query = em.createQuery("select client from Client client ");
		 List<Client> listem = query.getResultList() ;
		return listem;
	}

	@Override
	public void save(Client t) {
		// TODO Auto-generated method stub
				
				// Transaction
				em.getTransaction().begin();
				// operation 
				em.persist(t);				
				em.getTransaction().commit();

	}


	@Override
	public void delete(Client t) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// operation 
		em.remove(t);				
		em.getTransaction().commit();
		
	}



	@Override
	public Client get(long id) {
		// TODO Auto-generated method stub
		Client client= em.find(Client.class, id);
		return client;
	}



	@Override
	public void update(Client t, String name, String prenom, String adresse, String phone) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		  t.setNom(name);
		  t.setPrenom(prenom);
		  t.setAdresse(adresse);
		  t.setPhone(phone);
		  em.getTransaction().commit();
	}

}
