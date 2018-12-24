package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;

public class DGM007Diluyente {
	
	private Long dgm007Id; 
	private Long secuencia; 
	private String sustancia; 
	private BigDecimal sustanciaSal; 
	private BigDecimal sustanciaBase; 
	private String unidadMedida; 
	private String comentario;
	private String sustanciaDesc;
	
	public Long getDgm007Id() {
		return dgm007Id;
	}
	public void setDgm007Id(Long dgm007Id) {
		this.dgm007Id = dgm007Id;
	}
	public Long getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	public String getSustancia() {
		return sustancia;
	}
	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}
	public BigDecimal getSustanciaSal() {
		return sustanciaSal;
	}
	public void setSustanciaSal(BigDecimal sustanciaSal) {
		this.sustanciaSal = sustanciaSal;
	}
	public BigDecimal getSustanciaBase() {
		return sustanciaBase;
	}
	public void setSustanciaBase(BigDecimal sustanciaBase) {
		this.sustanciaBase = sustanciaBase;
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
	
	public String getSustanciaDesc() {
		return sustanciaDesc;
	}
	public void setSustanciaDesc(String sustanciaDesc) {
		this.sustanciaDesc = sustanciaDesc;
	}
	
}
