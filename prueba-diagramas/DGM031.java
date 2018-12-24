package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM031 {

	private Long dgm031Id;
	private Long ordenId;
	private Integer mto;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String direccionEstablecimiento;
	private String idDireccionEstablecimiento;
	private String representanteLegal;
	private String codigoRegente;
	private String cargoRegente;
	private Integer tipoTramite;
	private String nroPrevision;
	private String nombreExportador;
	private String codigoExportador;
	private String domicilioExportador;
	private String paisExportador;
	private String observacion;
	private String emailExportador;
	private String viaTransporte;
	private String aduana;
	private String tipoProducto;
	private String clasificacionProducto;
	private String tipoUso;
	private String unidadMinimaMedida;
	private String estadoSustancia;
	private String nroResolucionOrigen;
	private String reinscripcionEnTramite;
	private String partidaArancelaria;
	private String codigoDetallePartida;
	private String sustancia;
	private Double factor;
	private BigDecimal cantidadSolicitadaSustancia;
	private Double equivalenciaBase;
	private String unidadMedidaSustancia;

	private Integer dr;
	private Integer sdr;

	private String umFisica;
	private Double cantidadFisica;

	private String expedientesReinscripcion;
	private String esModificaExportador;
	private String nombreSustanciaBase;

	private String nroRegistroSanitario;
	private String nombreProducto;
	private String concentracion;
	private String formaFarmaceutica;
	private Date fechaVencimiento;

	private List<DGM031Presentacion> dgm031presentacions = new ArrayList<DGM031Presentacion>();
	private List<DGM031Sustancia> dgm031sustancias = new ArrayList<DGM031Sustancia>();
	private List<DGM031EstandarReferencia> dgm031estandarreferencias = new ArrayList<DGM031EstandarReferencia>();
	private List<DGM031Producto> dgm031productos = new ArrayList<DGM031Producto>();

	public Long getDgm031Id() {
		return dgm031Id;
	}

	public void setDgm031Id(Long dgm031Id) {
		this.dgm031Id = dgm031Id;
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

	public String getNroPrevision() {
		return nroPrevision;
	}

	public void setNroPrevision(String nroPrevision) {
		this.nroPrevision = nroPrevision;
	}

	public String getNombreExportador() {
		return nombreExportador;
	}

	public void setNombreExportador(String nombreExportador) {
		this.nombreExportador = nombreExportador;
	}

	public String getCodigoExportador() {
		return codigoExportador;
	}

	public void setCodigoExportador(String codigoExportador) {
		this.codigoExportador = codigoExportador;
	}

	public String getDomicilioExportador() {
		return domicilioExportador;
	}

	public void setDomicilioExportador(String domicilioExportador) {
		this.domicilioExportador = domicilioExportador;
	}

	public String getPaisExportador() {
		return paisExportador;
	}

	public void setPaisExportador(String paisExportador) {
		this.paisExportador = paisExportador;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getEmailExportador() {
		return emailExportador;
	}

	public void setEmailExportador(String emailExportador) {
		this.emailExportador = emailExportador;
	}

	public String getViaTransporte() {
		return viaTransporte;
	}

	public void setViaTransporte(String viaTransporte) {
		this.viaTransporte = viaTransporte;
	}

	public String getAduana() {
		return aduana;
	}

	public void setAduana(String aduana) {
		this.aduana = aduana;
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

	public String getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}

	public String getUnidadMinimaMedida() {
		return unidadMinimaMedida;
	}

	public void setUnidadMinimaMedida(String unidadMinimaMedida) {
		this.unidadMinimaMedida = unidadMinimaMedida;
	}

	public String getNroRegistroSanitario() {
		return nroRegistroSanitario;
	}

	public void setNroRegistroSanitario(String nroRegistroSanitario) {
		this.nroRegistroSanitario = nroRegistroSanitario;
	}

	public String getSustancia() {
		return sustancia;
	}

	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}

	public BigDecimal getCantidadSolicitadaSustancia() {
		return cantidadSolicitadaSustancia;
	}

	public void setCantidadSolicitadaSustancia(BigDecimal cantidadSolicitadaSustancia) {
		this.cantidadSolicitadaSustancia = cantidadSolicitadaSustancia;
	}

	public String getUnidadMedidaSustancia() {
		return unidadMedidaSustancia;
	}

	public void setUnidadMedidaSustancia(String unidadMedidaSustancia) {
		this.unidadMedidaSustancia = unidadMedidaSustancia;
	}

	public Double getFactor() {
		return factor;
	}

	public void setFactor(Double factor) {
		this.factor = factor;
	}

	public List<DGM031Presentacion> getDgm031presentacions() {
		return this.dgm031presentacions;
	}

	public void setDgm031presentacions(List<DGM031Presentacion> dgm031presentacions) {
		this.dgm031presentacions = dgm031presentacions;
	}

	public void addDgm031presentacions(DGM031Presentacion dgm031presentacion) {
		this.dgm031presentacions.add(dgm031presentacion);
	}

	public List<DGM031Sustancia> getDgm031sustancias() {
		return this.dgm031sustancias;
	}

	public void setDgm031sustancias(List<DGM031Sustancia> dgm031sustancias) {
		this.dgm031sustancias = dgm031sustancias;
	}

	public void addDgm031sustancias(DGM031Sustancia dgm031sustancia) {
		this.dgm031sustancias.add(dgm031sustancia);
	}

	public List<DGM031EstandarReferencia> getDgm031estandarreferencias() {
		return this.dgm031estandarreferencias;
	}

	public void setDgm031estandarreferencias(List<DGM031EstandarReferencia> dgm031estandarreferencias) {
		this.dgm031estandarreferencias = dgm031estandarreferencias;
	}

	public void addDgm031estandarreferencias(DGM031EstandarReferencia dgm031estandarreferencia) {
		this.dgm031estandarreferencias.add(dgm031estandarreferencia);
	}

	public List<DGM031Producto> getDgm031productos() {
		return this.dgm031productos;
	}

	public void setDgm031productos(List<DGM031Producto> dgm031productos) {
		this.dgm031productos = dgm031productos;
	}

	public void addDgm031productos(DGM031Producto dgm031producto) {
		this.dgm031productos.add(dgm031producto);
	}

	public String getEstadoSustancia() {
		return estadoSustancia;
	}

	public void setEstadoSustancia(String estadoSustancia) {
		this.estadoSustancia = estadoSustancia;
	}

	public String getReinscripcionEnTramite() {
		return reinscripcionEnTramite;
	}

	public void setReinscripcionEnTramite(String reinscripcionEnTramite) {
		this.reinscripcionEnTramite = reinscripcionEnTramite;
	}

	public String getPartidaArancelaria() {
		return partidaArancelaria;
	}

	public void setPartidaArancelaria(String partidaArancelaria) {
		this.partidaArancelaria = partidaArancelaria;
	}

	public String getCodigoDetallePartida() {
		return codigoDetallePartida;
	}

	public void setCodigoDetallePartida(String codigoDetallePartida) {
		this.codigoDetallePartida = codigoDetallePartida;
	}

	public Double getEquivalenciaBase() {
		return equivalenciaBase;
	}

	public void setEquivalenciaBase(Double equivalenciaBase) {
		this.equivalenciaBase = equivalenciaBase;
	}

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}

	public String getNroResolucionOrigen() {
		return nroResolucionOrigen;
	}

	public void setNroResolucionOrigen(String nroResolucionOrigen) {
		this.nroResolucionOrigen = nroResolucionOrigen;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public Integer getSdr() {
		return sdr;
	}

	public void setSdr(Integer sdr) {
		this.sdr = sdr;
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

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}

	public Double getCantidadFisica() {
		return cantidadFisica;
	}

	public void setCantidadFisica(Double cantidadFisica) {
		this.cantidadFisica = cantidadFisica;
	}

	public String getUmFisica() {
		return umFisica;
	}

	public void setUmFisica(String umFisica) {
		this.umFisica = umFisica;
	}

	public String getExpedientesReinscripcion() {
		return expedientesReinscripcion;
	}

	public void setExpedientesReinscripcion(String expedientesReinscripcion) {
		this.expedientesReinscripcion = expedientesReinscripcion;
	}

	public String getEsModificaExportador() {
		return esModificaExportador;
	}

	public void setEsModificaExportador(String esModificaExportador) {
		this.esModificaExportador = esModificaExportador;
	}

	public String getNombreSustanciaBase() {
		return nombreSustanciaBase;
	}

	public void setNombreSustanciaBase(String nombreSustanciaBase) {
		this.nombreSustanciaBase = nombreSustanciaBase;
	}

}
