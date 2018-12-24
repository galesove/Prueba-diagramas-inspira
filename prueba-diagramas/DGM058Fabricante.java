package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM058Fabricante {

	private Long dgm058Id; 
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
	private String tipoFabricante;
	private String paraLaEmpresa;
	
	private List<DGM058Maquila> dgm058maquilas = new ArrayList<DGM058Maquila>();
	
	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public Long getDgm058Id() {
		return dgm058Id;
	}
	public void setDgm058Id(Long dgm058Id) {
		this.dgm058Id = dgm058Id;
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
	public List getDgm058maquilas() {
		return this.dgm058maquilas;
	}
	public void setDgm058maquilas (List<DGM058Maquila> dgm058maquilas) {
		this.dgm058maquilas = dgm058maquilas;
	}
	public void addDgm058maquilas (DGM058Maquila dgm058maquila) {
		this.dgm058maquilas.add(dgm058maquila);
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
	public String getTipoFabricante() {
		return tipoFabricante;
	}
	public void setTipoFabricante(String tipoFabricante) {
		this.tipoFabricante = tipoFabricante;
	}
	public String getParaLaEmpresa() {
		return paraLaEmpresa;
	}
	public void setParaLaEmpresa(String paraLaEmpresa) {
		this.paraLaEmpresa = paraLaEmpresa;
	}

}
