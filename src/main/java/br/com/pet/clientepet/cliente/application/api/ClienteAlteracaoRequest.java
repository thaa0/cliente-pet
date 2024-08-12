package br.com.pet.clientepet.cliente.application.api;

import java.time.LocalDate;



import br.com.pet.clientepet.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {	
	private String nomeCompleto;	
	private String celular;
	private String telefone;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos;
}