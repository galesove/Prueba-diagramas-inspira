package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;


public class DGM036EnvaseInmediato {

	private Long dgm036Id;
	private Integer secuenciaEnvInmediato;
	private Integer envaseInmediato;
	//private Integer material;
	//private Integer color;
	
	private List<DGM036MaterialEnvaseInm> materialEnvaseInm;
	
	public Long getDgm036Id() {
		return dgm036Id;
	}

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
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

	public List<DGM036MaterialEnvaseInm> getMaterialEnvaseInm() {
		return materialEnvaseInm;
	}

	public void setMaterialEnvaseInm(List<DGM036MaterialEnvaseInm> materialEnvaseInm) {
		this.materialEnvaseInm = materialEnvaseInm;
	}

}
