package br.com.trigg.candidates.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job implements Serializable {

		private static final long serialVersionUID = 8231489759230208226L;
		
		@JsonProperty("recrutador")
		private String recruiter;
		
		@JsonProperty("dtAberturaVaga")
	    private String openingDate;
		
		@JsonProperty("candidatos")
	    private List<Candidate> candidates;
}
