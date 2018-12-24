package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM011Lote {

	private Long dgm011Id; 
	private Integer secuencia; 
	private String nroLote; 
	private String sistemaCodificacion; 

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
	public String getNroLote() {
		return nroLote;
	}
	public void setNroLote(String nroLote) {
		this.nroLote = nroLote;
	}
	public String getSistemaCodificacion() {
		return sistemaCodificacion;
	}
	public void setSistemaCodificacion(String sistemaCodificacion) {
		this.sistemaCodificacion = sistemaCodificacion;
	}
}
