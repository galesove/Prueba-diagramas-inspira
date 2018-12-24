package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016SustentoSolventesTA {

	private Long dgm016Id;
	private Integer secuenciaSolvente;
	private Integer secuenciaSolventeTA;
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
	public void setSecuenciaSolventeTA(Integer secuenciaSolventeTA) {
		this.secuenciaSolventeTA = secuenciaSolventeTA;
	}
	public Integer getSecuenciaSolventeTA() {
		return secuenciaSolventeTA;
	}
	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}
	public String getFuenteReferencia() {
		return fuenteReferencia;
	}

}
