package br.com.trigg.candidates.converter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import br.com.trigg.candidates.domain.Candidate;
import br.com.trigg.candidates.domain.dto.CandidateDTO;

@Component
public class CandidateConverter {

	public CandidateDTO toCandidateDTO(final Candidate c) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

		return CandidateDTO.builder()
				.id(c.getId())
				.name(c.getName())
				.position(c.getPosition())
				.birthDate(LocalDate.parse(c.getBirthDate(), formatter))
				.age(Period.between(LocalDate.parse(c.getBirthDate(), formatter), LocalDate.now()).getYears())
				.build();
	}
}
