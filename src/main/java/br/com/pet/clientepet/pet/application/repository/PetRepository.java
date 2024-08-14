package br.com.pet.clientepet.pet.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.pet.clientepet.pet.domain.Pet;

public interface PetRepository {
	Pet salvaPet(Pet pet);
	List<Pet> buscaPetsDoClienteComId(UUID idCliente);
	Pet buscaPetPeloId(UUID idPet);
}