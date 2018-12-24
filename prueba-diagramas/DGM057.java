package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;


public class DGM057 {

	private Long            dgm057Id;
	private Long            ordenId;
	private Integer         mto;
	private String          codigoEstablecimiento;
	private String          categoriaEstablecimiento;
	private String          direccionEstablecimiento;
	private String          idDireccionEstablecimiento;
	private String          representanteLegal;
	private String          codigoRegente;
	private String          cargoRegente;
	private String          establecimientoFarmTelefono;
	private String          establecimientoFarmEmail;
	private String          esModifRazonSocial;
	private String          esModifFabricante;
	private String          razonSocialAnterior;
	private String          razonSocialNuevo;
	private String          fabricanteActualOrigen;
	private String          fabricanteActualNombre;
	private String          fabricanteActualNacional;
	private String          fabricanteActualExtranjero;
	private String          fabricanteActualDireccion;
	private Integer         fabricanteActualDistritoId;
	private String          fabricanteActualPais;
	private String          fabricanteActualPara;
	private String          fabricanteNuevoOrigen;
	private String          fabricanteNuevoNombre;
	private String          fabricanteNuevoNacional;
	private String          fabricanteNuevoExtranjero;
	private String          fabricanteNuevoDireccion;
	private Integer         fabricanteNuevoDistritoId;
	private String          fabricanteNuevoPais;
	private String          fabricanteNuevoPara;
	
