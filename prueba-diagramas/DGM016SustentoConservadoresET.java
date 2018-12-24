package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016SustentoConservadoresET {

	private Long dgm016Id;
	
	private Integer secuenciaConservante;
	
	private Integer secuenciaConservanteET;
	
	private String fuenteReferencia;

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public Long getDgm016Id() {
		return dgm016Id;
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
