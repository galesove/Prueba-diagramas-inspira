package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM017ExcipienteOtros {

	private Long dgm017Id;
	private Integer secuenciaExipienteOtro;
	private String sustancia;
	private BigDecimal cantidad;
	private String unidadMedida;
	private String comentario;
	
	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
	}

	public void setSecuenciaExipienteOtro(Integer secuenciaExipienteOtro) {
		this.secuenciaExipienteOtro = secuenciaExipienteOtro;
	}

	public Integer getSecuenciaExipienteOtro() {
		return secuenciaExipienteOtro;
	}

	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}

	public String getSustancia() {
		return sustancia;
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
