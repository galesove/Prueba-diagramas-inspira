package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM012Maquiladora {

	private Long dgm012Id; 
	private Integer secuencia; 
	private String origen; 
	private String maquiladoraNacional; 
	private String maquiladoraExtranjera; 
	private String          paisMaquiladora;
	
	public String getPaisMaquiladora() {
		return paisMaquiladora;
	}
	public void setPaisMaquiladora(String paisMaquiladora) {
		this.paisMaquiladora = paisMaquiladora;
	}
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
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getMaquiladoraNacional() {
		return maquiladoraNacional;
	}
	public void setMaquiladoraNacional(String maquiladoraNacional) {
		this.maquiladoraNacional = maquiladoraNacional;
	}
	public String getMaquiladoraExtranjera() {
		return maquiladoraExtranjera;
	}
	public void setMaquiladoraExtranjera(String maquiladoraExtranjera) {
		this.maquiladoraExtranjera = maquiladoraExtranjera;
	}
}
