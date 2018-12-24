package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035SustentoSolventesTA {

	private Long dgm035Id;
	private Integer secuenciaSolvente;
	private Integer secuenciaSolventeTA;
	private String fuenteReferencia;
	
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
