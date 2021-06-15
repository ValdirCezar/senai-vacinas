package com.valdir.senaivacinas.domain.dto;

import java.io.Serializable;

import com.valdir.senaivacinas.domain.Cidade;
import com.valdir.senaivacinas.domain.Endereco;
import com.valdir.senaivacinas.domain.UnidadeAtendimento;
import com.valdir.senaivacinas.domain.Usuario;

public class EnderecoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String logradouro;

	private String numero;

	private String bairro;

	private String cep;

	private Usuario usuario;

	private Cidade cidade;

	private UnidadeAtendimento unidadeAtendimento;

	public EnderecoDTO() {
		super();
	}

	public EnderecoDTO(Endereco obj) {
		super();
		this.logradouro = obj.getLogradouro();
		this.numero = obj.getNumero();
		this.bairro = obj.getBairro();
		this.cep = obj.getCep();
		this.usuario = obj.getUsuario();
		this.cidade = obj.getCidade();
		this.unidadeAtendimento = obj.getUnidadeAtendimento();
	}

	public static Endereco fromDTO(Endereco obj) {
		Endereco newObj = new Endereco(obj.getLogradouro(), obj.getNumero(), obj.getComplemento(), obj.getBairro(),
				obj.getCep(), obj.getUsuario(), obj.getCidade());
		return newObj;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public UnidadeAtendimento getUnidadeAtendimento() {
		return unidadeAtendimento;
	}

	public void setUnidadeAtendimento(UnidadeAtendimento unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}

}
