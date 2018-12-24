package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;


public class DGM038 {

	private Integer dgm038Id; 
	private Integer ordenId; 
	private Integer mto; 
	private String codigoEstablecimiento; 
	private String categoriaEstablecimiento; 
	private String direccionEstablecimiento; 
	private String representanteLegal; 
	private String codigoRegente; 
	private String cargoRegente; 
	private String nroRegistroSanitarioOrigen; 
	private String nombreProductoOld; 
	private String nombreProductoNew; 
	private String grupoProducto;
	private String grupoProductoDesc;
	private String idDireccionEstablecimiento;
	//private Integer tupaIdModificado;
	private String expedienteReinscripcion;
	
	//VERSION_II
	private Date fechaVencimientoRs;
	private Date fechaExpReins;

	public Integer getDgm038Id() {
		return dgm038Id;
	}
	public void setDgm038Id(Integer dgm038Id) {
		this.dgm038Id = dgm038Id;
	}
	public Integer getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(Integer ordenId) {
		this.ordenId = ordenId;
	}
	public Integer getMto() {
		return mto;
	}
	public void setMto(Integer mto) {
		this.mto = mto;
	}
	public String getCodigoEstablecimiento() {
		return codigoEstablecimiento;
	}
	public void setCodigoEstablecimiento(String codigoEstablecimiento) {
		this.codigoEstablecimiento = codigoEstablecimiento;
	}
	public String getCategoriaEstablecimiento() {
		return categoriaEstablecimiento;
	}
	public void setCategoriaEstablecimiento(String categoriaEstablecimiento) {
		this.categoriaEstablecimiento = categoriaEstablecimiento;
	}
	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}
	public void setDireccionEstablecimiento(String direccionEstablecimiento) {
		this.direccionEstablecimiento = direccionEstablecimiento;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getCodigoRegente() {
		return codigoRegente;
	}
	public void setCodigoRegente(String codigoRegente) {
		this.codigoRegente = codigoRegente;
	}
	public String getCargoRegente() {
		return cargoRegente;
	}
	public void setCargoRegente(String cargoRegente) {
		this.cargoRegente = cargoRegente;
	}
	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}
	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}
	public String getNombreProductoOld() {
		return nombreProductoOld;
	}
	public void setNombreProductoOld(String nombreProductoOld) {
		this.nombreProductoOld = nombreProductoOld;
	}
	public String getNombreProductoNew() {
		return nombreProductoNew;
	}
	public void setNombreProductoNew(String nombreProductoNew) {
		this.nombreProductoNew = nombreProductoNew;
	}
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	/*public Integer getTupaIdModificado() {
		return tupaIdModificado;
	}
	public void setTupaIdModificado(Integer tupaIdModificado) {
		this.tupaIdModificado = tupaIdModificado;
	}*/
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public String getGrupoProductoDesc() {
		return grupoProductoDesc;
	}
	public void setGrupoProductoDesc(String grupoProductoDesc) {
		this.grupoProductoDesc = grupoProductoDesc;
	}
	public String getExpedienteReinscripcion() {
		return expedienteReinscripcion;
	}
	public void setExpedienteReinscripcion(String expedienteReinscripcion) {
		this.expedienteReinscripcion = expedienteReinscripcion;
	}
	
	public Date getFechaVencimientoRs() {
		return fechaVencimientoRs;
	}
	public void setFechaVencimientoRs(Date fechaVencimientoRs) {
		this.fechaVencimientoRs = fechaVencimientoRs;
	}
	public Date getFechaExpReins() {
		return fechaExpReins;
	}
	public void setFechaExpReins(Date fechaExpReins) {
		this.fechaExpReins = fechaExpReins;
	}
}
