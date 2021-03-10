package com.valdir.senaivacinas.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.senaivacinas.domain.Usuario;
import com.valdir.senaivacinas.repositories.UsuarioRepository;

@Service
public class DBService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void instanciaDB() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Usuario u1 = new Usuario(null, "09129161924", "Valdir", "Cezar de Jesus", 1.75, 70.0, 'M', "43984634308",
				sdf.parse("12/02/1995"), false, null, "valdir@email.com", "123");

		usuarioRepository.saveAll(Arrays.asList(u1));
	}
}
