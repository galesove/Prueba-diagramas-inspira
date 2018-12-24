package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM066Lote {

	private Long dgm066Id;
	private Integer secuenciaLote;
	private String nroLotes;
	private String cantidadProductoAlmacen;
	private String ventaPromedioMensual;
	private String tiempoAgotamientoExistencia;
	
	private String          formaPresentacion;
	private Long            cantidadProducto;
	private String          observacion;

	public Long getDgm066Id() {
		return dgm066Id;
	}

	public void setDgm066Id(Long dgm066Id) {
		this.dgm066Id = dgm066Id;
	}

	public Integer getSecuenciaLote() {
		return secuenciaLote;
	}

	public void setSecuenciaLote(Integer secuenciaLote) {
		this.secuenciaLote = secuenciaLote;
	}

	public String getNroLotes() {
		return nroLotes;
	}

	public void setNroLotes(String nroLotes) {
		this.nroLotes = nroLotes;
	}

	public String getCantidadProductoAlmacen() {
		return cantidadProductoAlmacen;
	}

	public void setCantidadProductoAlmacen(String cantidadProductoAlmacen) {
		this.cantidadProductoAlmacen = cantidadProductoAlmacen;
	}

	public String getVentaPromedioMensual() {
		return ventaPromedioMensual;
	}

	public void setVentaPromedioMensual(String ventaPromedioMensual) {
		this.ventaPromedioMensual = ventaPromedioMensual;
	}

	public String getTiempoAgotamientoExistencia() {
		return tiempoAgotamientoExistencia;
	}

	public void setTiempoAgotamientoExistencia(String tiempoAgotamientoExistencia) {
		this.tiempoAgotamientoExistencia = tiempoAgotamientoExistencia;
	}

	public String getFormaPresentacion() {
		return formaPresentacion;
	}

	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}

	public Long getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Long cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
