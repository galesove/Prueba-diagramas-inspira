package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DGM051 {

	private Integer dgm051Id;
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
	private String motivoCambio;
	private Integer formaCosmetica;
	private Integer grupo;
	private String tipoGrupo;
	private Date fechaVigenciaNsoOrigen;
	private String 	formaCosmeticaTexto;
	
	private List<DGM051Variedad> dgm051variedades = new ArrayList<DGM051Variedad>();
	private List<DGM051Marca> dgm051marcas = new ArrayList<DGM051Marca>();
	
	public String getFormaCosmeticaTexto() {
		return formaCosmeticaTexto;
	}

	public void setFormaCosmeticaTexto(String formaCosmeticaTexto) {
		this.formaCosmeticaTexto = formaCosmeticaTexto;
	}

	public Integer getDgm051Id() {
		return dgm051Id;
	}

	public void setDgm051Id(Integer dgm051Id) {
		this.dgm051Id = dgm051Id;
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

	public String getMotivoCambio() {
		return motivoCambio;
	}

	public void setMotivoCambio(String motivoCambio) {
		this.motivoCambio = motivoCambio;
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

	public Date getFechaVigenciaNsoOrigen() {
		return fechaVigenciaNsoOrigen;
	}

	public void setFechaVigenciaNsoOrigen(Date fechaVigenciaNsoOrigen) {
		this.fechaVigenciaNsoOrigen = fechaVigenciaNsoOrigen;
	}
	
	public List<DGM051Variedad> getDgm051variedades() {
		return this.dgm051variedades;
	}
	
	public void setDgm051variedades(List<DGM051Variedad> dgm051variedades) {
		this.dgm051variedades = dgm051variedades;
	}
	
	public List<DGM051Marca> getDgm051marcas() {
		return this.dgm051marcas;
	}
	
	public void setDgm051marcas(List<DGM051Marca> dgm051marcas) {
		this.dgm051marcas = dgm051marcas;
	}
}
