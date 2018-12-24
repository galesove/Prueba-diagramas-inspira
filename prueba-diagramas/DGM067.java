package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM067 {
		
	private Long            dgm067Id;
	private Long            ordenId;
	private Integer         mto;
	private String          codigoEstablecimiento;
	private String          categoriaEstablecimiento;
	private String          direccionEstablecimiento;
	private String          codigoRegente;
	private String          cargoRegente;
	private String          nroColegiaturaDirector;
	private String          telefonoDirector;
	private String          emailDirector;
	private String          representanteLegal;
	private String          telefonoRepresentanteLegal;
	private String          emailRepresentanteLegal;
	private String          tipoProducto;
	private String          clasificacionProducto;
	private String          nroRegistroSanitarioOrigen;
	private String          nombreProducto;
	private String          concentracion;
	private String          formaFarmaceutica;
	private String          formaPresentacion;
	private String          cantidadProductoTerminado;
	private Date            fechaVencimiento;
	private String          nroRegistroSanitarioReins;
	private Date            fechaVencimientoRsReins;
	private String          nombreSustancia;
	private String          sustancia;
	private BigDecimal      cantidad;
	private String          unidadMedida;
	private BigDecimal      factor;
	private BigDecimal      equivalenciaSustancia;
	private BigDecimal      pesoSustancia;
	private Long            partidaArancelaria;
	private String          codigoDetallePartida;
	private String          esCatalogadoImportador;
	private String          nombreImportador;
	private String          codigoImportador;
	private String          domicilioImportador;
	private String          paisImportador;
	private String          correoImportador;
	private String          observacionesImportador;
	private String          viaTransporteImportador;
	private String          aduanaImportador;
	private String          idDireccionEstablecimiento;
	
	private List<DGM067EstandarReferencia> dgm067estandarreferencia= new ArrayList<DGM067EstandarReferencia>();
	private List<DGM067Sustancia> dgm067sustancia = new ArrayList<DGM067Sustancia>();
	
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	public Long getDgm067Id() {
		return dgm067Id;
	}
	public void setDgm067Id(Long dgm067Id) {
		this.dgm067Id = dgm067Id;
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
	public String getNroColegiaturaDirector() {
		return nroColegiaturaDirector;
	}
	public void setNroColegiaturaDirector(String nroColegiaturaDirector) {
		this.nroColegiaturaDirector = nroColegiaturaDirector;
	}
	public String getTelefonoDirector() {
		return telefonoDirector;
	}
	public void setTelefonoDirector(String telefonoDirector) {
		this.telefonoDirector = telefonoDirector;
	}
	public String getEmailDirector() {
		return emailDirector;
	}
	public void setEmailDirector(String emailDirector) {
		this.emailDirector = emailDirector;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getTelefonoRepresentanteLegal() {
		return telefonoRepresentanteLegal;
	}
	public void setTelefonoRepresentanteLegal(String telefonoRepresentanteLegal) {
		this.telefonoRepresentanteLegal = telefonoRepresentanteLegal;
	}
	public String getEmailRepresentanteLegal() {
		return emailRepresentanteLegal;
	}
	public void setEmailRepresentanteLegal(String emailRepresentanteLegal) {
		this.emailRepresentanteLegal = emailRepresentanteLegal;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getClasificacionProducto() {
		return clasificacionProducto;
	}
	public void setClasificacionProducto(String clasificacionProducto) {
		this.clasificacionProducto = clasificacionProducto;
	}
	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}
	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
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
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
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
	public String getNombreSustancia() {
		return nombreSustancia;
	}
	public void setNombreSustancia(String nombreSustancia) {
		this.nombreSustancia = nombreSustancia;
	}
	public String getSustancia() {
		return sustancia;
	}
	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}
	public BigDecimal getCantidad() {
		return cantidad;
	}
	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public BigDecimal getFactor() {
		return factor;
	}
	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}
	public BigDecimal getEquivalenciaSustancia() {
		return equivalenciaSustancia;
	}
	public void setEquivalenciaSustancia(BigDecimal equivalenciaSustancia) {
		this.equivalenciaSustancia = equivalenciaSustancia;
	}
	public BigDecimal getPesoSustancia() {
		return pesoSustancia;
	}
	public void setPesoSustancia(BigDecimal pesoSustancia) {
		this.pesoSustancia = pesoSustancia;
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
	public String getEsCatalogadoImportador() {
		return esCatalogadoImportador;
	}
	public void setEsCatalogadoImportador(String esCatalogadoImportador) {
		this.esCatalogadoImportador = esCatalogadoImportador;
	}
	public String getNombreImportador() {
		return nombreImportador;
	}
	public void setNombreImportador(String nombreImportador) {
		this.nombreImportador = nombreImportador;
	}
	public String getCodigoImportador() {
		return codigoImportador;
	}
	public void setCodigoImportador(String codigoImportador) {
		this.codigoImportador = codigoImportador;
	}
	public String getDomicilioImportador() {
		return domicilioImportador;
	}
	public void setDomicilioImportador(String domicilioImportador) {
		this.domicilioImportador = domicilioImportador;
	}
	public String getPaisImportador() {
		return paisImportador;
	}
	public void setPaisImportador(String paisImportador) {
		this.paisImportador = paisImportador;
	}
	public String getCorreoImportador() {
		return correoImportador;
	}
	public void setCorreoImportador(String correoImportador) {
		this.correoImportador = correoImportador;
	}
	public String getObservacionesImportador() {
		return observacionesImportador;
	}
	public void setObservacionesImportador(String observacionesImportador) {
		this.observacionesImportador = observacionesImportador;
	}
	public String getViaTransporteImportador() {
		return viaTransporteImportador;
	}
	public void setViaTransporteImportador(String viaTransporteImportador) {
		this.viaTransporteImportador = viaTransporteImportador;
	}
	public String getAduanaImportador() {
		return aduanaImportador;
	}
	public void setAduanaImportador(String aduanaImportador) {
		this.aduanaImportador = aduanaImportador;
	}
	public String getFormaPresentacion() {
		return formaPresentacion;
	}
	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}
	public String getCantidadProductoTerminado() {
		return cantidadProductoTerminado;
	}
	public void setCantidadProductoTerminado(String cantidadProductoTerminado) {
		this.cantidadProductoTerminado = cantidadProductoTerminado;
	}
	public List<DGM067EstandarReferencia> getDgm067estandarreferencia() {
		return dgm067estandarreferencia;
	}
	public void setDgm067estandarreferencia(List<DGM067EstandarReferencia> dgm067estandarreferencia) {
		this.dgm067estandarreferencia = dgm067estandarreferencia;
	}
	public List<DGM067Sustancia> getDgm067sustancia() {
		return dgm067sustancia;
	}
	public void setDgm067sustancia(List<DGM067Sustancia> dgm067sustancia) {
		this.dgm067sustancia = dgm067sustancia;
	}

}
