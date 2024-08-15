package br.com.pet.clientepet.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.pet.clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
}