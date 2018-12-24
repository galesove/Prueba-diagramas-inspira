package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM017EnvaseMediatoAccesorio {
	private Long dgm017Id;
	private Integer secuenciaEnvMediato;
	private Integer secuenciaEnvMedAccesorio;
	private Integer accesorio;
	private String comentario;

	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
	}

	public Integer getSecuenciaEnvMediato() {
		return secuenciaEnvMediato;
	}

	public void setSecuenciaEnvMediato(Integer secuenciaEnvMediato) {
		this.secuenciaEnvMediato = secuenciaEnvMediato;
	}

	public Integer getSecuenciaEnvMedAccesorio() {
		return secuenciaEnvMedAccesorio;
	}

	public void setSecuenciaEnvMedAccesorio(Integer secuenciaEnvMedAccesorio) {
		this.secuenciaEnvMedAccesorio = secuenciaEnvMedAccesorio;
	}

	public Integer getAccesorio() {
		return accesorio;
	}

	public void setAccesorio(Integer accesorio) {
		this.accesorio = accesorio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
