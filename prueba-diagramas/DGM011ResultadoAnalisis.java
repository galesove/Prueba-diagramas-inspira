package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM011ResultadoAnalisis {

	private Long dgm011Id; 
	private Integer secuencia; 
	private String nombreAnalisis; 
	private String detalle; 

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
	public String getNombreAnalisis() {
		return nombreAnalisis;
	}
	public void setNombreAnalisis(String nombreAnalisis) {
		this.nombreAnalisis = nombreAnalisis;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
}
