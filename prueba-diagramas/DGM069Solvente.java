package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM069Solvente {

	private Integer dgm069Id;
	private Integer secSolvente;
	private String codigoSustancia;
	private BigDecimal cantidad;
	private String unidadMedida;
	private List<DGM069SustentoSolventesET> sustentosSolventeET;
	private List<DGM069SustentoSolventesTA> sustentosSolventeTA;
	private String comentario;

	public Integer getDgm069Id() {
		return dgm069Id;
	}

	public void setDgm069Id(Integer dgm069Id) {
		this.dgm069Id = dgm069Id;
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

	public List<DGM069SustentoSolventesET> getSustentosSolventeET() {
		return sustentosSolventeET;
	}

	public void setSustentosSolventeET(List<DGM069SustentoSolventesET> sustentosSolventeET) {
		this.sustentosSolventeET = sustentosSolventeET;
	}

	public List<DGM069SustentoSolventesTA> getSustentosSolventeTA() {
		return sustentosSolventeTA;
	}

	public void setSustentosSolventeTA(List<DGM069SustentoSolventesTA> sustentosSolventeTA) {
		this.sustentosSolventeTA = sustentosSolventeTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
