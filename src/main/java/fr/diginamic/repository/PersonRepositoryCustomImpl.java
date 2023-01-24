//package fr.diginamic.repository;
//
//import java.util.List;
//
//import fr.diginamic.model.Person;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//
//public class PersonRepositoryCustomImpl implements PersonRepositoryCustom{
//
//	@PersistenceContext
//	private EntityManager em;
//	
//	
//	public Person uneMethodePerso() {
//	Person p = new Person();
//	p.setFirstName("Entity");
//	p.setLastName("Manager");
//	em.persist(p);
//	return p;
//	}
//
//	
//}
