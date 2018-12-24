package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM001ExcipienteOtros {

	private Integer dgm001Id;
	
	private Integer secuencia;
	
	private Integer secExcipienteOtros;
	
	private String codigoSustancia;
	
	private Double cantidad;
	
	private String unidadMedida;
	
	private List<DGM001SustentoOtrosET> sustentosOtrosET;
	
	private List<DGM001SustentoOtrosTA> sustentosOtrosTA;
	
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

	public List<DGM001SustentoOtrosET> getSustentosOtrosET() {
		return sustentosOtrosET;
	}

	public void setSustentosOtrosET(List<DGM001SustentoOtrosET> sustentosOtrosET) {
		this.sustentosOtrosET = sustentosOtrosET;
	}

	public List<DGM001SustentoOtrosTA> getSustentosOtrosTA() {
		return sustentosOtrosTA;
	}

	public void setSustentosOtrosTA(List<DGM001SustentoOtrosTA> sustentosOtrosTA) {
		this.sustentosOtrosTA = sustentosOtrosTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
