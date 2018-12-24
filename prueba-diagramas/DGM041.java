package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM041 {

	private Integer dgm041Id;
	private Integer ordenId;
	private Integer mto;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String direccionEstablecimiento;
	private String idDireccionEstablecimiento;
	private String representanteLegal;
	private String codigoRegente;
	private String cargoRegente;
	private String nroRegistroSanitarioOrigen;
	private String nombreProducto;
	private String grupoProducto;
	private String grupoProductoDesc;
	//private Integer tupaIdModificado;
	private String expedienteReinscripcion;
	private Integer dgmIndOrigenRs;
    
	private List<DGM041EnvaseInmediato> dgm041envaseinmediatos = new ArrayList<DGM041EnvaseInmediato>();

	private List<DGM041EnvaseMediato> dgm041envasemediatos = new ArrayList<DGM041EnvaseMediato>();

	public Integer getDgm041Id() {
		return dgm041Id;
	}

	public void setDgm041Id(Integer dgm041Id) {
		this.dgm041Id = dgm041Id;
	}

	public Integer getOrdenId() {
		return ordenId;
	}

	public void setOrdenId(Integer ordenId) {
		this.ordenId = ordenId;
	}

	public Integer getMto() {
		return mto;
	}

	public void setMto(Integer mto) {
		this.mto = mto;
	}

	public String getCodigoEstablecimiento() {
		return codigoEstablecimiento;
	}

	public void setCodigoEstablecimiento(String codigoEstablecimiento) {
		this.codigoEstablecimiento = codigoEstablecimiento;
	}

	public String getCategoriaEstablecimiento() {
		return categoriaEstablecimiento;
	}

	public void setCategoriaEstablecimiento(String categoriaEstablecimiento) {
		this.categoriaEstablecimiento = categoriaEstablecimiento;
	}

	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}

	public void setDireccionEstablecimiento(String direccionEstablecimiento) {
		this.direccionEstablecimiento = direccionEstablecimiento;
	}

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}

	public String getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public String getCodigoRegente() {
		return codigoRegente;
	}

	public void setCodigoRegente(String codigoRegente) {
		this.codigoRegente = codigoRegente;
	}

	public String getCargoRegente() {
		return cargoRegente;
	}

	public void setCargoRegente(String cargoRegente) {
		this.cargoRegente = cargoRegente;
	}

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}

	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public List<DGM041EnvaseInmediato> getDgm041envaseinmediatos() {
		return this.dgm041envaseinmediatos;
	}

	public void setDgm041envaseinmediatos(
			List<DGM041EnvaseInmediato> dgm041envaseinmediatos) {
		this.dgm041envaseinmediatos = dgm041envaseinmediatos;
	}

	public void addDgm041envaseinmediatos(
			DGM041EnvaseInmediato dgm041envaseinmediato) {
		this.dgm041envaseinmediatos.add(dgm041envaseinmediato);
	}

	public List<DGM041EnvaseMediato> getDgm041envasemediatos() {
		return this.dgm041envasemediatos;
	}

	public void setDgm041envasemediatos(List<DGM041EnvaseMediato> dgm041envasemediatos) {
		this.dgm041envasemediatos = dgm041envasemediatos;
	}

	public void addDgm041envasemediatos(DGM041EnvaseMediato dgm041envasemediato) {
		this.dgm041envasemediatos.add(dgm041envasemediato);
	}

	public String getGrupoProducto() {
		return grupoProducto;
	}

	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}

	public String getGrupoProductoDesc() {
		return grupoProductoDesc;
	}

	public void setGrupoProductoDesc(String grupoProductoDesc) {
		this.grupoProductoDesc = grupoProductoDesc;
	}

	public String getExpedienteReinscripcion() {
		return expedienteReinscripcion;
	}

	public void setExpedienteReinscripcion(String expedienteReinscripcion) {
		this.expedienteReinscripcion = expedienteReinscripcion;
	}

	public Integer getDgmIndOrigenRs() {
		return dgmIndOrigenRs;
	}

	public void setDgmIndOrigenRs(Integer dgmIndOrigenRs) {
		this.dgmIndOrigenRs = dgmIndOrigenRs;
	}
	
	/*public Integer getTupaIdModificado() {
		return tupaIdModificado;
	}

	public void setTupaIdModificado(Integer tupaIdModificado) {
		this.tupaIdModificado = tupaIdModificado;
	}*/

}
