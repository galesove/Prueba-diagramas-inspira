package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;
import java.util.List;

public class DGM036 {
	
	private Long dgm036Id;
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
	private String nroAutorizacionCemis;
	//private String viaAdministracion;
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
	private String grupoProductoDesc;
	
    private String envasadoPor;
    private String tipoLiberacion;

	private String codigoFormulaCualicuantitativa;
	private Double cantidadFormCualicuantitativa;
	private String uMedidaFormCualicuantitativa;
	private Date fechaVencimientoRS;
			
	private List<DGM036ExcipienteColorante> excipientesColorantes;
	
	private List<DGM036ExcipienteConservador> excipientesConservadores;	

	private List<DGM036ExcipienteOtros> excipientesOtros;

    private List<DGM036EnvaseInmediato> envasesInmediato;
    
    private List<DGM036EnvaseMediato> envasesMediato;
    
    private List<DGM036Presentacion> presentaciones;
    
    private List<DGM036SustentoRegistro> sustentos;
    
    private List<DGM036ClaseTaxonomica> clasesTaxonomicas;
    
    private List<DGM036PrincipioActivo> principiosActivos;    
    
    private List<DGM036RecursoMineral> recursosMinerales;
    
    private List<DGM036Acondicionadora> acondicionadoras;
    
    private List<DGM036ViaAdministracion> viasAdministracion;
    
    
	public Long getDgm036Id() {
		return dgm036Id;
	}

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
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

	public void setExcipientesColorantes(List<DGM036ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}

	public List<DGM036ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}

	public List<DGM036ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}

	public void setExcipientesConservadores(List<DGM036ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}

	public void setExcipientesOtros(List<DGM036ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}

	public List<DGM036ExcipienteOtros> getExcipientesOtros() {
		return excipientesOtros;
	}
	
	public List<DGM036EnvaseInmediato> getEnvasesInmediato() {
		return envasesInmediato;
	}

	public void setEnvasesInmediato(List<DGM036EnvaseInmediato> envasesInmediato) {
		this.envasesInmediato = envasesInmediato;
	}

	public List<DGM036EnvaseMediato> getEnvasesMediato() {
		return envasesMediato;
	}

	public void setEnvasesMediato(List<DGM036EnvaseMediato> envasesMediato) {
		this.envasesMediato = envasesMediato;
	}

	public List<DGM036Presentacion> getPresentaciones() {
		return presentaciones;
	}

	public void setPresentaciones(List<DGM036Presentacion> presentaciones) {
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

	public List<DGM036SustentoRegistro> getSustentos() {
		return sustentos;
	}

	public void setSustentos(List<DGM036SustentoRegistro> sustentos) {
		this.sustentos = sustentos;
	}

	public List<DGM036ClaseTaxonomica> getClasesTaxonomicas() {
		return clasesTaxonomicas;
	}

	public void setClasesTaxonomicas(List<DGM036ClaseTaxonomica> clasesTaxonomicas) {
		this.clasesTaxonomicas = clasesTaxonomicas;
	}

	public List<DGM036PrincipioActivo> getPrincipiosActivos() {
		return principiosActivos;
	}

	public void setPrincipiosActivos(List<DGM036PrincipioActivo> principiosActivos) {
		this.principiosActivos = principiosActivos;
	}

	public List<DGM036RecursoMineral> getRecursosMinerales() {
		return recursosMinerales;
	}

	public void setRecursosMinerales(List<DGM036RecursoMineral> recursosMinerales) {
		this.recursosMinerales = recursosMinerales;
	}

	public List<DGM036Acondicionadora> getAcondicionadoras() {
		return acondicionadoras;
	}

	public void setAcondicionadoras(List<DGM036Acondicionadora> acondicionadoras) {
		this.acondicionadoras = acondicionadoras;
	}

	public String getGrupoProductoDesc() {
		return grupoProductoDesc;
	}

	public void setGrupoProductoDesc(String grupoProductoDesc) {
		this.grupoProductoDesc = grupoProductoDesc;
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

	public Date getFechaVencimientoRS() {
		return fechaVencimientoRS;
	}

	public void setFechaVencimientoRS(Date fechaVencimientoRS) {
		this.fechaVencimientoRS = fechaVencimientoRS;
	}

	public List<DGM036ViaAdministracion> getViasAdministracion() {
		return viasAdministracion;
	}

	public void setViasAdministracion(
			List<DGM036ViaAdministracion> viasAdministracion) {
		this.viasAdministracion = viasAdministracion;
	}

}
