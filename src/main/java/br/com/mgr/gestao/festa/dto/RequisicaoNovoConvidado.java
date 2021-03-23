package br.com.mgr.gestao.festa.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.mgr.gestao.festa.dataprovider.model.Convidado;

public class RequisicaoNovoConvidado {

	@NotBlank
	private String nomeConvidado;

	@NotBlank
	@Min(0)
	private String quantidadeAcompanhantes;

	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

	public String getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(String quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

	public Convidado toConvidado() {
		Convidado convidado = new Convidado();
		convidado.setNome(this.nomeConvidado);
		convidado.setQuantidadeAcompanhantes(Integer.valueOf(this.quantidadeAcompanhantes));
		return convidado;
	}

}
