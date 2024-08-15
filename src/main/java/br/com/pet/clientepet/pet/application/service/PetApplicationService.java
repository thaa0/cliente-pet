package br.com.pet.clientepet.pet.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.pet.clientepet.cliente.application.service.ClienteService;
import br.com.pet.clientepet.pet.application.api.PetAlteracaoRequest;
import br.com.pet.clientepet.pet.application.api.PetClienteDetalhaResponse;
import br.com.pet.clientepet.pet.application.api.PetClienteListResponse;
import br.com.pet.clientepet.pet.application.api.PetRequest;
import br.com.pet.clientepet.pet.application.api.PetResponse;
import br.com.pet.clientepet.pet.application.repository.PetRepository;
import br.com.pet.clientepet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PetApplicationService implements PetService {
	private final PetRepository petRepository;
	private final ClienteService clienteService;
	
	@Override
	public PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[Inicia] PetApplicationService - criaPet");
		clienteService.buscaClienteAtravesId(idCliente);
		Pet pet = petRepository.salvaPet(new Pet(idCliente, petRequest));
		log.info("[Finaliza] PetApplicationService - criaPet");
		return new PetResponse(pet.getIdPet());
	}

	@Override
	public List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente) {
		log.info("[Inicia] PetApplicationService - buscaPetsDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		List<Pet> petsDoCliente = petRepository.buscaPetsDoClienteComId(idCliente);
		log.info("[Finaliza] PetApplicationService - buscaPetsDoClienteComId");
		return PetClienteListResponse.converte(petsDoCliente);
	}

	@Override
	public PetClienteDetalhaResponse buscaPetDoCliente(UUID idPet, UUID idCliente) {
		log.info("[Inicia] PetApplicationService - buscaPetDoCliente");
		clienteService.buscaClienteAtravesId(idCliente);
		Pet pet = petRepository.buscaPetPeloId(idPet);
		log.info("[Finaliza] PetApplicationService - buscaPetDoCliente");
		return new PetClienteDetalhaResponse(pet);
	}

	@Override
	public void deletaPetDoCliente(UUID idPet, UUID idCliente) {
		log.info("[Inicia] PetApplicationService - deletaPetDoCliente");
		clienteService.buscaClienteAtravesId(idCliente);
		Pet pet = petRepository.buscaPetPeloId(idPet);
		petRepository.deletaPetDoCliente(pet);
		log.info("[Finaliza] PetApplicationService - deletaPetDoCliente");		
	}

	@Override
	public void alteraPetDoCliente(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest) {
		log.info("[Inicia] PetApplicationService - alteraPetDoCliente");
		clienteService.buscaClienteAtravesId(idCliente);
		Pet pet = petRepository.buscaPetPeloId(idPet);
		pet.altera(petAlteracaoRequest); 
		petRepository.salvaPet(pet);
		log.info("[Inicia] PetApplicationService - alteraPetDoCliente");
	}
}