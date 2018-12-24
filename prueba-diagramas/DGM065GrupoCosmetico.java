package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM065GrupoCosmetico {
	private Long dgm065Id;
	private Integer secuenciaGrupoCosmetico;
	private String tipoGrupoCosmetico;
	private String descripcion;

	public Long getDgm065Id() {
		return dgm065Id;
	}

	public void setDgm065Id(Long dgm065Id) {
		this.dgm065Id = dgm065Id;
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
