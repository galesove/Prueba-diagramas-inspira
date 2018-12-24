package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016FuenteReferenciaEnvaseInmediato {

	private Long dgm016Id;
	
	private Integer secuenciaEnvInmediato;
	
	private Integer secuenciaSustentoEInmediato;
	
	private String fuenteReferencia;

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setSecuenciaEnvInmediato(Integer secuenciaEnvInmediato) {
		this.secuenciaEnvInmediato = secuenciaEnvInmediato;
	}

	public Integer getSecuenciaEnvInmediato() {
		return secuenciaEnvInmediato;
	}

	public void setSecuenciaSustentoEInmediato(
			Integer secuenciaSustentoEInmediato) {
		this.secuenciaSustentoEInmediato = secuenciaSustentoEInmediato;
	}

	public Integer getSecuenciaSustentoEInmediato() {
		return secuenciaSustentoEInmediato;
	}

	public String getFuenteReferencia() {
		return fuenteReferencia;
	}

	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}

}
