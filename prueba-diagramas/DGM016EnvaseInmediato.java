package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM016EnvaseInmediato {

	private Long dgm016Id;
	private Integer secuenciaEnvInmediato;
	private Integer envaseInmediato;
	//private Integer material;
	//private Integer color;
	
	//private List<DGM016FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato;
	
	private List<DGM016MaterialEnvaseInm> dgm016MaterialEnvaseInm = new ArrayList<DGM016MaterialEnvaseInm>();
	
	
	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
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
	public List<DGM016MaterialEnvaseInm> getDgm016MaterialEnvaseInm() {
		return dgm016MaterialEnvaseInm;
	}

	public void setDgm016MaterialEnvaseInm(List<DGM016MaterialEnvaseInm> dgm016MaterialEnvaseInm) {
		this.dgm016MaterialEnvaseInm = dgm016MaterialEnvaseInm;
	}

}
