package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;
import java.util.List;

public class DGM044 {
	private Long dgm044Id;
	private Long ordenId;
	private Integer mto;
	// DR_ID_ORIGEN, SDR_ORIGEN
	private String nroRegistroSanitarioOrigen;
	private String nroResolucionOrigen;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String direccionEstablecimiento;
	private String representanteLegal;
	private String codigoRegente;
	private String cargoRegente;
	private String nombreProducto;
	private String concentracion;
	private String formaFarmaceutica;
	private Integer condicionVenta;
	private String origenFabricante;
	private String codigoFabricante;
	private String nombreFabricante;
	private String origenAcondicionadora;
	private String codigoAcondicionadora;
	private String nombreAcondicionadora;
	private String fabricacionEncargo;
	private String bajoLicenciaDe;
	// DR_ID, SDR
	private Long drId;
	private Long sdr;
	private String idDireccionEstablecimiento;
	private String telefonoEstablecimiento;
	private String emailEstablecimiento;
	private String nroColegiaturaDirector;
	private String telefonoDirector;
	private String emailDirector;
	private String nombreRepresentante;
	private String telefonoRepresentanteLegal;
	private String emailRepresentanteLegal;
	private String grupoProducto;
	private String origenProducto;
	private Date fechaVencimientoRS;
	private String nroRegistroSanitarioReins;
	private Date fechaVencimientoRSReins;
	
	private List<DGM044ExcipienteColorante> excipientesColorantes;
	private List<DGM044ExcipienteConservador> excipientesConservadores;
	private List<DGM044ExcipienteOtros> excipientesOtros;
	private List<DGM044Solvente> solventes;
    
	private String dgmIndOrigenRS;
	
	public Long getDgm044Id() {
		return dgm044Id;
	}

	public void setDgm044Id(Long dgm044Id) {
		this.dgm044Id = dgm044Id;
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

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}

	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}

	public String getNroResolucionOrigen() {
		return nroResolucionOrigen;
	}

	public void setNroResolucionOrigen(String nroResolucionOrigen) {
		this.nroResolucionOrigen = nroResolucionOrigen;
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

	public Integer getCondicionVenta() {
		return condicionVenta;
	}

	public void setCondicionVenta(Integer condicionVenta) {
		this.condicionVenta = condicionVenta;
	}

	public String getOrigenFabricante() {
		return origenFabricante;
	}

	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricante = origenFabricante;
	}

	public String getCodigoFabricante() {
		return codigoFabricante;
	}

	public void setCodigoFabricante(String codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	public String getOrigenAcondicionadora() {
		return origenAcondicionadora;
	}

	public void setOrigenAcondicionadora(String origenAcondicionadora) {
		this.origenAcondicionadora = origenAcondicionadora;
	}

	public String getCodigoAcondicionadora() {
		return codigoAcondicionadora;
	}

	public void setCodigoAcondicionadora(String codigoAcondicionadora) {
		this.codigoAcondicionadora = codigoAcondicionadora;
	}

	public String getNombreAcondicionadora() {
		return nombreAcondicionadora;
	}

	public void setNombreAcondicionadora(String nombreAcondicionadora) {
		this.nombreAcondicionadora = nombreAcondicionadora;
	}

	public String getFabricacionEncargo() {
		return fabricacionEncargo;
	}

	public void setFabricacionEncargo(String fabricacionEncargo) {
		this.fabricacionEncargo = fabricacionEncargo;
	}

	public String getBajoLicenciaDe() {
		return bajoLicenciaDe;
	}

	public void setBajoLicenciaDe(String bajoLicenciaDe) {
		this.bajoLicenciaDe = bajoLicenciaDe;
	}

	public Long getDrId() {
		return drId;
	}

	public void setDrId(Long drId) {
		this.drId = drId;
	}

	public Long getSdr() {
		return sdr;
	}

	public void setSdr(Long sdr) {
		this.sdr = sdr;
	}

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}

	public String getTelefonoEstablecimiento() {
		return telefonoEstablecimiento;
	}

	public void setTelefonoEstablecimiento(String telefonoEstablecimiento) {
		this.telefonoEstablecimiento = telefonoEstablecimiento;
	}

	public String getEmailEstablecimiento() {
		return emailEstablecimiento;
	}

	public void setEmailEstablecimiento(String emailEstablecimiento) {
		this.emailEstablecimiento = emailEstablecimiento;
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

	public String getNombreRepresentante() {
		return nombreRepresentante;
	}

	public void setNombreRepresentante(String nombreRepresentante) {
		this.nombreRepresentante = nombreRepresentante;
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

	public String getGrupoProducto() {
		return grupoProducto;
	}

	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}

	public String getOrigenProducto() {
		return origenProducto;
	}

	public void setOrigenProducto(String origenProducto) {
		this.origenProducto = origenProducto;
	}

	public Date getFechaVencimientoRS() {
		return fechaVencimientoRS;
	}

	public void setFechaVencimientoRS(Date fechaVencimientoRS) {
		this.fechaVencimientoRS = fechaVencimientoRS;
	}

	public String getNroRegistroSanitarioReins() {
		return nroRegistroSanitarioReins;
	}

	public void setNroRegistroSanitarioReins(String nroRegistroSanitarioReins) {
		this.nroRegistroSanitarioReins = nroRegistroSanitarioReins;
	}

	public Date getFechaVencimientoRSReins() {
		return fechaVencimientoRSReins;
	}

	public void setFechaVencimientoRSReins(Date fechaVencimientoRSReins) {
		this.fechaVencimientoRSReins = fechaVencimientoRSReins;
	}

	public String getDgmIndOrigenRS() {
		return dgmIndOrigenRS;
	}

	public void setDgmIndOrigenRS(String dgmIndOrigenRS) {
		this.dgmIndOrigenRS = dgmIndOrigenRS;
	}

	public List<DGM044ExcipienteColorante> getExcipientesColorantes() {
		return excipientesColorantes;
	}

	public void setExcipientesColorantes(
			List<DGM044ExcipienteColorante> excipientesColorantes) {
		this.excipientesColorantes = excipientesColorantes;
	}

	public List<DGM044ExcipienteConservador> getExcipientesConservadores() {
		return excipientesConservadores;
	}

	public void setExcipientesConservadores(
			List<DGM044ExcipienteConservador> excipientesConservadores) {
		this.excipientesConservadores = excipientesConservadores;
	}

	public List<DGM044ExcipienteOtros> getExcipientesOtros() {
		return excipientesOtros;
	}

	public void setExcipientesOtros(List<DGM044ExcipienteOtros> excipientesOtros) {
		this.excipientesOtros = excipientesOtros;
	}

	public List<DGM044Solvente> getSolventes() {
		return solventes;
	}

	public void setSolventes(List<DGM044Solvente> solventes) {
		this.solventes = solventes;
	}

}
