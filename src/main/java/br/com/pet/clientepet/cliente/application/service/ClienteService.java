package br.com.pet.clientepet.cliente.application.service;

import java.util.List;

import br.com.pet.clientepet.cliente.application.api.ClienteListResponse;
import br.com.pet.clientepet.cliente.application.api.ClienteRequest;
import br.com.pet.clientepet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}