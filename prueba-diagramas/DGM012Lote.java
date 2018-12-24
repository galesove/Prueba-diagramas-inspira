package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM012Lote {

	private Long dgm012Id; 
	private Integer secuencia; 
	private String nroLote; 
	private String sistemaCodificacion; 

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
