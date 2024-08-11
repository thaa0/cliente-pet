package br.com.pet.clientepet.cliente.application.repository;

import java.util.List;

import br.com.pet.clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}