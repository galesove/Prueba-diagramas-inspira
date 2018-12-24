package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034Presentacion {

	private Long dgm034Id; 
	private Long secuencia; 
	private Integer tipoEnvaseMediato; 
	private Integer materialEnvaseMediato; 
	private Double cantidadEnvaseMediato; 
	private Integer tipoEnvaseInmediato; 
	private Double cantidadEnvaseInmediato; 
	private String unidadMedidaEnvaseInmediato; 
	private String otrosDatos; 
	private List<DGM034PresentacionEnvaseInmediatoMaterial> dgm034presentacionenvaseinmediatomaterials = new ArrayList<DGM034PresentacionEnvaseInmediatoMaterial>();
	private List<DGM034PresentacionEnvaseInmediatoColor> dgm034presentacionenvaseinmediatocolors = new ArrayList<DGM034PresentacionEnvaseInmediatoColor>();
	private List<DGM034PresentacionEnvaseInmediatoAccesorio> dgm034presentacionenvaseinmediatoaccesorios = new ArrayList<DGM034PresentacionEnvaseInmediatoAccesorio>();

	public Long getDgm034Id() {
		return dgm034Id;
	}
	public void setDgm034Id(Long dgm034Id) {
		this.dgm034Id = dgm034Id;
	}
	public Long getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	public Integer getTipoEnvaseMediato() {
		return tipoEnvaseMediato;
	}
	public void setTipoEnvaseMediato(Integer tipoEnvaseMediato) {
		this.tipoEnvaseMediato = tipoEnvaseMediato;
	}
	public Integer getMaterialEnvaseMediato() {
		return materialEnvaseMediato;
	}
	public void setMaterialEnvaseMediato(Integer materialEnvaseMediato) {
		this.materialEnvaseMediato = materialEnvaseMediato;
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
	public String getOtrosDatos() {
		return otrosDatos;
	}
	public void setOtrosDatos(String otrosDatos) {
		this.otrosDatos = otrosDatos;
	}
	public List getDgm034presentacionenvaseinmediatomaterials() {
		return this.dgm034presentacionenvaseinmediatomaterials;
	}
	public void setDgm034presentacionenvaseinmediatomaterials (List<DGM034PresentacionEnvaseInmediatoMaterial> dgm034presentacionenvaseinmediatomaterials) {
		this.dgm034presentacionenvaseinmediatomaterials = dgm034presentacionenvaseinmediatomaterials;
	}
	public void addDgm034presentacionenvaseinmediatomaterials (DGM034PresentacionEnvaseInmediatoMaterial dgm034presentacionenvaseinmediatomaterial) {
		this.dgm034presentacionenvaseinmediatomaterials.add(dgm034presentacionenvaseinmediatomaterial);
	}
	public List getDgm034presentacionenvaseinmediatocolors() {
		return this.dgm034presentacionenvaseinmediatocolors;
	}
	public void setDgm034presentacionenvaseinmediatocolors (List<DGM034PresentacionEnvaseInmediatoColor> dgm034presentacionenvaseinmediatocolors) {
		this.dgm034presentacionenvaseinmediatocolors = dgm034presentacionenvaseinmediatocolors;
	}
	public void addDgm034presentacionenvaseinmediatocolors (DGM034PresentacionEnvaseInmediatoColor dgm034presentacionenvaseinmediatocolor) {
		this.dgm034presentacionenvaseinmediatocolors.add(dgm034presentacionenvaseinmediatocolor);
	}
	public List getDgm034presentacionenvaseinmediatoaccesorios() {
		return this.dgm034presentacionenvaseinmediatoaccesorios;
	}
	public void setDgm034presentacionenvaseinmediatoaccesorios (List<DGM034PresentacionEnvaseInmediatoAccesorio> dgm034presentacionenvaseinmediatoaccesorios) {
		this.dgm034presentacionenvaseinmediatoaccesorios = dgm034presentacionenvaseinmediatoaccesorios;
	}
	public void addDgm034presentacionenvaseinmediatoaccesorios (DGM034PresentacionEnvaseInmediatoAccesorio dgm034presentacionenvaseinmediatoaccesorio) {
		this.dgm034presentacionenvaseinmediatoaccesorios.add(dgm034presentacionenvaseinmediatoaccesorio);
	}
}
