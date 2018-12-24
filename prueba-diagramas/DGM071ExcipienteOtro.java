package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;

public class DGM071ExcipienteOtro {

	private Long dgm071Id;
	private Integer secuenciaExcOtro;
	private String sustancia;
	private BigDecimal cantidad;
	private String unidadMedida;
	private String comentario;

	public Long getDgm071Id() {
		return dgm071Id;
	}

	public void setDgm071Id(Long dgm071Id) {
		this.dgm071Id = dgm071Id;
	}

	public Integer getSecuenciaExcOtro() {
		return secuenciaExcOtro;
	}

	public void setSecuenciaExcOtro(Integer secuenciaExcOtro) {
		this.secuenciaExcOtro = secuenciaExcOtro;
	}

	public String getSustancia() {
		return sustancia;
	}

	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
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
