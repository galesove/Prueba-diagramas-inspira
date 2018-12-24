package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM018Fabricante {

	private Long dgm018Id; 
	private Integer secuenciaFabricante; 
	private String origen; 
	private String fabricanteNacional; 
	private String fabricanteExtranjero; 
	private String direccion; 
	private Integer distritoIdFabricante; 
	private String telefono; 
	private String paisFabricante; 
	private String nombreFabricante;
	private String fax;
	private String email;
	private String paraLaEmpresa;
	private String ubigeoFabricante;
	
	private List<DGM018Maquila> dgm018maquilas = new ArrayList<DGM018Maquila>();

	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public Long getDgm018Id() {
		return dgm018Id;
	}
	public void setDgm018Id(Long dgm018Id) {
		this.dgm018Id = dgm018Id;
	}
	public Integer getSecuenciaFabricante() {
		return secuenciaFabricante;
	}
	public void setSecuenciaFabricante(Integer secuenciaFabricante) {
		this.secuenciaFabricante = secuenciaFabricante;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getDistritoIdFabricante() {
		return distritoIdFabricante;
	}
	public void setDistritoIdFabricante(Integer distritoIdFabricante) {
		this.distritoIdFabricante = distritoIdFabricante;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<DGM018Maquila> getDgm018maquilas() {
		return this.dgm018maquilas;
	}
	public void setDgm018maquilas (List<DGM018Maquila> dgm018maquilas) {
		this.dgm018maquilas = dgm018maquilas;
	}
	
	public String getPaisFabricante() {
		return paisFabricante;
	}
	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
	}
	public void addDgm018maquilas (DGM018Maquila dgm018maquila) {
		this.dgm018maquilas.add(dgm018maquila);
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getParaLaEmpresa() {
		return paraLaEmpresa;
	}
	public void setParaLaEmpresa(String paraLaEmpresa) {
		this.paraLaEmpresa = paraLaEmpresa;
	}
	public String getUbigeoFabricante() {
		return ubigeoFabricante;
	}
	public void setUbigeoFabricante(String ubigeoFabricante) {
		this.ubigeoFabricante = ubigeoFabricante;
	}
	
}
