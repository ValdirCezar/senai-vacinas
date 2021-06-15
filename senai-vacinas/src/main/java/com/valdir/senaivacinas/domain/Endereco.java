package com.valdir.senaivacinas.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
 
	@JsonIgnore
	private Usuario usuario;

	private Cidade cidade;

	private UnidadeAtendimento unidadeAtendimento;

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String numero, String complemento, String bairro, String cep, Usuario usuario,
			Cidade cidade) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.usuario = usuario;
		this.cidade = cidade;
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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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
