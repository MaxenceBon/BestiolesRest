package fr.diginamic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.diginamic.model.Species;
import fr.diginamic.repository.SpeciesRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

@Service
public class SpeciesService {

	@Autowired
	SpeciesRepository speciesRepository;
	
	public Species create(@Valid Species speciesToCreate) {
		return this.speciesRepository.save(speciesToCreate);
	}
	
	public Species update(@Valid Species updateSpecies) {
		return this.speciesRepository.save(updateSpecies);
	}
	
//	public Page<Species> findAllPageable(Pageable pageable) {
//		return speciesRepository.findAll(pageable);
//	}
	
	public Species findById(Integer id) {
		return this.speciesRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}
	
	public Species delete(@Valid Species deleteSpecies) {
		return deleteSpecies;
	}
}
