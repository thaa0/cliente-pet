package br.com.pet.clientepet.pet.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.pet.clientepet.pet.domain.Pet;
import br.com.pet.clientepet.pet.domain.Porte;
import br.com.pet.clientepet.pet.domain.SexoPet;
import br.com.pet.clientepet.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetClienteDetalhaResponse {
	private UUID idPet;
	private String nomePet;	
	private Porte porte;
	private TipoPet tipo;
	private String microchip;	
	private String raca;	
	private SexoPet sexo;
	private String pelagemCor;	
	private LocalDate dataNascimento;
	private String rga;	
	private Integer peso;	
	
	
	public PetClienteDetalhaResponse(Pet pet) {
		this.idPet = pet.getIdPet();
		this.nomePet = pet.getNomePet();
		this.porte = pet.getPorte();
		this.tipo = pet.getTipo();
		this.microchip = pet.getMicrochip();
		this.raca = pet.getRaca();
		this.sexo = pet.getSexo();
		this.pelagemCor = pet.getPelagemCor();
		this.dataNascimento = pet.getDataNascimento();
		this.rga = pet.getRga();
		this.peso = pet.getPeso();
	}
}