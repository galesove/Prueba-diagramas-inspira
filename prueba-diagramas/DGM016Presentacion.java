package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM016Presentacion {

	private Long dgm016Id;
	private Integer secuenciaPresentacion;
	private Integer envaseMediato;
	private Integer materialMediato;
	private Double cantidadEMediato;
	private Integer envaseInmediato;
	private Double cantidadEInmediato;
	private String unidadMedida;
	private String datoComplementario;

	private List<DGM016PresentacionAccesorios> accesoriosPresentacion;
	
	private List<DGM016PresentacionMaterialInmediato> materialInmediatoPresentacion;
	
	private List<DGM016PresentacionColorInmediato> colorInmediatoPresentacion;

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public Long getDgm016Id() {
		return dgm016Id;
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

	public List<DGM016PresentacionAccesorios> getAccesoriosPresentacion() {
		return accesoriosPresentacion;
	}

	public void setAccesoriosPresentacion(List<DGM016PresentacionAccesorios> accesoriosPresentacion) {
		this.accesoriosPresentacion = accesoriosPresentacion;
	}

	public List<DGM016PresentacionMaterialInmediato> getMaterialInmediatoPresentacion() {
		return materialInmediatoPresentacion;
	}

	public void setMaterialInmediatoPresentacion(List<DGM016PresentacionMaterialInmediato> materialInmediatoPresentacion) {
		this.materialInmediatoPresentacion = materialInmediatoPresentacion;
	}

	public List<DGM016PresentacionColorInmediato> getColorInmediatoPresentacion() {
		return colorInmediatoPresentacion;
	}

	public void setColorInmediatoPresentacion(List<DGM016PresentacionColorInmediato> colorInmediatoPresentacion) {
		this.colorInmediatoPresentacion = colorInmediatoPresentacion;
	}

}
