package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM007PresentacionEnvaseInmediatoMaterial {

	private Long dgm007Id; 
	private Long secuenciaPresentacion; 
	private Long secuencia; 
	private Integer materialInmediato; 

	public Long getDgm007Id() {
		return dgm007Id;
	}
	public void setDgm007Id(Long dgm007Id) {
		this.dgm007Id = dgm007Id;
	}
	public Long getSecuenciaPresentacion() {
		return secuenciaPresentacion;
	}
	public void setSecuenciaPresentacion(Long secuenciaPresentacion) {
		this.secuenciaPresentacion = secuenciaPresentacion;
	}
	public Long getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	public Integer getMaterialInmediato() {
		return materialInmediato;
	}
	public void setMaterialInmediato(Integer materialInmediato) {
		this.materialInmediato = materialInmediato;
	}
}
