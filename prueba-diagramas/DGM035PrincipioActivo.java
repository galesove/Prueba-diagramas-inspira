package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035PrincipioActivo {

	private Long dgm035Id;
	private Integer secuenciaPrincActivo;
	private String sustancia;
	private Double sustanciaSal;
	private Double sustanciaBase;
	private String unidadMedida;
	private String claseFarmacologica;	
	private String comentario;

	private List<DGM035SustentoPrincipioActivoET> sustentosPrincipioActivoET;
	
	private List<DGM035SustentoPrincipioActivoTA> sustentosPrincipioActivoTA;

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public Long getDgm035Id() {
		return dgm035Id;
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

	public void setSustanciaSal(Double sustanciaSal) {
		this.sustanciaSal = sustanciaSal;
	}

	public Double getSustanciaSal() {
		return sustanciaSal;
	}

	public void setSustanciaBase(Double sustanciaBase) {
		this.sustanciaBase = sustanciaBase;
	}

	public Double getSustanciaBase() {
		return sustanciaBase;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setClaseFarmacologica(String claseFarmacologica) {
		this.claseFarmacologica = claseFarmacologica;
	}

	public String getClaseFarmacologica() {
		return claseFarmacologica;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getComentario() {
		return comentario;
	}

	public List<DGM035SustentoPrincipioActivoET> getSustentosPrincipioActivoET() {
		return sustentosPrincipioActivoET;
	}

	public void setSustentosPrincipioActivoET(
			List<DGM035SustentoPrincipioActivoET> sustentosPrincipioActivoET) {
		this.sustentosPrincipioActivoET = sustentosPrincipioActivoET;
	}

	public List<DGM035SustentoPrincipioActivoTA> getSustentosPrincipioActivoTA() {
		return sustentosPrincipioActivoTA;
	}

	public void setSustentosPrincipioActivoTA(List<DGM035SustentoPrincipioActivoTA> sustentosPrincipioActivoTA) {
		this.sustentosPrincipioActivoTA = sustentosPrincipioActivoTA;
	}
	
}
