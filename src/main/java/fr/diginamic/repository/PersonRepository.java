package fr.diginamic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.model.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	List<Person> findByFirstName(String firstName);
	
	List<Person> findByFirstNameOrLastName (String firstName, String lastName);
	
	List<Person> findByAgeGreaterThan (int age);

	@Query("SELECT p FROM Person p WHERE p.age BETWEEN 40 AND 80")
	List<Person> findByAgeBetween();
	
}
