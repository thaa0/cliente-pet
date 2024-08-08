package br.com.pet.clientepet.cliente.application.service;

import br.com.pet.clientepet.cliente.application.api.ClienteRequest;
import br.com.pet.clientepet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}