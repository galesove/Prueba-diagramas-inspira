package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;
import java.util.List;

public class DGM017 {

	private Long dgm017Id;
	private Long ordenId;
	private Integer mto;
	private Long drId;
	private Integer sdr;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String representanteLegal;
	private String codigoRegente;
	private String cargoRegente;
	private String nroRegistroSanitarioOrigen;
	private Date fechaVencimientoRsOrigen;
    private Integer dgmTipoTramite;
	private String nombreProducto;
	private String concentracion;
	private String formaFarmaceutica;
	private String origenProducto;
	private String grupoProducto;
	private Long partidaArancelaria;
	private String codigoDetallePartida;
	private String origenFabricante;
	private String fabricanteNacional;
	private String fabricanteExtranjero;
	private String esAcondicionadora;
	private String esFabricacionEncargo;
	private String fabricacionEncargo;
	private String nroExpedienteFabricacion;
	private String bajoLicenciaDe;
	private String nombreProductoSimilar;
	private String registroSanitarioSimilar;
	private String nroAutorizacionCemis;
	// private String viaAdministracion;
	private Integer vidaUtil;
	private String sistemaCodificacion;
	private String direccionEstablecimiento;
	private String tipoPlaguicida;
	private String sustanciaExtrana;
	private String condicionLavado;
	private String condicionSecado;
	private String almacenamientoConservacion;
	private String condicionVenta;
	private String uso;
	private String idDireccionEstablecimiento;

	private String paisFabricante;
	private String direccionFabricante;
	private String formaPresentacion;
	private String envasadoPor;
	private String tipoLiberacion;

	private String codigoFormulaCualicuantitativa;
	private Double cantidadFormCualicuantitativa;
	private String uMedidaFormCualicuantitativa;
	private String nombreComercial;
	private String nombreRepresentante;
	private String telefonoRepresentanteLegal;
	private String emailRepresentanteLegal;
	private String nroColegiaturaDirector;
	private String telefonoDirector;
	private String emailDirector;
	private String esInscripcion;
	private String esReinscripcion;
	private String nombreFabricante;
	private String nroFechaResolDirectoral;
	private String paisLicenciante;
	
	// Para almacenar valores de campo esInscripcion/esReinscripcion
	private String tipoTramite;
	
	private List<DGM017ExcipienteColorante> excipientesColorantes;
	
	private List<DGM017ExcipienteConservador> excipientesConservadores;	

	private List<DGM017ExcipienteOtros> excipientesOtros;

    private List<DGM017EnvaseInmediato> envasesInmediato;
    
    private List<DGM017EnvaseMediato> envasesMediato;
    
    private List<DGM017Presentacion> presentaciones;
    
    private List<DGM017SustentoRegistro> sustentos;
    
    private List<DGM017ClaseTaxonomica> clasesTaxonomicas;
    
    private List<DGM017PrincipioActivo> principiosActivos;    
    
    private List<DGM017RecursoMineral> recursosMinerales;
    
    private List<DGM017Acondicionadora> acondicionadoras;
    
