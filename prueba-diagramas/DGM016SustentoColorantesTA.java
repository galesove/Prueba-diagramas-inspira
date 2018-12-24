package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016SustentoColorantesTA {

	private Long dgm016Id;
	private Integer secuenciaColorante;
	private Integer secuenciaColoranteTA;
	private String fuenteReferencia;
	
	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}
	public Long getDgm016Id() {
		return dgm016Id;
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
