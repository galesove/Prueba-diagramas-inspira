package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035SustentoColorantesTA {

	private Long dgm035Id;
	private Integer secuenciaColorante;
	private Integer secuenciaColoranteTA;
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
	public void setSecuenciaColoranteTA(Integer secuenciaColoranteTA) {
		this.secuenciaColoranteTA = secuenciaColoranteTA;
	}
	public Integer getSecuenciaColoranteTA() {
		return secuenciaColoranteTA;
	}
	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}
	public String getFuenteReferencia() {
		return fuenteReferencia;
	}
	
}
