package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM001Producto {
	
	private Long dgm001Id;
	
	private Integer secuencia;
	
	private String nombre;
	
	private String concentracion;
	
	private String formaFarmaceutica;
	
	private String origen;
	
	private String condicionVenta;
	
	private String ventaSinReceta;
	
	private String grupo;
	
	private List<DGM001ViaAdministracion> viasAdministracion;
	
	private String tipoLiberacion;
	
	private String unidadPosologica;
	
	private String productoControlado;
	
	private String tipoProductoControlado;
	
	private String categoria;
	
	private String tipoSustentoInserto;
	
	private String paisAltaVigilancia;
	
	private List<DGM001SustentoEspecificacionesTecnicas> sustentosET;
	
	private List<DGM001SustentoTecnicaAnalitica> sustentosTA;
	
	private String codigoFormulaCualicuantitativa;
	
	private Double cantidadFormCualicuantitativa;
	
	private String uMedidaFormCualicuantitativa;
	
	private List<DGM001PrincipioActivo> principiosActivos;
	
	private List<DGM001ExcipienteColorante> excipientesColorantes;
	
	private List<DGM001ExcipienteConservador> excipientesConservadores;
	
	private List<DGM001ExcipienteOtros> excipientesOtros;
	
    private List<DGM001Solvente> solventes;
    
    private Integer tiempoVidaUtil;
    
    private List<DGM001EnvaseInmediato> envasesInmediato;
    
    private List<DGM001EnvaseMediato> envasesMediato;
    
    private List<DGM001Presentacion> presentaciones;
	
	private Long partidaArancelaria;
	
	private String codigoDetallePartida;
	
	private String formaPresentacion;
	
	private String sistemaCodificacion;
	
	public Long getDgm001Id() {
		return dgm001Id;
	}

	public void setDgm001Id(Long dgm001Id) {
		this.dgm001Id = dgm001Id;
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

	public List<DGM001ViaAdministracion> getViasAdministracion() {
		return viasAdministracion;
	}

	public void setViasAdministracion(
			List<DGM001ViaAdministracion> viasAdministracion) {
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

	public List<DGM001SustentoEspecificacionesTecnicas> getSustentosET() {
		return sustentosET;
	}

	public void setSustentosET(
			List<DGM001SustentoEspecificacionesTecnicas> sustentosET) {
		this.sustentosET = sustentosET;
	}

	public List<DGM001SustentoTecnicaAnalitica> getSustentosTA() {
		return sustentosTA;
	}

	public void setSustentosTA(List<DGM001SustentoTecnicaAnalitica> sustentosTA) {
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

	public List<DGM001PrincipioActivo> getPrincipiosActivos() {
		return principiosActivos;
	}

	public void setPrincipiosActivos(List<DGM001PrincipioActivo> principiosActivos) {
		this.principiosActivos = principiosActivos;
	}

	public List<DGM001ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}

	public void setExcipientesColorantes(
			List<DGM001ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}

	public List<DGM001ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}

	public void setExcipientesConservadores(
			List<DGM001ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}

	public List<DGM001Solvente> getSolventes() {
		return solventes;
	}

	public void setSolventes(List<DGM001Solvente> solventes) {
		this.solventes = solventes;
	}

	public Integer getTiempoVidaUtil() {
		return tiempoVidaUtil;
	}

	public void setTiempoVidaUtil(Integer tiempoVidaUtil) {
		this.tiempoVidaUtil = tiempoVidaUtil;
	}

	public List<DGM001EnvaseInmediato> getEnvasesInmediato() {
		return envasesInmediato;
	}

	public void setEnvasesInmediato(List<DGM001EnvaseInmediato> envasesInmediato) {
		this.envasesInmediato = envasesInmediato;
	}

	public List<DGM001EnvaseMediato> getEnvasesMediato() {
		return envasesMediato;
	}

	public void setEnvasesMediato(List<DGM001EnvaseMediato> envasesMediato) {
		this.envasesMediato = envasesMediato;
	}

	public List<DGM001Presentacion> getPresentaciones() {
		return presentaciones;
	}

	public void setPresentaciones(List<DGM001Presentacion> presentaciones) {
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

	public void setExcipientesOtros(List<DGM001ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}

	public List<DGM001ExcipienteOtros> getExcipientesOtros() {
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
