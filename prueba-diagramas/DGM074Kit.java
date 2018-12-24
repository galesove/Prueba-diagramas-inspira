package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;



public class DGM074Kit  {

	private Long dgm074Id; 
	private Integer secuenciaKit; 
	private String kitCodigo; 
	private String formaPresentacion; 
	
	private List<DGM074KitProducto> productos = new ArrayList<DGM074KitProducto>();
	private List<DGM074KitFormaPresentacion> envases = new ArrayList<DGM074KitFormaPresentacion>();

	public Long getDgm074Id() {
		return dgm074Id;
	}
	public void setDgm074Id(Long dgm074Id) {
		this.dgm074Id = dgm074Id;
	}
	public Integer getSecuenciaKit() {
		return secuenciaKit;
	}
	public void setSecuenciaKit(Integer secuenciaKit) {
		this.secuenciaKit = secuenciaKit;
	}
	public String getKitCodigo() {
		return kitCodigo;
	}
	public void setKitCodigo(String kitCodigo) {
		this.kitCodigo = kitCodigo;
	}
	public String getFormaPresentacion() {
		return formaPresentacion;
	}
	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}
	public List<DGM074KitProducto> getProductos() {
		return productos;
	}
	public void setProductos(List<DGM074KitProducto> productos) {
		this.productos = productos;
	}
	public List<DGM074KitFormaPresentacion> getEnvases() {
		return envases;
	}
	public void setEnvases(List<DGM074KitFormaPresentacion> envases) {
		this.envases = envases;
	}
}
