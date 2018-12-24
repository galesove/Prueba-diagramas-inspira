package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM001PresentacionEnvaseInmediato {

	private Integer dgm001Id;
	
	private Integer secuencia;
	
	private Integer secPresentacion;
	
	private Integer secPresentacionEnvaseInmediato;
	
	private Integer codigo;
	
	private Double cantidad;
	
	private String unidadMedida;
	
	private List<DGM001PresentacionEnvaseInmediatoMaterial> presentacionEnvaseInmediatoMaterial;
	
	private List<DGM001PresentacionEnvaseInmediatoColor> presentacionEnvaseMediatoColor;
	
	public Integer getDgm001Id() {
		return dgm001Id;
	}

	public void setDgm001Id(Integer dgm001Id) {
		this.dgm001Id = dgm001Id;
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

	public Integer getSecPresentacionEnvaseInmediato() {
		return secPresentacionEnvaseInmediato;
	}

	public void setSecPresentacionEnvaseInmediato(
			Integer secPresentacionEnvaseInmediato) {
		this.secPresentacionEnvaseInmediato = secPresentacionEnvaseInmediato;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public List<DGM001PresentacionEnvaseInmediatoMaterial> getPresentacionEnvaseInmediatoMaterial() {
		return presentacionEnvaseInmediatoMaterial;
	}

	public void setPresentacionEnvaseInmediatoMaterial(
			List<DGM001PresentacionEnvaseInmediatoMaterial> presentacionEnvaseInmediatoMaterial) {
		this.presentacionEnvaseInmediatoMaterial = presentacionEnvaseInmediatoMaterial;
	}

	public List<DGM001PresentacionEnvaseInmediatoColor> getPresentacionEnvaseMediatoColor() {
		return presentacionEnvaseMediatoColor;
	}

	public void setPresentacionEnvaseMediatoColor(
			List<DGM001PresentacionEnvaseInmediatoColor> presentacionEnvaseMediatoColor) {
		this.presentacionEnvaseMediatoColor = presentacionEnvaseMediatoColor;
	}

}
