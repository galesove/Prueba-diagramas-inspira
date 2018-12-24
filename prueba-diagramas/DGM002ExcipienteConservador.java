package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM002ExcipienteConservador {

	private Integer dgm002Id;
	
	private Integer secuencia;
	
	private Integer secExcipienteConservador;
	
	private String codigoSustancia;
	
	private Double cantidad;
	
	private String unidadMedida;
	
	private List<DGM002SustentoConservadoresET> sustentosConservadoresET;
	
	private List<DGM002SustentoConservadoresTA> sustentosConservadoresTA;
	
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

	public List<DGM002SustentoConservadoresET> getSustentosConservadoresET() {
		return sustentosConservadoresET;
	}

	public void setSustentosConservadoresET(
			List<DGM002SustentoConservadoresET> sustentosConservadoresET) {
		this.sustentosConservadoresET = sustentosConservadoresET;
	}

	public List<DGM002SustentoConservadoresTA> getSustentosConservadoresTA() {
		return sustentosConservadoresTA;
	}

	public void setSustentosConservadoresTA(
			List<DGM002SustentoConservadoresTA> sustentosConservadoresTA) {
		this.sustentosConservadoresTA = sustentosConservadoresTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
