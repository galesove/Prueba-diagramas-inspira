package pe.prueba.domain.dgm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM007 {

	private Long dgm007Id; 
	private Long ordenId; 
	private Integer mto; 
	private String codigoEstablecimiento; 
	private String categoriaEstablecimiento; 
	private String direccionEstablecimiento; 
	private String representanteLegal; 
	private String codigoRegente; 
	private String cargoRegente; 
	private Integer dgmTipoTramite; 
	private String dgmTipoTramite2;
	private String nombreProducto; 
	private String concentracion; 
	private String formaFarmaceutica; 
	private String origenProducto; 
	private String grupoFarmaceutico; 
	private String nombreProductoSimilar; 
	private String registroSanitarioSimilar; 
	private String sustentoFarmacopea; 
	private String nroAutorizacionCemis; 
	private String conservacion; 
	private String almacenamiento; 
	private String dosificacion; 
	private String uso; 
	private String condicionVenta; 
	private Double vidaUtil; 
	private String sistemaCodificacion; 
	private Long partidaArancelaria; 
	private String codigoDetallePartida; 
	private String origenFabricante; 
	private String fabricanteNacional; 
	private String fabricanteExtranjero; 
	private String esAcondicionadora; 
	private String origenAcondicionadora; 
	private String acondicionadoraNacional; 
	private String acondicionadoraExtranjero; 
	private String esFabricacionEncargo; 
	private String fabricacionEncargo; 
	private String nroExpedienteFabricacion; 
	private String licenciaDe; 
	private String idDireccionEstablecimiento;
	private String paisFabricante;
	private String direccionFabricante;
	
	private String formaPresentacion;
	
	private String paisAcondicionadora;
	
	private String unidadTiempoVida;
	
	private String          esIncripcion;
	private String          esReinscripcion;
	private String          nroRegistroSanitarioOrigen;
	private Date            fechaVencimientoRsOrigen;
	private String          nroRegistroSanitarioReins;
	private Date            fechaVencimientoRsReins;
	
	private String          esPack;
	private String          esFabPrinIgualSec;
	
	
	//CP: Cambios Nuevo Tupa Version III - 06/07/15
	private Integer dgmTipoProdBiologico;
	private String tipoProdBiologicoOtro;
	private String estFarmaceutico;
	private String sustento;
	private String pais;
	private String formulaCualicuantitativa;
	private String tieneDispMedico;
	private Double tiempoVidaDiluyente;
	private Double tiempoVidaDispMed;
	private String diluyente;
	private String dispMedico;
	private String paisEncargaFabri;
	private String numFechaResolDirec;
	private String paisLicenciante;
	//
	
	private List<DGM007SustentoRegistro> dgm007sustentoregistros = new ArrayList<DGM007SustentoRegistro>();
	private List<DGM007PrincipioActivo> dgm007principioactivos = new ArrayList<DGM007PrincipioActivo>();
	private List<DGM007Solvente> dgm007solventes = new ArrayList<DGM007Solvente>();
	private List<DGM007ExcipienteColorante> dgm007excipientecolorantes = new ArrayList<DGM007ExcipienteColorante>();
	private List<DGM007ExcipienteConservador> dgm007excipienteconservadors = new ArrayList<DGM007ExcipienteConservador>();
	private List<DGM007ExcipienteOtros> dgm007excipienteotross = new ArrayList<DGM007ExcipienteOtros>();
	private List<DGM007ClaseTaxonomica> dgm007clasetaxonomicas = new ArrayList<DGM007ClaseTaxonomica>();
	private List<DGM007ViaAdministracion> dgm007viaadministracions = new ArrayList<DGM007ViaAdministracion>();
	private List<DGM007EnvaseInmediato> dgm007envaseinmediatos = new ArrayList<DGM007EnvaseInmediato>();
	private List<DGM007EnvaseMediato> dgm007envasemediatos = new ArrayList<DGM007EnvaseMediato>();
	//private List<DGM007Presentacion> dgm007presentacions = new ArrayList<DGM007Presentacion>();
	
	public String getPaisAcondicionadora() {
		return paisAcondicionadora;
	}
	public void setPaisAcondicionadora(String paisAcondicionadora) {
		this.paisAcondicionadora = paisAcondicionadora;
	}
	public Long getDgm007Id() {
		return dgm007Id;
	}
	public void setDgm007Id(Long dgm007Id) {
		this.dgm007Id = dgm007Id;
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
	public Integer getDgmTipoTramite() {
		return dgmTipoTramite;
	}
	public void setDgmTipoTramite(Integer dgmTipoTramite) {
		this.dgmTipoTramite = dgmTipoTramite;
	}
	public String getDgmTipoTramite2() {
		return dgmTipoTramite2;
	}
	public void setDgmTipoTramite2(String dgmTipoTramite2) {
		this.dgmTipoTramite2 = dgmTipoTramite2;
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
	public String getGrupoFarmaceutico() {
		return grupoFarmaceutico;
	}
	public void setGrupoFarmaceutico(String grupoFarmaceutico) {
		this.grupoFarmaceutico = grupoFarmaceutico;
	}
	public String getNombreProductoSimilar() {
		return nombreProductoSimilar;
	}
	public void setNombreProductoSimilar(String nombreProductoSimilar) {
		this.nombreProductoSimilar = nombreProductoSimilar;
	}
	public String getRegistroSanitarioSimilar() {
		return registroSanitarioSimilar;
	}
	public void setRegistroSanitarioSimilar(String registroSanitarioSimilar) {
		this.registroSanitarioSimilar = registroSanitarioSimilar;
	}
	public String getSustentoFarmacopea() {
		return sustentoFarmacopea;
	}
	public void setSustentoFarmacopea(String sustentoFarmacopea) {
		this.sustentoFarmacopea = sustentoFarmacopea;
	}
	public String getNroAutorizacionCemis() {
		return nroAutorizacionCemis;
	}
	public void setNroAutorizacionCemis(String nroAutorizacionCemis) {
		this.nroAutorizacionCemis = nroAutorizacionCemis;
	}
	public String getConservacion() {
		return conservacion;
	}
	public void setConservacion(String conservacion) {
		this.conservacion = conservacion;
	}
	public String getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public String getDosificacion() {
		return dosificacion;
	}
	public void setDosificacion(String dosificacion) {
		this.dosificacion = dosificacion;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	public String getCondicionVenta() {
		return condicionVenta;
	}
	public void setCondicionVenta(String condicionVenta) {
		this.condicionVenta = condicionVenta;
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
	public String getCodigoDetallePartida() {
		return codigoDetallePartida;
	}
	public void setCodigoDetallePartida(String codigoDetallePartida) {
		this.codigoDetallePartida = codigoDetallePartida;
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
	public String getAcondicionadoraExtranjero() {
		return acondicionadoraExtranjero;
	}
	public void setAcondicionadoraExtranjero(String acondicionadoraExtranjero) {
		this.acondicionadoraExtranjero = acondicionadoraExtranjero;
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
	public String getLicenciaDe() {
		return licenciaDe;
	}
	public void setLicenciaDe(String licenciaDe) {
		this.licenciaDe = licenciaDe;
	}
	public List getDgm007sustentoregistros() {
		return this.dgm007sustentoregistros;
	}
	public void setDgm007sustentoregistros (List<DGM007SustentoRegistro> dgm007sustentoregistros) {
		this.dgm007sustentoregistros = dgm007sustentoregistros;
	}
	public void addDgm007sustentoregistros (DGM007SustentoRegistro dgm007sustentoregistro) {
		this.dgm007sustentoregistros.add(dgm007sustentoregistro);
	}
	public List getDgm007principioactivos() {
		return this.dgm007principioactivos;
	}
	public void setDgm007principioactivos (List<DGM007PrincipioActivo> dgm007principioactivos) {
		this.dgm007principioactivos = dgm007principioactivos;
	}
	public void addDgm007principioactivos (DGM007PrincipioActivo dgm007principioactivo) {
		this.dgm007principioactivos.add(dgm007principioactivo);
	}
	public List getDgm007solventes() {
		return this.dgm007solventes;
	}
	public void setDgm007solventes (List<DGM007Solvente> dgm007solventes) {
		this.dgm007solventes = dgm007solventes;
	}
	public void addDgm007solventes (DGM007Solvente dgm007solvente) {
		this.dgm007solventes.add(dgm007solvente);
	}
	public List getDgm007excipientecolorantes() {
		return this.dgm007excipientecolorantes;
	}
	public void setDgm007excipientecolorantes (List<DGM007ExcipienteColorante> dgm007excipientecolorantes) {
		this.dgm007excipientecolorantes = dgm007excipientecolorantes;
	}
	public void addDgm007excipientecolorantes (DGM007ExcipienteColorante dgm007excipientecolorante) {
		this.dgm007excipientecolorantes.add(dgm007excipientecolorante);
	}
	public List getDgm007excipienteconservadors() {
		return this.dgm007excipienteconservadors;
	}
	public void setDgm007excipienteconservadors (List<DGM007ExcipienteConservador> dgm007excipienteconservadors) {
		this.dgm007excipienteconservadors = dgm007excipienteconservadors;
	}
	public void addDgm007excipienteconservadors (DGM007ExcipienteConservador dgm007excipienteconservador) {
		this.dgm007excipienteconservadors.add(dgm007excipienteconservador);
	}
	public List getDgm007excipienteotross() {
		return this.dgm007excipienteotross;
	}
	public void setDgm007excipienteotross (List<DGM007ExcipienteOtros> dgm007excipienteotross) {
		this.dgm007excipienteotross = dgm007excipienteotross;
	}
	public void addDgm007excipienteotross (DGM007ExcipienteOtros dgm007excipienteotros) {
		this.dgm007excipienteotross.add(dgm007excipienteotros);
	}
	public List getDgm007clasetaxonomicas() {
		return this.dgm007clasetaxonomicas;
	}
	public void setDgm007clasetaxonomicas (List<DGM007ClaseTaxonomica> dgm007clasetaxonomicas) {
		this.dgm007clasetaxonomicas = dgm007clasetaxonomicas;
	}
	public void addDgm007clasetaxonomicas (DGM007ClaseTaxonomica dgm007clasetaxonomica) {
		this.dgm007clasetaxonomicas.add(dgm007clasetaxonomica);
	}
	public List getDgm007viaadministracions() {
		return this.dgm007viaadministracions;
	}
	public void setDgm007viaadministracions (List<DGM007ViaAdministracion> dgm007viaadministracions) {
		this.dgm007viaadministracions = dgm007viaadministracions;
	}
	public void addDgm007viaadministracions (DGM007ViaAdministracion dgm007viaadministracion) {
		this.dgm007viaadministracions.add(dgm007viaadministracion);
	}
	public List getDgm007envaseinmediatos() {
		return this.dgm007envaseinmediatos;
	}
	public void setDgm007envaseinmediatos (List<DGM007EnvaseInmediato> dgm007envaseinmediatos) {
		this.dgm007envaseinmediatos = dgm007envaseinmediatos;
	}
	public void addDgm007envaseinmediatos (DGM007EnvaseInmediato dgm007envaseinmediato) {
		this.dgm007envaseinmediatos.add(dgm007envaseinmediato);
	}
	public List getDgm007envasemediatos() {
		return this.dgm007envasemediatos;
	}
	public void setDgm007envasemediatos (List<DGM007EnvaseMediato> dgm007envasemediatos) {
		this.dgm007envasemediatos = dgm007envasemediatos;
	}
	public void addDgm007envasemediatos (DGM007EnvaseMediato dgm007envasemediato) {
		this.dgm007envasemediatos.add(dgm007envasemediato);
	}
//	public List getDgm007presentacions() {
//		return this.dgm007presentacions;
//	}
//	public void setDgm007presentacions (List<DGM007Presentacion> dgm007presentacions) {
//		this.dgm007presentacions = dgm007presentacions;
//	}
//	public void addDgm007presentacions (DGM007Presentacion dgm007presentacion) {
//		this.dgm007presentacions.add(dgm007presentacion);
//	}
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
	public String getUnidadTiempoVida() {
		return unidadTiempoVida;
	}
	public void setUnidadTiempoVida(String unidadTiempoVida) {
		this.unidadTiempoVida = unidadTiempoVida;
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
	public String getEsPack() {
		return esPack;
	}
	public void setEsPack(String esPack) {
		this.esPack = esPack;
	}
	public String getEsFabPrinIgualSec() {
		return esFabPrinIgualSec;
	}
	public void setEsFabPrinIgualSec(String esFabPrinIgualSec) {
		this.esFabPrinIgualSec = esFabPrinIgualSec;
	}
	public Integer getDgmTipoProdBiologico() {
		return dgmTipoProdBiologico;
	}
	public void setDgmTipoProdBiologico(Integer dgmTipoProdBiologico) {
		this.dgmTipoProdBiologico = dgmTipoProdBiologico;
	}
	public String getTipoProdBiologicoOtro() {
		return tipoProdBiologicoOtro;
	}
	public void setTipoProdBiologicoOtro(String tipoProdBiologicoOtro) {
		this.tipoProdBiologicoOtro = tipoProdBiologicoOtro;
	}
	public String getEstFarmaceutico() {
		return estFarmaceutico;
	}
	public void setEstFarmaceutico(String estFarmaceutico) {
		this.estFarmaceutico = estFarmaceutico;
	}
	public String getSustento() {
		return sustento;
	}
	public void setSustento(String sustento) {
		this.sustento = sustento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getFormulaCualicuantitativa() {
		return formulaCualicuantitativa;
	}
	public void setFormulaCualicuantitativa(String formulaCualicuantitativa) {
		this.formulaCualicuantitativa = formulaCualicuantitativa;
	}
	public String getTieneDispMedico() {
		return tieneDispMedico;
	}
	public void setTieneDispMedico(String tieneDispMedico) {
		this.tieneDispMedico = tieneDispMedico;
	}
	public String getDiluyente() {
		return diluyente;
	}
	public void setDiluyente(String diluyente) {
		this.diluyente = diluyente;
	}
	public String getDispMedico() {
		return dispMedico;
	}
	public void setDispMedico(String dispMedico) {
		this.dispMedico = dispMedico;
	}
	public String getPaisEncargaFabri() {
		return paisEncargaFabri;
	}
	public void setPaisEncargaFabri(String paisEncargaFabri) {
		this.paisEncargaFabri = paisEncargaFabri;
	}
	public String getNumFechaResolDirec() {
		return numFechaResolDirec;
	}
	public void setNumFechaResolDirec(String numFechaResolDirec) {
		this.numFechaResolDirec = numFechaResolDirec;
	}
	public String getPaisLicenciante() {
		return paisLicenciante;
	}
	public void setPaisLicenciante(String paisLicenciante) {
		this.paisLicenciante = paisLicenciante;
	}
	public Double getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(Double vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public Double getTiempoVidaDiluyente() {
		return tiempoVidaDiluyente;
	}
	public void setTiempoVidaDiluyente(Double tiempoVidaDiluyente) {
		this.tiempoVidaDiluyente = tiempoVidaDiluyente;
	}
	public Double getTiempoVidaDispMed() {
		return tiempoVidaDispMed;
	}
	public void setTiempoVidaDispMed(Double tiempoVidaDispMed) {
		this.tiempoVidaDispMed = tiempoVidaDispMed;
	}
	
}
