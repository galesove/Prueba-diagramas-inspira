package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM055ExcipienteConservador {

	private Integer dgm055Id;
	private Integer secuencia;
	private Integer secExcipienteConservador;
	private String codigoSustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM055SustentoConservadoresET> sustentosConservadoresET;
	
	private List<DGM055SustentoConservadoresTA> sustentosConservadoresTA;
	
	public Integer getDgm055Id() {
		return dgm055Id;
	}

	public void setDgm055Id(Integer dgm055Id) {
		this.dgm055Id = dgm055Id;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public List<DGM055SustentoConservadoresET> getSustentosConservadoresET() {
		return sustentosConservadoresET;
	}

	public void setSustentosConservadoresET(
			List<DGM055SustentoConservadoresET> sustentosConservadoresET) {
		this.sustentosConservadoresET = sustentosConservadoresET;
	}

	public List<DGM055SustentoConservadoresTA> getSustentosConservadoresTA() {
		return sustentosConservadoresTA;
	}

	public void setSustentosConservadoresTA(
			List<DGM055SustentoConservadoresTA> sustentosConservadoresTA) {
		this.sustentosConservadoresTA = sustentosConservadoresTA;
	}
}
