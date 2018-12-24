package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035EnvaseInmediato {

	private Long dgm035Id;
	private Integer secuenciaEnvInmediato;
	private Integer envaseInmediato;
	private Integer material;
	private Integer color;
	
	private List<DGM035FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato;

	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public void setSecuenciaEnvInmediato(Integer secuenciaEnvInmediato) {
		this.secuenciaEnvInmediato = secuenciaEnvInmediato;
	}

	public Integer getSecuenciaEnvInmediato() {
		return secuenciaEnvInmediato;
	}

	public void setEnvaseInmediato(Integer envaseInmediato) {
		this.envaseInmediato = envaseInmediato;
	}

	public Integer getEnvaseInmediato() {
		return envaseInmediato;
	}

	public Integer getMaterial() {
		return material;
	}

	public void setMaterial(Integer material) {
		this.material = material;
	}

	public Integer getColor() {
		return color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public List<DGM035FuenteReferenciaEnvaseInmediato> getFuentesReferenciaEnvaseInmediato() {
		return fuentesReferenciaEnvaseInmediato;
	}

	public void setFuentesReferenciaEnvaseInmediato(
			List<DGM035FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato) {
		this.fuentesReferenciaEnvaseInmediato = fuentesReferenciaEnvaseInmediato;
	}
	
}
