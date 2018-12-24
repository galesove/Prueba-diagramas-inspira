package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DGM053 {

	private Integer dgm053Id;
	private Integer ordenId;
	private Integer mto;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String direccionEstablecimiento;
	private String idDireccionEstablecimiento;
	private String representanteLegal;
	private String codigoRegente;
	private String cargoRegente;
	private String nroRegistroSanitarioOrigen;
	private String nombreProducto;
	private String grupoProducto;
	private String grupoProductoDesc;
	private String numeroExpediente;
	private Integer tiempoVidaUtil;
	private String dgmUnidadTiempo;
	private Integer grupo;
	private String tipoGrupo;
	private Date fechaVigenciaNsoOrigen;
	
	private List<DGM053Variedad> dgm053variedades = new ArrayList<DGM053Variedad>();
	private List<DGM053Marca> dgm053marcas = new ArrayList<DGM053Marca>();
	
	public Integer getDgm053Id() {
		return dgm053Id;
	}
	public void setDgm053Id(Integer dgm053Id) {
		this.dgm053Id = dgm053Id;
	}
	public Integer getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(Integer ordenId) {
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
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public String getGrupoProductoDesc() {
		return grupoProductoDesc;
	}
	public void setGrupoProductoDesc(String grupoProductoDesc) {
		this.grupoProductoDesc = grupoProductoDesc;
	}
	public String getNumeroExpediente() {
		return numeroExpediente;
	}
	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	public Integer getTiempoVidaUtil() {
		return tiempoVidaUtil;
	}
	public void setTiempoVidaUtil(Integer tiempoVidaUtil) {
		this.tiempoVidaUtil = tiempoVidaUtil;
	}
	public String getDgmUnidadTiempo() {
		return dgmUnidadTiempo;
	}
	public void setDgmUnidadTiempo(String dgmUnidadTiempo) {
		this.dgmUnidadTiempo = dgmUnidadTiempo;
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
	public Date getFechaVigenciaNsoOrigen() {
		return fechaVigenciaNsoOrigen;
	}
	public void setFechaVigenciaNsoOrigen(Date fechaVigenciaNsoOrigen) {
		this.fechaVigenciaNsoOrigen = fechaVigenciaNsoOrigen;
	}
	public List<DGM053Variedad> getDgm053variedades() {
		return this.dgm053variedades;
	}
	public void setDgm053variedades(List<DGM053Variedad> dgm053variedades) {
		this.dgm053variedades = dgm053variedades;
	}
	public List<DGM053Marca> getDgm053marcas() {
		return this.dgm053marcas;
	}
	public void setDgm053marcas(List<DGM053Marca> dgm053marcas) {
		this.dgm053marcas = dgm053marcas;
	}
	
}