package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;

/**
 * DGM023: Certificado de Registro Sanitario de Productos Dietéticos y Edulcorantes, 
 * Biológicos, Agentes de Diagnóstico, Radiofármacos y Productos Homeopáticos, importados
 * @author Roger Panayfo
 * @version 1.0
 *
 */
public class DGM023 {
	
	private Long dgm023Id;
	private Long ordenId;
	private Integer mto;
	
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	//Informacion del producto
	private String nroRegistroSanitario;
	private String nombreProducto;
	private String concentracion;
	private String formaFarmaceutica;
	private String grupoProducto;
	private String procedencia;
	private String formaPresentacion;
	private Long partidaArancelaria;
	private String codigoDetallePartida;
	//Fabricante
	private String fabricanteNacional;
	private String fabricanteExtranjero;
	private String nombreFabricante;
	private String ruc;
	private String direccionFabricante;
	private String paisFabricante;
	private String paisFabricanteDesc;
	private String indicadorProductoAcond;
	private String acondicionadoraNacional;
	private String acondicionadoraExtranjera;
	private String nombreEmpresaAcond;
	private String licencia;
	
	private String direccionEstablecimiento;
	private String idDireccionEstablecimiento;
	private String representanteLegal;
	private String codigoRegente;
	private String cargoRegente;
	private Integer dgm_tipo_tramite;
	
	private Integer dgmIndOrigenRS;
	
	private Long drId;
	private Integer sdr;
	
	private String nroResolucionOrigen;	
	//Tabla dr
	private Integer anoDrOrigen;	
	private Long numeroDrOrigen;
	
	private String reinscripcionEnTramite;
	private String cumpleArt25DS0162011;
	private Date fechaVencimientoRS;
	

	public Long getDgm023Id() {
		return dgm023Id;
	}
	public void setDgm023Id(Long dgm023Id) {
		this.dgm023Id = dgm023Id;
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
	public String getNroRegistroSanitario() {
		return nroRegistroSanitario;
	}
	public void setNroRegistroSanitario(String nroRegistroSanitario) {
		this.nroRegistroSanitario = nroRegistroSanitario;
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
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
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
	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDireccionFabricante() {
		return direccionFabricante;
	}
	public void setDireccionFabricante(String direccionFabricante) {
		this.direccionFabricante = direccionFabricante;
	}
	public String getPaisFabricante() {
		return paisFabricante;
	}
	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
	}
	public String getPaisFabricanteDesc() {
		return paisFabricanteDesc;
	}
	public void setPaisFabricanteDesc(String paisFabricanteDesc) {
		this.paisFabricanteDesc = paisFabricanteDesc;
	}
	public String getIndicadorProductoAcond() {
		return indicadorProductoAcond;
	}
	public void setIndicadorProductoAcond(String indicadorProductoAcond) {
		this.indicadorProductoAcond = indicadorProductoAcond;
	}
	public String getNombreEmpresaAcond() {
		return nombreEmpresaAcond;
	}
	public void setNombreEmpresaAcond(String nombreEmpresaAcond) {
		this.nombreEmpresaAcond = nombreEmpresaAcond;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	public String getFormaPresentacion() {
		return formaPresentacion;
	}
	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}
//	public String getCodigo_establecimiento() {
//		return codigo_establecimiento;
//	}
//	public void setCodigo_establecimiento(String codigoEstablecimiento) {
//		codigo_establecimiento = codigoEstablecimiento;
//	}
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
	public Integer getDgm_tipo_tramite() {
		return dgm_tipo_tramite;
	}
	public void setDgm_tipo_tramite(Integer dgmTipoTramite) {
		dgm_tipo_tramite = dgmTipoTramite;
	}
	public Integer getDgmIndOrigenRS() {
		return dgmIndOrigenRS;
	}
	public void setDgmIndOrigenRS(Integer dgmIndOrigenRS) {
		this.dgmIndOrigenRS = dgmIndOrigenRS;
	}
	public String getCategoriaEstablecimiento() {
		return categoriaEstablecimiento;
	}
	public void setCategoriaEstablecimiento(String categoriaEstablecimiento) {
		this.categoriaEstablecimiento = categoriaEstablecimiento;
	}
	public String getCodigoEstablecimiento() {
		return codigoEstablecimiento;
	}
	public void setCodigoEstablecimiento(String codigoEstablecimiento) {
		this.codigoEstablecimiento = codigoEstablecimiento;
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
	public String getAcondicionadoraNacional() {
		return acondicionadoraNacional;
	}
	public void setAcondicionadoraNacional(String acondicionadoraNacional) {
		this.acondicionadoraNacional = acondicionadoraNacional;
	}
	public String getAcondicionadoraExtranjera() {
		return acondicionadoraExtranjera;
	}
	public void setAcondicionadoraExtranjera(String acondicionadoraExtranjera) {
		this.acondicionadoraExtranjera = acondicionadoraExtranjera;
	}
	public Long getDrId() {
		return drId;
	}
	public void setDrId(Long drId) {
		this.drId = drId;
	}
	public Integer getSdr() {
		return sdr;
	}
	public void setSdr(Integer sdr) {
		this.sdr = sdr;
	}
	public String getNroResolucionOrigen() {
		return nroResolucionOrigen;
	}
	public void setNroResolucionOrigen(String nroResolucionOrigen) {
		this.nroResolucionOrigen = nroResolucionOrigen;
	}
	public Integer getAnoDrOrigen() {
		return anoDrOrigen;
	}
	public void setAnoDrOrigen(Integer anoDrOrigen) {
		this.anoDrOrigen = anoDrOrigen;
	}
	public Long getNumeroDrOrigen() {
		return numeroDrOrigen;
	}
	public void setNumeroDrOrigen(Long numeroDrOrigen) {
		this.numeroDrOrigen = numeroDrOrigen;
	}
	public String getReinscripcionEnTramite() {
		return reinscripcionEnTramite;
	}
	public void setReinscripcionEnTramite(String reinscripcionEnTramite) {
		this.reinscripcionEnTramite = reinscripcionEnTramite;
	}
	public String getCumpleArt25DS0162011() {
		return cumpleArt25DS0162011;
	}
	public void setCumpleArt25DS0162011(String cumpleArt25DS0162011) {
		this.cumpleArt25DS0162011 = cumpleArt25DS0162011;
	}
	public Date getFechaVencimientoRS() {
		return fechaVencimientoRS;
	}
	public void setFechaVencimientoRS(Date fechaVencimientoRS) {
		this.fechaVencimientoRS = fechaVencimientoRS;
	}
	
}