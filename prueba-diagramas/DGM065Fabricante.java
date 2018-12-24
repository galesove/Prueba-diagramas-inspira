package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;


public class DGM065Fabricante {

	private Long dgm065Id;
	private Integer secuenciaFabricante;
	private String origen;
	private String esCatalogo;
	private String nombreFabricante;
	private String fabricanteNacional;
	private String fabricanteExtranjero;
	private String direccion;
	private Integer distritoIdFabricante;
	private String paisFabricante;
	private String paraLaEmpresa;
	private String ubigeo;

	private List<DGM065Maquila> dgm065maquilas = new ArrayList<DGM065Maquila>();

	public Long getDgm065Id() {
		return dgm065Id;
	}

	public void setDgm065Id(Long dgm065Id) {
		this.dgm065Id = dgm065Id;
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

	public String getEsCatalogo() {
		return esCatalogo;
	}

	public void setEsCatalogo(String esCatalogo) {
		this.esCatalogo = esCatalogo;
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

	public Integer getDistritoIdFabricante() {
		return distritoIdFabricante;
	}

	public void setDistritoIdFabricante(Integer distritoIdFabricante) {
		this.distritoIdFabricante = distritoIdFabricante;
	}

	public String getPaisFabricante() {
		return paisFabricante;
	}

	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
	}
	
	public List<DGM065Maquila> getDgm065maquilas() {
		return dgm065maquilas;
	}

	public void setDgm065maquilas(List<DGM065Maquila> dgm065maquilas) {
		this.dgm065maquilas = dgm065maquilas;
	}

	public String getParaLaEmpresa() {
		return paraLaEmpresa;
	}

	public void setParaLaEmpresa(String paraLaEmpresa) {
		this.paraLaEmpresa = paraLaEmpresa;
	}
	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}
}
