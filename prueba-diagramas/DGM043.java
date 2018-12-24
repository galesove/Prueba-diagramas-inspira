package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;

public class DGM043 {

	private Long dgm043Id; 
	private Long ordenId; 
	private Integer mto; 
	private String nroRegistroSanitarioOrigen; 
	private String nroResolucionOrigen; 
	private String codigoEstablecimiento; 
	private String categoriaEstablecimiento; 
	private String direccionEstablecimiento; 
	private String idDireccionEstablecimiento;
	private String representanteLegal; 
	private String codigoRegente; 
	private String cargoRegente; 
	private String nombreProducto; 
	private String concentracion; 
	private String formaFarmaceutica; 
	private String condicionVenta; 
	private String origenFabricante; 
	private String codigoFabricante; 
	private String nombreFabricante; 
	private String origenAcondicionadora; 
	private String nombreAcondicionadora;
	private String codigoAcondicionadora; 
	private String fabricacionEncargo; 
	private String bajoLicenciaDe; 
	private Long drId; 
	private Long sdr;
	private String ano;
	private String dr;
	
	private String grupoProducto;
	private Date   fechaVencimiento;
	private String expReinscripcion;
	private Date   fechaExpReins;
	
	public Long getDgm043Id() {
		return dgm043Id;
	}
	public void setDgm043Id(Long dgm043Id) {
		this.dgm043Id = dgm043Id;
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
	
	public String getConcentracion() {
		return concentracion;
	}
	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}
	
	public Long getSdr() {
		return sdr;
	}
	public void setSdr(Long sdr) {
		this.sdr = sdr;
	}
	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}
	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}
	public void setDrId(Long drId) {
		this.drId = drId;
	}
	public Long getDrId() {
		return drId;
	}
	public void setBajoLicenciaDe(String bajoLicenciaDe) {
		this.bajoLicenciaDe = bajoLicenciaDe;
	}
	public String getBajoLicenciaDe() {
		return bajoLicenciaDe;
	}
	public void setNroResolucionOrigen(String nroResolucionOrigen) {
		this.nroResolucionOrigen = nroResolucionOrigen;
	}
	public String getNroResolucionOrigen() {
		return nroResolucionOrigen;
	}
	public void setCodigoEstablecimiento(String codigoEstablecimiento) {
		this.codigoEstablecimiento = codigoEstablecimiento;
	}
	public String getCodigoEstablecimiento() {
		return codigoEstablecimiento;
	}
	public void setCategoriaEstablecimiento(String categoriaEstablecimiento) {
		this.categoriaEstablecimiento = categoriaEstablecimiento;
	}
	public String getCategoriaEstablecimiento() {
		return categoriaEstablecimiento;
	}
	public void setDireccionEstablecimiento(String direccionEstablecimiento) {
		this.direccionEstablecimiento = direccionEstablecimiento;
	}
	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setCodigoRegente(String codigoRegente) {
		this.codigoRegente = codigoRegente;
	}
	public String getCodigoRegente() {
		return codigoRegente;
	}
	public void setCargoRegente(String cargoRegente) {
		this.cargoRegente = cargoRegente;
	}
	public String getCargoRegente() {
		return cargoRegente;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}
	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}
	public void setCondicionVenta(String condicionVenta) {
		this.condicionVenta = condicionVenta;
	}
	public String getCondicionVenta() {
		return condicionVenta;
	}
	public void setFabricacionEncargo(String fabricacionEncargo) {
		this.fabricacionEncargo = fabricacionEncargo;
	}
	public String getFabricacionEncargo() {
		return fabricacionEncargo;
	}
	public void setNombreAcondicionadora(String nombreAcondicionadora) {
		this.nombreAcondicionadora = nombreAcondicionadora;
	}
	public String getNombreAcondicionadora() {
		return nombreAcondicionadora;
	}
	public void setCodigoAcondicionadora(String codigoAcondicionadora) {
		this.codigoAcondicionadora = codigoAcondicionadora;
	}
	public String getCodigoAcondicionadora() {
		return codigoAcondicionadora;
	}
	public void setOrigenAcondicionadora(String origenAcondicionadora) {
		this.origenAcondicionadora = origenAcondicionadora;
	}
	public String getOrigenAcondicionadora() {
		return origenAcondicionadora;
	}
	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricante = origenFabricante;
	}
	public String getOrigenFabricante() {
		return origenFabricante;
	}
	public void setCodigoFabricante(String codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}
	public String getCodigoFabricante() {
		return codigoFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getDr() {
		return dr;
	}
	public void setDr(String dr) {
		this.dr = dr;
	}
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getExpReinscripcion() {
		return expReinscripcion;
	}
	public void setExpReinscripcion(String expReinscripcion) {
		this.expReinscripcion = expReinscripcion;
	}
	public Date getFechaExpReins() {
		return fechaExpReins;
	}
	public void setFechaExpReins(Date fechaExpReins) {
		this.fechaExpReins = fechaExpReins;
	}
}
