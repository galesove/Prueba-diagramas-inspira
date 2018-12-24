package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016PresentacionColorInmediato {
	
	private Long dgm016Id;
	private Integer secuenciaPresentacion;
	private Integer secuenciaColorInmediato;
	private Integer color;
	
	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}
	public Long getDgm016Id() {
		return dgm016Id;
	}
	public void setSecuenciaPresentacion(Integer secuenciaPresentacion) {
		this.secuenciaPresentacion = secuenciaPresentacion;
	}
	public Integer getSecuenciaPresentacion() {
		return secuenciaPresentacion;
	}
	public void setSecuenciaColorInmediato(Integer secuenciaColorInmediato) {
		this.secuenciaColorInmediato = secuenciaColorInmediato;
	}
	public Integer getSecuenciaColorInmediato() {
		return secuenciaColorInmediato;
	}
	public void setColor(Integer color) {
		this.color = color;
	}
	public Integer getColor() {
		return color;
	}

}
