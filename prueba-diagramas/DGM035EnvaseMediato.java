package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035EnvaseMediato {

	private Long dgm035Id;
	private Integer secuenciaEnvMediato;
	private Integer envaseMediato;
	private Integer material;
	
	private List<DGM035FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato;

	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public void setSecuenciaEnvMediato(Integer secuenciaEnvMediato) {
		this.secuenciaEnvMediato = secuenciaEnvMediato;
	}

	public Integer getSecuenciaEnvMediato() {
		return secuenciaEnvMediato;
	}

	public void setEnvaseMediato(Integer envaseMediato) {
		this.envaseMediato = envaseMediato;
	}

	public Integer getEnvaseMediato() {
		return envaseMediato;
	}

	public Integer getMaterial() {
		return material;
	}

	public void setMaterial(Integer material) {
		this.material = material;
	}

	public List<DGM035FuenteReferenciaEnvaseMediato> getFuentesReferenciaEnvaseMediato() {
		return fuentesReferenciaEnvaseMediato;
	}

	public void setFuentesReferenciaEnvaseMediato(
			List<DGM035FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato) {
		this.fuentesReferenciaEnvaseMediato = fuentesReferenciaEnvaseMediato;
	}
	
}
