package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035PresentacionColorInmediato {
	
	private Long dgm035Id;
	private Integer secuenciaPresentacion;
	private Integer secuenciaColorInmediato;
	private Integer color;
	
	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}
	public Long getDgm035Id() {
		return dgm035Id;
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
