package com.valdir.senaivacinas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdir.senaivacinas.domain.Endereco;
import com.valdir.senaivacinas.domain.Usuario;

@Repository
public interface EnderecoRepository extends JpaRepository<Usuario, Integer>{

}
