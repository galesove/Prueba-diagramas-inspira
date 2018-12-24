package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM002PresentacionEnvaseInmediato {

	private Integer dgm002Id;
	
	private Integer secuencia;
	
	private Integer secPresentacion;
	
	private Integer secPresentacionEnvaseInmediato;
	
	private Integer codigo;
	
	private Double cantidad;
	
	private String unidadMedida;
	
	private List<DGM002PresentacionEnvaseInmediatoMaterial> presentacionEnvaseInmediatoMaterial;
	
	private List<DGM002PresentacionEnvaseInmediatoColor> presentacionEnvaseMediatoColor;
	
	public Integer getDgm002Id() {
		return dgm002Id;
	}

	public void setDgm002Id(Integer dgm002Id) {
		this.dgm002Id = dgm002Id;
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

	public List<DGM002PresentacionEnvaseInmediatoMaterial> getPresentacionEnvaseInmediatoMaterial() {
		return presentacionEnvaseInmediatoMaterial;
	}

	public void setPresentacionEnvaseInmediatoMaterial(
			List<DGM002PresentacionEnvaseInmediatoMaterial> presentacionEnvaseInmediatoMaterial) {
		this.presentacionEnvaseInmediatoMaterial = presentacionEnvaseInmediatoMaterial;
	}

	public List<DGM002PresentacionEnvaseInmediatoColor> getPresentacionEnvaseMediatoColor() {
		return presentacionEnvaseMediatoColor;
	}

	public void setPresentacionEnvaseMediatoColor(
			List<DGM002PresentacionEnvaseInmediatoColor> presentacionEnvaseMediatoColor) {
		this.presentacionEnvaseMediatoColor = presentacionEnvaseMediatoColor;
	}

}
