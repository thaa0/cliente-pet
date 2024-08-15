package br.com.pet.clientepet.pet.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.pet.clientepet.handler.APIException;
import br.com.pet.clientepet.pet.application.repository.PetRepository;
import br.com.pet.clientepet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PetInfraRepository implements PetRepository {
	private final PetSpringDataJPARepository petSpringDataJPARepository;
	
	@Override
	public Pet salvaPet(Pet pet) {
		log.info("[Inicia] PetInfraRepository - salvaPet");
		petSpringDataJPARepository.save(pet);
		log.info("[Finaliza] PetInfraRepository - salvaPet");
		return pet;
	}

	@Override
	public List<Pet> buscaPetsDoClienteComId(UUID idCliente) {
		log.info("[Inicia] PetInfraRepository - buscaPetsDoClienteComId");
		var pets = petSpringDataJPARepository.findByIdClienteTutor(idCliente);
		log.info("[Finaliza] PetInfraRepository - buscaPetsDoClienteComId");
		return pets;
	}

	@Override
	public Pet buscaPetPeloId(UUID idPet) {
		log.info("[Inicia] PetInfraRepository - buscaPetPeloId");
		var pet = petSpringDataJPARepository.findById(idPet)
				.orElseThrow(()-> APIException.build(HttpStatus.NOT_FOUND, "Pet não encontrado"));
		log.info("[Finaliza] PetInfraRepository - buscaPetPeloId");
		return pet;
	}

	@Override
	public void deletaPetDoCliente(Pet pet) {
		log.info("[Inicia] PetInfraRepository - deletaPetDoCliente");
		petSpringDataJPARepository.delete(pet);
		log.info("[Finaliza] PetInfraRepository - deletaPetDoCliente");
		
	}
}