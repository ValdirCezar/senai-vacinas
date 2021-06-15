package com.valdir.senaivacinas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdir.senaivacinas.domain.Agendamento;
import com.valdir.senaivacinas.domain.Usuario;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
	
	List<Agendamento> findByUsuario(Usuario usuario);
}
