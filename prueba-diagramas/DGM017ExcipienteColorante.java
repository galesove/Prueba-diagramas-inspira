package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM017ExcipienteColorante {

	private Long dgm017Id;
	private Integer secuenciaColorante;
	private String tipoCatalogoColor;
	private String catalogoColor;
	private String sustancia;
	private BigDecimal cantidad;
	private String unidadMedida;
	private String comentario;
	
	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
