package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM036PresentacionMaterialInmediato {
	
	private Long dgm036Id;
	
	private Integer secuenciaPresentacion;
	
	private Integer secuenciaMatInmediato;
	
	private Integer material;

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
	}

	public Long getDgm036Id() {
		return dgm036Id;
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
