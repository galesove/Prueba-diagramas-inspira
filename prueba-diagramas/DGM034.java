package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034 {

	private Long dgm034Id; 
	private Long ordenId; 
	private Integer mto; 
	private String codigoEstablecimiento; 
	private String categoriaEstablecimiento; 
	private String direccionEstablecimiento; 
	private String representanteLegal; 
	private String codigoRegente; 
	private String cargoRegente; 
	private Integer tipoTramite; 
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
	private Integer vidaUtil; 
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
	private String nroRegistroSanOrigen; 
	
	private List<DGM034SustentoRegistro> dgm034sustentoregistros = new ArrayList<DGM034SustentoRegistro>();
	private List<DGM034PrincipioActivo> dgm034principioactivos = new ArrayList<DGM034PrincipioActivo>();
	private List<DGM034Solvente> dgm034solventes = new ArrayList<DGM034Solvente>();
	private List<DGM034ExcipienteColorante> dgm034excipientecolorantes = new ArrayList<DGM034ExcipienteColorante>();
	private List<DGM034ExcipienteConservador> dgm034excipienteconservadors = new ArrayList<DGM034ExcipienteConservador>();
	private List<DGM034ExcipienteOtros> dgm034excipienteotross = new ArrayList<DGM034ExcipienteOtros>();
	private List<DGM034ClaseTaxonomica> dgm034clasetaxonomicas = new ArrayList<DGM034ClaseTaxonomica>();
	private List<DGM034ViaAdministracion> dgm034viaadministracions = new ArrayList<DGM034ViaAdministracion>();
	private List<DGM034EnvaseInmediato> dgm034envaseinmediatos = new ArrayList<DGM034EnvaseInmediato>();
	private List<DGM034EnvaseMediato> dgm034envasemediatos = new ArrayList<DGM034EnvaseMediato>();
	private List<DGM034Presentacion> dgm034presentacions = new ArrayList<DGM034Presentacion>();

	public Long getDgm034Id() {
		return dgm034Id;
	}
	public void setDgm034Id(Long dgm034Id) {
		this.dgm034Id = dgm034Id;
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
	public Integer getTipoTramite() {
		return tipoTramite;
	}
	public void setTipoTramite(Integer tipoTramite) {
		this.tipoTramite = tipoTramite;
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
	public Integer getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(Integer vidaUtil) {
		this.vidaUtil = vidaUtil;
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
	public List getDgm034sustentoregistros() {
		return this.dgm034sustentoregistros;
	}
	public void setDgm034sustentoregistros (List<DGM034SustentoRegistro> dgm034sustentoregistros) {
		this.dgm034sustentoregistros = dgm034sustentoregistros;
	}
	public void addDgm034sustentoregistros (DGM034SustentoRegistro dgm034sustentoregistro) {
		this.dgm034sustentoregistros.add(dgm034sustentoregistro);
	}
	public List getDgm034principioactivos() {
		return this.dgm034principioactivos;
	}
	public void setDgm034principioactivos (List<DGM034PrincipioActivo> dgm034principioactivos) {
		this.dgm034principioactivos = dgm034principioactivos;
	}
	public void addDgm034principioactivos (DGM034PrincipioActivo dgm034principioactivo) {
		this.dgm034principioactivos.add(dgm034principioactivo);
	}
	public List getDgm034solventes() {
		return this.dgm034solventes;
	}
	public void setDgm034solventes (List<DGM034Solvente> dgm034solventes) {
		this.dgm034solventes = dgm034solventes;
	}
	public void addDgm034solventes (DGM034Solvente dgm034solvente) {
		this.dgm034solventes.add(dgm034solvente);
	}
	public List getDgm034excipientecolorantes() {
		return this.dgm034excipientecolorantes;
	}
	public void setDgm034excipientecolorantes (List<DGM034ExcipienteColorante> dgm034excipientecolorantes) {
		this.dgm034excipientecolorantes = dgm034excipientecolorantes;
	}
	public void addDgm034excipientecolorantes (DGM034ExcipienteColorante dgm034excipientecolorante) {
		this.dgm034excipientecolorantes.add(dgm034excipientecolorante);
	}
	public List getDgm034excipienteconservadors() {
		return this.dgm034excipienteconservadors;
	}
	public void setDgm034excipienteconservadors (List<DGM034ExcipienteConservador> dgm034excipienteconservadors) {
		this.dgm034excipienteconservadors = dgm034excipienteconservadors;
	}
	public void addDgm034excipienteconservadors (DGM034ExcipienteConservador dgm034excipienteconservador) {
		this.dgm034excipienteconservadors.add(dgm034excipienteconservador);
	}
	public List getDgm034excipienteotross() {
		return this.dgm034excipienteotross;
	}
	public void setDgm034excipienteotross (List<DGM034ExcipienteOtros> dgm034excipienteotross) {
		this.dgm034excipienteotross = dgm034excipienteotross;
	}
	public void addDgm034excipienteotross (DGM034ExcipienteOtros dgm034excipienteotros) {
		this.dgm034excipienteotross.add(dgm034excipienteotros);
	}
	public List getDgm034clasetaxonomicas() {
		return this.dgm034clasetaxonomicas;
	}
	public void setDgm034clasetaxonomicas (List<DGM034ClaseTaxonomica> dgm034clasetaxonomicas) {
		this.dgm034clasetaxonomicas = dgm034clasetaxonomicas;
	}
	public void addDgm034clasetaxonomicas (DGM034ClaseTaxonomica dgm034clasetaxonomica) {
		this.dgm034clasetaxonomicas.add(dgm034clasetaxonomica);
	}
	public List getDgm034viaadministracions() {
		return this.dgm034viaadministracions;
	}
	public void setDgm034viaadministracions (List<DGM034ViaAdministracion> dgm034viaadministracions) {
		this.dgm034viaadministracions = dgm034viaadministracions;
	}
	public void addDgm034viaadministracions (DGM034ViaAdministracion dgm034viaadministracion) {
		this.dgm034viaadministracions.add(dgm034viaadministracion);
	}
	public List getDgm034envaseinmediatos() {
		return this.dgm034envaseinmediatos;
	}
	public void setDgm034envaseinmediatos (List<DGM034EnvaseInmediato> dgm034envaseinmediatos) {
		this.dgm034envaseinmediatos = dgm034envaseinmediatos;
	}
	public void addDgm034envaseinmediatos (DGM034EnvaseInmediato dgm034envaseinmediato) {
		this.dgm034envaseinmediatos.add(dgm034envaseinmediato);
	}
	public List getDgm034envasemediatos() {
		return this.dgm034envasemediatos;
	}
	public void setDgm034envasemediatos (List<DGM034EnvaseMediato> dgm034envasemediatos) {
		this.dgm034envasemediatos = dgm034envasemediatos;
	}
	public void addDgm034envasemediatos (DGM034EnvaseMediato dgm034envasemediato) {
		this.dgm034envasemediatos.add(dgm034envasemediato);
	}
	public List getDgm034presentacions() {
		return this.dgm034presentacions;
	}
	public void setDgm034presentacions (List<DGM034Presentacion> dgm034presentacions) {
		this.dgm034presentacions = dgm034presentacions;
	}
	public void addDgm034presentacions (DGM034Presentacion dgm034presentacion) {
		this.dgm034presentacions.add(dgm034presentacion);
	}
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	public String getNroRegistroSanOrigen() {
		return nroRegistroSanOrigen;
	}
	public void setNroRegistroSanOrigen(String nroRegistroSanOrigen) {
		this.nroRegistroSanOrigen = nroRegistroSanOrigen;
	}
}
