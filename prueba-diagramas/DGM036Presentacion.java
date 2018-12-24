package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM036Presentacion {

	private Long dgm036Id;
	private Integer secuenciaPresentacion;
	private Integer envaseMediato;
	private Integer materialMediato;
	private BigDecimal cantidadEMediato;
	private Integer envaseInmediato;
	private BigDecimal cantidadEInmediato;
	private String unidadMedida;
	private String datoComplementario;

	private List<DGM036PresentacionAccesorios> accesoriosPresentacion;
	
	private List<DGM036PresentacionMaterialInmediato> materialInmediatoPresentacion;
	
	private List<DGM036PresentacionColorInmediato> colorInmediatoPresentacion;

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
	}

	public Long getDgm036Id() {
		return dgm036Id;
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

	public void setCantidadEMediato(BigDecimal cantidadEMediato) {
		this.cantidadEMediato = cantidadEMediato;
	}

	public BigDecimal getCantidadEMediato() {
		return cantidadEMediato;
	}

	public void setEnvaseInmediato(Integer envaseInmediato) {
		this.envaseInmediato = envaseInmediato;
	}

	public Integer getEnvaseInmediato() {
		return envaseInmediato;
	}

	public void setCantidadEInmediato(BigDecimal cantidadEInmediato) {
		this.cantidadEInmediato = cantidadEInmediato;
	}

	public BigDecimal getCantidadEInmediato() {
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

	public List<DGM036PresentacionAccesorios> getAccesoriosPresentacion() {
		return accesoriosPresentacion;
	}

	public void setAccesoriosPresentacion(List<DGM036PresentacionAccesorios> accesoriosPresentacion) {
		this.accesoriosPresentacion = accesoriosPresentacion;
	}

	public List<DGM036PresentacionMaterialInmediato> getMaterialInmediatoPresentacion() {
		return materialInmediatoPresentacion;
	}

	public void setMaterialInmediatoPresentacion(List<DGM036PresentacionMaterialInmediato> materialInmediatoPresentacion) {
		this.materialInmediatoPresentacion = materialInmediatoPresentacion;
	}

	public List<DGM036PresentacionColorInmediato> getColorInmediatoPresentacion() {
		return colorInmediatoPresentacion;
	}

	public void setColorInmediatoPresentacion(List<DGM036PresentacionColorInmediato> colorInmediatoPresentacion) {
		this.colorInmediatoPresentacion = colorInmediatoPresentacion;
	}

}
