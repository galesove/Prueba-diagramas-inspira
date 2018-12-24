package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM031Presentacion {

	private Long dgm031Id; 
	private Integer secuencia; 
	private String descripcion; 
	private String recipiente; 
	private Long cantidadRecipiente;
	private Double volumen;
	private String unidadMedidaVolumen; 
	private Long cantidadSolicitada;
	private String formaFarmaceutica;

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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getRecipiente() {
		return recipiente;
	}
	public void setRecipiente(String recipiente) {
		this.recipiente = recipiente;
	}
	public Long getCantidadRecipiente() {
		return cantidadRecipiente;
	}
	public void setCantidadRecipiente(Long cantidadRecipiente) {
		this.cantidadRecipiente = cantidadRecipiente;
	}
	public String getUnidadMedidaVolumen() {
		return unidadMedidaVolumen;
	}
	public void setUnidadMedidaVolumen(String unidadMedidaVolumen) {
		this.unidadMedidaVolumen = unidadMedidaVolumen;
	}
	public Long getCantidadSolicitada() {
		return cantidadSolicitada;
	}
	public void setCantidadSolicitada(Long cantidadSolicitada) {
		this.cantidadSolicitada = cantidadSolicitada;
	}
	public Double getVolumen() {
		return volumen;
	}
	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}
	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}
	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}
	
}
