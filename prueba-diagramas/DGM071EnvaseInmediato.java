package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM071EnvaseInmediato {

	private Long dgm071Id;
	private Integer secuenciaEnvInmediato;
	private Integer envaseInmediato;
	private String tipoTapa;
	
	private List<DGM071EnvaseInmediatoDet> dgm071EnvasesInmediatoDet = new ArrayList<DGM071EnvaseInmediatoDet>();


	public Long getDgm071Id() {
		return dgm071Id;
	}

	public void setDgm071Id(Long dgm071Id) {
		this.dgm071Id = dgm071Id;
	}

	public Integer getSecuenciaEnvInmediato() {
		return secuenciaEnvInmediato;
	}

	public void setSecuenciaEnvInmediato(Integer secuenciaEnvInmediato) {
		this.secuenciaEnvInmediato = secuenciaEnvInmediato;
	}

	public Integer getEnvaseInmediato() {
		return envaseInmediato;
	}

	public void setEnvaseInmediato(Integer envaseInmediato) {
		this.envaseInmediato = envaseInmediato;
	}

	public String getTipoTapa() {
		return tipoTapa;
	}

	public void setTipoTapa(String tipoTapa) {
		this.tipoTapa = tipoTapa;
	}
	
	public List<DGM071EnvaseInmediatoDet> getDgm071EnvasesInmediatoDet() {
		return dgm071EnvasesInmediatoDet;
	}

	public void setDgm071EnvasesInmediatoDet(
			List<DGM071EnvaseInmediatoDet> dgm071EnvasesInmediatoDet) {
		this.dgm071EnvasesInmediatoDet = dgm071EnvasesInmediatoDet;
	}
}
