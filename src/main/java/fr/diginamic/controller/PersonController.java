package fr.diginamic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.model.Animal;
import fr.diginamic.model.Person;
import fr.diginamic.service.PersonService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/person")
public class PersonController {

	@Autowired
	PersonService personService;
	
	@GetMapping("/{id}")
	public Person findOne(@PathVariable("id") Integer id) {
		return this.personService.findById(id);
	}
	
	@PostMapping
	public Person createPerson(@RequestBody @Valid Person personToCreate) {
		return this.personService.create(personToCreate);
	}
	
    @PutMapping
    public Person updatePerson(@PathVariable("id") Integer id, @RequestBody @Valid Person updatePerson) {
		return this.personService.update(updatePerson);
    }
    
    @DeleteMapping
    public Person deletePerson(@RequestBody @Valid Person updatePerson) {
		return this.personService.delete(updatePerson);
    }
	
//    public Page<Person> findAllPageable(@RequestParam Integer pageNumber, @RequestParam Integer pageSize){
//    	return personService.findAllPageable(PageRequest.of(pageNumber, pageSize));
//    }
}
