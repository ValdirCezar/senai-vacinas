package com.valdir.senaivacinas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valdir.senaivacinas.domain.dto.AgendamentoDTO;
import com.valdir.senaivacinas.services.AgendamentoService;

@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentoResource {

	@Autowired
	private AgendamentoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<AgendamentoDTO> findById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(service.findById(id));
	}

	@GetMapping(value = "/usuario")
	public ResponseEntity<List<AgendamentoDTO>> findAll(@RequestParam Integer id) {
		return ResponseEntity.ok().body(service.findAll(id));
	}

	@PostMapping
	public ResponseEntity<AgendamentoDTO> create(@RequestBody AgendamentoDTO obj) {
		obj = service.create(obj);
		return ResponseEntity.ok().build();
	}

}
