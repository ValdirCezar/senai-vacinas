package com.valdir.senaivacinas.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valdir.senaivacinas.domain.UnidadeAtendimento;
import com.valdir.senaivacinas.domain.dto.UnidadeAtendimentoDTO;
import com.valdir.senaivacinas.services.UnidadeAtendimentoService;

@RestController
@RequestMapping(value = "/unidade_atendimento")
public class UnidadeAtendimentoResource {

	@Autowired
	private UnidadeAtendimentoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UnidadeAtendimentoDTO> findById(@PathVariable Integer id) {
		UnidadeAtendimento obj = service.findById(id);
		return ResponseEntity.ok().body(new UnidadeAtendimentoDTO(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<UnidadeAtendimentoDTO>> findAll() {
		List<UnidadeAtendimento> list = service.findAll();
		List<UnidadeAtendimentoDTO> listDTO = list.stream().map(obj -> new UnidadeAtendimentoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}
