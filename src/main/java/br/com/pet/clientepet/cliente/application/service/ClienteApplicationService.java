package br.com.pet.clientepet.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.pet.clientepet.cliente.application.api.ClienteRequest;
import br.com.pet.clientepet.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[Inicia] ClienteApplicationService - criaCliente");
		log.info("[Finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
