package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035Solvente {

	private Long dgm035Id;
	private Integer secuenciaSolvente;
	private String sustancia;
	private Double sustanciaSal;
	private Double sustanciaBase;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM035SustentoSolventesET> sustentosSolventeET;
	
	private List<DGM035SustentoSolventesTA> sustentosSolventeTA;

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setSecuenciaSolvente(Integer secuenciaSolvente) {
		this.secuenciaSolvente = secuenciaSolvente;
	}

	public Integer getSecuenciaSolvente() {
		return secuenciaSolvente;
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

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getComentario() {
		return comentario;
	}

	public List<DGM035SustentoSolventesET> getSustentosSolventeET() {
		return sustentosSolventeET;
	}

	public void setSustentosSolventeET(List<DGM035SustentoSolventesET> sustentosSolventeET) {
		this.sustentosSolventeET = sustentosSolventeET;
	}

	public List<DGM035SustentoSolventesTA> getSustentosSolventeTA() {
		return sustentosSolventeTA;
	}

	public void setSustentosSolventeTA(List<DGM035SustentoSolventesTA> sustentosSolventeTA) {
		this.sustentosSolventeTA = sustentosSolventeTA;
	}

}
