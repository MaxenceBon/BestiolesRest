package fr.diginamic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.model.Species;
import fr.diginamic.service.SpeciesService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/species")
public class SpeciesController {

	@Autowired
	SpeciesService speciesService;
	
	@GetMapping("/{id}")
	public Species findOne(@PathVariable("id") Integer id) {
		return this.speciesService.findById(id);
	}
	
	@PostMapping
	public Species createSpecies(@RequestBody @Valid Species speciesToCreate) {
		return this.speciesService.create(speciesToCreate);
	}
	
    @PutMapping
    public Species updateSpecies(@PathVariable("id") Integer id, @RequestBody @Valid Species updateSpecies) {
		return this.speciesService.update(updateSpecies);
    }
    
    @DeleteMapping
    public Species deleteSpecies(@RequestBody @Valid Species updateSpecies) {
		return this.speciesService.delete(updateSpecies);
    }
	
}
