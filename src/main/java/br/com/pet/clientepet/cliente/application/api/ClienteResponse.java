package br.com.pet.clientepet.cliente.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteResponse {
	private UUID idCliente;

}
