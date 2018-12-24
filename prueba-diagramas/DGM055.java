package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM055 {
	private Long dgm055Id;
	private Long ordenId;
	private Integer mto;
	// DR_ID_ORIGEN, SDR_ORIGEN
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	// NOMBRE_COMERCIAL
	private String nombreComercial;
	private String direccionEstablecimiento;
	private String idDireccionEstablecimiento;
	private String codigoRegente;
	private String cargoRegente;
	// NRO_COLEGIATURA_DIRECTOR, TELEFONO_DIRECTOR, EMAIL_DIRECTOR
	private String nroColegiaturaDirector;
	private String telefonoDirector;
	private String emailDirector;
	private String representanteLegal;
	// NOMBRE_REPRESENTANTE, TELEFONO_REP_LEGAL, EMAIL_REP_LEGAL
	private String nombreRepresentante;
	private String telefonoRepresentanteLegal;
	private String emailRepresentanteLegal;
	private String grupoAtc;
	// CATEGORIA
	private String categoria;
	private String proteccionDatosPrueba;
	private DGM055Producto producto;
	private String nombreFabricante;
	private String fabricanteNacional;
	private String fabricanteExtranjero;
	private String paisFabricante;
	private String direccionFabricante;
	// TELEFONO_FABRICANTE
	private String telefonoFabricante;
	private String esAcondicionadora;
	private String origenAcondicionadora;
	private String nombreAcondicionadora;
	private String acondicionadoraNacional;
	private String acondicionadoraExtranjera;
	private String paisAcondicionadora;
	// DIRECCION_ACONDICIONADORA
	private String direccionAcondicionadora;
	private String esFabricacionEncargo;
	private String fabricacionEncargo;
	private String nroExpedienteFabricacion;
	// NRO_RESOLUCION_FABRICACION
	private String nroResolucionFabricacion;
	private String bajoLicenciaDe;
	// PAIS_LICENCIANTE
	private String paisLicenciante;
	
	private String paisAltaVigilancia;

	// TODO: Eliminar este atributo
	private String origenFabricante;
	private String dgmTipoTramite;
	private String esInscripcion;
	private String esReinscripcion;
	private String indRsActualizado;
	
	// Version III
	private Integer dgmClasificacionProd;
	private Integer dgmTipoExpediente;
	private String esReacondicionadora;
	private String origenReacondicionadora;
	private String nombreReacondicionadora;
	private String reacondicionadoraNacional;
	private String reacondicionadoraExtranjera;
	private String paisReacondicionadora;
	private String esEnvasadora;
	private String origenEnvasadora;
	private String nombreEnvasadora;
	private String envasadoraNacional;
	private String envasadoraExtranjera;
	private String paisEnvasadora;
	
	private String          condicionalAlmacenamiento;	
	
	public Integer getDgmClasificacionProd() {
		return dgmClasificacionProd;
	}

	public void setDgmClasificacionProd(Integer dgmClasificacionProd) {
		this.dgmClasificacionProd = dgmClasificacionProd;
	}

	public Integer getDgmTipoExpediente() {
		return dgmTipoExpediente;
	}

	public void setDgmTipoExpediente(Integer dgmTipoExpediente) {
		this.dgmTipoExpediente = dgmTipoExpediente;
	}

	public String getEsReacondicionadora() {
		return esReacondicionadora;
	}

	public void setEsReacondicionadora(String esReacondicionadora) {
		this.esReacondicionadora = esReacondicionadora;
	}

	public String getOrigenReacondicionadora() {
		return origenReacondicionadora;
	}

	public void setOrigenReacondicionadora(String origenReacondicionadora) {
		this.origenReacondicionadora = origenReacondicionadora;
	}

	public String getNombreReacondicionadora() {
		return nombreReacondicionadora;
	}

	public void setNombreReacondicionadora(String nombreReacondicionadora) {
		this.nombreReacondicionadora = nombreReacondicionadora;
	}

	public String getReacondicionadoraNacional() {
		return reacondicionadoraNacional;
	}

	public void setReacondicionadoraNacional(String reacondicionadoraNacional) {
		this.reacondicionadoraNacional = reacondicionadoraNacional;
	}

	public String getReacondicionadoraExtranjera() {
		return reacondicionadoraExtranjera;
	}

	public void setReacondicionadoraExtranjera(String reacondicionadoraExtranjera) {
		this.reacondicionadoraExtranjera = reacondicionadoraExtranjera;
	}

	public String getPaisReacondicionadora() {
		return paisReacondicionadora;
	}

	public void setPaisReacondicionadora(String paisReacondicionadora) {
		this.paisReacondicionadora = paisReacondicionadora;
	}

	public String getEsEnvasadora() {
		return esEnvasadora;
	}

	public void setEsEnvasadora(String esEnvasadora) {
		this.esEnvasadora = esEnvasadora;
	}

	public String getOrigenEnvasadora() {
		return origenEnvasadora;
	}

	public void setOrigenEnvasadora(String origenEnvasadora) {
		this.origenEnvasadora = origenEnvasadora;
	}

	public String getNombreEnvasadora() {
		return nombreEnvasadora;
	}

	public void setNombreEnvasadora(String nombreEnvasadora) {
		this.nombreEnvasadora = nombreEnvasadora;
	}

	public String getEnvasadoraNacional() {
		return envasadoraNacional;
	}

	public void setEnvasadoraNacional(String envasadoraNacional) {
		this.envasadoraNacional = envasadoraNacional;
	}

	public String getEnvasadoraExtranjera() {
		return envasadoraExtranjera;
	}

	public void setEnvasadoraExtranjera(String envasadoraExtranjera) {
		this.envasadoraExtranjera = envasadoraExtranjera;
	}

	public String getPaisEnvasadora() {
		return paisEnvasadora;
	}

	public void setPaisEnvasadora(String paisEnvasadora) {
		this.paisEnvasadora = paisEnvasadora;
	}

	public Long getDgm055Id() {
		return dgm055Id;
	}

	public void setDgm055Id(Long dgm055Id) {
		this.dgm055Id = dgm055Id;
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

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
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

	public String getGrupoAtc() {
		return grupoAtc;
	}

	public void setGrupoAtc(String grupoAtc) {
		this.grupoAtc = grupoAtc;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getProteccionDatosPrueba() {
		return proteccionDatosPrueba;
	}

	public void setProteccionDatosPrueba(String proteccionDatosPrueba) {
		this.proteccionDatosPrueba = proteccionDatosPrueba;
	}

	public DGM055Producto getProducto() {
		return producto;
	}

	public void setProducto(DGM055Producto producto) {
		this.producto = producto;
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

	public String getTelefonoFabricante() {
		return telefonoFabricante;
	}

	public void setTelefonoFabricante(String telefonoFabricante) {
		this.telefonoFabricante = telefonoFabricante;
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

	public String getPaisAcondicionadora() {
		return paisAcondicionadora;
	}

	public void setPaisAcondicionadora(String paisAcondicionadora) {
		this.paisAcondicionadora = paisAcondicionadora;
	}

	public String getDireccionAcondicionadora() {
		return direccionAcondicionadora;
	}

	public void setDireccionAcondicionadora(String direccionAcondicionadora) {
		this.direccionAcondicionadora = direccionAcondicionadora;
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

	public String getNroResolucionFabricacion() {
		return nroResolucionFabricacion;
	}

	public void setNroResolucionFabricacion(String nroResolucionFabricacion) {
		this.nroResolucionFabricacion = nroResolucionFabricacion;
	}

	public String getBajoLicenciaDe() {
		return bajoLicenciaDe;
	}

	public void setBajoLicenciaDe(String bajoLicenciaDe) {
		this.bajoLicenciaDe = bajoLicenciaDe;
	}

	public String getPaisLicenciante() {
		return paisLicenciante;
	}

	public void setPaisLicenciante(String paisLicenciante) {
		this.paisLicenciante = paisLicenciante;
	}

	public String getOrigenFabricante() {
		return origenFabricante;
	}

	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricante = origenFabricante;
	}

	public String getPaisAltaVigilancia() {
		return paisAltaVigilancia;
	}

	public void setPaisAltaVigilancia(String paisAltaVigilancia) {
		this.paisAltaVigilancia = paisAltaVigilancia;
	}

	public String getDgmTipoTramite() {
		return dgmTipoTramite;
	}

	public void setDgmTipoTramite(String dgmTipoTramite) {
		this.dgmTipoTramite = dgmTipoTramite;
	}

	public String getEsInscripcion() {
		return esInscripcion;
	}

	public void setEsInscripcion(String esInscripcion) {
		this.esInscripcion = esInscripcion;
	}

	public String getEsReinscripcion() {
		return esReinscripcion;
	}

	public void setEsReinscripcion(String esReinscripcion) {
		this.esReinscripcion = esReinscripcion;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	public String getNombreAcondicionadora() {
		return nombreAcondicionadora;
	}

	public void setNombreAcondicionadora(String nombreAcondicionadora) {
		this.nombreAcondicionadora = nombreAcondicionadora;
	}

	public String getIndRsActualizado() {
		return indRsActualizado;
	}

	public void setIndRsActualizado(String indRsActualizado) {
		this.indRsActualizado = indRsActualizado;
	}

	public String getCondicionalAlmacenamiento() {
		return condicionalAlmacenamiento;
	}

	public void setCondicionalAlmacenamiento(String condicionalAlmacenamiento) {
		this.condicionalAlmacenamiento = condicionalAlmacenamiento;
	}
	/*
	 * private String almacenEstablecimiento; private String
	 * idDireccionEstablecimiento; private String origenFabricante; private
	 * String fabricacionEncargo; private Integer dgmTipoTramite;
	 */

}
