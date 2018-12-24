package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM011 {

	private Long    dgm011Id; 
	private Long    ordenId; 
	private Integer mto; 
	private String  codigoEstablecimiento; 
	private String  categoriaEstablecimiento; 
	private String  idDireccionEstablecimiento;
	private String  direccionEstablecimiento; 
	//private String  representanteLegal;
	private String  codigoRegente; 
	private String  cargoRegente; 
	private Integer  dgmTipoTramite; 
	private String  nombreProducto; 
	private String  origenProducto; 
	private Long    partidaArancelaria; 
	private String  codigoDetallePartida; 
	private Integer vidaUtil; 
	private String  formaPresentacion; 
	private String  origenFabricante; 
	private String  fabricanteNacional; 
	private String  fabricanteExtranjero; 
	private String  esMaquila; 
	private String  esFabricacionEncargo; 
	private String  fabricacionEncargo; 
	//private String  nroExpedienteFabricacion; 
	private String  licenciaDe;
	
	private String  paisFabricante;
	private String  direccionFabricante;
	//atributos para nueva version DGM011_II
	private String  esInscripcion;
	private String  esReinscripcion;
	private String  nroRegistroSanitarioOrigen;
	private Date    fechaVencimientoRsOrigen;
	private String  nroExpRsReins;
	private Date    fechaExpRsReins;
	private String  grupoProducto;
	
	//AEP 01/02: DGM-002-2017 
	private String esFabricanteCata;
	private String nombreFabriNoCata;
	
	//Lista de clases para detalle del producto
	private List<DGM011Producto> dgm011productos = new ArrayList<DGM011Producto>();
	private List<DGM011EnvaseInmediato> dgm011envaseinmediatos = new ArrayList<DGM011EnvaseInmediato>();
	private List<DGM011EnvaseMediato> dgm011envasemediatos = new ArrayList<DGM011EnvaseMediato>();
	private List<DGM011FormulaCualCuan> dgm011formulacualcuans = new ArrayList<DGM011FormulaCualCuan>();
	private List<DGM011ResultadoAnalisis> dgm011resultadoanalisiss = new ArrayList<DGM011ResultadoAnalisis>();
	private List<DGM011Uso> dgm011usos = new ArrayList<DGM011Uso>();
	private List<DGM011Lote> dgm011lotes = new ArrayList<DGM011Lote>();
	private List<DGM011Maquiladora> dgm011maquiladoras = new ArrayList<DGM011Maquiladora>();
	
	public boolean validateRequiredFieldsFabricante() {
	     return
	    		 this.origenFabricante==null?false:
	    	     this.esFabricanteCata==null?false:
	    	     (this.nombreFabriNoCata==null && this.fabricanteNacional==null && this.fabricanteExtranjero==null)?false:
	    	     this.paisFabricante==null?false:
	    	 	 this.direccionFabricante==null?false:true;	 
	}
	
	public List<DGM011EnvaseInmediato> getDgm011envaseinmediatos() {
		return dgm011envaseinmediatos;
	}
	public void setDgm011envaseinmediatos(
			List<DGM011EnvaseInmediato> dgm011envaseinmediatos) {
		this.dgm011envaseinmediatos = dgm011envaseinmediatos;
	}
	public List<DGM011EnvaseMediato> getDgm011envasemediatos() {
		return dgm011envasemediatos;
	}
	public void setDgm011envasemediatos(
			List<DGM011EnvaseMediato> dgm011envasemediatos) {
		this.dgm011envasemediatos = dgm011envasemediatos;
	}
	public List<DGM011FormulaCualCuan> getDgm011formulacualcuans() {
		return dgm011formulacualcuans;
	}
	public void setDgm011formulacualcuans(
			List<DGM011FormulaCualCuan> dgm011formulacualcuans) {
		this.dgm011formulacualcuans = dgm011formulacualcuans;
	}
	public List<DGM011ResultadoAnalisis> getDgm011resultadoanalisiss() {
		return dgm011resultadoanalisiss;
	}
	public void setDgm011resultadoanalisiss(
			List<DGM011ResultadoAnalisis> dgm011resultadoanalisiss) {
		this.dgm011resultadoanalisiss = dgm011resultadoanalisiss;
	}
	public List<DGM011Uso> getDgm011usos() {
		return dgm011usos;
	}
	public void setDgm011usos(List<DGM011Uso> dgm011usos) {
		this.dgm011usos = dgm011usos;
	}
	public List<DGM011Lote> getDgm011lotes() {
		return dgm011lotes;
	}
	public void setDgm011lotes(List<DGM011Lote> dgm011lotes) {
		this.dgm011lotes = dgm011lotes;
	}

	public Long getDgm011Id() {
		return dgm011Id;
	}
	public void setDgm011Id(Long dgm011Id) {
		this.dgm011Id = dgm011Id;
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
	public void setCategoriaEstablecimiento(String categoria_establecimiento) {
		this.categoriaEstablecimiento = categoria_establecimiento;
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
	public void setDireccionEstablecimiento(String direccion_establecimiento) {
		this.direccionEstablecimiento = direccion_establecimiento;
	}
	public String getCodigoRegente() {
		return codigoRegente;
	}
	public void setCodigoRegente(String codigo_regente) {
		this.codigoRegente = codigo_regente;
	}
	public String getCargoRegente() {
		return cargoRegente;
	}
	public void setCargoRegente(String cargo_regente) {
		this.cargoRegente = cargo_regente;
	}
	public Integer getDgmTipoTramite() {
		return dgmTipoTramite;
	}
	public void setDgmTipoTramite(Integer dgmTipoTramite) {
		this.dgmTipoTramite = dgmTipoTramite;
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
	public Integer getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(Integer vidaUtil) {
		this.vidaUtil = vidaUtil;
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
	public String getEsMaquila() {
		return esMaquila;
	}
	public void setEsMaquila(String esMaquila) {
		this.esMaquila = esMaquila;
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
	
	public String getLicenciaDe() {
		return licenciaDe;
	}
	public void setLicenciaDe(String licenciaDe) {
		this.licenciaDe = licenciaDe;
	}
	public List<DGM011Producto> getDgm011productos() {
		return dgm011productos;
	}
	public void setDgm011productos(List<DGM011Producto> dgm011productos) {
		this.dgm011productos = dgm011productos;
	}
	public List<DGM011Maquiladora> getDgm011maquiladoras() {
		return dgm011maquiladoras;
	}
	public void setDgm011maquiladoras(List<DGM011Maquiladora> dgm011maquiladoras) {
		this.dgm011maquiladoras = dgm011maquiladoras;
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
	public Date getFechaExpRsReins() {
		return fechaExpRsReins;
	}
	public void setFechaExpRsReins(Date fechaExpRsReins) {
		this.fechaExpRsReins = fechaExpRsReins;
	}
	public String getNroExpRsReins() {
		return nroExpRsReins;
	}
	public void setNroExpRsReins(String nroExpRsReins) {
		this.nroExpRsReins = nroExpRsReins;
	}
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public String getEsFabricanteCata() {
		return esFabricanteCata;
	}
	public String getNombreFabriNoCata() {
		return nombreFabriNoCata;
	}
	public void setEsFabricanteCata(String esFabricanteCata) {
		this.esFabricanteCata = esFabricanteCata;
	}
	public void setNombreFabriNoCata(String nombreFabriNoCata) {
		this.nombreFabriNoCata = nombreFabriNoCata;
	}
}
