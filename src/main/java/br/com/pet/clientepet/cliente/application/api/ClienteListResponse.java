package br.com.pet.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.pet.clientepet.cliente.domain.Cliente;

public class ClienteListResponse {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		// TODO Auto-generated method stub
		return null;
	}
}
