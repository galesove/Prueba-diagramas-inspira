package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM066 {

	private Long dgm066Id;
	private Long ordenId;
	private Integer mto;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String nombreComercial;
	private String idDireccionEstablecimiento;
	private String direccionEstablecimiento;
	private String codigoRegente;
	private String cargoRegente;
	private String nroColegiaturaDirector;
	private String telefonoDirector;
	private String emailDirector;
	private String representanteLegal;
	private String nombreRepresentante;
	private String telefonoRepresentanteLegal;
	private String emailRepresentanteLegal;
	private String nroRegistroSanitarioOrigen;
	private String grupoProducto;
	private String nombreProducto;
	private String concentracion;
	private String formaFarmaceutica;
	private String origenProducto;
	private Date fechaVencimientoRS;
	private String nroRegistroSanitarioReins;
	private Date fechaVencimientoRSReins;
	private Integer dgmMotivo;
	private String detalleMotivo;
	private Long nroDocumentoFabricante;
	private String nombreFabricante;
	private String codigoFabricante;
	private String paisFabricante;
	private String direccionFabricante;
	private String esAcondicionadora;
	private String origenAcondicionadora;
	private String nombreAcondicionadora;
	private String paisAcondicionadora;
	private String bajoLicenciaDe;
	private Integer dgmIndOrigenRS;
	private String esTitularRS;
	private String nroCertificadoRS;
	private String          ventaPromedioMensual;
	private Integer         tiempoAgotamientoExistencia;
	private String telefonoEst; 
	private String emailEst;
	
	private List<DGM066Lote> dgm066lote = new ArrayList<DGM066Lote>();

	public Long getDgm066Id() {
		return dgm066Id;
	}

	public void setDgm066Id(Long dgm066Id) {
		this.dgm066Id = dgm066Id;
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

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
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

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}

	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
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

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}

	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}

	public String getOrigenProducto() {
		return origenProducto;
	}

	public void setOrigenProducto(String origenProducto) {
		this.origenProducto = origenProducto;
	}

	public Date getFechaVencimientoRS() {
		return fechaVencimientoRS;
	}

	public void setFechaVencimientoRS(Date fechaVencimientoRS) {
		this.fechaVencimientoRS = fechaVencimientoRS;
	}

	public String getNroRegistroSanitarioReins() {
		return nroRegistroSanitarioReins;
	}

	public void setNroRegistroSanitarioReins(String nroRegistroSanitarioReins) {
		this.nroRegistroSanitarioReins = nroRegistroSanitarioReins;
	}

	public Date getFechaVencimientoRSReins() {
		return fechaVencimientoRSReins;
	}

	public void setFechaVencimientoRSReins(Date fechaVencimientoRSReins) {
		this.fechaVencimientoRSReins = fechaVencimientoRSReins;
	}

	public Integer getDgmMotivo() {
		return dgmMotivo;
	}

	public void setDgmMotivo(Integer dgmMotivo) {
		this.dgmMotivo = dgmMotivo;
	}

	public String getDetalleMotivo() {
		return detalleMotivo;
	}

	public void setDetalleMotivo(String detalleMotivo) {
		this.detalleMotivo = detalleMotivo;
	}

	public Long getNroDocumentoFabricante() {
		return nroDocumentoFabricante;
	}

	public void setNroDocumentoFabricante(Long nroDocumentoFabricante) {
		this.nroDocumentoFabricante = nroDocumentoFabricante;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	public String getCodigoFabricante() {
		return codigoFabricante;
	}

	public void setCodigoFabricante(String codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}

	public String getPaisFabricante() {
		return paisFabricante;
	}

	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
	}

	public String getDireccionFabricante() {
		return direccionFabricante;
	}

	public void setDireccionFabricante(String direccionFabricante) {
		this.direccionFabricante = direccionFabricante;
	}

	public String getEsAcondicionadora() {
		return esAcondicionadora;
	}

	public void setEsAcondicionadora(String esAcondicionadora) {
		this.esAcondicionadora = esAcondicionadora;
	}

	public String getOrigenAcondicionadora() {
		return origenAcondicionadora;
	}

	public void setOrigenAcondicionadora(String origenAcondicionadora) {
		this.origenAcondicionadora = origenAcondicionadora;
	}

	public String getNombreAcondicionadora() {
		return nombreAcondicionadora;
	}

	public void setNombreAcondicionadora(String nombreAcondicionadora) {
		this.nombreAcondicionadora = nombreAcondicionadora;
	}

	public String getPaisAcondicionadora() {
		return paisAcondicionadora;
	}

	public void setPaisAcondicionadora(String paisAcondicionadora) {
		this.paisAcondicionadora = paisAcondicionadora;
	}

	public String getBajoLicenciaDe() {
		return bajoLicenciaDe;
	}

	public void setBajoLicenciaDe(String bajoLicenciaDe) {
		this.bajoLicenciaDe = bajoLicenciaDe;
	}

	public Integer getDgmIndOrigenRS() {
		return dgmIndOrigenRS;
	}

	public void setDgmIndOrigenRS(Integer dgmIndOrigenRS) {
		this.dgmIndOrigenRS = dgmIndOrigenRS;
	}
	public List<DGM066Lote> getDgm066lote() {
		return dgm066lote;
	}

	public void setDgm066lote(List<DGM066Lote> dgm066lote) {
		this.dgm066lote = dgm066lote;
	}

	public String getEsTitularRS() {
		return esTitularRS;
	}

	public void setEsTitularRS(String esTitularRS) {
		this.esTitularRS = esTitularRS;
	}

	public String getNroCertificadoRS() {
		return nroCertificadoRS;
	}

	public void setNroCertificadoRS(String nroCertificadoRS) {
		this.nroCertificadoRS = nroCertificadoRS;
	}

	public String getVentaPromedioMensual() {
		return ventaPromedioMensual;
	}

	public void setVentaPromedioMensual(String ventaPromedioMensual) {
		this.ventaPromedioMensual = ventaPromedioMensual;
	}

	public Integer getTiempoAgotamientoExistencia() {
		return tiempoAgotamientoExistencia;
	}

	public void setTiempoAgotamientoExistencia(Integer tiempoAgotamientoExistencia) {
		this.tiempoAgotamientoExistencia = tiempoAgotamientoExistencia;
	}
	public String getTelefonoEst() {
		return telefonoEst;
	}

	public void setTelefonoEst(String telefonoEst) {
		this.telefonoEst = telefonoEst;
	}

	public String getEmailEst() {
		return emailEst;
	}

	public void setEmailEst(String emailEst) {
		this.emailEst = emailEst;
	}
	
}
