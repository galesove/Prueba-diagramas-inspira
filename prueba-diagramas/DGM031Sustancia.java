package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM031Sustancia {

	private Long dgm031Id; 
	private Integer secuencia; 
	private String sustancia; 
	private Double factor; 
	private Double concentracion; 
	private String unidadMedidaConcentracion; 
	private Double cantidadSolicitadaSustancia; 
	private Double equivalenciaBase;
	private String unidadMedidaSustancia;
	private String nombreSustanciaBase;

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
	public String getSustancia() {
		return sustancia;
	}
	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}
	public Double getFactor() {
		return factor;
	}
	public void setFactor(Double factor) {
		this.factor = factor;
	}
	public Double getConcentracion() {
		return concentracion;
	}
	public void setConcentracion(Double concentracion) {
		this.concentracion = concentracion;
	}
	public String getUnidadMedidaConcentracion() {
		return unidadMedidaConcentracion;
	}
	public void setUnidadMedidaConcentracion(String unidadMedidaConcentracion) {
		this.unidadMedidaConcentracion = unidadMedidaConcentracion;
	}
	public Double getCantidadSolicitadaSustancia() {
		return cantidadSolicitadaSustancia;
	}
	public void setCantidadSolicitadaSustancia(Double cantidadSolicitadaSustancia) {
		this.cantidadSolicitadaSustancia = cantidadSolicitadaSustancia;
	}
	public Double getEquivalenciaBase() {
		return equivalenciaBase;
	}
	public void setEquivalenciaBase(Double equivalenciaBase) {
		this.equivalenciaBase = equivalenciaBase;
	}
	public String getUnidadMedidaSustancia() {
		return unidadMedidaSustancia;
	}
	public void setUnidadMedidaSustancia(String unidadMedidaSustancia) {
		this.unidadMedidaSustancia = unidadMedidaSustancia;
	}
	
	public String getNombreSustanciaBase() {
		return nombreSustanciaBase;
	}
	public void setNombreSustanciaBase(String nombreSustanciaBase) {
		this.nombreSustanciaBase = nombreSustanciaBase;
	}
	public Boolean validateRequiredFields() {
		return 
		this.sustancia==null?false:
		this.cantidadSolicitadaSustancia==null?false:
		this.unidadMedidaSustancia==null?false:
		this.factor==null?false:
		this.unidadMedidaConcentracion==null?false:true;
	}
	
}
