package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM065 {

	private Long dgm065Id;
	private Long ordenId;
	private Integer mto;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String nombreComercial;
	private String idDireccionEstablecimiento;
	private String direccionEstablecimiento;
	private String codigoRegente;
	private String cargoRegente;
	private String nroColegiaturaDirector;
	private String telefonoDirector;
	private String emailDirector;
	private String representanteLegal;
	private String nombreRepresentante;
	private String telefonoRepresentanteLegal;
	private String emailRepresentanteLegal;
	private String nso;
	private String grupoProducto;
	private String nombreProducto;
	private Date fechaVigenciaNSO;
	private String informacionAdicionalCLC;
	private Integer formaCosmetica;
	private String formaCosmeticaTexto;
	private Integer grupoDecision706;
	private Integer subGrupoDecision706;
	//Nuevos atributos 29/08/14
	private String forma;
	private String formaPresentacion; 

	private List<DGM065Variedad> dgm065variedades = new ArrayList<DGM065Variedad>();
	private List<DGM065Fabricante> dgm065fabricantes = new ArrayList<DGM065Fabricante>();
	private List<DGM065Marca> dgm065marcas = new ArrayList<DGM065Marca>();
	private List<DGM065GrupoCosmetico> dgm065gruposcosmeticos = new ArrayList<DGM065GrupoCosmetico>();
	
	public Long getDgm065Id() {
		return dgm065Id;
	}

	public void setDgm065Id(Long dgm065Id) {
		this.dgm065Id = dgm065Id;
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

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
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

	public String getNso() {
		return nso;
	}

	public void setNso(String nso) {
		this.nso = nso;
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

	public Date getFechaVigenciaNSO() {
		return fechaVigenciaNSO;
	}

	public void setFechaVigenciaNSO(Date fechaVigenciaNSO) {
		this.fechaVigenciaNSO = fechaVigenciaNSO;
	}

	public String getInformacionAdicionalCLC() {
		return informacionAdicionalCLC;
	}

	public void setInformacionAdicionalCLC(String informacionAdicionalCLC) {
		this.informacionAdicionalCLC = informacionAdicionalCLC;
	}

	public Integer getFormaCosmetica() {
		return formaCosmetica;
	}

	public void setFormaCosmetica(Integer formaCosmetica) {
		this.formaCosmetica = formaCosmetica;
	}

	public String getFormaCosmeticaTexto() {
		return formaCosmeticaTexto;
	}

	public void setFormaCosmeticaTexto(String formaCosmeticaTexto) {
		this.formaCosmeticaTexto = formaCosmeticaTexto;
	}

	public Integer getGrupoDecision706() {
		return grupoDecision706;
	}

	public void setGrupoDecision706(Integer grupoDecision706) {
		this.grupoDecision706 = grupoDecision706;
	}

	public Integer getSubGrupoDecision706() {
		return subGrupoDecision706;
	}

	public void setSubGrupoDecision706(Integer subGrupoDecision706) {
		this.subGrupoDecision706 = subGrupoDecision706;
	}
	
	public List<DGM065Variedad> getDgm065variedades() {
		return dgm065variedades;
	}

	public void setDgm065variedades(List<DGM065Variedad> dgm065variedades) {
		this.dgm065variedades = dgm065variedades;
	}

	public List<DGM065Fabricante> getDgm065fabricantes() {
		return dgm065fabricantes;
	}

	public void setDgm065fabricantes(List<DGM065Fabricante> dgm065fabricantes) {
		this.dgm065fabricantes = dgm065fabricantes;
	}

	public List<DGM065Marca> getDgm065marcas() {
		return dgm065marcas;
	}

	public void setDgm065marcas(List<DGM065Marca> dgm065marcas) {
		this.dgm065marcas = dgm065marcas;
	}

	public List<DGM065GrupoCosmetico> getDgm065gruposcosmeticos() {
		return dgm065gruposcosmeticos;
	}

	public void setDgm065gruposcosmeticos(
			List<DGM065GrupoCosmetico> dgm065gruposcosmeticos) {
		this.dgm065gruposcosmeticos = dgm065gruposcosmeticos;
	}
	
	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getFormaPresentacion() {
		return formaPresentacion;
	}

	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}
}
