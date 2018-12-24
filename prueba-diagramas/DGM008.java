package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM008 {
	
	private Long dgm008Id;
	private Long ordenId;
	private int mto;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String direccionEstablecimiento;
	private String representanteLegal;
	private String codigoRegente;
	private String cargoRegente;
	private Integer dgmTipoTramite;
	private String grupoProducto;
	private Long clasificacion;
	private Long subClasificacion;
	private String nombreProducto;
	private String origenProducto;
	private String flagAplica;
	private Long periodoVigencia;
	private String formaPresentacion;
	private Long partidaArancelaria;
	private String codigoDetallePartida;
	private String origenFabricante;
	private String fabricanteNacional;
	private String fabricanteExtranjero;
	private String direccionFabricante;
	private String telefonoFabricante;
	private String paisFabricante;
	private String bajoLicenciaDe;
	private String fabricacionEncargo;
	private String idDireccionEstablecimiento;
	private String grupoRubroProducto;
	
	private Integer         dgmIndOrigenRs;
	private String          formaComercial;
	private String          formaComercialOtro;
	private Integer          tipoDispositivoMedico;
	private String          clasificacionTexto;
	private String          subclasificacionTexto;
	private String          marcaComercial;
	private String          clasificacionRiesgoTexto;
	private String          nomenclaturaDm;
	private String          codigoEstandarInternacional;
	private String          estandarInternacional;
	private String          reacondicionante;
	private String          nombreReacondicionante;
	
	private String          esFabricacionEncargo;
	//private String          grupoRubroProductoVii;
	
	private String          esIncripcion;
	private String          esReinscripcion;
	//AMPLIACION 15/09/2014 - CPA
	private String 			esAmpliacion;
	private String          nroRegistroSanitarioOrigen;
	private Date            fechaVencimientoRsOrigen;
	private String          nroRegistroSanitarioReins;
	private Date            fechaVencimientoRsReins;
	
	private String esCatalogado;
	private String nombreFabricante;
	
	//CP 10/03/16: Cambios acta: DGM-002-16: Cambio de tasas || DGM-003-16: Activación de filtros || DGM-004-16: Validaciones Requisitos
	private String sitioFabricacion;
	private String direccionSitioFabricacion;
	private String paisSitioFabricacion;
	private String nroRdReacondicionamiento;
	
	private List<DGM008Acondicionadora> dgm008Acondicionadoras = new ArrayList<DGM008Acondicionadora>();
	private List<DGM008EnvaseInmediato> dgm008envaseinmediatos = new ArrayList<DGM008EnvaseInmediato>();
	private List<DGM008EnvaseMediato> dgm008envasemediatos = new ArrayList<DGM008EnvaseMediato>();
	private List<DGM008Modelo> dgm008modelos = new ArrayList<DGM008Modelo>();

	public List<DGM008EnvaseInmediato> getDgm008envaseinmediatos() {
		return dgm008envaseinmediatos;
	}

	public void setDgm008envaseinmediatos(
			List<DGM008EnvaseInmediato> dgm008envaseinmediatos) {
		this.dgm008envaseinmediatos = dgm008envaseinmediatos;
	}

	public List<DGM008EnvaseMediato> getDgm008envasemediatos() {
		return dgm008envasemediatos;
	}

	public void setDgm008envasemediatos(
			List<DGM008EnvaseMediato> dgm008envasemediatos) {
		this.dgm008envasemediatos = dgm008envasemediatos;
	}

	public String getFabricacionEncargo() {
		return fabricacionEncargo;
	}

	public void setFabricacionEncargo(String fabricacionEncargo) {
		this.fabricacionEncargo = fabricacionEncargo;
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

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
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

	public String getOrigenProducto() {
		return origenProducto;
	}

	public void setOrigenProducto(String origenProducto) {
		this.origenProducto = origenProducto;
	}

	public String getFlagAplica() {
		return flagAplica;
	}

	public void setFlagAplica(String flagAplica) {
		this.flagAplica = flagAplica;
	}

	public String getFormaPresentacion() {
		return formaPresentacion;
	}

	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}

	public String getOrigenFabricante() {
		return origenFabricante;
	}

	public Long getDgm008Id() {
		return dgm008Id;
	}

	public void setDgm008Id(Long dgm008Id) {
		this.dgm008Id = dgm008Id;
	}

	public Long getOrdenId() {
		return ordenId;
	}

	public void setOrdenId(Long ordenId) {
		this.ordenId = ordenId;
	}

	public int getMto() {
		return mto;
	}

	public void setMto(int mto) {
		this.mto = mto;
	}

	public Integer getDgmTipoTramite() {
		return dgmTipoTramite;
	}

	public void setDgmTipoTramite(Integer dgmTipoTramite) {
		this.dgmTipoTramite = dgmTipoTramite;
	}

	public Long getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Long clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Long getSubClasificacion() {
		return subClasificacion;
	}

	public void setSubClasificacion(Long subClasificacion) {
		this.subClasificacion = subClasificacion;
	}

	public Long getPeriodoVigencia() {
		return periodoVigencia;
	}

	public void setPeriodoVigencia(Long periodoVigencia) {
		this.periodoVigencia = periodoVigencia;
	}

	public Long getPartidaArancelaria() {
		return partidaArancelaria;
	}

	public void setPartidaArancelaria(Long partidaArancelaria) {
		this.partidaArancelaria = partidaArancelaria;
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

	public String getPaisFabricante() {
		return paisFabricante;
	}

	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
	}

	public String getBajoLicenciaDe() {
		return bajoLicenciaDe;
	}

	public void setBajoLicenciaDe(String bajoLicenciaDe) {
		this.bajoLicenciaDe = bajoLicenciaDe;
	}

	public List<DGM008Acondicionadora> getDgm008Acondicionadoras() {
		return dgm008Acondicionadoras;
	}

	public void setDgm008Acondicionadoras(
			List<DGM008Acondicionadora> dgm008Acondicionadoras) {
		this.dgm008Acondicionadoras = dgm008Acondicionadoras;
	}

	public void setDgm008modelos(List<DGM008Modelo> dgm008modelos) {
		this.dgm008modelos = dgm008modelos;
	}

	public List<DGM008Modelo> getDgm008modelos() {
		return dgm008modelos;
	}

	public void setCodigoDetallePartida(String codigoDetallePartida) {
		this.codigoDetallePartida = codigoDetallePartida;
	}

	public String getCodigoDetallePartida() {
		return codigoDetallePartida;
	}

	public String getGrupoRubroProducto() {
		return grupoRubroProducto;
	}

	public void setGrupoRubroProducto(String grupoRubroProducto) {
		this.grupoRubroProducto = grupoRubroProducto;
	}

	public Integer getDgmIndOrigenRs() {
		return dgmIndOrigenRs;
	}

	public void setDgmIndOrigenRs(Integer dgmIndOrigenRs) {
		this.dgmIndOrigenRs = dgmIndOrigenRs;
	}

	public String getFormaComercial() {
		return formaComercial;
	}

	public void setFormaComercial(String formaComercial) {
		this.formaComercial = formaComercial;
	}

	public String getFormaComercialOtro() {
		return formaComercialOtro;
	}

	public void setFormaComercialOtro(String formaComercialOtro) {
		this.formaComercialOtro = formaComercialOtro;
	}

	public Integer getTipoDispositivoMedico() {
		return tipoDispositivoMedico;
	}

	public void setTipoDispositivoMedico(Integer tipoDispositivoMedico) {
		this.tipoDispositivoMedico = tipoDispositivoMedico;
	}

	public String getClasificacionTexto() {
		return clasificacionTexto;
	}

	public void setClasificacionTexto(String clasificacionTexto) {
		this.clasificacionTexto = clasificacionTexto;
	}

	public String getSubclasificacionTexto() {
		return subclasificacionTexto;
	}

	public void setSubclasificacionTexto(String subclasificacionTexto) {
		this.subclasificacionTexto = subclasificacionTexto;
	}

	public String getMarcaComercial() {
		return marcaComercial;
	}

	public void setMarcaComercial(String marcaComercial) {
		this.marcaComercial = marcaComercial;
	}

	public String getClasificacionRiesgoTexto() {
		return clasificacionRiesgoTexto;
	}

	public void setClasificacionRiesgoTexto(String clasificacionRiesgoTexto) {
		this.clasificacionRiesgoTexto = clasificacionRiesgoTexto;
	}

	public String getNomenclaturaDm() {
		return nomenclaturaDm;
	}

	public void setNomenclaturaDm(String nomenclaturaDm) {
		this.nomenclaturaDm = nomenclaturaDm;
	}

	public String getCodigoEstandarInternacional() {
		return codigoEstandarInternacional;
	}

	public void setCodigoEstandarInternacional(String codigoEstandarInternacional) {
		this.codigoEstandarInternacional = codigoEstandarInternacional;
	}

	public String getEstandarInternacional() {
		return estandarInternacional;
	}

	public void setEstandarInternacional(String estandarInternacional) {
		this.estandarInternacional = estandarInternacional;
	}

	public String getReacondicionante() {
		return reacondicionante;
	}

	public void setReacondicionante(String reacondicionante) {
		this.reacondicionante = reacondicionante;
	}

	public String getNombreReacondicionante() {
		return nombreReacondicionante;
	}

	public void setNombreReacondicionante(String nombreReacondicionante) {
		this.nombreReacondicionante = nombreReacondicionante;
	}

	public String getEsFabricacionEncargo() {
		return esFabricacionEncargo;
	}

	public void setEsFabricacionEncargo(String esFabricacionEncargo) {
		this.esFabricacionEncargo = esFabricacionEncargo;
	}

	public String getEsIncripcion() {
		return esIncripcion;
	}

	public void setEsIncripcion(String esIncripcion) {
		this.esIncripcion = esIncripcion;
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

	public String getNroRegistroSanitarioReins() {
		return nroRegistroSanitarioReins;
	}

	public void setNroRegistroSanitarioReins(String nroRegistroSanitarioReins) {
		this.nroRegistroSanitarioReins = nroRegistroSanitarioReins;
	}

	public Date getFechaVencimientoRsReins() {
		return fechaVencimientoRsReins;
	}

	public void setFechaVencimientoRsReins(Date fechaVencimientoRsReins) {
		this.fechaVencimientoRsReins = fechaVencimientoRsReins;
	}

	/*public String getGrupoRubroProductoVii() {
		return grupoRubroProductoVii;
	}

	public void setGrupoRubroProductoVii(String grupoRubroProductoVii) {
		this.grupoRubroProductoVii = grupoRubroProductoVii;
	}
	*/
	public String getEsAmpliacion() {
		return esAmpliacion;
	}

	public void setEsAmpliacion(String esAmpliacion) {
		this.esAmpliacion = esAmpliacion;
	}
	
	public String getEsCatalogado() {
		return esCatalogado;
	}

	public void setEsCatalogado(String esCatalogado) {
		this.esCatalogado = esCatalogado;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	
	public String getSitioFabricacion() {
		return sitioFabricacion;
	}

	public void setSitioFabricacion(String sitioFabricacion) {
		this.sitioFabricacion = sitioFabricacion;
	}

	public String getDireccionSitioFabricacion() {
		return direccionSitioFabricacion;
	}

	public void setDireccionSitioFabricacion(String direccionSitioFabricacion) {
		this.direccionSitioFabricacion = direccionSitioFabricacion;
	}

	public String getPaisSitioFabricacion() {
		return paisSitioFabricacion;
	}

	public void setPaisSitioFabricacion(String paisSitioFabricacion) {
		this.paisSitioFabricacion = paisSitioFabricacion;
	}

	public String getNroRdReacondicionamiento() {
		return nroRdReacondicionamiento;
	}

	public void setNroRdReacondicionamiento(String nroRdReacondicionamiento) {
		this.nroRdReacondicionamiento = nroRdReacondicionamiento;
	}
}