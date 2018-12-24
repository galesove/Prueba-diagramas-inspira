package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016PresentacionMaterialInmediato {
	
	private Long dgm016Id;
	
	private Integer secuenciaPresentacion;
	
	private Integer secuenciaMatInmediato;
	
	private Integer material;

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
