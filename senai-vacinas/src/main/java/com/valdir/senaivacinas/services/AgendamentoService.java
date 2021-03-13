package com.valdir.senaivacinas.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.senaivacinas.domain.Agendamento;
import com.valdir.senaivacinas.domain.UnidadeAtendimento;
import com.valdir.senaivacinas.domain.Usuario;
import com.valdir.senaivacinas.domain.dto.AgendamentoDTO;
import com.valdir.senaivacinas.repositories.AgendamentoRepository;
import com.valdir.senaivacinas.repositories.UnidadeAtendimentoRepository;
import com.valdir.senaivacinas.repositories.UsuarioRepository;
import com.valdir.senaivacinas.services.exceptions.DataIntegrityViolationException;
import com.valdir.senaivacinas.services.exceptions.ObjectNotFoundException;

@Service
public class AgendamentoService {

	@Autowired
	private AgendamentoRepository repository;
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private UnidadeAtendimentoRepository unidadeRepository;
	@Autowired
	private UnidadeAtendimentoService unidadeService;

	public AgendamentoDTO findById(Integer id) {
		Optional<Agendamento> obj = repository.findById(id);
		return new AgendamentoDTO(obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não contrado! Id: " + id + ", Tipo: " + Agendamento.class.getName())));
	}

	public List<AgendamentoDTO> findAll() {
		List<Agendamento> list = repository.findAll();
		return list.stream().map(obj -> new AgendamentoDTO(obj)).collect(Collectors.toList());
	}

	public AgendamentoDTO create(AgendamentoDTO obj) {
		return new AgendamentoDTO(updateData(obj));
	}
	
	private Agendamento updateData(AgendamentoDTO obj) {
		obj.setId(null);
		Usuario user = usuarioService.findById(obj.getUsuario().getId());
		System.out.println(user.getNome());
		UnidadeAtendimento unidadeAtendimento = unidadeService.findById(obj.getUnidadeAtendimento().getId());
		Agendamento newObj = AgendamentoDTO.toModel(obj);
		
		newObj.setUsuario(user);
		newObj.setUnidadeAtendimento(unidadeAtendimento);
		
		if(user.getAgendamentos().size() < 2) {
			user.getAgendamentos().add(newObj);
		} else {
			throw new DataIntegrityViolationException("Usuário já possui dois agendamento e não pode realizar mais agendamentos!");
		}
		
		unidadeAtendimento.getAgendamentos().add(newObj);
		usuarioRepository.save(user);
		unidadeRepository.save(unidadeAtendimento);
		return repository.save(newObj);
	}

}

















