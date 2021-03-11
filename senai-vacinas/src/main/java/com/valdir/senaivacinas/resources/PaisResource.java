package com.valdir.senaivacinas.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valdir.senaivacinas.domain.Pais;
import com.valdir.senaivacinas.domain.dto.PaisDTO;
import com.valdir.senaivacinas.services.PaisService;

@RestController
@RequestMapping(value = "/paises")
public class PaisResource {

	@Autowired
	private PaisService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<PaisDTO> findById(@PathVariable Integer id) {
		Pais obj = service.findById(id);
		return ResponseEntity.ok().body(new PaisDTO(obj));
	}

	@GetMapping
	public ResponseEntity<List<PaisDTO>> findAll() {
		List<Pais> list = service.findAll();
		List<PaisDTO> listDTO = list.stream().map(obj -> new PaisDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}
