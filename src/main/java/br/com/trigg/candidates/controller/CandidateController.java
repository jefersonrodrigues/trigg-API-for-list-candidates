package br.com.trigg.candidates.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.trigg.candidates.domain.dto.CandidateDTO;
import br.com.trigg.candidates.service.CandidateService;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

	@Autowired
	private CandidateService service;

	@GetMapping()
	public ResponseEntity<List<CandidateDTO>> getCandidatesList(
			@RequestParam(required = false) Integer fromAge,
			@RequestParam(required = false) Integer toAge) throws IOException {

		if (fromAge != null && toAge != null) {
			return ResponseEntity.ok().body(service.getCandidates(fromAge, toAge));
		} else if (fromAge != null && toAge == null) {
			return ResponseEntity.ok().body(service.getCandidates(fromAge, 100));
		} else if(fromAge == null && toAge != null) {
			return ResponseEntity.ok().body(service.getCandidates(0, toAge));
		} else {
			return ResponseEntity.ok().body(service.getCandidates(0, 100));
		}
	}
}
