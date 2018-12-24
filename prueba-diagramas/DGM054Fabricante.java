package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM054Fabricante {
	private Long dgm054Id;
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

	private List<DGM054Maquila> dgm054maquilas = new ArrayList<DGM054Maquila>();
	
	public Long getDgm054Id() {
		return dgm054Id;
	}

	public void setDgm054Id(Long dgm054Id) {
		this.dgm054Id = dgm054Id;
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
	
	public List<DGM054Maquila> getDgm054maquilas() {
		return this.dgm054maquilas;
	}
	public void setDgm054maquilas (List<DGM054Maquila> dgm054maquilas) {
		this.dgm054maquilas = dgm054maquilas;
	}
	public void addDgm054maquilas (DGM054Maquila dgm054maquila) {
		this.dgm054maquilas.add(dgm054maquila);
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
