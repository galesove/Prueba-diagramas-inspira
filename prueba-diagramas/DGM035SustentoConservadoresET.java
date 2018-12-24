package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035SustentoConservadoresET {

	private Long dgm035Id;
	
	private Integer secuenciaConservante;
	
	private Integer secuenciaConservanteET;
	
	private String fuenteReferencia;

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setSecuenciaConservante(Integer secuenciaConservante) {
		this.secuenciaConservante = secuenciaConservante;
	}

	public Integer getSecuenciaConservante() {
		return secuenciaConservante;
	}

	public void setSecuenciaConservanteET(Integer secuenciaConservanteET) {
		this.secuenciaConservanteET = secuenciaConservanteET;
	}

	public Integer getSecuenciaConservanteET() {
		return secuenciaConservanteET;
	}

	public String getFuenteReferencia() {
		return fuenteReferencia;
	}

	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}

}
