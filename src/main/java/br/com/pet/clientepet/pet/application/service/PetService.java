package br.com.pet.clientepet.pet.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.pet.clientepet.pet.application.api.PetAlteracaoRequest;
import br.com.pet.clientepet.pet.application.api.PetClienteDetalhaResponse;
import br.com.pet.clientepet.pet.application.api.PetClienteListResponse;
import br.com.pet.clientepet.pet.application.api.PetRequest;
import br.com.pet.clientepet.pet.application.api.PetResponse;

public interface PetService {
	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
	List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente);
	PetClienteDetalhaResponse buscaPetDoCliente(UUID idPet, UUID idCliente);
	void deletaPetDoCliente(UUID idPet, UUID idCliente);
	void alteraPetDoCliente(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest);
}
