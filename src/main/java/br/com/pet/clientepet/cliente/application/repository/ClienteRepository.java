package br.com.pet.clientepet.cliente.application.repository;

import br.com.pet.clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}