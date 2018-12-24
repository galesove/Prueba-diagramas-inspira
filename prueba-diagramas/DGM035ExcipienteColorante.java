package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035ExcipienteColorante {

	private Long dgm035Id;
	private Integer secuenciaColorante;
	private String tipoCatalogoColor;
	private String catalogoColor;
	private String sustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM035SustentoColorantesET> sustentosColorantesET;
	
	private List<DGM035SustentoColorantesTA> sustentosColorantesTA;
	
	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public void setSecuenciaColorante(Integer secuenciaColorante) {
		this.secuenciaColorante = secuenciaColorante;
	}

	public Integer getSecuenciaColorante() {
		return secuenciaColorante;
	}

	public String getTipoCatalogoColor() {
		return tipoCatalogoColor;
	}

	public void setTipoCatalogoColor(String tipoCatalogoColor) {
		this.tipoCatalogoColor = tipoCatalogoColor;
	}

	public void setCatalogoColor(String catalogoColor) {
		this.catalogoColor = catalogoColor;
	}

	public String getCatalogoColor() {
		return catalogoColor;
	}

	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}

	public String getSustancia() {
		return sustancia;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public List<DGM035SustentoColorantesET> getSustentosColorantesET() {
		return sustentosColorantesET;
	}

	public void setSustentosColorantesET(List<DGM035SustentoColorantesET> sustentosColorantesET) {
		this.sustentosColorantesET = sustentosColorantesET;
	}

	public List<DGM035SustentoColorantesTA> getSustentosColorantesTA() {
		return sustentosColorantesTA;
	}

	public void setSustentosColorantesTA(List<DGM035SustentoColorantesTA> sustentosColorantesTA) {
		this.sustentosColorantesTA = sustentosColorantesTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}