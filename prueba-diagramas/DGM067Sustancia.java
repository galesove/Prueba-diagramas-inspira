package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM067Sustancia {

	private Long dgm067Id;
	
	private Integer secuencia;
	
	private String sustancia;
	
	private Double factor;
	
	private Double concentracion;
	
	private Double cantidadSolicitadaSustancia;
	
	private String nombreSustanciaBase;
	
	public Long getDgm067Id() {
		return dgm067Id;
	}

	public void setDgm067Id(Long dgm067Id) {
		this.dgm067Id = dgm067Id;
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

	public Double getCantidadSolicitadaSustancia() {
		return cantidadSolicitadaSustancia;
	}

	public void setCantidadSolicitadaSustancia(Double cantidadSolicitadaSustancia) {
		this.cantidadSolicitadaSustancia = cantidadSolicitadaSustancia;
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
		this.factor==null?false:true;
	}
	
}
