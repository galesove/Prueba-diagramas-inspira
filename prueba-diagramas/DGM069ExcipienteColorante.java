package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM069ExcipienteColorante {
	private Integer dgm069Id;
	private Integer secExcipienteColorante;
	private String tipoCatalogoColor;
	private String codigoColor;
	private String codigoSustancia;
	private String nombreSustanciaTraducida;
	private BigDecimal cantidad;
	private String unidadMedida;
	private String comentario;
	private List<DGM069SustentoColorantesET> sustentosColorantesET;
	private List<DGM069SustentoColorantesTA> sustentosColorantesTA;

	public Integer getDgm069Id() {
		return dgm069Id;
	}

	public void setDgm069Id(Integer dgm069Id) {
		this.dgm069Id = dgm069Id;
	}

	public Integer getSecExcipienteColorante() {
		return secExcipienteColorante;
	}

	public void setSecExcipienteColorante(Integer secExcipienteColorante) {
		this.secExcipienteColorante = secExcipienteColorante;
	}

	public String getTipoCatalogoColor() {
		return tipoCatalogoColor;
	}

	public void setTipoCatalogoColor(String tipoCatalogoColor) {
		this.tipoCatalogoColor = tipoCatalogoColor;
	}

	public String getCodigoColor() {
		return codigoColor;
	}

	public void setCodigoColor(String codigoColor) {
		this.codigoColor = codigoColor;
	}

	public String getCodigoSustancia() {
		return codigoSustancia;
	}

	public void setCodigoSustancia(String codigoSustancia) {
		this.codigoSustancia = codigoSustancia;
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

	public List<DGM069SustentoColorantesET> getSustentosColorantesET() {
		return sustentosColorantesET;
	}

	public void setSustentosColorantesET(List<DGM069SustentoColorantesET> sustentosColorantesET) {
		this.sustentosColorantesET = sustentosColorantesET;
	}

	public List<DGM069SustentoColorantesTA> getSustentosColorantesTA() {
		return sustentosColorantesTA;
	}

	public void setSustentosColorantesTA(List<DGM069SustentoColorantesTA> sustentosColorantesTA) {
		this.sustentosColorantesTA = sustentosColorantesTA;
	}

}
