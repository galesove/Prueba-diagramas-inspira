package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM011Fabricante {

	private Long dgm011Id; 
	private Integer secuencia; 
	private String nombre;
	

	public Long getDgm011Id() {
		return dgm011Id;
	}
	public void setDgm011Id(Long dgm011Id) {
		this.dgm011Id = dgm011Id;
	}
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
