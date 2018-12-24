package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;

public class DGM071ExcipienteColorante {

	private Long dgm071Id;
	private Integer secuenciaExcColor;
	private String tipoCatalogoColor;
	private String catalogoColor;
	private String nombreSustanciaTraducida;
	private BigDecimal cantidad;
	private String unidadMedida;
	private String comentario;

	public Long getDgm071Id() {
		return dgm071Id;
	}

	public void setDgm071Id(Long dgm071Id) {
		this.dgm071Id = dgm071Id;
	}

	public Integer getSecuenciaExcColor() {
		return secuenciaExcColor;
	}

	public void setSecuenciaExcColor(Integer secuenciaExcColor) {
		this.secuenciaExcColor = secuenciaExcColor;
	}

	public String getTipoCatalogoColor() {
		return tipoCatalogoColor;
	}

	public void setTipoCatalogoColor(String tipoCatalogoColor) {
		this.tipoCatalogoColor = tipoCatalogoColor;
	}

	public String getCatalogoColor() {
		return catalogoColor;
	}

	public void setCatalogoColor(String catalogoColor) {
		this.catalogoColor = catalogoColor;
	}

	public String getNombreSustanciaTraducida() {
		return nombreSustanciaTraducida;
	}

	public void setNombreSustanciaTraducida(String nombreSustanciaTraducida) {
		this.nombreSustanciaTraducida = nombreSustanciaTraducida;
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
