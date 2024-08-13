package br.com.pet.clientepet.pet.infra;

import org.springframework.stereotype.Repository;

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
}