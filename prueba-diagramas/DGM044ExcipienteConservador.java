package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM044ExcipienteConservador {

	private Integer dgm044Id;
	private Integer secExcipienteConservador;
	private String codigoSustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM044SustentoConservadoresET> sustentosConservadoresET;
	private List<DGM044SustentoConservadoresTA> sustentosConservadoresTA;

	public Integer getDgm044Id() {
		return dgm044Id;
	}

	public void setDgm044Id(Integer dgm044Id) {
		this.dgm044Id = dgm044Id;
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



	public List<DGM044SustentoConservadoresET> getSustentosConservadoresET() {
		return sustentosConservadoresET;
	}

	public void setSustentosConservadoresET(
			List<DGM044SustentoConservadoresET> sustentosConservadoresET) {
		this.sustentosConservadoresET = sustentosConservadoresET;
	}

	public List<DGM044SustentoConservadoresTA> getSustentosConservadoresTA() {
		return sustentosConservadoresTA;
	}

	public void setSustentosConservadoresTA(
			List<DGM044SustentoConservadoresTA> sustentosConservadoresTA) {
		this.sustentosConservadoresTA = sustentosConservadoresTA;
	}
	
}
