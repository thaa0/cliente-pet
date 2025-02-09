package br.com.pet.clientepet.pet.application.api;

import java.time.LocalDate;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import br.com.pet.clientepet.pet.domain.Porte;
import br.com.pet.clientepet.pet.domain.SexoPet;
import br.com.pet.clientepet.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetAlteracaoRequest {
	@NotBlank
	private String nomePet;	
	private Porte porte;
	@NotNull
	private TipoPet tipo;
	private String microchip;	
	@NotBlank
	private String raca;	
	@Enumerated(EnumType.STRING)
	@NotNull
	private SexoPet sexo;
	private String pelagemCor;	
	@NotNull
	private LocalDate dataNascimento;
	private String rga;	
	private Integer peso;	
}