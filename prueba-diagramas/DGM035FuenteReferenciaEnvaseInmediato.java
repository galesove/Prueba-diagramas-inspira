package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035FuenteReferenciaEnvaseInmediato {

	private Long dgm035Id;
	
	private Integer secuenciaEnvInmediato;
	
	private Integer secuenciaSustentoEInmediato;
	
	private String fuenteReferencia;

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public Long getDgm035Id() {
		return dgm035Id;
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
