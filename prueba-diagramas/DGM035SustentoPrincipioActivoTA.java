package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035SustentoPrincipioActivoTA {

	private Long dgm035Id;
	private Integer secuenciaPrincActivo;
	private Integer secuenciaPrincActivoTA;
	private String fuenteReferencia;
	
	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}
	public Long getDgm035Id() {
		return dgm035Id;
	}
	public void setSecuenciaPrincActivo(Integer secuenciaPrincActivo) {
		this.secuenciaPrincActivo = secuenciaPrincActivo;
	}
	public Integer getSecuenciaPrincActivo() {
		return secuenciaPrincActivo;
	}
	public void setSecuenciaPrincActivoTA(Integer secuenciaPrincActivoTA) {
		this.secuenciaPrincActivoTA = secuenciaPrincActivoTA;
	}
	public Integer getSecuenciaPrincActivoTA() {
		return secuenciaPrincActivoTA;
	}
	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}
	public String getFuenteReferencia() {
		return fuenteReferencia;
	}
}