    private List<DGM017ViaAdministracion> viasAdministracion;
    
    
	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
	}

	public void setDrId(Long drId) {
		this.drId = drId;
	}

	public Long getDrId() {
		return drId;
	}

	public void setSdr(Integer sdr) {
		this.sdr = sdr;
	}

	public Integer getSdr() {
		return sdr;
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

	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}

	public Date getFechaVencimientoRsOrigen() {
		return fechaVencimientoRsOrigen;
	}

	public void setFechaVencimientoRsOrigen(Date fechaVencimientoRsOrigen) {
		this.fechaVencimientoRsOrigen = fechaVencimientoRsOrigen;
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

	public void setNombreProductoSimilar(String nombreProductoSimilar) {
		this.nombreProductoSimilar = nombreProductoSimilar;
	}

	public String getNombreProductoSimilar() {
		return nombreProductoSimilar;
	}

	public void setRegistroSanitarioSimilar(String registroSanitarioSimilar) {
		this.registroSanitarioSimilar = registroSanitarioSimilar;
	}

	public String getRegistroSanitarioSimilar() {
		return registroSanitarioSimilar;
	}

	public void setNroAutorizacionCemis(String nroAutorizacionCemis) {
		this.nroAutorizacionCemis = nroAutorizacionCemis;
	}

	public String getNroAutorizacionCemis() {
		return nroAutorizacionCemis;
	}

	/*public void setViaAdministracion(String viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
	}

	public String getViaAdministracion() {
		return viaAdministracion;
	}
*/
	public void setVidaUtil(Integer vidaUtil) {
		this.vidaUtil = vidaUtil;
	}

	public Integer getVidaUtil() {
		return vidaUtil;
	}

	public void setSistemaCodificacion(String sistemaCodificacion) {
		this.sistemaCodificacion = sistemaCodificacion;
	}

	public String getSistemaCodificacion() {
		return sistemaCodificacion;
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

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}

	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setOrigenProducto(String origenProducto) {
		this.origenProducto = origenProducto;
	}

	public String getOrigenProducto() {
		return origenProducto;
	}

	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}

	public String getGrupoProducto() {
		return grupoProducto;
	}

	public void setPartidaArancelaria(Long partidaArancelaria) {
		this.partidaArancelaria = partidaArancelaria;
	}

	public Long getPartidaArancelaria() {
		return partidaArancelaria;
	}

	public void setCodigoDetallePartida(String codigoDetallePartida) {
		this.codigoDetallePartida = codigoDetallePartida;
	}

	public String getCodigoDetallePartida() {
		return codigoDetallePartida;
	}

	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}

	public void setDireccionEstablecimiento(String direccionEstablecimiento) {
		this.direccionEstablecimiento = direccionEstablecimiento;
	}

	public void setTipoPlaguicida(String tipoPlaguicida) {
		this.tipoPlaguicida = tipoPlaguicida;
	}

	public String getTipoPlaguicida() {
		return tipoPlaguicida;
	}

	public void setSustanciaExtrana(String sustanciaExtrana) {
		this.sustanciaExtrana = sustanciaExtrana;
	}

	public String getSustanciaExtrana() {
		return sustanciaExtrana;
	}

	public void setCondicionLavado(String condicionLavado) {
		this.condicionLavado = condicionLavado;
	}

	public String getCondicionLavado() {
		return condicionLavado;
	}

	public void setCondicionSecado(String condicionSecado) {
		this.condicionSecado = condicionSecado;
	}

	public String getCondicionSecado() {
		return condicionSecado;
	}

	public void setAlmacenamientoConservacion(String almacenamientoConservacion) {
		this.almacenamientoConservacion = almacenamientoConservacion;
	}

	public String getAlmacenamientoConservacion() {
		return almacenamientoConservacion;
	}

	public void setCondicionVenta(String condicionVenta) {
		this.condicionVenta = condicionVenta;
	}

	public String getCondicionVenta() {
		return condicionVenta;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
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

	public String getNroFechaResolDirectoral() {
		return nroFechaResolDirectoral;
	}

	public void setNroFechaResolDirectoral(String nroFechaResolDirectoral) {
		this.nroFechaResolDirectoral = nroFechaResolDirectoral;
	}

	public String getPaisLicenciante() {
		return paisLicenciante;
	}

	public void setPaisLicenciante(String paisLicenciante) {
		this.paisLicenciante = paisLicenciante;
	}

	public String getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public void setExcipientesColorantes(List<DGM017ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}

	public List<DGM017ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}

	public List<DGM017ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}

	public void setExcipientesConservadores(List<DGM017ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}

	public void setExcipientesOtros(List<DGM017ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}

	public List<DGM017ExcipienteOtros> getExcipientesOtros() {
		return excipientesOtros;
	}
	
	public List<DGM017EnvaseInmediato> getEnvasesInmediato() {
		return envasesInmediato;
	}

	public void setEnvasesInmediato(List<DGM017EnvaseInmediato> envasesInmediato) {
		this.envasesInmediato = envasesInmediato;
	}

	public List<DGM017EnvaseMediato> getEnvasesMediato() {
		return envasesMediato;
	}

	public void setEnvasesMediato(List<DGM017EnvaseMediato> envasesMediato) {
		this.envasesMediato = envasesMediato;
	}

	public List<DGM017Presentacion> getPresentaciones() {
		return presentaciones;
	}

	public void setPresentaciones(List<DGM017Presentacion> presentaciones) {
		this.presentaciones = presentaciones;
	}

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
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

	public String getFormaPresentacion() {
		return formaPresentacion;
	}

	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}

	public List<DGM017SustentoRegistro> getSustentos() {
		return sustentos;
	}

	public void setSustentos(List<DGM017SustentoRegistro> sustentos) {
		this.sustentos = sustentos;
	}

	public List<DGM017ClaseTaxonomica> getClasesTaxonomicas() {
		return clasesTaxonomicas;
	}

	public void setClasesTaxonomicas(List<DGM017ClaseTaxonomica> clasesTaxonomicas) {
		this.clasesTaxonomicas = clasesTaxonomicas;
	}

	public List<DGM017PrincipioActivo> getPrincipiosActivos() {
		return principiosActivos;
	}

	public void setPrincipiosActivos(List<DGM017PrincipioActivo> principiosActivos) {
		this.principiosActivos = principiosActivos;
	}

	public List<DGM017RecursoMineral> getRecursosMinerales() {
		return recursosMinerales;
	}

	public void setRecursosMinerales(List<DGM017RecursoMineral> recursosMinerales) {
		this.recursosMinerales = recursosMinerales;
	}

	public List<DGM017Acondicionadora> getAcondicionadoras() {
		return acondicionadoras;
	}

	public void setAcondicionadoras(List<DGM017Acondicionadora> acondicionadoras) {
		this.acondicionadoras = acondicionadoras;
	}

	public String getEnvasadoPor() {
		return envasadoPor;
	}

	public void setEnvasadoPor(String envasadoPor) {
		this.envasadoPor = envasadoPor;
	}

	public String getTipoLiberacion() {
		return tipoLiberacion;
	}

	public void setTipoLiberacion(String tipoLiberacion) {
		this.tipoLiberacion = tipoLiberacion;
	}

	public String getCodigoFormulaCualicuantitativa() {
		return codigoFormulaCualicuantitativa;
	}

	public List<DGM017ViaAdministracion> getViasAdministracion() {
		return viasAdministracion;
	}

	public void setViasAdministracion(
			List<DGM017ViaAdministracion> viasAdministracion) {
		this.viasAdministracion = viasAdministracion;
	}

	public void setCodigoFormulaCualicuantitativa(
			String codigoFormulaCualicuantitativa) {
		this.codigoFormulaCualicuantitativa = codigoFormulaCualicuantitativa;
	}

	public Double getCantidadFormCualicuantitativa() {
		return cantidadFormCualicuantitativa;
	}

	public void setCantidadFormCualicuantitativa(
			Double cantidadFormCualicuantitativa) {
		this.cantidadFormCualicuantitativa = cantidadFormCualicuantitativa;
	}

	public String getuMedidaFormCualicuantitativa() {
		return uMedidaFormCualicuantitativa;
	}

	public void setuMedidaFormCualicuantitativa(String uMedidaFormCualicuantitativa) {
		this.uMedidaFormCualicuantitativa = uMedidaFormCualicuantitativa;
	}

}
