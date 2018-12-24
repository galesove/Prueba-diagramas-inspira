package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;


public class DGM036PrincipioActivo {

	private Long dgm036Id;
	private Integer secuenciaPrincActivo;
	private String sustancia;
	private BigDecimal sustanciaSal;
	private BigDecimal sustanciaBase;
	private String unidadMedida;
	private String comentario;
	private String tipoClasificacionATC;
	private String clasificacionATC;

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
	}

	public Long getDgm036Id() {
		return dgm036Id;
	}

	public void setSecuenciaPrincActivo(Integer secuenciaPrincActivo) {
		this.secuenciaPrincActivo = secuenciaPrincActivo;
	}

	public Integer getSecuenciaPrincActivo() {
		return secuenciaPrincActivo;
	}

	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}

	public String getSustancia() {
		return sustancia;
	}
	
	public BigDecimal getSustanciaSal() {
		return sustanciaSal;
	}

	public void setSustanciaSal(BigDecimal sustanciaSal) {
		this.sustanciaSal = sustanciaSal;
	}

	public BigDecimal getSustanciaBase() {
		return sustanciaBase;
	}

	public void setSustanciaBase(BigDecimal sustanciaBase) {
		this.sustanciaBase = sustanciaBase;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getComentario() {
		return comentario;
	}

	public String getTipoClasificacionATC() {
		return tipoClasificacionATC;
	}

	public void setTipoClasificacionATC(String tipoClasificacionATC) {
		this.tipoClasificacionATC = tipoClasificacionATC;
	}

	public String getClasificacionATC() {
		return clasificacionATC;
	}

	public void setClasificacionATC(String clasificacionATC) {
		this.clasificacionATC = clasificacionATC;
	}

}
