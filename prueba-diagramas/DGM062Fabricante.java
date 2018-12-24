package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM062Fabricante {

	private Long dgm062Id; 
	private Integer secuenciaFabricante; 
	private String origen; 
	private String fabricanteNacional; 
	private String fabricanteExtranjero; 
	private String direccion; 
	private Integer distritoIdFabricante; 
	private String telefono; 
	//private String fabricacionEncargo;
	private String paisFabricante; 
	private String          nombreFabricante;
	private String fax;
	private String email;
	private String paraLaEmpresa;
	
	private List<DGM062Maquila> dgm062maquilas = new ArrayList<DGM062Maquila>();

	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public Long getDgm062Id() {
		return dgm062Id;
	}
	public void setDgm062Id(Long dgm062Id) {
		this.dgm062Id = dgm062Id;
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
	public List getDgm062maquilas() {
		return this.dgm062maquilas;
	}
	public void setDgm062maquilas (List<DGM062Maquila> dgm062maquilas) {
		this.dgm062maquilas = dgm062maquilas;
	}
	public void addDgm062maquilas (DGM062Maquila dgm062maquila) {
		this.dgm062maquilas.add(dgm062maquila);
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
	
}
