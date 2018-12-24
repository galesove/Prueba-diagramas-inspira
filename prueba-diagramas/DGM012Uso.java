package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM012Uso {

	private Long dgm012Id; 
	private Integer secuencia; 
	private String uso; 

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
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
}
