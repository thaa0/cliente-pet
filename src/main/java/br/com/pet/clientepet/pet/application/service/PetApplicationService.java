package br.com.pet.clientepet.pet.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.pet.clientepet.pet.application.api.PetRequest;
import br.com.pet.clientepet.pet.application.api.PetResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PetApplicationService implements PetService {

	@Override
	public PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[Inicia] PetApplicationService - criaPet");
		log.info("[Finaliza] PetApplicationService - criaPet");
		return null;
	}

}
