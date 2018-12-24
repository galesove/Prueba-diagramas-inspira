package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016SustentoPrincipioActivoET {

	private Long dgm016Id;
	private Integer secuenciaPrincActivo;
	private Integer secuenciaPrincActivoET;
	private String fuenteReferencia;
	
	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}
	public Long getDgm016Id() {
		return dgm016Id;
	}
	public void setSecuenciaPrincActivo(Integer secuenciaPrincActivo) {
		this.secuenciaPrincActivo = secuenciaPrincActivo;
	}
	public Integer getSecuenciaPrincActivo() {
		return secuenciaPrincActivo;
	}
	public void setSecuenciaPrincActivoET(Integer secuenciaPrincActivoET) {
		this.secuenciaPrincActivoET = secuenciaPrincActivoET;
	}
	public Integer getSecuenciaPrincActivoET() {
		return secuenciaPrincActivoET;
	}
	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}
	public String getFuenteReferencia() {
		return fuenteReferencia;
	}
}
