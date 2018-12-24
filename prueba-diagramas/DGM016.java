package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;
import java.util.List;

public class DGM016 {
	
	private Long dgm016Id;
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
	//private String suplementoReferencia;
	//private String tecnicaDesarrollada;
	private String nroAutorizacionCemis;
	private String viaAdministracion;
	private String dosificacion;
	private Integer vidaUtil;
	private String sistemaCodificacion;
	private String direccionEstablecimiento;
	private String idDireccionEstablecimiento;
	//private String sustentoFarmacopea;
	
	private String paisFabricante;
	private String direccionFabricante;	
	private String formaPresentacion;
	
	//atributos para nueva version DGM011_II
	private String  esInscripcion;
	private String  esReinscripcion;
	//private String  nroRegistroSanitarioOrigen;
	private Date    fechaVencimientoRsOrigen;
	private String  nroExpRsReins;
	private Date    fechaExpRsReins;
	
	private List<DGM016SustentoRegistro> sustentosregistro; //ok
	private List<DGM016PrincipioActivo> principiosactivos; //ok
	private List<DGM016SuplementoReferencia> sumplementosreferencia; //ok
	private List<DGM016Acondicionadora> empresasacondicionado; 
	
	//private List<DGM016ExcipienteColorante> dgm016excipientesColorantes = new ArrayList<DGM016ExcipienteColorante>();
	//private List<DGM016ExcipienteConservador> dgm016excipientesconservador = new ArrayList<DGM016ExcipienteConservador>();
	//private List<DGM016ExcipienteOtros> dgm016excipientesotros = new ArrayList<DGM016ExcipienteOtros>();
	//private List<DGM016Solvente> dgm016solventes = new ArrayList<DGM016Solvente>();
	//private List<DGM016EnvaseInmediato> dgm016envasesinmediatos = new ArrayList<DGM016EnvaseInmediato>();
	//private List<DGM016EnvaseMediato> dgm016envasesmediatos = new ArrayList<DGM016EnvaseMediato>();
	

	
	private List<DGM016ExcipienteColorante> excipientesColorantes; //ok
	
	private List<DGM016ExcipienteConservador> excipientesConservadores;	//ok

	private List<DGM016ExcipienteOtros> excipientesOtros; //ok

    private List<DGM016Solvente> solventes; //ok
    
    private List<DGM016EnvaseInmediato> envasesInmediato; //ok
    
    private List<DGM016EnvaseMediato> envasesMediato; //ok
    
  //  private List<DGM016Presentacion> presentaciones;
    
	
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


	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
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

	/*public String getSustentoFarmacopea() {
		return sustentoFarmacopea;
	}

	public void setSustentoFarmacopea(String sustentoFarmacopea) {
		this.sustentoFarmacopea = sustentoFarmacopea;
	}
*/
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

	/*public void setSuplementoReferencia(String suplementoReferencia) {
		this.suplementoReferencia = suplementoReferencia;
	}

	public String getSuplementoReferencia() {
		return suplementoReferencia;
	}

	public void setTecnicaDesarrollada(String tecnicaDesarrollada) {
		this.tecnicaDesarrollada = tecnicaDesarrollada;
	}

	public String getTecnicaDesarrollada() {
		return tecnicaDesarrollada;
	}
*/
	public void setNroAutorizacionCemis(String nroAutorizacionCemis) {
		this.nroAutorizacionCemis = nroAutorizacionCemis;
	}

	public String getNroAutorizacionCemis() {
		return nroAutorizacionCemis;
	}

	public void setViaAdministracion(String viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
	}

	public String getViaAdministracion() {
		return viaAdministracion;
	}

	public void setDosificacion(String dosificacion) {
		this.dosificacion = dosificacion;
	}

	public String getDosificacion() {
		return dosificacion;
	}

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

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}

	public void setExcipientesColorantes(List<DGM016ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}

	public List<DGM016ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}

	public List<DGM016ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}

	public void setExcipientesConservadores(List<DGM016ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}

	public void setExcipientesOtros(List<DGM016ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}

	public List<DGM016ExcipienteOtros> getExcipientesOtros() {
		return excipientesOtros;
	}
	
	public List<DGM016Solvente> getSolventes() {
		return solventes;
	}

	public void setSolventes(List<DGM016Solvente> solventes) {
		this.solventes = solventes;
	}

	public List<DGM016EnvaseInmediato> getEnvasesInmediato() {
		return envasesInmediato;
	}

	public void setEnvasesInmediato(List<DGM016EnvaseInmediato> envasesInmediato) {
		this.envasesInmediato = envasesInmediato;
	}

	public List<DGM016EnvaseMediato> getEnvasesMediato() {
		return envasesMediato;
	}

	public void setEnvasesMediato(List<DGM016EnvaseMediato> envasesMediato) {
		this.envasesMediato = envasesMediato;
	}

	/*public List<DGM016Presentacion> getPresentaciones() {
		return presentaciones;
	}

	public void setPresentaciones(List<DGM016Presentacion> presentaciones) {
		this.presentaciones = presentaciones;
	}*/
	public List<DGM016SustentoRegistro> getSustentosregistro() {
		return sustentosregistro;
	}

	public void setSustentosregistro(List<DGM016SustentoRegistro> sustentosregistro) {
		this.sustentosregistro = sustentosregistro;
	}

	public List<DGM016PrincipioActivo> getPrincipiosactivos() {
		return principiosactivos;
	}

	public void setPrincipiosactivos(List<DGM016PrincipioActivo> principiosactivos) {
		this.principiosactivos = principiosactivos;
	}

	public List<DGM016SuplementoReferencia> getSumplementosreferencia() {
		return sumplementosreferencia;
	}

	public void setSumplementosreferencia(
			List<DGM016SuplementoReferencia> sumplementosreferencia) {
		this.sumplementosreferencia = sumplementosreferencia;
	}

	public List<DGM016Acondicionadora> getEmpresasacondicionado() {
		return empresasacondicionado;
	}

	public void setEmpresasacondicionado(List<DGM016Acondicionadora> empresasacondicionado) {
		this.empresasacondicionado = empresasacondicionado;
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

	public Date getFechaVencimientoRsOrigen() {
		return fechaVencimientoRsOrigen;
	}

	public void setFechaVencimientoRsOrigen(Date fechaVencimientoRsOrigen) {
		this.fechaVencimientoRsOrigen = fechaVencimientoRsOrigen;
	}

	public String getNroExpRsReins() {
		return nroExpRsReins;
	}

	public void setNroExpRsReins(String nroExpRsReins) {
		this.nroExpRsReins = nroExpRsReins;
	}

	public Date getFechaExpRsReins() {
		return fechaExpRsReins;
	}

	public void setFechaExpRsReins(Date fechaExpRsReins) {
		this.fechaExpRsReins = fechaExpRsReins;
	}
}
