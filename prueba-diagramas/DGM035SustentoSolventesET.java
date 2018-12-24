package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035SustentoSolventesET {

	private Long dgm035Id;
	private Integer secuenciaSolvente;
	private Integer secuenciaSolventeET;
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
