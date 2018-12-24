package pe.gob.mincetur.vuce.vc.domain.digemid;


import java.util.Date; 

/**
 * DGM073_PRODUCTO
 * @author vucedev
 *
 */
public class DGM073Producto  {

	private Long dgm073Id; 
	private Integer secuenciaProducto; 
	private String grupoProducto; 
	private String nombreProducto; 
	private String denominacionInternacionalDci; 
	private String concentracion; 
	private Integer formaFarmaceutica; 
	private Integer formaCosmetica; 
	private String tipoAcondicionado; 
	private Long usuidRegAud; 
	private Long usuidModAud; 
	private Date fechaRegAud; 
	private Date fechaModAud; 
	private String usubdRegAud; 
	private String usubdModAud; 

	public Long getDgm073Id() {
		return dgm073Id;
	}
	public void setDgm073Id(Long dgm073Id) {
		this.dgm073Id = dgm073Id;
	}
	public Integer getSecuenciaProducto() {
		return secuenciaProducto;
	}
	public void setSecuenciaProducto(Integer secuenciaProducto) {
		this.secuenciaProducto = secuenciaProducto;
	}
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDenominacionInternacionalDci() {
		return denominacionInternacionalDci;
	}
	public void setDenominacionInternacionalDci(String denominacionInternacionalDci) {
		this.denominacionInternacionalDci = denominacionInternacionalDci;
	}
	public String getConcentracion() {
		return concentracion;
	}
	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}
	public Integer getFormaFarmaceutica() {
		return formaFarmaceutica;
	}
	public void setFormaFarmaceutica(Integer formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}
	public Integer getFormaCosmetica() {
		return formaCosmetica;
	}
	public void setFormaCosmetica(Integer formaCosmetica) {
		this.formaCosmetica = formaCosmetica;
	}
	public String getTipoAcondicionado() {
		return tipoAcondicionado;
	}
	public void setTipoAcondicionado(String tipoAcondicionado) {
		this.tipoAcondicionado = tipoAcondicionado;
	}
	public Long getUsuidRegAud() {
		return usuidRegAud;
	}
	public void setUsuidRegAud(Long usuidRegAud) {
		this.usuidRegAud = usuidRegAud;
	}
	public Long getUsuidModAud() {
		return usuidModAud;
	}
	public void setUsuidModAud(Long usuidModAud) {
		this.usuidModAud = usuidModAud;
	}
	public Date getFechaRegAud() {
		return fechaRegAud;
	}
	public void setFechaRegAud(Date fechaRegAud) {
		this.fechaRegAud = fechaRegAud;
	}
	public Date getFechaModAud() {
		return fechaModAud;
	}
	public void setFechaModAud(Date fechaModAud) {
		this.fechaModAud = fechaModAud;
	}
	public String getUsubdRegAud() {
		return usubdRegAud;
	}
	public void setUsubdRegAud(String usubdRegAud) {
		this.usubdRegAud = usubdRegAud;
	}
	public String getUsubdModAud() {
		return usubdModAud;
	}
	public void setUsubdModAud(String usubdModAud) {
		this.usubdModAud = usubdModAud;
	}
	
}
