package br.com.pet.clientepet.pet.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pet.clientepet.pet.domain.Pet;

public interface PetSpringDataJPARepository extends JpaRepository<Pet, UUID> {

}
