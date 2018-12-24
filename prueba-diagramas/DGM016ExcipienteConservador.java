package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM016ExcipienteConservador {

	private Long dgm016Id;
	private Integer secuenciaConservante;
	private String sustancia;
	private BigDecimal cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM016SustentoConservadoresET> sustentosConservadoresET;
	
	private List<DGM016SustentoConservadoresTA> sustentosConservadoresTA;

	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
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

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public List<DGM016SustentoConservadoresET> getSustentosConservadoresET() {
		return sustentosConservadoresET;
	}

	public void setSustentosConservadoresET(
			List<DGM016SustentoConservadoresET> sustentosConservadoresET) {
		this.sustentosConservadoresET = sustentosConservadoresET;
	}

	public List<DGM016SustentoConservadoresTA> getSustentosConservadoresTA() {
		return sustentosConservadoresTA;
	}

	public void setSustentosConservadoresTA(
			List<DGM016SustentoConservadoresTA> sustentosConservadoresTA) {
		this.sustentosConservadoresTA = sustentosConservadoresTA;
	}

	
	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
