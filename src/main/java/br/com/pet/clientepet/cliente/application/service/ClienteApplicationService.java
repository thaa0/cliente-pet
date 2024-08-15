package br.com.pet.clientepet.cliente.application.service;


import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.pet.clientepet.cliente.application.api.ClienteAlteracaoRequest;
import br.com.pet.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.pet.clientepet.cliente.application.api.ClienteListResponse;
import br.com.pet.clientepet.cliente.application.api.ClienteRequest;
import br.com.pet.clientepet.cliente.application.api.ClienteResponse;
import br.com.pet.clientepet.cliente.application.repository.ClienteRepository;
import br.com.pet.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[Inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[Finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[Inicia] ClienteApplicationService - buscaTodosCliente");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[Finaliza] ClienteApplicationService - buscaTodosCliente");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[Inicia] ClienteApplicationService - buscaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		log.info("[Finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public void deletaClienteAtravesId(UUID idCliente) {
		log.info("[Inicia] ClienteApplicationService - deletaClienteAtravesId");
		clienteRepository.deletaClienteAtravesId(idCliente);
		log.info("[Finaliza] ClienteApplicationService - deletaClienteAtravesId");
	}

	@Override
	public void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
		log.info("[Inicia] ClienteApplicationService - patchAlteraCliente");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		cliente.altera(clienteAlteracaoRequest);
		clienteRepository.salva(cliente);
		log.info("[Inicia] ClienteApplicationService - patchAlteraCliente");
	}
}