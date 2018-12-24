package pe.prueba.domain.dgm;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DGM007Presentacion {

	private Long dgm007Id; 
	private Long secuencia; 
	private Integer tipoEnvaseMediato; 
	private Integer materialEnvaseMediato; 
	private BigDecimal cantidadEnvaseMediato; 
	private Integer tipoEnvaseInmediato; 
	private BigDecimal cantidadEnvaseInmediato; 
	private String unidadMedidaEnvaseInmediato; 
	private String otrosDatos; 
	private List<DGM007PresentacionEnvaseInmediatoMaterial> dgm007presentacionenvaseinmediatomaterials = new ArrayList<DGM007PresentacionEnvaseInmediatoMaterial>();
	private List<DGM007PresentacionEnvaseInmediatoColor> dgm007presentacionenvaseinmediatocolors = new ArrayList<DGM007PresentacionEnvaseInmediatoColor>();
	private List<DGM007PresentacionEnvaseInmediatoAccesorio> dgm007presentacionenvaseinmediatoaccesorios = new ArrayList<DGM007PresentacionEnvaseInmediatoAccesorio>();

	public Long getDgm007Id() {
		return dgm007Id;
	}
	public void setDgm007Id(Long dgm007Id) {
		this.dgm007Id = dgm007Id;
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
	public BigDecimal getCantidadEnvaseMediato() {
		return cantidadEnvaseMediato;
	}
	public void setCantidadEnvaseMediato(BigDecimal cantidadEnvaseMediato) {
		this.cantidadEnvaseMediato = cantidadEnvaseMediato;
	}
	public Integer getTipoEnvaseInmediato() {
		return tipoEnvaseInmediato;
	}
	public void setTipoEnvaseInmediato(Integer tipoEnvaseInmediato) {
		this.tipoEnvaseInmediato = tipoEnvaseInmediato;
	}
	public BigDecimal getCantidadEnvaseInmediato() {
		return cantidadEnvaseInmediato;
	}
	public void setCantidadEnvaseInmediato(BigDecimal cantidadEnvaseInmediato) {
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
	public List getDgm007presentacionenvaseinmediatomaterials() {
		return this.dgm007presentacionenvaseinmediatomaterials;
	}
	public void setDgm007presentacionenvaseinmediatomaterials (List<DGM007PresentacionEnvaseInmediatoMaterial> dgm007presentacionenvaseinmediatomaterials) {
		this.dgm007presentacionenvaseinmediatomaterials = dgm007presentacionenvaseinmediatomaterials;
	}
	public void addDgm007presentacionenvaseinmediatomaterials (DGM007PresentacionEnvaseInmediatoMaterial dgm007presentacionenvaseinmediatomaterial) {
		this.dgm007presentacionenvaseinmediatomaterials.add(dgm007presentacionenvaseinmediatomaterial);
	}
	public List getDgm007presentacionenvaseinmediatocolors() {
		return this.dgm007presentacionenvaseinmediatocolors;
	}
	public void setDgm007presentacionenvaseinmediatocolors (List<DGM007PresentacionEnvaseInmediatoColor> dgm007presentacionenvaseinmediatocolors) {
		this.dgm007presentacionenvaseinmediatocolors = dgm007presentacionenvaseinmediatocolors;
	}
	public void addDgm007presentacionenvaseinmediatocolors (DGM007PresentacionEnvaseInmediatoColor dgm007presentacionenvaseinmediatocolor) {
		this.dgm007presentacionenvaseinmediatocolors.add(dgm007presentacionenvaseinmediatocolor);
	}
	public List getDgm007presentacionenvaseinmediatoaccesorios() {
		return this.dgm007presentacionenvaseinmediatoaccesorios;
	}
	public void setDgm007presentacionenvaseinmediatoaccesorios (List<DGM007PresentacionEnvaseInmediatoAccesorio> dgm007presentacionenvaseinmediatoaccesorios) {
		this.dgm007presentacionenvaseinmediatoaccesorios = dgm007presentacionenvaseinmediatoaccesorios;
	}
	public void addDgm007presentacionenvaseinmediatoaccesorios (DGM007PresentacionEnvaseInmediatoAccesorio dgm007presentacionenvaseinmediatoaccesorio) {
		this.dgm007presentacionenvaseinmediatoaccesorios.add(dgm007presentacionenvaseinmediatoaccesorio);
	}
}
