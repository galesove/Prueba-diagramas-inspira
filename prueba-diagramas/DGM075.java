package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;



public class DGM075  {

	private Long dgm075Id; 
	private Long ordenId; 
	private Integer mto; 
	private String codigoEstablecimiento; 
	private String categoriaEstablecimiento; 
	private String nombreComercial; 
	private String direccionEstablecimiento; 
	private String codigoRegente; 
	private String cargoRegente; 
	private String nroColegiaturaDirector; 
	private String telefonoDirector; 
	private String emailDirector; 
	private String representanteLegal; 
	private String nombreRepresentante; 
	private String telefonoRepLegal; 
	private String emailRepLegal; 
	private Integer dgmTipoImportacionExcep; 
	private String descripcionOtro; 
	private String nombre; 
	private String direccion; 
	private String nombreLugar; 
	private Integer duracion; 
	private Integer unidadTiempoId; 
	private String nombrePatrocinador; 
	private String direccionLugar; 
	private Integer distritoIdLugar;
	// Informacion Solicitante
	private String telefonoRepresentanteLegal;
	private String emailRepresentanteLegal;
	
	private List<DGM075Producto> productos = new ArrayList<DGM075Producto>();
	

	public Long getDgm075Id() {
		return dgm075Id;
	}
	public void setDgm075Id(Long dgm075Id) {
		this.dgm075Id = dgm075Id;
	}
	public Long getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(Long ordenId) {
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
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}
	public void setDireccionEstablecimiento(String direccionEstablecimiento) {
		this.direccionEstablecimiento = direccionEstablecimiento;
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
	public String getNroColegiaturaDirector() {
		return nroColegiaturaDirector;
	}
	public void setNroColegiaturaDirector(String nroColegiaturaDirector) {
		this.nroColegiaturaDirector = nroColegiaturaDirector;
	}
	public String getTelefonoDirector() {
		return telefonoDirector;
	}
	public void setTelefonoDirector(String telefonoDirector) {
		this.telefonoDirector = telefonoDirector;
	}
	public String getEmailDirector() {
		return emailDirector;
	}
	public void setEmailDirector(String emailDirector) {
		this.emailDirector = emailDirector;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getNombreRepresentante() {
		return nombreRepresentante;
	}
	public void setNombreRepresentante(String nombreRepresentante) {
		this.nombreRepresentante = nombreRepresentante;
	}
	public String getTelefonoRepLegal() {
		return telefonoRepLegal;
	}
	public void setTelefonoRepLegal(String telefonoRepLegal) {
		this.telefonoRepLegal = telefonoRepLegal;
	}
	public String getEmailRepLegal() {
		return emailRepLegal;
	}
	public void setEmailRepLegal(String emailRepLegal) {
		this.emailRepLegal = emailRepLegal;
	}
	public Integer getDgmTipoImportacionExcep() {
		return dgmTipoImportacionExcep;
	}
	public void setDgmTipoImportacionExcep(Integer dgmTipoImportacionExcep) {
		this.dgmTipoImportacionExcep = dgmTipoImportacionExcep;
	}
	public String getDescripcionOtro() {
		return descripcionOtro;
	}
	public void setDescripcionOtro(String descripcionOtro) {
		this.descripcionOtro = descripcionOtro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombreLugar() {
		return nombreLugar;
	}
	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public Integer getUnidadTiempoId() {
		return unidadTiempoId;
	}
	public void setUnidadTiempoId(Integer unidadTiempoId) {
		this.unidadTiempoId = unidadTiempoId;
	}
	public String getNombrePatrocinador() {
		return nombrePatrocinador;
	}
	public void setNombrePatrocinador(String nombrePatrocinador) {
		this.nombrePatrocinador = nombrePatrocinador;
	}
	public String getDireccionLugar() {
		return direccionLugar;
	}
	public void setDireccionLugar(String direccionLugar) {
		this.direccionLugar = direccionLugar;
	}
	public Integer getDistritoIdLugar() {
		return distritoIdLugar;
	}
	public void setDistritoIdLugar(Integer distritoIdLugar) {
		this.distritoIdLugar = distritoIdLugar;
	}
	
	public String getTelefonoRepresentanteLegal() {
		return telefonoRepresentanteLegal;
	}
	public void setTelefonoRepresentanteLegal(String telefonoRepresentanteLegal) {
		this.telefonoRepresentanteLegal = telefonoRepresentanteLegal;
	}
	public String getEmailRepresentanteLegal() {
		return emailRepresentanteLegal;
	}
	public void setEmailRepresentanteLegal(String emailRepresentanteLegal) {
		this.emailRepresentanteLegal = emailRepresentanteLegal;
	}	
	
	public List<DGM075Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<DGM075Producto> productos) {
		this.productos = productos;
	}
}
