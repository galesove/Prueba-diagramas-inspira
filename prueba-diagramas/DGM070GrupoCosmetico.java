package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;
import java.util.List;

public class DGM070GrupoCosmetico {	
	private Long            dgm070Id;
	private Integer         secuenciaGrupoCosmetico;
	private String          tipoGrupoCosmetico;
	private String          descripcion;
	
	public Long getDgm070Id() {
		return dgm070Id;
	}
	public void setDgm070Id(Long dgm070Id) {
		this.dgm070Id = dgm070Id;
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
