package fr.diginamic.service;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.model.Animal;
import fr.diginamic.model.Person;
import fr.diginamic.repository.AnimalRepository;
import fr.diginamic.repository.PersonRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;
	
	public Person create(@Valid Person personToCreate) {
		return this.personRepository.save(personToCreate);
	}
	
	public Person update(@Valid Person updatePerson) {
		return this.personRepository.save(updatePerson);
	}
	
//	public Page<Person> findAll(Pageable pageable) {
//		return this.personRepository.findAll(pageable);
//	}
	
	public Person findById(Integer id) {
		return this.personRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}
	
	public Person delete(@Valid Person deletePerson) {
		return deletePerson;
	}
	
}
