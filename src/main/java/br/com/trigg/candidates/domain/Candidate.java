package br.com.trigg.candidates.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Candidate implements Serializable {
	
	private static final long serialVersionUID = -3300213353528611349L;
	
	@JsonProperty("_id")
	private String id;
	
	@JsonProperty("nome")
    private String name;
	
	@JsonProperty("vaga")
    private String position;
	
	@JsonProperty("data_nascimento")
	private String birthDate;
		
}
