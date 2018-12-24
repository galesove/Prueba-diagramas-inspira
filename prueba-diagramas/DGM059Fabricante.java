package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM059Fabricante {

	private Long dgm059Id;
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
	
	private List<DGM059Maquila> dgm059maquilas = new ArrayList<DGM059Maquila>();

	public Long getDgm059Id() {
		return dgm059Id;
	}

	public void setDgm059Id(Long dgm059Id) {
		this.dgm059Id = dgm059Id;
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

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
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

	public List<DGM059Maquila> getDgm059maquilas() {
		return dgm059maquilas;
	}

	public void setDgm059maquilas(List<DGM059Maquila> dgm059maquilas) {
		this.dgm059maquilas = dgm059maquilas;
	}

	public String getParaLaEmpresa() {
		return paraLaEmpresa;
	}

	public void setParaLaEmpresa(String paraLaEmpresa) {
		this.paraLaEmpresa = paraLaEmpresa;
	}
	
}
