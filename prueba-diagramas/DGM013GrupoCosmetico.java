package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM013GrupoCosmetico {

	private Long dgm013Id; 
	private Integer secuenciaGrupoCosmetico; 
	private String tipoGrupoCosmetico; 
	private String descripcion; 

	public Long getDgm013Id() {
		return dgm013Id;
	}
	public void setDgm013Id(Long dgm013Id) {
		this.dgm013Id = dgm013Id;
	}
	public Integer getSecuenciaGrupoCosmetico() {
		return secuenciaGrupoCosmetico;
	}
	public void setSecuenciaGrupoCosmetico(Integer secuenciaGrupoCosmetico) {
		this.secuenciaGrupoCosmetico = secuenciaGrupoCosmetico;
	}
	public String getTipoGrupoCosmetico() {
		return tipoGrupoCosmetico;
	}
	public void setTipoGrupoCosmetico(String tipoGrupoCosmetico) {
		this.tipoGrupoCosmetico = tipoGrupoCosmetico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
