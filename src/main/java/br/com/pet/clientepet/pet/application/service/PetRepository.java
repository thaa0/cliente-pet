package br.com.pet.clientepet.pet.application.service;

import br.com.pet.clientepet.pet.domain.Pet;

public interface PetRepository {
	Pet salvaPet(Pet pet);
}