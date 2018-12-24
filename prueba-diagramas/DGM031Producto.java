package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;

public class DGM031Producto {

	private Long dgm031Id;
	private Integer secuencia;
	private String nroRegistroSanitario;
	private String nombreProducto;
	private String concentracion;
	private String formaFarmaceutica;
	private Date fechaVencimiento;

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Long getDgm031Id() {
		return dgm031Id;
	}

	public void setDgm031Id(Long dgm031Id) {
		this.dgm031Id = dgm031Id;
	}

	public Integer getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}

	public String getNroRegistroSanitario() {
		return nroRegistroSanitario;
	}

	public void setNroRegistroSanitario(String nroRegistroSanitario) {
		this.nroRegistroSanitario = nroRegistroSanitario;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}
}
