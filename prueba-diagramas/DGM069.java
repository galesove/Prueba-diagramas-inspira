package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;
import java.util.List;

public class DGM069 {	
	private Long            dgm069Id;
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
	private String          nroRegistroSanitarioOrigen;
	private String          grupoProducto;
	private String          nombreProducto;
	private String          concentracion;
	private String          formaFarmaceutica;
	private String          origenProducto;
	private Date            fechaVencimientoRsOrigen;
	private String          nroRegistroSanitarioReins;
	private Date            fechaVencimientoRsReins;
	private String          modeloClc;
	private String          condicionVenta;
	private String          tipoEstablecimiento;
	private String          formaPresentacion;
	private String          nroDocumentoFabricante;
	private String          nombreFabricante;
	private String          fabricanteNacional;
	private String          fabricanteExtranjero;
	private String          paisFabricante;
	private String          direccionFabricante;
	private String          esAcondicionadora;
	private String          acondicionadoraNacional;
	private String          acondicionadoraExtranjera;
	private String          origenAcondicionadora;
	private String          nombreAcondicionadora;
	private String          paisAcondicionadora;
	private String          bajoLicenciaDe;
	private Integer         dgmIndOrigenRS;
	private String          establecimientoFarmEmail;
	private String          establecimientoFarmTelefono;
	private String          idDireccionEstablecimiento;
	private String          paisImportador;
	private String 			nota;
	private String          origenFabricante;
	private String formulaCualicuantitativa;
	
	private List<DGM069SustentoEspecificacionesTecnicas> sustentosET;
	private List<DGM069SustentoTecnicaAnalitica> sustentosTA;
	private List<DGM069PrincipioActivo> principiosActivos;
	private List<DGM069ExcipienteColorante> excipientesColorantes;
	private List<DGM069ExcipienteConservador> excipientesConservadores;
	private List<DGM069ExcipienteOtros> excipientesOtros;
	private List<DGM069Solvente> solventes;

	public Long getDgm069Id() {
		return dgm069Id;
	}
	public void setDgm069Id(Long dgm069Id) {
		this.dgm069Id = dgm069Id;
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
	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}
	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
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
	public String getOrigenProducto() {
		return origenProducto;
	}
	public void setOrigenProducto(String origenProducto) {
		this.origenProducto = origenProducto;
	}
	public Date getFechaVencimientoRsOrigen() {
		return fechaVencimientoRsOrigen;
	}
	public void setFechaVencimientoRsOrigen(Date fechaVencimientoRsOrigen) {
		this.fechaVencimientoRsOrigen = fechaVencimientoRsOrigen;
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
	public String getModeloClc() {
		return modeloClc;
	}
	public void setModeloClc(String modeloClc) {
		this.modeloClc = modeloClc;
	}
	public String getCondicionVenta() {
		return condicionVenta;
	}
	public void setCondicionVenta(String condicionVenta) {
		this.condicionVenta = condicionVenta;
	}
	public String getTipoEstablecimiento() {
		return tipoEstablecimiento;
	}
	public void setTipoEstablecimiento(String tipoEstablecimiento) {
		this.tipoEstablecimiento = tipoEstablecimiento;
	}
	public String getFormaPresentacion() {
		return formaPresentacion;
	}
	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}
	public String getNroDocumentoFabricante() {
		return nroDocumentoFabricante;
	}
	public void setNroDocumentoFabricante(String nroDocumentoFabricante) {
		this.nroDocumentoFabricante = nroDocumentoFabricante;
	}
	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
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
	public String getEsAcondicionadora() {
		return esAcondicionadora;
	}
	public void setEsAcondicionadora(String esAcondicionadora) {
		this.esAcondicionadora = esAcondicionadora;
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
	public String getOrigenAcondicionadora() {
		return origenAcondicionadora;
	}
	public void setOrigenAcondicionadora(String origenAcondicionadora) {
		this.origenAcondicionadora = origenAcondicionadora;
	}
	public String getNombreAcondicionadora() {
		return nombreAcondicionadora;
	}
	public void setNombreAcondicionadora(String nombreAcondicionadora) {
		this.nombreAcondicionadora = nombreAcondicionadora;
	}
	public String getPaisAcondicionadora() {
		return paisAcondicionadora;
	}
	public void setPaisAcondicionadora(String paisAcondicionadora) {
		this.paisAcondicionadora = paisAcondicionadora;
	}
	public String getBajoLicenciaDe() {
		return bajoLicenciaDe;
	}
	public void setBajoLicenciaDe(String bajoLicenciaDe) {
		this.bajoLicenciaDe = bajoLicenciaDe;
	}
	public Integer getDgmIndOrigenRS() {
		return dgmIndOrigenRS;
	}
	public void setDgmIndOrigenRS(Integer dgmIndOrigenRS) {
		this.dgmIndOrigenRS = dgmIndOrigenRS;
	}
	public String getEstablecimientoFarmEmail() {
		return establecimientoFarmEmail;
	}
	public void setEstablecimientoFarmEmail(String establecimientoFarmEmail) {
		this.establecimientoFarmEmail = establecimientoFarmEmail;
	}
	public String getEstablecimientoFarmTelefono() {
		return establecimientoFarmTelefono;
	}
	public void setEstablecimientoFarmTelefono(String establecimientoFarmTelefono) {
		this.establecimientoFarmTelefono = establecimientoFarmTelefono;
	}
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	public List<DGM069SustentoEspecificacionesTecnicas> getSustentosET() {
		return sustentosET;
	}
	public void setSustentosET(
			List<DGM069SustentoEspecificacionesTecnicas> sustentosET) {
		this.sustentosET = sustentosET;
	}
	public List<DGM069SustentoTecnicaAnalitica> getSustentosTA() {
		return sustentosTA;
	}
	public void setSustentosTA(List<DGM069SustentoTecnicaAnalitica> sustentosTA) {
		this.sustentosTA = sustentosTA;
	}
	public List<DGM069PrincipioActivo> getPrincipiosActivos() {
		return principiosActivos;
	}
	public void setPrincipiosActivos(List<DGM069PrincipioActivo> principiosActivos) {
		this.principiosActivos = principiosActivos;
	}
	public List<DGM069ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}
	public void setExcipientesColorantes(
			List<DGM069ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}
	public List<DGM069ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}
	public void setExcipientesConservadores(
			List<DGM069ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}
	public List<DGM069ExcipienteOtros> getExcipientesOtros() {
		return excipientesOtros;
	}
	public void setExcipientesOtros(List<DGM069ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}
	public List<DGM069Solvente> getSolventes() {
		return solventes;
	}
	public void setSolventes(List<DGM069Solvente> solventes) {
		this.solventes = solventes;
	}
	public String getPaisImportador() {
		return paisImportador;
	}
	public void setPaisImportador(String paisImportador) {
		this.paisImportador = paisImportador;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public String getOrigenFabricante() {
		return origenFabricante;
	}
	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricante = origenFabricante;
	}
	
	public String getFormulaCualicuantitativa() {
		return formulaCualicuantitativa;
	}
	public void setFormulaCualicuantitativa(String formulaCualicuantitativa) {
		this.formulaCualicuantitativa = formulaCualicuantitativa;
	}
}
