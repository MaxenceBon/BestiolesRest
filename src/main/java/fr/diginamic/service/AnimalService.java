package fr.diginamic.service;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.model.Animal;
import fr.diginamic.model.Species;
import fr.diginamic.repository.AnimalRepository;
import fr.diginamic.repository.SpeciesRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

@Service
public class AnimalService {

	@Autowired
	AnimalRepository animalRepository;
	
	public Animal create(@Valid Animal animalToCreate) {
//		if (animalToCreate.getId() != null) {
//			throw new BadRequestException();
//		}
		return this.animalRepository.save(animalToCreate);
	}
	
	public Animal update(@Valid Animal updateAnimal) {
		return this.animalRepository.save(updateAnimal);
	}
	
//	public Page<Animal> findAllPageable(Pageable pageable) {
//		return animalRepository.findAll(pageable);
//	}
	
	public Animal findById(Integer id) {
		return this.animalRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}
	
	public Animal delete(@Valid Animal deleteAnimal) {
		return deleteAnimal;
	}


}
