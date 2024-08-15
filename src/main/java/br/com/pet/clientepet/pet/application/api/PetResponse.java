package br.com.pet.clientepet.pet.application.api;

import java.util.UUID;
import lombok.Value;

@Value
public class PetResponse {
	private UUID idPet;
}