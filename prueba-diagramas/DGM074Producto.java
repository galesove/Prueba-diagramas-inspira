package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;

public class DGM074Producto {

	private Long dgm074Id;
	private Integer secuenciaProducto;
	private Integer dgmClasificacionDgm074;
	private String nroRegistroSanitario;
	private String nso;
	private String grupoProducto;
	private String nombreProducto;
	private Date fechaVencimiento;
	private String nombreTitular;
	private String formaPresentacion;

	public Long getDgm074Id() {
		return dgm074Id;
	}

	public void setDgm074Id(Long dgm074Id) {
		this.dgm074Id = dgm074Id;
	}

	public Integer getSecuenciaProducto() {
		return secuenciaProducto;
	}

	public void setSecuenciaProducto(Integer secuenciaProducto) {
		this.secuenciaProducto = secuenciaProducto;
	}

	public Integer getDgmClasificacionDgm074() {
		return dgmClasificacionDgm074;
	}

	public void setDgmClasificacionDgm074(Integer dgmClasificacionDgm074) {
		this.dgmClasificacionDgm074 = dgmClasificacionDgm074;
	}

	public String getNroRegistroSanitario() {
		return nroRegistroSanitario;
	}

	public void setNroRegistroSanitario(String nroRegistroSanitario) {
		this.nroRegistroSanitario = nroRegistroSanitario;
	}

	public String getNso() {
		return nso;
	}

	public void setNso(String nso) {
		this.nso = nso;
	}

	public String getGrupoProducto() {
		return grupoProducto;
	}

	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getFormaPresentacion() {
		return formaPresentacion;
	}

	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}

}
