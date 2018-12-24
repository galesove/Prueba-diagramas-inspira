package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035SustentoColorantesET {

	private Long dgm035Id;
	private Integer secuenciaColorante;
	private Integer secuenciaColoranteET;
	private String fuenteReferencia;
	
	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}
	public Long getDgm035Id() {
		return dgm035Id;
	}
	public void setSecuenciaColorante(Integer secuenciaColorante) {
		this.secuenciaColorante = secuenciaColorante;
	}
	public Integer getSecuenciaColorante() {
		return secuenciaColorante;
	}
	public void setSecuenciaColoranteET(Integer secuenciaColoranteET) {
		this.secuenciaColoranteET = secuenciaColoranteET;
	}
	public Integer getSecuenciaColoranteET() {
		return secuenciaColoranteET;
	}
	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}
	public String getFuenteReferencia() {
		return fuenteReferencia;
	}

}
