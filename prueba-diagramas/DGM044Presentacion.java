package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM044Presentacion {

	private Integer dgm044Id;
	private Integer secuencia;
	private Integer secPresentacion;
	private String descripcion;
	private List<DGM044PresentacionAccesorios> accesoriosPresentacion;
	private List<DGM044PresentacionMaterialInmediato> materialInmediatoPresentacion;
	private List<DGM044PresentacionColorInmediato> colorInmediatoPresentacion;
	private String otrosDatos;
	private Integer tipoEnvaseMediato;
	private Integer materialMediato;
	private Double cantidadEnvaseMediato;
	private Integer tipoEnvaseInmediato;
	private Double cantidadEnvaseInmediato;
	private String unidadMedidaEnvaseInmediato;

	public Integer getDgm044Id() {
		return dgm044Id;
	}

	public void setDgm044Id(Integer dgm044Id) {
		this.dgm044Id = dgm044Id;
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

	public List<DGM044PresentacionAccesorios> getAccesoriosPresentacion() {
		return accesoriosPresentacion;
	}

	public void setAccesoriosPresentacion(List<DGM044PresentacionAccesorios> accesoriosPresentacion) {
		this.accesoriosPresentacion = accesoriosPresentacion;
	}

	public List<DGM044PresentacionMaterialInmediato> getMaterialInmediatoPresentacion() {
		return materialInmediatoPresentacion;
	}

	public void setMaterialInmediatoPresentacion(List<DGM044PresentacionMaterialInmediato> materialInmediatoPresentacion) {
		this.materialInmediatoPresentacion = materialInmediatoPresentacion;
	}

	public List<DGM044PresentacionColorInmediato> getColorInmediatoPresentacion() {
		return colorInmediatoPresentacion;
	}

	public void setColorInmediatoPresentacion(List<DGM044PresentacionColorInmediato> colorInmediatoPresentacion) {
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
