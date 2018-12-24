package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM017PresentacionColorInmediato {
	
	private Long dgm017Id;
	private Integer secuenciaPresentacion;
	private Integer secuenciaColorInmediato;
	private Integer color;
	
	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
	}
	public Long getDgm017Id() {
		return dgm017Id;
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
