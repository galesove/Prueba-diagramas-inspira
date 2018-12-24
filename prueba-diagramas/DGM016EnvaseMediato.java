package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM016EnvaseMediato {

	private Long dgm016Id;
	private Integer secuenciaEnvMediato;
	private Integer envaseMediato;
	//private Integer material;
	
	//private List<DGM016FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato;

	private List<DGM016MaterialEnvaseMed> dgm016MaterialEnvaseMedi = new ArrayList<DGM016MaterialEnvaseMed>();
	
	
	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
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
	
	public List<DGM016MaterialEnvaseMed> getDgm016MaterialEnvaseMedi() {
		return dgm016MaterialEnvaseMedi;
	}

	public void setDgm016MaterialEnvaseMedi(
			List<DGM016MaterialEnvaseMed> dgm016MaterialEnvaseMedi) {
		this.dgm016MaterialEnvaseMedi = dgm016MaterialEnvaseMedi;
	}
}
