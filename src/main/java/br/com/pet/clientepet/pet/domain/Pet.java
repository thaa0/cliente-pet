package br.com.pet.clientepet.pet.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.pet.clientepet.pet.application.api.PetAlteracaoRequest;
import br.com.pet.clientepet.pet.application.api.PetRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(columnDefinition = "uuid",name="id", updatable = false, unique = true,nullable = false)
	private UUID idPet;
	@NotNull
	@Column(columnDefinition = "uuid",name="idClienteTutor", updatable = false, nullable = false)
	private UUID idClienteTutor;
	@NotBlank
	private String nomePet;	
	@Enumerated(EnumType.STRING)
	private Porte porte;
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoPet tipo;
	private String microchip;	
	@NotBlank
	private String raca;	
	@NotNull
	@Enumerated(EnumType.STRING)
	private SexoPet sexo;
	private String pelagemCor;	
	@NotNull
	private LocalDate dataNascimento;
	private String rga;	
	private Integer peso;	
		
	public Pet(UUID idCliente, @Valid PetRequest petRequest) {
		this.idClienteTutor = idCliente;
		this.nomePet = petRequest.getNomePet();
		this.porte = petRequest.getPorte();
		this.tipo = petRequest.getTipo();
		this.microchip = petRequest.getMicrochip();
		this.raca = petRequest.getRaca();
		this.sexo = petRequest.getSexo();
		this.pelagemCor = petRequest.getPelagemCor();
		this.dataNascimento = petRequest.getDataNascimento();
		this.rga = petRequest.getRga();
		this.peso = petRequest.getPeso();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public void altera(PetAlteracaoRequest petRequest) {
		this.nomePet = petRequest.getNomePet();
		this.porte = petRequest.getPorte();
		this.tipo = petRequest.getTipo();
		this.microchip = petRequest.getMicrochip();
		this.raca = petRequest.getRaca();
		this.sexo = petRequest.getSexo();
		this.pelagemCor = petRequest.getPelagemCor();
		this.dataNascimento = petRequest.getDataNascimento();
		this.rga = petRequest.getRga();
		this.peso = petRequest.getPeso();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}
	
}