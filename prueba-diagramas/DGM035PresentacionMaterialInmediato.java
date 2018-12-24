package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035PresentacionMaterialInmediato {
	
	private Long dgm035Id;
	
	private Integer secuenciaPresentacion;
	
	private Integer secuenciaMatInmediato;
	
	private Integer material;

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

	public void setSecuenciaMatInmediato(Integer secuenciaMatInmediato) {
		this.secuenciaMatInmediato = secuenciaMatInmediato;
	}

	public Integer getSecuenciaMatInmediato() {
		return secuenciaMatInmediato;
	}

	public void setMaterial(Integer material) {
		this.material = material;
	}

	public Integer getMaterial() {
		return material;
	}

}
