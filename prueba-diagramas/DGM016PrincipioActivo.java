package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM016PrincipioActivo {

	private Long dgm016Id;
	private Integer secuenciaPrincActivo;
	private String sustancia;
	private BigDecimal sustanciaSal;
	private BigDecimal sustanciaBase;
	private String unidadMedida;
	//private String claseFarmacologica;	
	private String comentario;
	private String tipoClasificacionATC;
	private String clasificacionATC;

	private List<DGM016SustentoPrincipioActivoET> sustentosPrincipioActivoET;
	
	private List<DGM016SustentoPrincipioActivoTA> sustentosPrincipioActivoTA;

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public Long getDgm016Id() {
		return dgm016Id;
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

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getComentario() {
		return comentario;
	}

	public List<DGM016SustentoPrincipioActivoET> getSustentosPrincipioActivoET() {
		return sustentosPrincipioActivoET;
	}

	public void setSustentosPrincipioActivoET(
			List<DGM016SustentoPrincipioActivoET> sustentosPrincipioActivoET) {
		this.sustentosPrincipioActivoET = sustentosPrincipioActivoET;
	}

	public List<DGM016SustentoPrincipioActivoTA> getSustentosPrincipioActivoTA() {
		return sustentosPrincipioActivoTA;
	}

	public void setSustentosPrincipioActivoTA(List<DGM016SustentoPrincipioActivoTA> sustentosPrincipioActivoTA) {
		this.sustentosPrincipioActivoTA = sustentosPrincipioActivoTA;
	}
	
	
	
}
