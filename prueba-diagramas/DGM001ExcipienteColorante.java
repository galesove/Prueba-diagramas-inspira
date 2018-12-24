package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM001ExcipienteColorante {

	private Integer dgm001Id;
	
	private Integer secuencia;
	
	private Integer secExcipienteColorante;
	
	private String tipoCatalogoColor;
	
	private String codigoColor;
	
	private String codigoSustancia;
	
	private BigDecimal cantidad;
	
	private String unidadMedida;
	
	private List<DGM001SustentoColorantesET> sustentosColorantesET;
	
	private List<DGM001SustentoColorantesTA> sustentosColorantesTA;
	
	private String comentario;
	
	private String nombreSustanciaTraducida;

	public Integer getDgm001Id() {
		return dgm001Id;
	}

	public void setDgm001Id(Integer dgm001Id) {
		this.dgm001Id = dgm001Id;
	}

	public Integer getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
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

	public List<DGM001SustentoColorantesET> getSustentosColorantesET() {
		return sustentosColorantesET;
	}

	public void setSustentosColorantesET(
			List<DGM001SustentoColorantesET> sustentosColorantesET) {
		this.sustentosColorantesET = sustentosColorantesET;
	}

	public List<DGM001SustentoColorantesTA> getSustentosColorantesTA() {
		return sustentosColorantesTA;
	}

	public void setSustentosColorantesTA(
			List<DGM001SustentoColorantesTA> sustentosColorantesTA) {
		this.sustentosColorantesTA = sustentosColorantesTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getNombreSustanciaTraducida() {
		return nombreSustanciaTraducida;
	}

	public void setNombreSustanciaTraducida(String nombreSustanciaTraducida) {
		this.nombreSustanciaTraducida = nombreSustanciaTraducida;
	}
	
}
