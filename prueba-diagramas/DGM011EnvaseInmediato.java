package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM011EnvaseInmediato {

	private Long dgm011Id; 
	private Integer secuencia; 
	private Integer envase; 
	//private Integer material; 
	//private Integer color; 

	public Long getDgm011Id() {
		return dgm011Id;
	}
	public void setDgm011Id(Long dgm011Id) {
		this.dgm011Id = dgm011Id;
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
	/*
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
	*/
}
