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
import fr.diginamic.service.AnimalService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/animal")
public class AnimalController {

	@Autowired
	AnimalService animalService;
	
	@GetMapping("/{id}")
	public Animal findById(@PathVariable("id") Integer id) {
		return animalService.findById(id);
	}
	
	@PostMapping
	public Animal createAnimal(@RequestBody @Valid Animal animalToCreate) {
		return animalService.create(animalToCreate);
	}
	
    @PutMapping
    public Animal updateAnimal(@PathVariable("id") Integer id, @RequestBody @Valid Animal updateAnimal) {
		return animalService.update(updateAnimal);
    }
    
    @DeleteMapping
    public Animal deleteAnimal(@RequestBody @Valid Animal updateAnimal) {
		return animalService.delete(updateAnimal);
    }
    
//    public Page<Animal> findAllPageable(
//    		@RequestParam(value = "page", defaultValue = "0") Integer pageNumber, 
//    		@RequestParam(value = "size", defaultValue = "10") Integer pageSize)
//    {
//    	return animalService.findAllPageable(PageRequest.of(pageNumber, pageSize));
//    }
	
}
