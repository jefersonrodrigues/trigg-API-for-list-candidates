package br.com.trigg.candidates.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.trigg.candidates.domain.Job;

@Service
public class ReadJsonFile {
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	
	public List<Job> getCandidatesFromJson() throws IOException {
		TypeReference<List<Job>> typeReference = new TypeReference<List<Job>>() {};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/candidates.json");
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		return objectMapper.readValue(inputStream, typeReference);
	}
	
}
