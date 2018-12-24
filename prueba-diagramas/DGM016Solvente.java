package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM016Solvente {

	private Long dgm016Id;
	private Integer secuenciaSolvente;
	private String sustancia;
	private BigDecimal sustanciaSal;
	private BigDecimal sustanciaBase;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM016SustentoSolventesET> sustentosSolventeET;
	
	private List<DGM016SustentoSolventesTA> sustentosSolventeTA;

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public Long getDgm016Id() {
		return dgm016Id;
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

	public List<DGM016SustentoSolventesET> getSustentosSolventeET() {
		return sustentosSolventeET;
	}

	public void setSustentosSolventeET(List<DGM016SustentoSolventesET> sustentosSolventeET) {
		this.sustentosSolventeET = sustentosSolventeET;
	}

	public List<DGM016SustentoSolventesTA> getSustentosSolventeTA() {
		return sustentosSolventeTA;
	}

	public void setSustentosSolventeTA(List<DGM016SustentoSolventesTA> sustentosSolventeTA) {
		this.sustentosSolventeTA = sustentosSolventeTA;
	}

}
