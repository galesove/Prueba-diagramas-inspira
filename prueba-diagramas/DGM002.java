package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;

public class DGM002 {
	
	private Long dgm002Id;
	
	private String codigoEstablecimiento;
	
	private String categoriaEstablecimiento;
	
	private String almacenEstablecimiento;
	
	private String idDireccionEstablecimiento;
	
	private String direccionEstablecimiento; 

	private String representanteLegal;
	
	private String codigoRegente;
	
	private String cargoRegente;	
	
	private String proteccionDatosPrueba;
	
	private String origenFabricante;
	
	private String fabricanteNacional;
	
	private String fabricanteExtranjero;
	
	private String esAcondicionadora;
	
	private String origenAcondicionadora;
	
	private String acondicionadoraNacional;
	
	private String acondicionadoraExtranjera;
	
	private String esFabricacionEncargo;
	
	private String fabricacionEncargo;
	
	private String nroExpedienteFabricacion;
	
	private String bajoLicenciaDe;
	
	private Integer dgmTipoTramite;
	
	private Long ordenId;

	private Integer mto;

	private String paisFabricante;
	
	private String direccionFabricante;
	
	private DGM002Producto producto;
	
	private String paisAcondicionadora;
	
	private String grupoAtc;
	
	private String nroRegistroSanitarioOrigen;
	
	private Date fechaVencimientoRS;
	
	private String indRsActualizado;
	
	public String getPaisAcondicionadora() {
		return paisAcondicionadora;
	}

	public void setPaisAcondicionadora(String paisAcondicionadora) {
		this.paisAcondicionadora = paisAcondicionadora;
	}

	public Long getDgm002Id() {
		return dgm002Id;
	}

	public void setDgm002Id(Long dgm002Id) {
		this.dgm002Id = dgm002Id;
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

	public String getAlmacenEstablecimiento() {
		return almacenEstablecimiento;
	}

	public void setAlmacenEstablecimiento(String almacenEstablecimiento) {
		this.almacenEstablecimiento = almacenEstablecimiento;
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

	public String getProteccionDatosPrueba() {
		return proteccionDatosPrueba;
	}

	public void setProteccionDatosPrueba(String proteccionDatosPrueba) {
		this.proteccionDatosPrueba = proteccionDatosPrueba;
	}

	public String getOrigenFabricante() {
		return origenFabricante;
	}

	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricante = origenFabricante;
	}

	public String getFabricanteNacional() {
		return fabricanteNacional;
	}

	public void setFabricanteNacional(String fabricanteNacional) {
		this.fabricanteNacional = fabricanteNacional;
	}

	public String getFabricanteExtranjero() {
		return fabricanteExtranjero;
	}

	public void setFabricanteExtranjero(String fabricanteExtranjero) {
		this.fabricanteExtranjero = fabricanteExtranjero;
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

	public String getAcondicionadoraNacional() {
		return acondicionadoraNacional;
	}

	public void setAcondicionadoraNacional(String acondicionadoraNacional) {
		this.acondicionadoraNacional = acondicionadoraNacional;
	}

	public String getAcondicionadoraExtranjera() {
		return acondicionadoraExtranjera;
	}

	public void setAcondicionadoraExtranjera(String acondicionadoraExtranjera) {
		this.acondicionadoraExtranjera = acondicionadoraExtranjera;
	}

	public String getEsFabricacionEncargo() {
		return esFabricacionEncargo;
	}

	public void setEsFabricacionEncargo(String esFabricacionEncargo) {
		this.esFabricacionEncargo = esFabricacionEncargo;
	}

	public String getFabricacionEncargo() {
		return fabricacionEncargo;
	}

	public void setFabricacionEncargo(String fabricacionEncargo) {
		this.fabricacionEncargo = fabricacionEncargo;
	}

	public String getNroExpedienteFabricacion() {
		return nroExpedienteFabricacion;
	}

	public void setNroExpedienteFabricacion(String nroExpedienteFabricacion) {
		this.nroExpedienteFabricacion = nroExpedienteFabricacion;
	}

	public String getBajoLicenciaDe() {
		return bajoLicenciaDe;
	}

	public void setBajoLicenciaDe(String bajoLicenciaDe) {
		this.bajoLicenciaDe = bajoLicenciaDe;
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
	
	public Integer getDgmTipoTramite() {
		return dgmTipoTramite;
	}

	public void setDgmTipoTramite(Integer dgmTipoTramite) {
		this.dgmTipoTramite = dgmTipoTramite;
	}

	public void setProducto(DGM002Producto producto) {
		this.producto = producto;
	}

	public DGM002Producto getProducto() {
		return producto;
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

	public String getGrupoAtc() {
		return grupoAtc;
	}

	public void setGrupoAtc(String grupoAtc) {
		this.grupoAtc = grupoAtc;
	}

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}

	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}

	public Date getFechaVencimientoRS() {
		return fechaVencimientoRS;
	}

	public void setFechaVencimientoRS(Date fechaVencimientoRS) {
		this.fechaVencimientoRS = fechaVencimientoRS;
	}

	public String getIndRsActualizado() {
		return indRsActualizado;
	}

	public void setIndRsActualizado(String indRsActualizado) {
		this.indRsActualizado = indRsActualizado;
	}

}
