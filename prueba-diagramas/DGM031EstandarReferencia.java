package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;


public class DGM031EstandarReferencia {

	private Long dgm031Id; 
	private Integer secuencia; 
	private String estandarReferencia; 
	private BigDecimal cantidadSolicitada; 
	private BigDecimal equivalenciaBase; 
	private String unidadMedida;
	private String codigoSustancia;
	
	public Long getDgm031Id() {
		return dgm031Id;
	}
	public void setDgm031Id(Long dgm031Id) {
		this.dgm031Id = dgm031Id;
	}
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public String getEstandarReferencia() {
		return estandarReferencia;
	}
	public void setEstandarReferencia(String estandarReferencia) {
		this.estandarReferencia = estandarReferencia;
	}
	public BigDecimal getCantidadSolicitada() {
		return cantidadSolicitada;
	}
	public void setCantidadSolicitada(BigDecimal cantidadSolicitada) {
		this.cantidadSolicitada = cantidadSolicitada;
	}

	public BigDecimal getEquivalenciaBase() {
		return equivalenciaBase;
	}
	public void setEquivalenciaBase(BigDecimal equivalenciaBase) {
		this.equivalenciaBase = equivalenciaBase;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public String getCodigoSustancia() {
		return codigoSustancia;
	}
	public void setCodigoSustancia(String codigoSustancia) {
		this.codigoSustancia = codigoSustancia;
	}
}
