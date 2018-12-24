package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM046 {

	private Long dgm046Id; 
	private Long ordenId; 
	private Integer mto; 
	private String codigoEstablecimiento; 
	private String categoriaEstablecimiento; 
	private String direccionEstablecimiento; 
	private String representanteLegal; 
	private String codigoRegente; 
	private String cargoRegente; 
	private String idDireccionEstablecimiento;
	//private Long tupaIdAModificar;
	private String cambioLicenciante;
	private String cambioRazonSocialLic;
	
	private List<DGM046Detalle> dgm046detalles = new ArrayList<DGM046Detalle>();

	public Long getDgm046Id() {
		return dgm046Id;
	}
	public void setDgm046Id(Long dgm046Id) {
		this.dgm046Id = dgm046Id;
	}
	public Long getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(Long ordenId) {
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
	public List<DGM046Detalle> getDgm046detalles() {
		return this.dgm046detalles;
	}
	public void setDgm046detalles (List<DGM046Detalle> dgm046detalles) {
		this.dgm046detalles = dgm046detalles;
	}
	public void addDgm046detalles (DGM046Detalle dgm046detalle) {
		this.dgm046detalles.add(dgm046detalle);
	}
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	/*public Long getTupaIdAModificar() {
		return tupaIdAModificar;
	}
	public void setTupaIdAModificar(Long tupaIdAModificar) {
		this.tupaIdAModificar = tupaIdAModificar;
	}*/
	public String getCambioLicenciante() {
		return cambioLicenciante;
	}
	public void setCambioLicenciante(String cambioLicenciante) {
		this.cambioLicenciante = cambioLicenciante;
	}
	public String getCambioRazonSocialLic() {
		return cambioRazonSocialLic;
	}
	public void setCambioRazonSocialLic(String cambioRazonSocialLic) {
		this.cambioRazonSocialLic = cambioRazonSocialLic;
	}


}
