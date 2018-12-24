package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;


public class DGM036EnvaseMediato {

	private Long dgm036Id;
	private Integer secuenciaEnvMediato;
	private Integer envaseMediato;
	//private Integer material;
	private List<DGM036MaterialEnvaseMed> materialEnvaseMed;
	
	public Long getDgm036Id() {
		return dgm036Id;
	}

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
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

	public List<DGM036MaterialEnvaseMed> getMaterialEnvaseMed() {
		return materialEnvaseMed;
	}

	public void setMaterialEnvaseMed(List<DGM036MaterialEnvaseMed> materialEnvaseMed) {
		this.materialEnvaseMed = materialEnvaseMed;
	}

}
