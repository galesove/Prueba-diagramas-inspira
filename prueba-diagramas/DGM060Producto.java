package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;

public class DGM060Producto {
		
	private Long            dgm060Id;
	private Integer         secuenciaProducto;
	private String          nsoOrigen;
	private String          nroExpedienteOrigen;
	private Date            fechaVigenciaNsoOrigen;
	private String          nombreProducto;
	private String          grupoProducto;
	private String          grupoProductoDesc;
	
	public Long getDgm060Id() {
		return dgm060Id;
	}
	public void setDgm060Id(Long dgm060Id) {
		this.dgm060Id = dgm060Id;
	}
	public Integer getSecuenciaProducto() {
		return secuenciaProducto;
	}
	public void setSecuenciaProducto(Integer secuenciaProducto) {
		this.secuenciaProducto = secuenciaProducto;
	}
	public String getNsoOrigen() {
		return nsoOrigen;
	}
	public void setNsoOrigen(String nsoOrigen) {
		this.nsoOrigen = nsoOrigen;
	}
	public String getNroExpedienteOrigen() {
		return nroExpedienteOrigen;
	}
	public void setNroExpedienteOrigen(String nroExpedienteOrigen) {
		this.nroExpedienteOrigen = nroExpedienteOrigen;
	}
	public Date getFechaVigenciaNsoOrigen() {
		return fechaVigenciaNsoOrigen;
	}
	public void setFechaVigenciaNsoOrigen(Date fechaVigenciaNsoOrigen) {
		this.fechaVigenciaNsoOrigen = fechaVigenciaNsoOrigen;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public String getGrupoProductoDesc() {
		return grupoProductoDesc;
	}
	public void setGrupoProductoDesc(String grupoProductoDesc) {
		this.grupoProductoDesc = grupoProductoDesc;
	}
	
	
	

	
}
