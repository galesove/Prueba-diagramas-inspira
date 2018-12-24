package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035 {
	
	private Long dgm035Id;
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
	private String suplementoReferencia;
	private String tecnicaDesarrollada;
	private String nroAutorizacionCemis;
	private String viaAdministracion;
	private String dosificacion;
	private Integer vidaUtil;
	private String sistemaCodificacion;
	private String direccionEstablecimiento; 
	private String codigoDireccion;
	
	private Long dr;
	private Integer ano; 
		
	private List<DGM035ExcipienteColorante> excipientesColorantes;
	
	private List<DGM035ExcipienteConservador> excipientesConservadores;	

	private List<DGM035ExcipienteOtros> excipientesOtros;

    private List<DGM035Solvente> solventes;
    
    private List<DGM035EnvaseInmediato> envasesInmediato;
    
    private List<DGM035EnvaseMediato> envasesMediato;
    
    private List<DGM035Presentacion> presentaciones;
    
	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
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

	public void setSuplementoReferencia(String suplementoReferencia) {
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

	public void setCodigoDireccion(String codigoDireccion) {
		this.codigoDireccion = codigoDireccion;
	}

	public String getCodigoDireccion() {
		return codigoDireccion;
	}

	public void setDr(Long dr) {
		this.dr = dr;
	}

	public Long getDr() {
		return dr;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getAno() {
		return ano;
	}

	public void setExcipientesColorantes(List<DGM035ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}

	public List<DGM035ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}

	public List<DGM035ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}

	public void setExcipientesConservadores(List<DGM035ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}

	public void setExcipientesOtros(List<DGM035ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}

	public List<DGM035ExcipienteOtros> getExcipientesOtros() {
		return excipientesOtros;
	}
	
	public List<DGM035Solvente> getSolventes() {
		return solventes;
	}

	public void setSolventes(List<DGM035Solvente> solventes) {
		this.solventes = solventes;
	}

	public List<DGM035EnvaseInmediato> getEnvasesInmediato() {
		return envasesInmediato;
	}

	public void setEnvasesInmediato(List<DGM035EnvaseInmediato> envasesInmediato) {
		this.envasesInmediato = envasesInmediato;
	}

	public List<DGM035EnvaseMediato> getEnvasesMediato() {
		return envasesMediato;
	}

	public void setEnvasesMediato(List<DGM035EnvaseMediato> envasesMediato) {
		this.envasesMediato = envasesMediato;
	}

	public List<DGM035Presentacion> getPresentaciones() {
		return presentaciones;
	}

	public void setPresentaciones(List<DGM035Presentacion> presentaciones) {
		this.presentaciones = presentaciones;
	}

}
