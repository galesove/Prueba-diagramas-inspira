package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM044ExcipienteOtros {

	private Integer dgm044Id;
	private Integer secExcipienteOtros;
	private String codigoSustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;

	private List<DGM044SustentoOtrosET> sustentosOtrosET;
	
	private List<DGM044SustentoOtrosTA> sustentosOtrosTA;

	
	public Integer getDgm044Id() {
		return dgm044Id;
	}

	public void setDgm044Id(Integer dgm044Id) {
		this.dgm044Id = dgm044Id;
	}

	public Integer getSecExcipienteOtros() {
		return secExcipienteOtros;
	}

	public void setSecExcipienteOtros(Integer secExcipienteOtros) {
		this.secExcipienteOtros = secExcipienteOtros;
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

	public List<DGM044SustentoOtrosET> getSustentosOtrosET() {
		return sustentosOtrosET;
	}

	public void setSustentosOtrosET(List<DGM044SustentoOtrosET> sustentosOtrosET) {
		this.sustentosOtrosET = sustentosOtrosET;
	}

	public List<DGM044SustentoOtrosTA> getSustentosOtrosTA() {
		return sustentosOtrosTA;
	}

	public void setSustentosOtrosTA(List<DGM044SustentoOtrosTA> sustentosOtrosTA) {
		this.sustentosOtrosTA = sustentosOtrosTA;
	}
	
}
