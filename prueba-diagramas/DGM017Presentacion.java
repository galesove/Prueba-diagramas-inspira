package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM017Presentacion {

	private Long dgm017Id;
	private Integer secuenciaPresentacion;
	private Integer envaseMediato;
	private Integer materialMediato;
	private BigDecimal cantidadEMediato;
	private Integer envaseInmediato;
	private BigDecimal cantidadEInmediato;
	private String unidadMedida;
	private String datoComplementario;

	private List<DGM017PresentacionAccesorios> accesoriosPresentacion;
	
	private List<DGM017PresentacionMaterialInmediato> materialInmediatoPresentacion;
	
	private List<DGM017PresentacionColorInmediato> colorInmediatoPresentacion;

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
	}

	public Long getDgm017Id() {
		return dgm017Id;
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

	public List<DGM017PresentacionAccesorios> getAccesoriosPresentacion() {
		return accesoriosPresentacion;
	}

	public void setAccesoriosPresentacion(List<DGM017PresentacionAccesorios> accesoriosPresentacion) {
		this.accesoriosPresentacion = accesoriosPresentacion;
	}

	public List<DGM017PresentacionMaterialInmediato> getMaterialInmediatoPresentacion() {
		return materialInmediatoPresentacion;
	}

	public void setMaterialInmediatoPresentacion(List<DGM017PresentacionMaterialInmediato> materialInmediatoPresentacion) {
		this.materialInmediatoPresentacion = materialInmediatoPresentacion;
	}

	public List<DGM017PresentacionColorInmediato> getColorInmediatoPresentacion() {
		return colorInmediatoPresentacion;
	}

	public void setColorInmediatoPresentacion(List<DGM017PresentacionColorInmediato> colorInmediatoPresentacion) {
		this.colorInmediatoPresentacion = colorInmediatoPresentacion;
	}

}
