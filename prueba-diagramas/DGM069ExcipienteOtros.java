package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM069ExcipienteOtros {

	private Integer dgm069Id;
	private Integer secExcipienteOtros;
	private String codigoSustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM069SustentoOtrosET> sustentosOtrosET;
	private List<DGM069SustentoOtrosTA> sustentosOtrosTA;
	
	public Integer getDgm069Id() {
		return dgm069Id;
	}

	public void setDgm069Id(Integer dgm069Id) {
		this.dgm069Id = dgm069Id;
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
	public List<DGM069SustentoOtrosET> getSustentosOtrosET() {
		return sustentosOtrosET;
	}

	public void setSustentosOtrosET(List<DGM069SustentoOtrosET> sustentosOtrosET) {
		this.sustentosOtrosET = sustentosOtrosET;
	}

	public List<DGM069SustentoOtrosTA> getSustentosOtrosTA() {
		return sustentosOtrosTA;
	}

	public void setSustentosOtrosTA(List<DGM069SustentoOtrosTA> sustentosOtrosTA) {
		this.sustentosOtrosTA = sustentosOtrosTA;
	}
}
