package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM001ExcipienteConservador {

	private Integer dgm001Id;
	
	private Integer secuencia;
	
	private Integer secExcipienteConservador;
	
	private String codigoSustancia;
	
	private Double cantidad;
	
	private String unidadMedida;
	
	private List<DGM001SustentoConservadoresET> sustentosConservadoresET;
	
	private List<DGM001SustentoConservadoresTA> sustentosConservadoresTA;
	
	private String comentario;

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

	public Integer getSecExcipienteConservador() {
		return secExcipienteConservador;
	}

	public void setSecExcipienteConservador(Integer secExcipienteConservador) {
		this.secExcipienteConservador = secExcipienteConservador;
	}

	public String getCodigoSustancia() {
		return codigoSustancia;
	}

	public void setCodigoSustancia(String codigoSustancia) {
		this.codigoSustancia = codigoSustancia;
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

	public List<DGM001SustentoConservadoresET> getSustentosConservadoresET() {
		return sustentosConservadoresET;
	}

	public void setSustentosConservadoresET(
			List<DGM001SustentoConservadoresET> sustentosConservadoresET) {
		this.sustentosConservadoresET = sustentosConservadoresET;
	}

	public List<DGM001SustentoConservadoresTA> getSustentosConservadoresTA() {
		return sustentosConservadoresTA;
	}

	public void setSustentosConservadoresTA(
			List<DGM001SustentoConservadoresTA> sustentosConservadoresTA) {
		this.sustentosConservadoresTA = sustentosConservadoresTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
