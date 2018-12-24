package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM013Fabricante {

	private Long dgm013Id; 
	private Integer secuenciaFabricante; 
	private String origen; 
	private String fabricanteNacional; 
	private String fabricanteExtranjero; 
	private String direccion; 
	private Integer distritoIdFabricante; 
	private String telefono; 
	private String paisFabricante; 
	private String          nombreFabricante;
	private String fax;
	private String email;
	private String paraLaEmpresa;
	private String ubigeoFabricante;	
	
	private List<DGM013Maquila> dgm013maquilas = new ArrayList<DGM013Maquila>();

	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public Long getDgm013Id() {
		return dgm013Id;
	}
	public void setDgm013Id(Long dgm013Id) {
		this.dgm013Id = dgm013Id;
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
	public String getPaisFabricante() {
		return paisFabricante;
	}
	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
	}
	public List<DGM013Maquila> getDgm013maquilas() {
		return this.dgm013maquilas;
	}
	public void setDgm013maquilas (List<DGM013Maquila> dgm013maquilas) {
		this.dgm013maquilas = dgm013maquilas;
	}
	public void addDgm013maquilas (DGM013Maquila dgm013maquila) {
		this.dgm013maquilas.add(dgm013maquila);
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
