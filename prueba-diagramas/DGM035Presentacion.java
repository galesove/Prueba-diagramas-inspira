package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035Presentacion {

	private Long dgm035Id;
	private Integer secuenciaPresentacion;
	private Integer envaseMediato;
	private Integer materialMediato;
	private Double cantidadEMediato;
	private Integer envaseInmediato;
	private Double cantidadEInmediato;
	private String unidadMedida;
	private String datoComplementario;

	private List<DGM035PresentacionAccesorios> accesoriosPresentacion;
	
	private List<DGM035PresentacionMaterialInmediato> materialInmediatoPresentacion;
	
	private List<DGM035PresentacionColorInmediato> colorInmediatoPresentacion;

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setSecuenciaPresentacion(Integer secuenciaPresentacion) {
		this.secuenciaPresentacion = secuenciaPresentacion;
	}

	public Integer getSecuenciaPresentacion() {
		return secuenciaPresentacion;
	}

	public void setEnvaseMediato(Integer envaseMediato) {
		this.envaseMediato = envaseMediato;
	}

	public Integer getEnvaseMediato() {
		return envaseMediato;
	}

	public void setMaterialMediato(Integer materialMediato) {
		this.materialMediato = materialMediato;
	}

	public Integer getMaterialMediato() {
		return materialMediato;
	}

	public void setCantidadEMediato(Double cantidadEMediato) {
		this.cantidadEMediato = cantidadEMediato;
	}

	public Double getCantidadEMediato() {
		return cantidadEMediato;
	}

	public void setEnvaseInmediato(Integer envaseInmediato) {
		this.envaseInmediato = envaseInmediato;
	}

	public Integer getEnvaseInmediato() {
		return envaseInmediato;
	}

	public void setCantidadEInmediato(Double cantidadEInmediato) {
		this.cantidadEInmediato = cantidadEInmediato;
	}

	public Double getCantidadEInmediato() {
		return cantidadEInmediato;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}


	public void setDatoComplementario(String datoComplementario) {
		this.datoComplementario = datoComplementario;
	}

	public String getDatoComplementario() {
		return datoComplementario;
	}

	public List<DGM035PresentacionAccesorios> getAccesoriosPresentacion() {
		return accesoriosPresentacion;
	}

	public void setAccesoriosPresentacion(List<DGM035PresentacionAccesorios> accesoriosPresentacion) {
		this.accesoriosPresentacion = accesoriosPresentacion;
	}

	public List<DGM035PresentacionMaterialInmediato> getMaterialInmediatoPresentacion() {
		return materialInmediatoPresentacion;
	}

	public void setMaterialInmediatoPresentacion(List<DGM035PresentacionMaterialInmediato> materialInmediatoPresentacion) {
		this.materialInmediatoPresentacion = materialInmediatoPresentacion;
	}

	public List<DGM035PresentacionColorInmediato> getColorInmediatoPresentacion() {
		return colorInmediatoPresentacion;
	}

	public void setColorInmediatoPresentacion(List<DGM035PresentacionColorInmediato> colorInmediatoPresentacion) {
		this.colorInmediatoPresentacion = colorInmediatoPresentacion;
	}

}
