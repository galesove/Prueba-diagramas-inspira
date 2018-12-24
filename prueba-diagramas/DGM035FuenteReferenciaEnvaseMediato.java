package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035FuenteReferenciaEnvaseMediato {

	private Long dgm035Id;
	
	private Integer secuenciaEnvMediato;
	
	private Integer secuenciaSustentoEMediato;
	
	private String fuenteReferencia;

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public Long getDgm035Id() {
		return dgm035Id;
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
