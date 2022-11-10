package br.com.trigg.candidates.domain.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CandidateDTO {
		
	private String id;
    private String name;
    private String position;
	private LocalDate birthDate;
	private int age;
	
}
