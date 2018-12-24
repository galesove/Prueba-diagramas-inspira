package pe.gob.mincetur.vuce.vc.domain.digemid;



public class DGM072Profesional  {

	private Long dgm072Id; 
	private Integer secuenciaProfesional; 
	private String accionPersonalDgm; 
	private String cargo; 
	private String nombre; 
	private String apellidoPaterno; 
	private String apellidoMaterno; 
	private String cqfp; 

	public Long getDgm072Id() {
		return dgm072Id;
	}
	public void setDgm072Id(Long dgm072Id) {
		this.dgm072Id = dgm072Id;
	}
	public Integer getSecuenciaProfesional() {
		return secuenciaProfesional;
	}
	public void setSecuenciaProfesional(Integer secuenciaProfesional) {
		this.secuenciaProfesional = secuenciaProfesional;
	}
	public String getAccionPersonalDgm() {
		return accionPersonalDgm;
	}
	public void setAccionPersonalDgm(String accionPersonalDgm) {
		this.accionPersonalDgm = accionPersonalDgm;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCqfp() {
		return cqfp;
	}
	public void setCqfp(String cqfp) {
		this.cqfp = cqfp;
	}
	
}
