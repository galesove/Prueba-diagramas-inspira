package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM017PresentacionMaterialInmediato {
	
	private Long dgm017Id;
	
	private Integer secuenciaPresentacion;
	
	private Integer secuenciaMatInmediato;
	
	private Integer material;

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
