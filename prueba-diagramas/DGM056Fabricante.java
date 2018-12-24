package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM056Fabricante {

	private Long dgm056Id; 
	private Integer secuenciaFabricante; 
	private String origen; 
	private String fabricanteNacional; 
	private String fabricanteExtranjero; 
	private String direccion; 
	private Integer distritoIdFabricante; 
	private String telefono; 
	//private String fabricacionEncargo;
	private String paisFabricante; 
	private String nombreFabricante;
	private String fax;
	private String email;
	private String paraLaEmpresa;
	private String ubigeoFabricante;
	
	private List<DGM056Maquila> dgm056maquilas = new ArrayList<DGM056Maquila>();
	
	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public Long getDgm056Id() {
		return dgm056Id;
	}
	public void setDgm056Id(Long dgm056Id) {
		this.dgm056Id = dgm056Id;
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
	public List getDgm056maquilas() {
		return this.dgm056maquilas;
	}
	public void setDgm056maquilas (List<DGM056Maquila> dgm056maquilas) {
		this.dgm056maquilas = dgm056maquilas;
	}
	public void addDgm056maquilas (DGM056Maquila dgm056maquila) {
		this.dgm056maquilas.add(dgm056maquila);
	}
	public String getPaisFabricante() {
		return paisFabricante;
	}
	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
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
