package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;
import java.util.List;

public class DGM055Producto {
	private Long dgm055Id;
	private Integer secuencia;
	private String nombre;
	private String concentracion;
	private String formaFarmaceutica;
	private String origen;
	private String condicionVenta;
	private String ventaSinReceta;
	private String grupo;
	private String tipoLiberacion;
	private String unidadPosologica;
	private String productoControlado;
	private Long clasificacionFarmacologica;
	private String tipoProductoControlado;
	private String categoria;
	private String tipoSustentoInserto;
	private String pais;
	private String codigoFormulaCualicuantitativa;
	private Double cantidadFormCualicuantitativa;
	private String uMedidaFormCualicuantitativa;
	private String unidadTiempoVidaUtil;
	private Integer tiempoVidaUtil;
	private Long partidaArancelaria;
	private String codigoDetallePartida;
	private String formaPresentacion;
	private String sistemaCodificacion;
	private String nroRegistroSanitarioOrigen;
    private Date fechaVencimientoRSOrigen;
    private String grupoProducto;
    private String expedienteReinscripcionRS;
    private Date fechaExpedienteReinscripcionRS;
    
    // Version III
	private String condicionalAlmacenamiento;
	
	private List<DGM055ViaAdministracion> viasAdministracion;
	private List<DGM055SustentoEspecificacionesTecnicas> sustentosET;
	private List<DGM055SustentoTecnicaAnalitica> sustentosTA;
	private List<DGM055PrincipioActivo> principiosActivos;
	private List<DGM055ExcipienteColorante> excipientesColorantes;
	private List<DGM055ExcipienteConservador> excipientesConservadores;
	private List<DGM055ExcipienteOtros> excipientesOtros;
	private List<DGM055Solvente> solventes;
	private List<DGM055EnvaseMediato> envasesMediato;
	private List<DGM055Presentacion> presentaciones;
	private List<DGM055EnvaseInmediato> envasesInmediato;
    
	public Long getDgm055Id() {
		return dgm055Id;
	}

	public void setDgm055Id(Long dgm055Id) {
		this.dgm055Id = dgm055Id;
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

	public Long getClasificacionFarmacologica() {
		return clasificacionFarmacologica;
	}

	public void setClasificacionFarmacologica(Long clasificacionFarmacologica) {
		this.clasificacionFarmacologica = clasificacionFarmacologica;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoFormulaCualicuantitativa() {
		return codigoFormulaCualicuantitativa;
	}

	public void setCodigoFormulaCualicuantitativa(String codigoFormulaCualicuantitativa) {
		this.codigoFormulaCualicuantitativa = codigoFormulaCualicuantitativa;
	}

	public Double getCantidadFormCualicuantitativa() {
		return cantidadFormCualicuantitativa;
	}

	public void setCantidadFormCualicuantitativa(Double cantidadFormCualicuantitativa) {
		this.cantidadFormCualicuantitativa = cantidadFormCualicuantitativa;
	}

	public String getuMedidaFormCualicuantitativa() {
		return uMedidaFormCualicuantitativa;
	}

	public void setuMedidaFormCualicuantitativa(String uMedidaFormCualicuantitativa) {
		this.uMedidaFormCualicuantitativa = uMedidaFormCualicuantitativa;
	}

	public String getUnidadTiempoVidaUtil() {
		return unidadTiempoVidaUtil;
	}

	public void setUnidadTiempoVidaUtil(String unidadTiempoVidaUtil) {
		this.unidadTiempoVidaUtil = unidadTiempoVidaUtil;
	}

	public Integer getTiempoVidaUtil() {
		return tiempoVidaUtil;
	}

	public void setTiempoVidaUtil(Integer tiempoVidaUtil) {
		this.tiempoVidaUtil = tiempoVidaUtil;
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

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}

	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}

	public Date getFechaVencimientoRSOrigen() {
		return fechaVencimientoRSOrigen;
	}

	public void setFechaVencimientoRSOrigen(Date fechaVencimientoRSOrigen) {
		this.fechaVencimientoRSOrigen = fechaVencimientoRSOrigen;
	}

	public String getGrupoProducto() {
		return grupoProducto;
	}

	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}

	public String getExpedienteReinscripcionRS() {
		return expedienteReinscripcionRS;
	}

	public void setExpedienteReinscripcionRS(String expedienteReinscripcionRS) {
		this.expedienteReinscripcionRS = expedienteReinscripcionRS;
	}

	public Date getFechaExpedienteReinscripcionRS() {
		return fechaExpedienteReinscripcionRS;
	}

	public void setFechaExpedienteReinscripcionRS(
			Date fechaExpedienteReinscripcionRS) {
		this.fechaExpedienteReinscripcionRS = fechaExpedienteReinscripcionRS;
	}

	public String getCondicionalAlmacenamiento() {
		return condicionalAlmacenamiento;
	}

	public void setCondicionalAlmacenamiento(String condicionalAlmacenamiento) {
		this.condicionalAlmacenamiento = condicionalAlmacenamiento;
	}

	public List<DGM055ViaAdministracion> getViasAdministracion() {
		return viasAdministracion;
	}

	public void setViasAdministracion(List<DGM055ViaAdministracion> viasAdministracion) {
		this.viasAdministracion = viasAdministracion;
	}

	public List<DGM055SustentoEspecificacionesTecnicas> getSustentosET() {
		return sustentosET;
	}

	public void setSustentosET(List<DGM055SustentoEspecificacionesTecnicas> sustentosET) {
		this.sustentosET = sustentosET;
	}

	public List<DGM055SustentoTecnicaAnalitica> getSustentosTA() {
		return sustentosTA;
	}

	public void setSustentosTA(List<DGM055SustentoTecnicaAnalitica> sustentosTA) {
		this.sustentosTA = sustentosTA;
	}

	public List<DGM055PrincipioActivo> getPrincipiosActivos() {
		return principiosActivos;
	}

	public void setPrincipiosActivos(List<DGM055PrincipioActivo> principiosActivos) {
		this.principiosActivos = principiosActivos;
	}

	public List<DGM055ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}

	public void setExcipientesColorantes(List<DGM055ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}

	public List<DGM055ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}

	public void setExcipientesConservadores(List<DGM055ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}

	public List<DGM055ExcipienteOtros> getExcipientesOtros() {
		return excipientesOtros;
	}

	public void setExcipientesOtros(List<DGM055ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}

	public List<DGM055Solvente> getSolventes() {
		return solventes;
	}

	public void setSolventes(List<DGM055Solvente> solventes) {
		this.solventes = solventes;
	}

	public List<DGM055EnvaseMediato> getEnvasesMediato() {
		return envasesMediato;
	}

	public void setEnvasesMediato(List<DGM055EnvaseMediato> envasesMediato) {
		this.envasesMediato = envasesMediato;
	}

	public List<DGM055Presentacion> getPresentaciones() {
		return presentaciones;
	}

	public void setPresentaciones(List<DGM055Presentacion> presentaciones) {
		this.presentaciones = presentaciones;
	}

	public List<DGM055EnvaseInmediato> getEnvasesInmediato() {
		return envasesInmediato;
	}

	public void setEnvasesInmediato(List<DGM055EnvaseInmediato> envasesInmediato) {
		this.envasesInmediato = envasesInmediato;
	}

}
