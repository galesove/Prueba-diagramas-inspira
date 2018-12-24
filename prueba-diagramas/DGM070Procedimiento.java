package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM070Procedimiento {	
	private Long            dgm070Id;
	private Integer         secuenciaProcedimiento;
	private Long            tupaId;
	private String          tupa;
	private String          tipoTramite;
	
	public Long getDgm070Id() {
		return dgm070Id;
	}
	public void setDgm070Id(Long dgm070Id) {
		this.dgm070Id = dgm070Id;
	}
	public Integer getSecuenciaProcedimiento() {
		return secuenciaProcedimiento;
	}
	public void setSecuenciaProcedimiento(Integer secuenciaProcedimiento) {
		this.secuenciaProcedimiento = secuenciaProcedimiento;
	}
	public Long getTupaId() {
		return tupaId;
	}
	public void setTupaId(Long tupaId) {
		this.tupaId = tupaId;
	}
	public String getTipoTramite() {
		return tipoTramite;
	}
	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}
	public String getTupa() {
		return tupa;
	}
	public void setTupa(String tupa) {
		this.tupa = tupa;
	}
	
}
