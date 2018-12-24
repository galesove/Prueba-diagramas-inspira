package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM071 {

	private Long dgm071Id;
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
	private String esInscripcion;
	private String esReinscripcion;
	private String nroRegistroSanitarioOrigen;
	private Date fechaVencimientoRsOrigen;
	private String grupoProducto;
	private String nombreProducto;
	private String concentracion;
	private String formaFarmaceutica;
	private String formaPresentacion;
	private String unidadVidaUtil;
	private Integer vidaUtil;
	private String origenProducto;
	private String sistemaCodificacion;
	private Long partidaArancelaria;
	private String condicionVenta;
	private String estFarmaceutico;
	private String formulaCualicuantitativa;
	private String cantidadFormulaCualicuant;
	private String umedidaFormulaCualicuant;
	private String usoRecomendado;
	private String dosificacionPropuesta;
	private String nombreFabricante;
	private String direccionFabricante;
	private String fabricanteNacional;
	private String fabricanteExtranjero;
	private String paisFabricante;
	private String telefonoFabricante;
	private String esAcondicionadora;
	private String origenAcondicionadora;
	private String nombreAcondicionadora;
	private String acondicionadoraNacional;
	private String acondicionadoraExtranjera;
	private String paisAcondicionadora;
	private String direccionAcondicionadora;
	private String esFabricanteEncargo;
	private String fabricanteEncargo;
	private String nroExpedienteFabricacion;
	private String nroResolucionFabricacion;
	private String bajoLicenciaDe;

	// Informacion Solicitante
	private String telefonoRepresentanteLegal;
	private String emailRepresentanteLegal;

	private String productoGalenico;
	private String condicionAlmacenamiento;
	private String expedienteEEFF;
	private String paisLicenciante;
	private String dilucion;
	
	private String dgmTipoTramite;

	private List<DGM071Sustento> dgm071Sustentos = new ArrayList<DGM071Sustento>();
	private List<DGM071FuenteReferenciaET> dgm071FuentesReferenciaET = new ArrayList<DGM071FuenteReferenciaET>();
	private List<DGM071ViaAdministracion> dgm071ViasAdministracion = new ArrayList<DGM071ViaAdministracion>();
	private List<DGM071IngredienteActivo> dgm071IngredientesActivo = new ArrayList<DGM071IngredienteActivo>();
	private List<DGM071ExcipienteColorante> dgm071ExcipientesColorante = new ArrayList<DGM071ExcipienteColorante>();
	private List<DGM071ExcipienteOtro> dgm071ExcipientesOtro = new ArrayList<DGM071ExcipienteOtro>();
	private List<DGM071EnvaseInmediato> dgm071EnvasesInmediato = new ArrayList<DGM071EnvaseInmediato>();
	private List<DGM071EnvaseMediato> dgm071EnvasesMediato = new ArrayList<DGM071EnvaseMediato>();

	public Long getDgm071Id() {
		return dgm071Id;
	}

	public void setDgm071Id(Long dgm071Id) {
		this.dgm071Id = dgm071Id;
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

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}

	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}

	public Date getFechaVencimientoRsOrigen() {
		return fechaVencimientoRsOrigen;
	}

	public void setFechaVencimientoRsOrigen(Date fechaVencimientoRsOrigen) {
		this.fechaVencimientoRsOrigen = fechaVencimientoRsOrigen;
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

	public String getFormaPresentacion() {
		return formaPresentacion;
	}

	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}

	public String getUnidadVidaUtil() {
		return unidadVidaUtil;
	}

	public void setUnidadVidaUtil(String unidadVidaUtil) {
		this.unidadVidaUtil = unidadVidaUtil;
	}

	public Integer getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(Integer vidaUtil) {
		this.vidaUtil = vidaUtil;
	}

	public String getOrigenProducto() {
		return origenProducto;
	}

	public void setOrigenProducto(String origenProducto) {
		this.origenProducto = origenProducto;
	}

	public String getSistemaCodificacion() {
		return sistemaCodificacion;
	}

	public void setSistemaCodificacion(String sistemaCodificacion) {
		this.sistemaCodificacion = sistemaCodificacion;
	}

	public Long getPartidaArancelaria() {
		return partidaArancelaria;
	}

	public void setPartidaArancelaria(Long partidaArancelaria) {
		this.partidaArancelaria = partidaArancelaria;
	}

	public String getCondicionVenta() {
		return condicionVenta;
	}

	public void setCondicionVenta(String condicionVenta) {
		this.condicionVenta = condicionVenta;
	}

	public String getEstFarmaceutico() {
		return estFarmaceutico;
	}

	public void setEstFarmaceutico(String estFarmaceutico) {
		this.estFarmaceutico = estFarmaceutico;
	}

	public String getFormulaCualicuantitativa() {
		return formulaCualicuantitativa;
	}

	public void setFormulaCualicuantitativa(String formulaCualicuantitativa) {
		this.formulaCualicuantitativa = formulaCualicuantitativa;
	}

	public String getCantidadFormulaCualicuant() {
		return cantidadFormulaCualicuant;
	}

	public void setCantidadFormulaCualicuant(String cantidadFormulaCualicuant) {
		this.cantidadFormulaCualicuant = cantidadFormulaCualicuant;
	}

	public String getUmedidaFormulaCualicuant() {
		return umedidaFormulaCualicuant;
	}

	public void setUmedidaFormulaCualicuant(String umedidaFormulaCualicuant) {
		this.umedidaFormulaCualicuant = umedidaFormulaCualicuant;
	}

	public String getUsoRecomendado() {
		return usoRecomendado;
	}

	public void setUsoRecomendado(String usoRecomendado) {
		this.usoRecomendado = usoRecomendado;
	}

	public String getDosificacionPropuesta() {
		return dosificacionPropuesta;
	}

	public void setDosificacionPropuesta(String dosificacionPropuesta) {
		this.dosificacionPropuesta = dosificacionPropuesta;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	public String getDireccionFabricante() {
		return direccionFabricante;
	}

	public void setDireccionFabricante(String direccionFabricante) {
		this.direccionFabricante = direccionFabricante;
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

	public String getNombreAcondicionadora() {
		return nombreAcondicionadora;
	}

	public void setNombreAcondicionadora(String nombreAcondicionadora) {
		this.nombreAcondicionadora = nombreAcondicionadora;
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

	public String getEsFabricanteEncargo() {
		return esFabricanteEncargo;
	}

	public void setEsFabricanteEncargo(String esFabricanteEncargo) {
		this.esFabricanteEncargo = esFabricanteEncargo;
	}

	public String getFabricanteEncargo() {
		return fabricanteEncargo;
	}

	public void setFabricanteEncargo(String fabricanteEncargo) {
		this.fabricanteEncargo = fabricanteEncargo;
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

	public List<DGM071Sustento> getDgm071Sustentos() {
		return dgm071Sustentos;
	}

	public void setDgm071Sustentos(List<DGM071Sustento> dgm071Sustentos) {
		this.dgm071Sustentos = dgm071Sustentos;
	}

	public List<DGM071FuenteReferenciaET> getDgm071FuentesReferenciaET() {
		return dgm071FuentesReferenciaET;
	}

	public void setDgm071FuentesReferenciaET(List<DGM071FuenteReferenciaET> dgm071FuentesReferenciaET) {
		this.dgm071FuentesReferenciaET = dgm071FuentesReferenciaET;
	}

	public List<DGM071ViaAdministracion> getDgm071ViasAdministracion() {
		return dgm071ViasAdministracion;
	}

	public void setDgm071ViasAdministracion(List<DGM071ViaAdministracion> dgm071ViasAdministracion) {
		this.dgm071ViasAdministracion = dgm071ViasAdministracion;
	}

	public List<DGM071IngredienteActivo> getDgm071IngredientesActivo() {
		return dgm071IngredientesActivo;
	}

	public void setDgm071IngredientesActivo(List<DGM071IngredienteActivo> dgm071IngredientesActivo) {
		this.dgm071IngredientesActivo = dgm071IngredientesActivo;
	}

	public List<DGM071ExcipienteColorante> getDgm071ExcipientesColorante() {
		return dgm071ExcipientesColorante;
	}

	public void setDgm071ExcipientesColorante(List<DGM071ExcipienteColorante> dgm071ExcipientesColorante) {
		this.dgm071ExcipientesColorante = dgm071ExcipientesColorante;
	}

	public List<DGM071ExcipienteOtro> getDgm071ExcipientesOtro() {
		return dgm071ExcipientesOtro;
	}

	public void setDgm071ExcipientesOtro(List<DGM071ExcipienteOtro> dgm071ExcipientesOtro) {
		this.dgm071ExcipientesOtro = dgm071ExcipientesOtro;
	}

	public List<DGM071EnvaseInmediato> getDgm071EnvasesInmediato() {
		return dgm071EnvasesInmediato;
	}

	public void setDgm071EnvasesInmediato(List<DGM071EnvaseInmediato> dgm071EnvasesInmediato) {
		this.dgm071EnvasesInmediato = dgm071EnvasesInmediato;
	}

	public List<DGM071EnvaseMediato> getDgm071EnvasesMediato() {
		return dgm071EnvasesMediato;
	}

	public void setDgm071EnvasesMediato(List<DGM071EnvaseMediato> dgm071EnvasesMediato) {
		this.dgm071EnvasesMediato = dgm071EnvasesMediato;
	}

	public String getProductoGalenico() {
		return productoGalenico;
	}

	public void setProductoGalenico(String productoGalenico) {
		this.productoGalenico = productoGalenico;
	}

	public String getCondicionAlmacenamiento() {
		return condicionAlmacenamiento;
	}

	public void setCondicionAlmacenamiento(String condicionAlmacenamiento) {
		this.condicionAlmacenamiento = condicionAlmacenamiento;
	}

	public String getExpedienteEEFF() {
		return expedienteEEFF;
	}

	public void setExpedienteEEFF(String expedienteEEFF) {
		this.expedienteEEFF = expedienteEEFF;
	}

	public String getPaisLicenciante() {
		return paisLicenciante;
	}

	public void setPaisLicenciante(String paisLicenciante) {
		this.paisLicenciante = paisLicenciante;
	}

	public String getDilucion() {
		return dilucion;
	}

	public void setDilucion(String dilucion) {
		this.dilucion = dilucion;
	}

	public String getDgmTipoTramite() {
		return dgmTipoTramite;
	}

	public void setDgmTipoTramite(String dgmTipoTramite) {
		this.dgmTipoTramite = dgmTipoTramite;
	}
	
}
