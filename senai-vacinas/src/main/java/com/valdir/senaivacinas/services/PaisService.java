package com.valdir.senaivacinas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.senaivacinas.domain.Pais;
import com.valdir.senaivacinas.repositories.PaisRepository;

@Service
public class PaisService {

	@Autowired
	private PaisRepository repository;
	
	public Pais findById(Integer id) {
		Optional<Pais> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Pais> findAll() {
		return repository.findAll();
	}
}
