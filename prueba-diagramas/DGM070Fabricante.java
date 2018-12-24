package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM070Fabricante {	
	private Long            dgm070Id;
	private Integer         secuenciaFabricante;
	private String          tipoFabricante;
	private String          origenFabricante;
	private String          nombreFabricante;
	private String          fabricanteNacional;
	private String          fabricanteExtranjero;
	private String          direccion;
	private String          paisFabricante;
	private String          telefono;
	private String          email;
	private String          paraLaEmpresa;
	
	private List<DGM070Maquila> maquilas;

	public Long getDgm070Id() {
		return dgm070Id;
	}

	public void setDgm070Id(Long dgm070Id) {
		this.dgm070Id = dgm070Id;
	}

	public Integer getSecuenciaFabricante() {
		return secuenciaFabricante;
	}

	public void setSecuenciaFabricante(Integer secuenciaFabricante) {
		this.secuenciaFabricante = secuenciaFabricante;
	}

	public String getTipoFabricante() {
		return tipoFabricante;
	}

	public void setTipoFabricante(String tipoFabricante) {
		this.tipoFabricante = tipoFabricante;
	}

	public String getOrigenFabricante() {
		return origenFabricante;
	}

	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricante = origenFabricante;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
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

	public String getPaisFabricante() {
		return paisFabricante;
	}

	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public List<DGM070Maquila> getMaquilas() {
		return maquilas;
	}

	public void setMaquilas(List<DGM070Maquila> maquilas) {
		this.maquilas = maquilas;
	}



}
