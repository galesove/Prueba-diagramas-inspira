package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;



public class DGM060 {
		
	private Long            dgm060Id;
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
	private String          rucNuevoTitular;
	private String          codigoEstablecNuevo;
	private String          categoriaEstablecNuevo;
	private String          categoriaEstablecDesc;
	private String          nombreComercial;
	private String          razonSocialNuevo;
	private String          direccionOficinaAdm;

	private List<DGM060Producto> dgm060producto = new ArrayList<DGM060Producto>();
	private List<DGM060Fabricante> dgm060fabricantes = new ArrayList<DGM060Fabricante>();
	
	public Long getDgm060Id() {
		return dgm060Id;
	}
	public void setDgm060Id(Long dgm060Id) {
		this.dgm060Id = dgm060Id;
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
	public String getRucNuevoTitular() {
		return rucNuevoTitular;
	}
	public void setRucNuevoTitular(String rucNuevoTitular) {
		this.rucNuevoTitular = rucNuevoTitular;
	}
	public String getCodigoEstablecNuevo() {
		return codigoEstablecNuevo;
	}
	public void setCodigoEstablecNuevo(String codigoEstablecNuevo) {
		this.codigoEstablecNuevo = codigoEstablecNuevo;
	}
	public String getCategoriaEstablecNuevo() {
		return categoriaEstablecNuevo;
	}
	public void setCategoriaEstablecNuevo(String categoriaEstablecNuevo) {
		this.categoriaEstablecNuevo = categoriaEstablecNuevo;
	}
	public String getCategoriaEstablecDesc() {
		return categoriaEstablecDesc;
	}
	public void setCategoriaEstablecDesc(String categoriaEstablecDesc) {
		this.categoriaEstablecDesc = categoriaEstablecDesc;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getRazonSocialNuevo() {
		return razonSocialNuevo;
	}
	public void setRazonSocialNuevo(String razonSocialNuevo) {
		this.razonSocialNuevo = razonSocialNuevo;
	}
	
	public String getDireccionOficinaAdm() {
		return direccionOficinaAdm;
	}
	public void setDireccionOficinaAdm(String direccionOficinaAdm) {
		this.direccionOficinaAdm = direccionOficinaAdm;
	}
	
	public List<DGM060Producto> getDgm060producto() {
		return this.dgm060producto;
	}
	public void setDgm060producto(List<DGM060Producto> dgm060producto) {
		this.dgm060producto = dgm060producto;
	}
	public List<DGM060Fabricante> getDgm060fabricantes() {
		return this.dgm060fabricantes;
	}
	public void setDgm060fabricantes(List<DGM060Fabricante> dgm060fabricantes) {
		this.dgm060fabricantes = dgm060fabricantes;
	}
}
