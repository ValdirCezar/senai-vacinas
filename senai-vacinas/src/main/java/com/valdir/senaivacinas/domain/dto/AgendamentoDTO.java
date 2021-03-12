package com.valdir.senaivacinas.domain.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.valdir.senaivacinas.domain.Agendamento;
import com.valdir.senaivacinas.domain.UnidadeAtendimento;
import com.valdir.senaivacinas.domain.Usuario;

public class AgendamentoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Campo DATA é mandatório")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date data;

	private Boolean finalizado;
	private String observacoes;

	@NotEmpty(message = "Campo USUARIO é mandatório")
	private Usuario usuario;

	@NotEmpty(message = "Campo UNIDADE DE ATENDIMENTO é mandatório")
	private UnidadeAtendimento unidadeAtendimento;

	public AgendamentoDTO() {
		super();
	}

	public AgendamentoDTO(Agendamento obj) {
		super();
		this.id = obj.getId();
		this.data = obj.getData();
		this.finalizado = obj.getFinalizado();
		this.observacoes = obj.getObservações();
		this.usuario = obj.getUsuario();
		this.unidadeAtendimento = obj.getUnidadeAtendimento();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	public String getObservações() {
		return observacoes;
	}

	public void setObservações(String observações) {
		this.observacoes = observações;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UnidadeAtendimento getUnidadeAtendimento() {
		return unidadeAtendimento;
	}

	public void setUnidadeAtendimento(UnidadeAtendimento unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}

}
