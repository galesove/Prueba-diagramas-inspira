package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM002ExcipienteColorante {

	private Integer dgm002Id;
	
	private Integer secuencia;
	
	private Integer secExcipienteColorante;
	
	private String tipoCatalogoColor;
	
	private String codigoColor;
	
	private String codigoSustancia;
	
	private BigDecimal cantidad;
	
	private String unidadMedida;
	
	private List<DGM002SustentoColorantesET> sustentosColorantesET;
	
	private List<DGM002SustentoColorantesTA> sustentosColorantesTA;
	
	private String comentario;
	
	private String nombreSustanciaTraducida;

	public Integer getDgm002Id() {
		return dgm002Id;
	}

	public void setDgm002Id(Integer dgm002Id) {
		this.dgm002Id = dgm002Id;
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

	public List<DGM002SustentoColorantesET> getSustentosColorantesET() {
		return sustentosColorantesET;
	}

	public void setSustentosColorantesET(
			List<DGM002SustentoColorantesET> sustentosColorantesET) {
		this.sustentosColorantesET = sustentosColorantesET;
	}

	public List<DGM002SustentoColorantesTA> getSustentosColorantesTA() {
		return sustentosColorantesTA;
	}

	public void setSustentosColorantesTA(
			List<DGM002SustentoColorantesTA> sustentosColorantesTA) {
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
