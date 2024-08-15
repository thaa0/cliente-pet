package br.com.pet.clientepet.pet.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.pet.clientepet.pet.application.service.PetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements petAPI {
	private final PetService petService;
	
	@Override
	public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[Inicia] PetController - postPet");
		log.info("[idCliente] + {}", idCliente);
		PetResponse pet = petService.criaPet(idCliente,petRequest);
		log.info("[Finaliza] PetController - postPet");
		return pet;
	}

	@Override
	public List<PetClienteListResponse> getTodosPetsdoCliente(UUID idCliente) {
		log.info("[Inicia] PetController - getTodosPetsdoIdCiente");
		log.info("[idCliente] + {}", idCliente);
		List<PetClienteListResponse> petsDoCliente = petService.buscaPetsDoClienteComId(idCliente);
		log.info("[Finaliza] PetController - getTodosPetsdoIdCiente");
		return petsDoCliente;
	}

	@Override
	public PetClienteDetalhaResponse getPetdoCliente(UUID idCliente, UUID idPet) {
		log.info("[Inicia] PetController - getTodosPetsdoIdCiente");
		log.info("[idCliente] + {}", idCliente);
		log.info("[idPet] + {}", idPet);
		PetClienteDetalhaResponse pet = petService.buscaPetDoCliente(idPet, idCliente);
		log.info("[Finaliza] PetController - getTodosPetsdoIdCiente");
		return pet;
	}

	@Override
	public void DeletePetdoCliente(UUID idCliente, UUID idPet) {
		log.info("[Inicia] PetController - DeletePetdoCliente");
		log.info("[idCliente] + {}", idCliente);
		log.info("[idPet] + {}", idPet);
		petService.deletaPetDoCliente(idPet, idCliente);
		log.info("[Finaliza] PetController - DeletePetdoCliente");
	}

	@Override
	public void alteraPetdoCliente(@Valid PetAlteracaoRequest petAlteracaoRequest, UUID idCliente, UUID idPet) {
		log.info("[Inicia] PetController - alteraPetdoCliente");
		log.info("[idCliente] + {}", idCliente);
		log.info("[idPet] + {}", idPet);
		petService.alteraPetDoCliente(idCliente, idPet, petAlteracaoRequest);
		log.info("[Finaliza] PetController - alteraPetdoCliente");		
	}
}