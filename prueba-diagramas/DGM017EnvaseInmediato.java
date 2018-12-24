package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;


public class DGM017EnvaseInmediato {

	private Long dgm017Id;
	private Integer secuenciaEnvInmediato;
	private Integer envaseInmediato;
	//private Integer material;
	//private Integer color;
	
	private List<DGM017MaterialEnvaseInm> materialEnvaseInm;
	
	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
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

	public List<DGM017MaterialEnvaseInm> getMaterialEnvaseInm() {
		return materialEnvaseInm;
	}

	public void setMaterialEnvaseInm(List<DGM017MaterialEnvaseInm> materialEnvaseInm) {
		this.materialEnvaseInm = materialEnvaseInm;
	}

}
