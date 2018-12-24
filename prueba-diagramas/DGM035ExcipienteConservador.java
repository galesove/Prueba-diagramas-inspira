package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035ExcipienteConservador {

	private Long dgm035Id;
	private Integer secuenciaConservante;
	private String sustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM035SustentoConservadoresET> sustentosConservadoresET;
	
	private List<DGM035SustentoConservadoresTA> sustentosConservadoresTA;

	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public void setSecuenciaConservante(Integer secuenciaConservante) {
		this.secuenciaConservante = secuenciaConservante;
	}

	public Integer getSecuenciaConservante() {
		return secuenciaConservante;
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

	public List<DGM035SustentoConservadoresET> getSustentosConservadoresET() {
		return sustentosConservadoresET;
	}

	public void setSustentosConservadoresET(
			List<DGM035SustentoConservadoresET> sustentosConservadoresET) {
		this.sustentosConservadoresET = sustentosConservadoresET;
	}

	public List<DGM035SustentoConservadoresTA> getSustentosConservadoresTA() {
		return sustentosConservadoresTA;
	}

	public void setSustentosConservadoresTA(
			List<DGM035SustentoConservadoresTA> sustentosConservadoresTA) {
		this.sustentosConservadoresTA = sustentosConservadoresTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
