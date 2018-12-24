package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM012EnvaseInmediato {

	private Long dgm012Id; 
	private Integer secuencia; 
	private Integer envase; 
	//private Integer material; 
	//private Integer color; 

	public Long getDgm012Id() {
		return dgm012Id;
	}
	public void setDgm012Id(Long dgm012Id) {
		this.dgm012Id = dgm012Id;
	}
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public Integer getEnvase() {
		return envase;
	}
	public void setEnvase(Integer envase) {
		this.envase = envase;
	}
	
}
