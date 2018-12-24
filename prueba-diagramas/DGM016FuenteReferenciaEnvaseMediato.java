package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016FuenteReferenciaEnvaseMediato {

	private Long dgm016Id;
	
	private Integer secuenciaEnvMediato;
	
	private Integer secuenciaSustentoEMediato;
	
	private String fuenteReferencia;

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setSecuenciaEnvMediato(Integer secuenciaEnvMediato) {
		this.secuenciaEnvMediato = secuenciaEnvMediato;
	}

	public Integer getSecuenciaEnvMediato() {
		return secuenciaEnvMediato;
	}

	public void setSecuenciaSustentoEMediato(Integer secuenciaSustentoEMediato) {
		this.secuenciaSustentoEMediato = secuenciaSustentoEMediato;
	}

	public Integer getSecuenciaSustentoEMediato() {
		return secuenciaSustentoEMediato;
	}

	public String getFuenteReferencia() {
		return fuenteReferencia;
	}

	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}

}
