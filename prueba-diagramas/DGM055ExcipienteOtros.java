package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM055ExcipienteOtros {

	private Integer dgm055Id;
	private Integer secuencia;
	private Integer secExcipienteOtros;
	private String codigoSustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM055SustentoOtrosET> sustentosOtrosET;
	
	private List<DGM055SustentoOtrosTA> sustentosOtrosTA;
	
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
	
	public List<DGM055SustentoOtrosET> getSustentosOtrosET() {
		return sustentosOtrosET;
	}

	public void setSustentosOtrosET(List<DGM055SustentoOtrosET> sustentosOtrosET) {
		this.sustentosOtrosET = sustentosOtrosET;
	}

	public List<DGM055SustentoOtrosTA> getSustentosOtrosTA() {
		return sustentosOtrosTA;
	}

	public void setSustentosOtrosTA(List<DGM055SustentoOtrosTA> sustentosOtrosTA) {
		this.sustentosOtrosTA = sustentosOtrosTA;
	}

}
