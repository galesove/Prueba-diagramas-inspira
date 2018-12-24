package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM002Producto {
	
	private Long dgm002Id;
	
	private Integer secuencia;
	
	private String nombre;
	
	private String concentracion;
	
	private String formaFarmaceutica;
	
	private String origen;
	
	private String condicionVenta;
	
	private String ventaSinReceta;
	
	private String grupo;
	
	private List<DGM002ViaAdministracion> viasAdministracion;
	
	private String tipoLiberacion;
	
	private String unidadPosologica;
	
	private String productoControlado;
	
	private String tipoProductoControlado;
	
	private String categoria;
	
	private String tipoSustentoInserto;
	
	private String paisAltaVigilancia;
	
	private List<DGM002SustentoEspecificacionesTecnicas> sustentosET;
	
	private List<DGM002SustentoTecnicaAnalitica> sustentosTA;
	
	private String codigoFormulaCualicuantitativa;
	
	private Double cantidadFormCualicuantitativa;
	
	private String uMedidaFormCualicuantitativa;
	
	private List<DGM002PrincipioActivo> principiosActivos;
	
	private List<DGM002ExcipienteColorante> excipientesColorantes;
	
	private List<DGM002ExcipienteConservador> excipientesConservadores;
	
	private List<DGM002ExcipienteOtros> excipientesOtros;
	
    private List<DGM002Solvente> solventes;
    
    private Integer tiempoVidaUtil;
    
    private List<DGM002EnvaseInmediato> envasesInmediato;
    
    private List<DGM002EnvaseMediato> envasesMediato;
    
    private List<DGM002Presentacion> presentaciones;
	
	private Long partidaArancelaria;
	
	private String codigoDetallePartida;
	
	private String formaPresentacion;
	
	private String sistemaCodificacion;
	
	public Long getDgm002Id() {
		return dgm002Id;
	}

	public void setDgm002Id(Long dgm002Id) {
		this.dgm002Id = dgm002Id;
	}

	public Integer getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getCondicionVenta() {
		return condicionVenta;
	}

	public void setCondicionVenta(String condicionVenta) {
		this.condicionVenta = condicionVenta;
	}

	public String getVentaSinReceta() {
		return ventaSinReceta;
	}

	public void setVentaSinReceta(String ventaSinReceta) {
		this.ventaSinReceta = ventaSinReceta;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public List<DGM002ViaAdministracion> getViasAdministracion() {
		return viasAdministracion;
	}

	public void setViasAdministracion(
			List<DGM002ViaAdministracion> viasAdministracion) {
		this.viasAdministracion = viasAdministracion;
	}

	public String getTipoLiberacion() {
		return tipoLiberacion;
	}

	public void setTipoLiberacion(String tipoLiberacion) {
		this.tipoLiberacion = tipoLiberacion;
	}

	public String getUnidadPosologica() {
		return unidadPosologica;
	}

	public void setUnidadPosologica(String unidadPosologica) {
		this.unidadPosologica = unidadPosologica;
	}

	public String getProductoControlado() {
		return productoControlado;
	}

	public void setProductoControlado(String productoControlado) {
		this.productoControlado = productoControlado;
	}

	public String getTipoProductoControlado() {
		return tipoProductoControlado;
	}

	public void setTipoProductoControlado(String tipoProductoControlado) {
		this.tipoProductoControlado = tipoProductoControlado;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipoSustentoInserto() {
		return tipoSustentoInserto;
	}

	public void setTipoSustentoInserto(String tipoSustentoInserto) {
		this.tipoSustentoInserto = tipoSustentoInserto;
	}

	public String getPaisAltaVigilancia() {
		return paisAltaVigilancia;
	}

	public void setPaisAltaVigilancia(String paisAltaVigilancia) {
		this.paisAltaVigilancia = paisAltaVigilancia;
	}

	public List<DGM002SustentoEspecificacionesTecnicas> getSustentosET() {
		return sustentosET;
	}

	public void setSustentosET(
			List<DGM002SustentoEspecificacionesTecnicas> sustentosET) {
		this.sustentosET = sustentosET;
	}

	public List<DGM002SustentoTecnicaAnalitica> getSustentosTA() {
		return sustentosTA;
	}

	public void setSustentosTA(List<DGM002SustentoTecnicaAnalitica> sustentosTA) {
		this.sustentosTA = sustentosTA;
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

	public void setCantidadFormCualicuantitativa(Double cantidadFormCualicuantitativa) {
		this.cantidadFormCualicuantitativa = cantidadFormCualicuantitativa;
	}

	public String getUMedidaFormCualicuantitativa() {
		return uMedidaFormCualicuantitativa;
	}

	public void setUMedidaFormCualicuantitativa(String uMedidaFormCualicuantitativa) {
		this.uMedidaFormCualicuantitativa = uMedidaFormCualicuantitativa;
	}

	public List<DGM002PrincipioActivo> getPrincipiosActivos() {
		return principiosActivos;
	}

	public void setPrincipiosActivos(List<DGM002PrincipioActivo> principiosActivos) {
		this.principiosActivos = principiosActivos;
	}

	public List<DGM002ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}

	public void setExcipientesColorantes(
			List<DGM002ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}

	public List<DGM002ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}

	public void setExcipientesConservadores(
			List<DGM002ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}

	public List<DGM002Solvente> getSolventes() {
		return solventes;
	}

	public void setSolventes(List<DGM002Solvente> solventes) {
		this.solventes = solventes;
	}

	public Integer getTiempoVidaUtil() {
		return tiempoVidaUtil;
	}

	public void setTiempoVidaUtil(Integer tiempoVidaUtil) {
		this.tiempoVidaUtil = tiempoVidaUtil;
	}

	public List<DGM002EnvaseInmediato> getEnvasesInmediato() {
		return envasesInmediato;
	}

	public void setEnvasesInmediato(List<DGM002EnvaseInmediato> envasesInmediato) {
		this.envasesInmediato = envasesInmediato;
	}

	public List<DGM002EnvaseMediato> getEnvasesMediato() {
		return envasesMediato;
	}

	public void setEnvasesMediato(List<DGM002EnvaseMediato> envasesMediato) {
		this.envasesMediato = envasesMediato;
	}

	public List<DGM002Presentacion> getPresentaciones() {
		return presentaciones;
	}

	public void setPresentaciones(List<DGM002Presentacion> presentaciones) {
		this.presentaciones = presentaciones;
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

	public void setExcipientesOtros(List<DGM002ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}

	public List<DGM002ExcipienteOtros> getExcipientesOtros() {
		return excipientesOtros;
	}

	public String getFormaPresentacion() {
		return formaPresentacion;
	}

	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}

	public String getSistemaCodificacion() {
		return sistemaCodificacion;
	}

	public void setSistemaCodificacion(String sistemaCodificacion) {
		this.sistemaCodificacion = sistemaCodificacion;
	}
	
}