	private List<DGM057Producto> dgm057productos = new ArrayList<DGM057Producto>(); 
	
	
	public Long getDgm057Id() {
		return dgm057Id;
	}
	public void setDgm057Id(Long dgm057Id) {
		this.dgm057Id = dgm057Id;
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
	public String getEstablecimientoFarmTelefono() {
		return establecimientoFarmTelefono;
	}
	public void setEstablecimientoFarmTelefono(String establecimientoFarmTelefono) {
		this.establecimientoFarmTelefono = establecimientoFarmTelefono;
	}
	public String getEstablecimientoFarmEmail() {
		return establecimientoFarmEmail;
	}
	public void setEstablecimientoFarmEmail(String establecimientoFarmEmail) {
		this.establecimientoFarmEmail = establecimientoFarmEmail;
	}
	public String getEsModifRazonSocial() {
		return esModifRazonSocial;
	}
	public void setEsModifRazonSocial(String esModifRazonSocial) {
		this.esModifRazonSocial = esModifRazonSocial;
	}
	public String getEsModifFabricante() {
		return esModifFabricante;
	}
	public void setEsModifFabricante(String esModifFabricante) {
		this.esModifFabricante = esModifFabricante;
	}
	public String getRazonSocialAnterior() {
		return razonSocialAnterior;
	}
	public void setRazonSocialAnterior(String razonSocialAnterior) {
		this.razonSocialAnterior = razonSocialAnterior;
	}
	public String getRazonSocialNuevo() {
		return razonSocialNuevo;
	}
	public void setRazonSocialNuevo(String razonSocialNuevo) {
		this.razonSocialNuevo = razonSocialNuevo;
	}
	public String getFabricanteActualOrigen() {
		return fabricanteActualOrigen;
	}
	public void setFabricanteActualOrigen(String fabricanteActualOrigen) {
		this.fabricanteActualOrigen = fabricanteActualOrigen;
	}
	public String getFabricanteActualNombre() {
		return fabricanteActualNombre;
	}
	public void setFabricanteActualNombre(String fabricanteActualNombre) {
		this.fabricanteActualNombre = fabricanteActualNombre;
	}
	public String getFabricanteActualNacional() {
		return fabricanteActualNacional;
	}
	public void setFabricanteActualNacional(String fabricanteActualNacional) {
		this.fabricanteActualNacional = fabricanteActualNacional;
	}
	public String getFabricanteActualExtranjero() {
		return fabricanteActualExtranjero;
	}
	public void setFabricanteActualExtranjero(String fabricanteActualExtranjero) {
		this.fabricanteActualExtranjero = fabricanteActualExtranjero;
	}
	public String getFabricanteActualDireccion() {
		return fabricanteActualDireccion;
	}
	public void setFabricanteActualDireccion(String fabricanteActualDireccion) {
		this.fabricanteActualDireccion = fabricanteActualDireccion;
	}

	public String getFabricanteActualPais() {
		return fabricanteActualPais;
	}
	public void setFabricanteActualPais(String fabricanteActualPais) {
		this.fabricanteActualPais = fabricanteActualPais;
	}
	public String getFabricanteNuevoOrigen() {
		return fabricanteNuevoOrigen;
	}
	public void setFabricanteNuevoOrigen(String fabricanteNuevoOrigen) {
		this.fabricanteNuevoOrigen = fabricanteNuevoOrigen;
	}
	public String getFabricanteNuevoNombre() {
		return fabricanteNuevoNombre;
	}
	public void setFabricanteNuevoNombre(String fabricanteNuevoNombre) {
		this.fabricanteNuevoNombre = fabricanteNuevoNombre;
	}
	public String getFabricanteNuevoNacional() {
		return fabricanteNuevoNacional;
	}
	public void setFabricanteNuevoNacional(String fabricanteNuevoNacional) {
		this.fabricanteNuevoNacional = fabricanteNuevoNacional;
	}
	public String getFabricanteNuevoExtranjero() {
		return fabricanteNuevoExtranjero;
	}
	public void setFabricanteNuevoExtranjero(String fabricanteNuevoExtranjero) {
		this.fabricanteNuevoExtranjero = fabricanteNuevoExtranjero;
	}
	public String getFabricanteNuevoDireccion() {
		return fabricanteNuevoDireccion;
	}
	public void setFabricanteNuevoDireccion(String fabricanteNuevoDireccion) {
		this.fabricanteNuevoDireccion = fabricanteNuevoDireccion;
	}

	public String getFabricanteNuevoPais() {
		return fabricanteNuevoPais;
	}
	public void setFabricanteNuevoPais(String fabricanteNuevoPais) {
		this.fabricanteNuevoPais = fabricanteNuevoPais;
	}

	public Integer getFabricanteActualDistritoId() {
		return fabricanteActualDistritoId;
	}
	public void setFabricanteActualDistritoId(Integer fabricanteActualDistritoId) {
		this.fabricanteActualDistritoId = fabricanteActualDistritoId;
	}
	public Integer getFabricanteNuevoDistritoId() {
		return fabricanteNuevoDistritoId;
	}
	public void setFabricanteNuevoDistritoId(Integer fabricanteNuevoDistritoId) {
		this.fabricanteNuevoDistritoId = fabricanteNuevoDistritoId;
	}
	
	public String getFabricanteActualPara() {
		return fabricanteActualPara;
	}
	public void setFabricanteActualPara(String fabricanteActualPara) {
		this.fabricanteActualPara = fabricanteActualPara;
	}
	public String getFabricanteNuevoPara() {
		return fabricanteNuevoPara;
	}
	public void setFabricanteNuevoPara(String fabricanteNuevoPara) {
		this.fabricanteNuevoPara = fabricanteNuevoPara;
	}
	public Boolean validateRequiredFields(){
		return 
		this.codigoEstablecimiento==null?false:
		this.categoriaEstablecimiento==null?false:
		this.direccionEstablecimiento==null?false:
		this.idDireccionEstablecimiento==null?false:
		this.codigoRegente==null?false:
		this.cargoRegente==null?false:
		this.esModifRazonSocial==null?false:
		this.esModifFabricante==null?false:
		this.razonSocialNuevo==null?false:
		this.fabricanteActualOrigen==null?false:
		this.fabricanteActualNombre==null?false:
		this.fabricanteActualNacional==null?false:
		this.fabricanteActualExtranjero==null?false:
		this.fabricanteActualDireccion==null?false:
		this.fabricanteActualDistritoId==null?false:
		this.fabricanteActualPais==null?false:
		this.fabricanteNuevoOrigen==null?false:
		this.fabricanteNuevoNombre==null?false:
		this.fabricanteNuevoNacional==null?false:
		this.fabricanteNuevoExtranjero==null?false:
		this.fabricanteNuevoDireccion==null?false:
		this.fabricanteNuevoDistritoId==null?false:
		this.fabricanteNuevoPais==null?false:
		true;
	}
	
	public List<DGM057Producto> getDgm057productos() {
		return dgm057productos;
	}
	public void setDgm057productos(List<DGM057Producto> dgm057productos) {
		this.dgm057productos = dgm057productos;
	}
}
