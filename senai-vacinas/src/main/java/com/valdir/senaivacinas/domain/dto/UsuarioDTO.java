package com.valdir.senaivacinas.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.valdir.senaivacinas.domain.Agendamento;
import com.valdir.senaivacinas.domain.Endereco;
import com.valdir.senaivacinas.domain.Usuario;

public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Campo CPF é mandatório")
	private String cpf;

	@NotEmpty(message = "Campo NOME é mandatório")
	private String nome;

	@NotEmpty(message = "Campo SOBRENOME é mandatório")
	private String sobrenome;

	@NotEmpty(message = "Campo ALTURA é mandatório")
	private Double altura;

	@NotEmpty(message = "Campo PESO é mandatório")
	private Double peso;

	@NotEmpty(message = "Campo SEXO é mandatório")
	private Character sexo;

	@NotEmpty(message = "Campo TELEFONE é mandatório")
	private String telefone;

	@NotEmpty(message = "Campo DATA DE NASCIMENTO é mandatório")
	private Date dataDeNascimento;

	private Integer idade;
	private Boolean obeso;
	private Boolean deficiente;
	private String tipoDeDeficiencia;

	@NotEmpty(message = "Campo E-MAIL é mandatório")
	private String email;

	@NotEmpty(message = "Campo SENHA é mandatório")
	private String senha;

	@NotEmpty(message = "Campo ENDERECO é mandatório")
	private Endereco endereco;

	private List<Agendamento> agendamentos = new ArrayList<>();

	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(Usuario obj) {
		super();
		this.id = obj.getId();
		this.cpf = obj.getCpf();
		this.nome = obj.getNome();
		this.sobrenome = obj.getSobrenome();
		this.altura = obj.getAltura();
		this.peso = obj.getPeso();
		this.sexo = obj.getSexo();
		this.telefone = obj.getTelefone();
		this.dataDeNascimento = obj.getDataDeNascimento();
		this.idade = obj.getIdade();
		this.obeso = obj.getObeso();
		this.deficiente = obj.getDeficiente();
		this.tipoDeDeficiencia = obj.getTipoDeDeficiencia();
		this.email = obj.getEmail();
		this.senha = obj.getSenha();
		this.endereco = obj.getEndereco();
		this.agendamentos = obj.getAgendamentos();
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

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}

}
