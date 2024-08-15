package br.com.pet.clientepet.pet.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.pet.clientepet.pet.domain.Pet;
import br.com.pet.clientepet.pet.domain.TipoPet;
import lombok.Getter;

@Getter
public class PetClienteListResponse {
	private String nomePet;	
	private TipoPet tipo;
	private String raca;	
	private String pelagemCor;	
	private LocalDate dataNascimento;
	
	public static List<PetClienteListResponse> converte(List<Pet> petsDoCliente) {
		return petsDoCliente.stream()
				.map(PetClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public PetClienteListResponse(Pet pet) {
		this.nomePet = pet.getNomePet();
		this.tipo = pet.getTipo();
		this.raca = pet.getRaca();
		this.pelagemCor = pet.getPelagemCor();
		this.dataNascimento = pet.getDataNascimento();
	}

}
