package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;


public class DGM017EnvaseMediato {

	private Long dgm017Id;
	private Integer secuenciaEnvMediato;
	private Integer envaseMediato;
	//private Integer material;
	private List<DGM017MaterialEnvaseMed> materialEnvaseMed;
	
	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
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

	public List<DGM017MaterialEnvaseMed> getMaterialEnvaseMed() {
		return materialEnvaseMed;
	}

	public void setMaterialEnvaseMed(List<DGM017MaterialEnvaseMed> materialEnvaseMed) {
		this.materialEnvaseMed = materialEnvaseMed;
	}

}
