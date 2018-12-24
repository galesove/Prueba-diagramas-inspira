package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016SustentoSolventesET {

	private Long dgm016Id;
	private Integer secuenciaSolvente;
	private Integer secuenciaSolventeET;
	private String fuenteReferencia;
	
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
	public void setSecuenciaSolventeET(Integer secuenciaSolventeET) {
		this.secuenciaSolventeET = secuenciaSolventeET;
	}
	public Integer getSecuenciaSolventeET() {
		return secuenciaSolventeET;
	}
	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}
	public String getFuenteReferencia() {
		return fuenteReferencia;
	}

}
