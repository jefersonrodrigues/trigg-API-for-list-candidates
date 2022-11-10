package br.com.trigg.candidates.service;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.trigg.candidates.converter.CandidateConverter;
import br.com.trigg.candidates.domain.dto.CandidateDTO;

@Service
public class CandidateService {
	
	@Autowired
	ReadJsonFile readJsonFile;
	
	@Autowired
	CandidateConverter converter;
		
	public List<CandidateDTO> getCandidates(Integer fromAge, Integer toAge) throws IOException {
		List<CandidateDTO> list = readJsonFile.getCandidatesFromJson().get(0).getCandidates()
				.stream()
				.map(converter::toCandidateDTO)
				.collect(Collectors.toList());
		return list
				.stream()
				.filter(c -> c.getAge() >= fromAge && c.getAge() <= toAge)
		        .sorted(Comparator.comparing(CandidateDTO::getBirthDate).reversed())
		        .collect(Collectors.toList());
	}
	
}
