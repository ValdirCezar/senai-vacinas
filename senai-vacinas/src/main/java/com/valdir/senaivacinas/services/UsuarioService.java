package com.valdir.senaivacinas.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.senaivacinas.domain.Usuario;
import com.valdir.senaivacinas.domain.dto.UsuarioDTO;
import com.valdir.senaivacinas.repositories.EnderecoRepository;
import com.valdir.senaivacinas.repositories.UsuarioRepository;
import com.valdir.senaivacinas.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	/*
	 * Busca de um Usuário por ID
	 */
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não contrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
	}

	/*
	 * Busca de todos os Usuários
	 */
	public List<UsuarioDTO> findAll() {
		List<Usuario> list = repository.findAll();
		List<UsuarioDTO> listDTO = list.stream().map(obj -> new UsuarioDTO(obj)).collect(Collectors.toList());
		return listDTO;
	}

	/*
	 * Criando um Usuário
	 */
	public @Valid UsuarioDTO create(@Valid UsuarioDTO obj) {
		Usuario newObj = UsuarioDTO.toModel(obj);
		newObj = repository.save(newObj);
		enderecoRepository.save(newObj.getEndereco());
		return new UsuarioDTO(newObj);
	}

	/*
	 * Atualizando um Usuário
	 */
	public @Valid UsuarioDTO update(@Valid UsuarioDTO obj, Integer id) {
		obj.setId(id);
		Usuario objUp = findById(id);
		objUp = repository.save(UsuarioDTO.toModel(obj));
		return new UsuarioDTO(objUp);
	}

}
