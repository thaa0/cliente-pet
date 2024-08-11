package br.com.pet.clientepet.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.pet.clientepet.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;
	private LocalDateTime dataHoraDoCadastro;
	private Boolean aceitaTermos;
	private Sexo sexo;
}