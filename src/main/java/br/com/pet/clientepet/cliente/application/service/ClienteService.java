package br.com.pet.clientepet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.pet.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.pet.clientepet.cliente.application.api.ClienteListResponse;
import br.com.pet.clientepet.cliente.application.api.ClienteRequest;
import br.com.pet.clientepet.cliente.application.api.ClienteResponse;


public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
}