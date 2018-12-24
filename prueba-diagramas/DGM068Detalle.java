package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;

public class DGM068Detalle {
    
	private Long dgm068Id;
	
	private Integer secuenciaDetalle;
	
	private String tipoDr;
	
	private String nroRSReinscripcion;
	
	private Date fecVencRSReinscripcion;
	
	public Long getDgm068Id() {
		return dgm068Id;
	}
	
	public void setDgm068Id(Long dgm068Id) {
		this.dgm068Id = dgm068Id;
	}
	
	public Integer getSecuenciaDetalle() {
		return secuenciaDetalle;
	}
	
	public void setSecuenciaDetalle(Integer secuenciaDetalle) {
		this.secuenciaDetalle = secuenciaDetalle;
	}
	
	public String getTipoDr() {
		return tipoDr;
	}
	
	public void setTipoDr(String tipoDr) {
		this.tipoDr = tipoDr;
	}
	
	public String getNroRSReinscripcion() {
		return nroRSReinscripcion;
	}
	
	public void setNroRSReinscripcion(String nroRSReinscripcion) {
		this.nroRSReinscripcion = nroRSReinscripcion;
	}

	public Date getFecVencRSReinscripcion() {
		return fecVencRSReinscripcion;
	}

	public void setFecVencRSReinscripcion(Date fecVencRSReinscripcion) {
		this.fecVencRSReinscripcion = fecVencRSReinscripcion;
	}
	
}
