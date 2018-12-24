package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM055Presentacion {

	private Integer dgm055Id;
	private Integer secuencia;
	private Integer secPresentacion;
	private String descripcion;
	private List<DGM055PresentacionAccesorios> accesoriosPresentacion;
	private List<DGM055PresentacionMaterialInmediato> materialInmediatoPresentacion;
	private List<DGM055PresentacionColorInmediato> colorInmediatoPresentacion;
	private String otrosDatos;
	private Integer tipoEnvaseMediato;
	private Integer materialMediato;
	private Double cantidadEnvaseMediato;
	private Integer tipoEnvaseInmediato;
	private Double cantidadEnvaseInmediato;
	private String unidadMedidaEnvaseInmediato;

	public Integer getDgm055Id() {
		return dgm055Id;
	}

	public void setDgm055Id(Integer dgm055Id) {
		this.dgm055Id = dgm055Id;
	}

	public Integer getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}

	public Integer getSecPresentacion() {
		return secPresentacion;
	}

	public void setSecPresentacion(Integer secPresentacion) {
		this.secPresentacion = secPresentacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<DGM055PresentacionAccesorios> getAccesoriosPresentacion() {
		return accesoriosPresentacion;
	}

	public void setAccesoriosPresentacion(List<DGM055PresentacionAccesorios> accesoriosPresentacion) {
		this.accesoriosPresentacion = accesoriosPresentacion;
	}

	public List<DGM055PresentacionMaterialInmediato> getMaterialInmediatoPresentacion() {
		return materialInmediatoPresentacion;
	}

	public void setMaterialInmediatoPresentacion(List<DGM055PresentacionMaterialInmediato> materialInmediatoPresentacion) {
		this.materialInmediatoPresentacion = materialInmediatoPresentacion;
	}

	public List<DGM055PresentacionColorInmediato> getColorInmediatoPresentacion() {
		return colorInmediatoPresentacion;
	}

	public void setColorInmediatoPresentacion(List<DGM055PresentacionColorInmediato> colorInmediatoPresentacion) {
		this.colorInmediatoPresentacion = colorInmediatoPresentacion;
	}

	public String getOtrosDatos() {
		return otrosDatos;
	}

	public void setOtrosDatos(String otrosDatos) {
		this.otrosDatos = otrosDatos;
	}

	public Integer getTipoEnvaseMediato() {
		return tipoEnvaseMediato;
	}

	public void setTipoEnvaseMediato(Integer tipoEnvaseMediato) {
		this.tipoEnvaseMediato = tipoEnvaseMediato;
	}

	public Integer getMaterialMediato() {
		return materialMediato;
	}

	public void setMaterialMediato(Integer materialMediato) {
		this.materialMediato = materialMediato;
	}

	public Double getCantidadEnvaseMediato() {
		return cantidadEnvaseMediato;
	}

	public void setCantidadEnvaseMediato(Double cantidadEnvaseMediato) {
		this.cantidadEnvaseMediato = cantidadEnvaseMediato;
	}

	public Integer getTipoEnvaseInmediato() {
		return tipoEnvaseInmediato;
	}

	public void setTipoEnvaseInmediato(Integer tipoEnvaseInmediato) {
		this.tipoEnvaseInmediato = tipoEnvaseInmediato;
	}

	public Double getCantidadEnvaseInmediato() {
		return cantidadEnvaseInmediato;
	}

	public void setCantidadEnvaseInmediato(Double cantidadEnvaseInmediato) {
		this.cantidadEnvaseInmediato = cantidadEnvaseInmediato;
	}

	public String getUnidadMedidaEnvaseInmediato() {
		return unidadMedidaEnvaseInmediato;
	}

	public void setUnidadMedidaEnvaseInmediato(String unidadMedidaEnvaseInmediato) {
		this.unidadMedidaEnvaseInmediato = unidadMedidaEnvaseInmediato;
	}

}
