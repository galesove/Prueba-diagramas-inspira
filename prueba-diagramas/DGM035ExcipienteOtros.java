package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM035ExcipienteOtros {

	private Long dgm035Id;
	private Integer secuenciaExipienteOtro;
	private String sustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM035SustentoOtrosET> sustentosOtrosET;
	
	private List<DGM035SustentoOtrosTA> sustentosOtrosTA;

	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public void setSecuenciaExipienteOtro(Integer secuenciaExipienteOtro) {
		this.secuenciaExipienteOtro = secuenciaExipienteOtro;
	}

	public Integer getSecuenciaExipienteOtro() {
		return secuenciaExipienteOtro;
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

	public List<DGM035SustentoOtrosET> getSustentosOtrosET() {
		return sustentosOtrosET;
	}

	public void setSustentosOtrosET(List<DGM035SustentoOtrosET> sustentosOtrosET) {
		this.sustentosOtrosET = sustentosOtrosET;
	}

	public List<DGM035SustentoOtrosTA> getSustentosOtrosTA() {
		return sustentosOtrosTA;
	}

	public void setSustentosOtrosTA(List<DGM035SustentoOtrosTA> sustentosOtrosTA) {
		this.sustentosOtrosTA = sustentosOtrosTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
