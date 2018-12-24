package pe.gob.mincetur.vuce.vc.domain.digemid;



public class DGM072HorarioAtencion  {

	private Long dgm072Id; 
	private Integer secuenciaHorario; 
	private Integer tipoHorarioDgm; 
	private String cargo; 
	private Integer diaInicio; 
	private Integer diaFin; 
	private String horaInicio; 
	private String horaDescanso; 
	private String horaFinDescanso; 
	private String horaFin; 

	public Long getDgm072Id() {
		return dgm072Id;
	}
	public void setDgm072Id(Long dgm072Id) {
		this.dgm072Id = dgm072Id;
	}
	public Integer getSecuenciaHorario() {
		return secuenciaHorario;
	}
	public void setSecuenciaHorario(Integer secuenciaHorario) {
		this.secuenciaHorario = secuenciaHorario;
	}
	public Integer getTipoHorarioDgm() {
		return tipoHorarioDgm;
	}
	public void setTipoHorarioDgm(Integer tipoHorarioDgm) {
		this.tipoHorarioDgm = tipoHorarioDgm;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Integer getDiaInicio() {
		return diaInicio;
	}
	public void setDiaInicio(Integer diaInicio) {
		this.diaInicio = diaInicio;
	}
	public Integer getDiaFin() {
		return diaFin;
	}
	public void setDiaFin(Integer diaFin) {
		this.diaFin = diaFin;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraDescanso() {
		return horaDescanso;
	}
	public void setHoraDescanso(String horaDescanso) {
		this.horaDescanso = horaDescanso;
	}
	public String getHoraFinDescanso() {
		return horaFinDescanso;
	}
	public void setHoraFinDescanso(String horaFinDescanso) {
		this.horaFinDescanso = horaFinDescanso;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	
}
