package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM016ExcipienteColorante {

	private Long dgm016Id;
	private Integer secuenciaColorante;
	private String tipoCatalogoColor;
	private String catalogoColor;
	private String sustancia;
	private BigDecimal cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM016SustentoColorantesET> sustentosColorantesET;
	
	private List<DGM016SustentoColorantesTA> sustentosColorantesTA;
	
	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
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

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public List<DGM016SustentoColorantesET> getSustentosColorantesET() {
		return sustentosColorantesET;
	}

	public void setSustentosColorantesET(List<DGM016SustentoColorantesET> sustentosColorantesET) {
		this.sustentosColorantesET = sustentosColorantesET;
	}

	public List<DGM016SustentoColorantesTA> getSustentosColorantesTA() {
		return sustentosColorantesTA;
	}

	public void setSustentosColorantesTA(List<DGM016SustentoColorantesTA> sustentosColorantesTA) {
		this.sustentosColorantesTA = sustentosColorantesTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
