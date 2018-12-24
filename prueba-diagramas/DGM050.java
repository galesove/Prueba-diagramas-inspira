package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM050 {

	private Long dgm050Id; 
	private Long ordenId; 
	private Integer mto; 
	private String codigoEstablecimiento; 
	private String categoriaEstablecimiento; 
	private String idDireccionEstablecimiento;
	private String direccionEstablecimiento; 
	private String representanteLegal; 
	private String codigoRegente; 
	private String cargoRegente; 
	private String cambioFabricante;
	private String cambioAcondicionante;
	private String origenFabricante;
	private String origenAcondicionadora;
	
	private List<DGM050Detalle> dgm050detalles = new ArrayList<DGM050Detalle>();
	
	public Long getDgm050Id() {
		return dgm050Id;
	}
	public void setDgm050Id(Long dgm050Id) {
		this.dgm050Id = dgm050Id;
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
	public void setCambioFabricante(String cambioFabricante) {
		this.cambioFabricante = cambioFabricante;
	}
	public String getCambioFabricante() {
		return cambioFabricante;
	}
	public void setCambioAcondicionante(String cambioAcondicionante) {
		this.cambioAcondicionante = cambioAcondicionante;
	}
	public String getCambioAcondicionante() {
		return cambioAcondicionante;
	}
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	public String getOrigenFabricante() {
		return origenFabricante;
	}
	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricante = origenFabricante;
	}
	public String getOrigenAcondicionadora() {
		return origenAcondicionadora;
	}
	public void setOrigenAcondicionadora(String origenAcondicionadora) {
		this.origenAcondicionadora = origenAcondicionadora;
	}
	public List<DGM050Detalle> getDgm050detalles() {
		return dgm050detalles;
	}
	public void setDgm050detalles(List<DGM050Detalle> dgm050detalles) {
		this.dgm050detalles = dgm050detalles;
	}
	
}