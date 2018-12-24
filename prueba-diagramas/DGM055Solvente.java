package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM055Solvente {

	private Integer dgm055Id;
	private Integer secuencia;
	private Integer secSolvente;
	private String codigoSustancia;
	private String otroSolvente;
	private BigDecimal cantidad;
	private String unidadMedida;
	private List<DGM055SustentoSolventesET> sustentosSolventeET;
	private List<DGM055SustentoSolventesTA> sustentosSolventeTA;
	private String comentario;

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

	public Integer getSecSolvente() {
		return secSolvente;
	}

	public void setSecSolvente(Integer secSolvente) {
		this.secSolvente = secSolvente;
	}

	public String getCodigoSustancia() {
		return codigoSustancia;
	}

	public void setCodigoSustancia(String codigoSustancia) {
		this.codigoSustancia = codigoSustancia;
	}

	public String getOtroSolvente() {
		return otroSolvente;
	}

	public void setOtroSolvente(String otroSolvente) {
		this.otroSolvente = otroSolvente;
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

	public List<DGM055SustentoSolventesET> getSustentosSolventeET() {
		return sustentosSolventeET;
	}

	public void setSustentosSolventeET(List<DGM055SustentoSolventesET> sustentosSolventeET) {
		this.sustentosSolventeET = sustentosSolventeET;
	}

	public List<DGM055SustentoSolventesTA> getSustentosSolventeTA() {
		return sustentosSolventeTA;
	}

	public void setSustentosSolventeTA(List<DGM055SustentoSolventesTA> sustentosSolventeTA) {
		this.sustentosSolventeTA = sustentosSolventeTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
