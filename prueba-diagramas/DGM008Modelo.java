package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM008Modelo {

	private Long dgm008Id; 
	private Integer secuenciaModelo; 
	private String modeloProducto;
	private String nombreModeloProducto;
	
	public Long getDgm008Id() {
		return dgm008Id;
	}
	public void setDgm008Id(Long dgm008Id) {
		this.dgm008Id = dgm008Id;
	}
	public Integer getSecuenciaModelo() {
		return secuenciaModelo;
	}
	public void setSecuenciaModelo(Integer secuenciaModelo) {
		this.secuenciaModelo = secuenciaModelo;
	}
	public String getModeloProducto() {
		return modeloProducto;
	}
	public void setModeloProducto(String modeloProducto) {
		this.modeloProducto = modeloProducto;
	}
	public String getNombreModeloProducto() {
		return nombreModeloProducto;
	}
	public void setNombreModeloProducto(String nombreModeloProducto) {
		this.nombreModeloProducto = nombreModeloProducto;
	}
}