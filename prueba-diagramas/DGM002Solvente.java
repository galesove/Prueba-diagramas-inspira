package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM002Solvente {

	private Integer dgm002Id;
	
	private Integer secuencia;
	
	private Integer secSolvente;
	
	private String codigoSustancia;
	
	private String otroSolvente;
	
	private BigDecimal cantidadSustanciaSal;
	
	private BigDecimal cantidadSustanciaEnBase;
	
	private String unidadMedida;
	
	private List<DGM002SustentoSolventesET> sustentosSolventeET;
	
	private List<DGM002SustentoSolventesTA> sustentosSolventeTA;
	
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

	public BigDecimal getCantidadSustanciaSal() {
		return cantidadSustanciaSal;
	}

	public void setCantidadSustanciaSal(BigDecimal cantidadSustanciaSal) {
		this.cantidadSustanciaSal = cantidadSustanciaSal;
	}

	public BigDecimal getCantidadSustanciaEnBase() {
		return cantidadSustanciaEnBase;
	}

	public void setCantidadSustanciaEnBase(BigDecimal cantidadSustanciaEnBase) {
		this.cantidadSustanciaEnBase = cantidadSustanciaEnBase;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public List<DGM002SustentoSolventesET> getSustentosSolventeET() {
		return sustentosSolventeET;
	}

	public void setSustentosSolventeET(
			List<DGM002SustentoSolventesET> sustentosSolventeET) {
		this.sustentosSolventeET = sustentosSolventeET;
	}

	public List<DGM002SustentoSolventesTA> getSustentosSolventeTA() {
		return sustentosSolventeTA;
	}

	public void setSustentosSolventeTA(
			List<DGM002SustentoSolventesTA> sustentosSolventeTA) {
		this.sustentosSolventeTA = sustentosSolventeTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
