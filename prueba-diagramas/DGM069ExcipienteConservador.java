package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM069ExcipienteConservador {

	private Integer dgm069Id;
	private Integer secExcipienteConservador;
	private String codigoSustancia;
	private Double cantidad;
	private String unidadMedida;
	private String comentario;
	
	private List<DGM069SustentoConservadoresET> sustentosConservadoresET;
	private List<DGM069SustentoConservadoresTA> sustentosConservadoresTA;

	public Integer getDgm069Id() {
		return dgm069Id;
	}

	public void setDgm069Id(Integer dgm069Id) {
		this.dgm069Id = dgm069Id;
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
	public List<DGM069SustentoConservadoresET> getSustentosConservadoresET() {
		return sustentosConservadoresET;
	}

	public void setSustentosConservadoresET(
			List<DGM069SustentoConservadoresET> sustentosConservadoresET) {
		this.sustentosConservadoresET = sustentosConservadoresET;
	}

	public List<DGM069SustentoConservadoresTA> getSustentosConservadoresTA() {
		return sustentosConservadoresTA;
	}

	public void setSustentosConservadoresTA(
			List<DGM069SustentoConservadoresTA> sustentosConservadoresTA) {
		this.sustentosConservadoresTA = sustentosConservadoresTA;
	}
}
