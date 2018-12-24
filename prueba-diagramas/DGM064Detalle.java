package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;

public class DGM064Detalle {
    
	private Long dgm064Id;
	
	private Integer secuenciaDetalle;
	
	private String tipoDr;
	
	private String nroRSReinscripcion;
	
	private Date fecVencRSReinscripcion;
	
	public Long getDgm064Id() {
		return dgm064Id;
	}
	
	public void setDgm064Id(Long dgm064Id) {
		this.dgm064Id = dgm064Id;
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
