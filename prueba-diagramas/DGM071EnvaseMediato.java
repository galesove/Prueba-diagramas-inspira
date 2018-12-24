package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM071EnvaseMediato {

	private Long dgm071Id;
	private Integer secuenciaEnvMediato;
	private Integer envaseMediato;
	private Integer accesorio;

	private List<DGM071EnvaseMediatoDet> dgm071EnvasesMediatoDet = new ArrayList<DGM071EnvaseMediatoDet>();	

	public Long getDgm071Id() {
		return dgm071Id;
	}

	public void setDgm071Id(Long dgm071Id) {
		this.dgm071Id = dgm071Id;
	}

	public Integer getSecuenciaEnvMediato() {
		return secuenciaEnvMediato;
	}

	public void setSecuenciaEnvMediato(Integer secuenciaEnvMediato) {
		this.secuenciaEnvMediato = secuenciaEnvMediato;
	}

	public Integer getEnvaseMediato() {
		return envaseMediato;
	}

	public void setEnvaseMediato(Integer envaseMediato) {
		this.envaseMediato = envaseMediato;
	}

	public Integer getAccesorio() {
		return accesorio;
	}

	public void setAccesorio(Integer accesorio) {
		this.accesorio = accesorio;
	}
	
	public List<DGM071EnvaseMediatoDet> getDgm071EnvasesMediatoDet() {
		return dgm071EnvasesMediatoDet;
	}

	public void setDgm071EnvasesMediatoDet(
			List<DGM071EnvaseMediatoDet> dgm071EnvasesMediatoDet) {
		this.dgm071EnvasesMediatoDet = dgm071EnvasesMediatoDet;
	}
}
