package pe.gob.mincetur.vuce.vc.domain.digemid;



public class DGM072Direccion  {

	private Long dgm072Id; 
	private Integer secuenciaDireccion; 
	private Integer dgmTipoEstablecimiento; 
	private String direccion; 
	private String numero; 
	private String interior; 
	private String urbanizacion; 
	private Integer distritoId; 
	private String email; 
	private String telefono; 

	public Long getDgm072Id() {
		return dgm072Id;
	}
	public void setDgm072Id(Long dgm072Id) {
		this.dgm072Id = dgm072Id;
	}
	public Integer getSecuenciaDireccion() {
		return secuenciaDireccion;
	}
	public void setSecuenciaDireccion(Integer secuenciaDireccion) {
		this.secuenciaDireccion = secuenciaDireccion;
	}
	public Integer getDgmTipoEstablecimiento() {
		return dgmTipoEstablecimiento;
	}
	public void setDgmTipoEstablecimiento(Integer dgmTipoEstablecimiento) {
		this.dgmTipoEstablecimiento = dgmTipoEstablecimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getInterior() {
		return interior;
	}
	public void setInterior(String interior) {
		this.interior = interior;
	}
	public String getUrbanizacion() {
		return urbanizacion;
	}
	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}
	public Integer getDistritoId() {
		return distritoId;
	}
	public void setDistritoId(Integer distritoId) {
		this.distritoId = distritoId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
