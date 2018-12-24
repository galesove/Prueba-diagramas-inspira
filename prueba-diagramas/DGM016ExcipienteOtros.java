package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM016ExcipienteOtros {

	private Long dgm016Id;
	private Integer secuenciaExipienteOtro;
	private String sustancia;
	private BigDecimal cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM016SustentoOtrosET> sustentosOtrosET;
	
	private List<DGM016SustentoOtrosTA> sustentosOtrosTA;

	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
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

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public List<DGM016SustentoOtrosET> getSustentosOtrosET() {
		return sustentosOtrosET;
	}

	public void setSustentosOtrosET(List<DGM016SustentoOtrosET> sustentosOtrosET) {
		this.sustentosOtrosET = sustentosOtrosET;
	}

	public List<DGM016SustentoOtrosTA> getSustentosOtrosTA() {
		return sustentosOtrosTA;
	}

	public void setSustentosOtrosTA(List<DGM016SustentoOtrosTA> sustentosOtrosTA) {
		this.sustentosOtrosTA = sustentosOtrosTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
