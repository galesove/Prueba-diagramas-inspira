package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM062 {
	
	private Long            dgm062Id;
	private Long            ordenId;
	private Integer         mto;
	private String          codigoEstablecimiento;
	private String          categoriaEstablecimiento;
	private String          direccionEstablecimiento;
	private String          idDireccionEstablecimiento;
	private String          representanteLegal;
	private String          codigoRegente;
	private String          cargoRegente;
	private String          establecimientoFarmTelefono;
	private String          establecimientoFarmEmail;
	private String          nsoOrigen;
	private String          nroExpedienteOrigen;
	private Date            fechaVigenciaNsoOrigen;
	private String          nombreProducto;
	private Long            partidaArancelaria;
	private String          codigoDetallePartida;
	private String          grupoProducto;
	private String          esCambio;
	private String          esAmpliacion;
	private String          presentacionActual;
	private String          presentacionNueva;
	private Integer         formaCosmetica;
	private Integer         grupo;
	private String          tipoGrupo;
	
	private List<DGM062Variedad> dgm062variedades = new ArrayList<DGM062Variedad>();
	private List<DGM062Marca> dgm062marcas = new ArrayList<DGM062Marca>();
	private List<DGM062Fabricante> dgm062fabricantes = new ArrayList<DGM062Fabricante>();

	public Long getDgm062Id() {
		return dgm062Id;
	}
	public void setDgm062Id(Long dgm062Id) {
		this.dgm062Id = dgm062Id;
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
	public String getEstablecimientoFarmTelefono() {
		return establecimientoFarmTelefono;
	}
	public void setEstablecimientoFarmTelefono(String establecimientoFarmTelefono) {
		this.establecimientoFarmTelefono = establecimientoFarmTelefono;
	}
	public String getEstablecimientoFarmEmail() {
		return establecimientoFarmEmail;
	}
	public void setEstablecimientoFarmEmail(String establecimientoFarmEmail) {
		this.establecimientoFarmEmail = establecimientoFarmEmail;
	}
	public String getNsoOrigen() {
		return nsoOrigen;
	}
	public void setNsoOrigen(String nsoOrigen) {
		this.nsoOrigen = nsoOrigen;
	}
	public String getNroExpedienteOrigen() {
		return nroExpedienteOrigen;
	}
	public void setNroExpedienteOrigen(String nroExpedienteOrigen) {
		this.nroExpedienteOrigen = nroExpedienteOrigen;
	}
	public Date getFechaVigenciaNsoOrigen() {
		return fechaVigenciaNsoOrigen;
	}
	public void setFechaVigenciaNsoOrigen(Date fechaVigenciaNsoOrigen) {
		this.fechaVigenciaNsoOrigen = fechaVigenciaNsoOrigen;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
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
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public String getEsCambio() {
		return esCambio;
	}
	public void setEsCambio(String esCambio) {
		this.esCambio = esCambio;
	}
	public String getEsAmpliacion() {
		return esAmpliacion;
	}
	public void setEsAmpliacion(String esAmpliacion) {
		this.esAmpliacion = esAmpliacion;
	}
	public String getPresentacionActual() {
		return presentacionActual;
	}
	public void setPresentacionActual(String presentacionActual) {
		this.presentacionActual = presentacionActual;
	}
	public String getPresentacionNueva() {
		return presentacionNueva;
	}
	public void setPresentacionNueva(String presentacionNueva) {
		this.presentacionNueva = presentacionNueva;
	}
	public Integer getFormaCosmetica() {
		return formaCosmetica;
	}
	public void setFormaCosmetica(Integer formaCosmetica) {
		this.formaCosmetica = formaCosmetica;
	}
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}
	public String getTipoGrupo() {
		return tipoGrupo;
	}
	public void setTipoGrupo(String tipoGrupo) {
		this.tipoGrupo = tipoGrupo;
	}
	public List<DGM062Variedad> getDgm062variedades() {
		return dgm062variedades;
	}
	public void setDgm062variedades(List<DGM062Variedad> dgm062variedades) {
		this.dgm062variedades = dgm062variedades;
	}
	public List<DGM062Marca> getDgm062marcas() {
		return dgm062marcas;
	}
	public void setDgm062marcas(List<DGM062Marca> dgm062marcas) {
		this.dgm062marcas = dgm062marcas;
	}
	public List<DGM062Fabricante> getDgm062fabricantes() {
		return dgm062fabricantes;
	}
	public void setDgm062fabricantes(List<DGM062Fabricante> dgm062fabricantes) {
		this.dgm062fabricantes = dgm062fabricantes;
	}
	
}
