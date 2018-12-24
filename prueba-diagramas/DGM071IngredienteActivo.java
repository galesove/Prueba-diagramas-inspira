package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;

public class DGM071IngredienteActivo {

	private Long dgm071Id;
	private Integer secuenciaIngAct;
	private String sustancia;
	private BigDecimal cantidadHidrato;
	private BigDecimal cantidadAnihidro;
	private String unidadMedida;
	private String comentario;

	public Long getDgm071Id() {
		return dgm071Id;
	}

	public void setDgm071Id(Long dgm071Id) {
		this.dgm071Id = dgm071Id;
	}

	public Integer getSecuenciaIngAct() {
		return secuenciaIngAct;
	}

	public void setSecuenciaIngAct(Integer secuenciaIngAct) {
		this.secuenciaIngAct = secuenciaIngAct;
	}

	public String getSustancia() {
		return sustancia;
	}

	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}

	public BigDecimal getCantidadHidrato() {
		return cantidadHidrato;
	}

	public void setCantidadHidrato(BigDecimal cantidadHidrato) {
		this.cantidadHidrato = cantidadHidrato;
	}

	public BigDecimal getCantidadAnihidro() {
		return cantidadAnihidro;
	}

	public void setCantidadAnihidro(BigDecimal cantidadAnihidro) {
		this.cantidadAnihidro = cantidadAnihidro;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
