package emp_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import emp_dto.Emp_dto;

public class Emp_dao  {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void signup(Emp_dto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}


	public Emp_dto login(String email) {
	 Emp_dto  e	=entityManager.find(Emp_dto.class, email);
	 return e;
		
		
	}
	
}
