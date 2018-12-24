package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM002ExcipienteOtros {

	private Integer dgm002Id;
	
	private Integer secuencia;
	
	private Integer secExcipienteOtros;
	
	private String codigoSustancia;
	
	private Double cantidad;
	
	private String unidadMedida;
	
	private List<DGM002SustentoOtrosET> sustentosOtrosET;
	
	private List<DGM002SustentoOtrosTA> sustentosOtrosTA;
	
	private String comentario;

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

	public List<DGM002SustentoOtrosET> getSustentosOtrosET() {
		return sustentosOtrosET;
	}

	public void setSustentosOtrosET(List<DGM002SustentoOtrosET> sustentosOtrosET) {
		this.sustentosOtrosET = sustentosOtrosET;
	}

	public List<DGM002SustentoOtrosTA> getSustentosOtrosTA() {
		return sustentosOtrosTA;
	}

	public void setSustentosOtrosTA(List<DGM002SustentoOtrosTA> sustentosOtrosTA) {
		this.sustentosOtrosTA = sustentosOtrosTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
