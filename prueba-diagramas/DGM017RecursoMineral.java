package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM017RecursoMineral {

	private Long dgm017Id;
	private Integer secuenciaMineral;
	private String nombre;
	
	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
	}

	public void setSecuenciaMineral(Integer secuenciaMineral) {
		this.secuenciaMineral = secuenciaMineral;
	}

	public Integer getSecuenciaMineral() {
		return secuenciaMineral;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

}
