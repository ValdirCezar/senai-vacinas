package com.valdir.senaivacinas.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(unique = true)
	private String cpf;

	private String nome;
	private String sobrenome;
	private Float peso;
	private Character sexo;

	@Column(unique = true)
	private String telefone;

	private Date dataDeNascimento;
	private Byte idade;
	private Boolean obeso;
	private Boolean deficiente;
	private String tipoDeDeficiencia;

	@Column(unique = true)
	private String email;

	@JsonIgnore
	private String senha;

	public Usuario() {
		super();
	}

	public Usuario(Integer id, String cpf, String nome, String sobrenome, Float peso, Character sexo, String telefone,
			Date dataDeNascimento, Byte idade, Boolean obeso, Boolean deficiente, String tipoDeDeficiencia,
			String email, String senha) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.peso = peso;
		this.sexo = sexo;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
		this.idade = idade;
		this.obeso = obeso;
		this.deficiente = deficiente;
		this.tipoDeDeficiencia = tipoDeDeficiencia;
		this.email = email;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Byte getIdade() {
		return idade;
	}

	public void setIdade(Byte idade) {
		this.idade = idade;
	}

	public Boolean getObeso() {
		return obeso;
	}

	public void setObeso(Boolean obeso) {
		this.obeso = obeso;
	}

	public Boolean getDeficiente() {
		return deficiente;
	}

	public void setDeficiente(Boolean deficiente) {
		this.deficiente = deficiente;
	}

	public String getTipoDeDeficiencia() {
		return tipoDeDeficiencia;
	}

	public void setTipoDeDeficiencia(String tipoDeDeficiencia) {
		this.tipoDeDeficiencia = tipoDeDeficiencia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
