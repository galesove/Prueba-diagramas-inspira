package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM074 {

	private Long dgm074Id;
	private Long ordenId;
	private Integer mto;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String nombreComercial;
	private String direccionEstablecimiento;
	private String codigoRegente;
	private String cargoRegente;
	private String nroColegiaturaDirector;
	private String telefonoDirector;
	private String emailDirector;
	private String representanteLegal;
	private String nombreRepresentante;
	private String telefonoRepLegal;
	private String emailRepLegal;
	// Informacion Solicitante
	private String telefonoRepresentanteLegal;
	private String emailRepresentanteLegal;
	
	private List<DGM074Producto> productos = new ArrayList<DGM074Producto>();
	private List<DGM074Kit> kits = new ArrayList<DGM074Kit>();

	public Long getDgm074Id() {
		return dgm074Id;
	}

	public void setDgm074Id(Long dgm074Id) {
		this.dgm074Id = dgm074Id;
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

	public String getTelefonoRepLegal() {
		return telefonoRepLegal;
	}

	public void setTelefonoRepLegal(String telefonoRepLegal) {
		this.telefonoRepLegal = telefonoRepLegal;
	}

	public String getEmailRepLegal() {
		return emailRepLegal;
	}

	public void setEmailRepLegal(String emailRepLegal) {
		this.emailRepLegal = emailRepLegal;
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
	
	public List<DGM074Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<DGM074Producto> productos) {
		this.productos = productos;
	}

	public List<DGM074Kit> getKits() {
		return kits;
	}

	public void setKits(List<DGM074Kit> kits) {
		this.kits = kits;
	}
}
