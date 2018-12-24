package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM049Detalle {

	private Long dgm049Id;
	private Long secuenciaDetalle;
	private Long drIdOrigen; 
	private Long sdrOrigen;
	private String nroRegistroSanitarioOrigen; 
	private String nroResolucionOrigen; 
	private String nombreProducto; 
	private String nombreAcondicionadora;
	private String origenFabricanteOld; 
	private String codigoFabricanteOld; 
	private String nombreFabricanteOld;
	private String origenFabricanteNew;
	private String nombreFabricanteNew;
	private String codigoFabricanteNew;
	private String esAcondicionadora;
	private String origenAcondicionadoraOld;
	private String codigoAcondicionadoraOld;
	private String nombreAcondicionadoraOld;
	private String origenAcondicionadoraNew;
	private String codigoAcondicionadoraNew;
	private String nombreAcondicionadoraNew;
	
	private String          paisFabricanteOld;
	private String          paisFabricanteNew;
	private String          paisAcondicionadoraOld;
	private String          paisAcondicionadoraNew;
	
	private String grupoProducto;
	private String grupoProductoDesc;
	private String direccionFabricanteOld;
	private String direccionFabricanteNew;

	public String getDireccionFabricanteOld() {
		return direccionFabricanteOld;
	}
	public void setDireccionFabricanteOld(String direccionFabricanteOld) {
		this.direccionFabricanteOld = direccionFabricanteOld;
	}
	public String getDireccionFabricanteNew() {
		return direccionFabricanteNew;
	}
	public void setDireccionFabricanteNew(String direccionFabricanteNew) {
		this.direccionFabricanteNew = direccionFabricanteNew;
	}
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public String getPaisFabricanteOld() {
		return paisFabricanteOld;
	}
	public void setPaisFabricanteOld(String paisFabricanteOld) {
		this.paisFabricanteOld = paisFabricanteOld;
	}
	public String getPaisFabricanteNew() {
		return paisFabricanteNew;
	}
	public void setPaisFabricanteNew(String paisFabricanteNew) {
		this.paisFabricanteNew = paisFabricanteNew;
	}
	public String getPaisAcondicionadoraOld() {
		return paisAcondicionadoraOld;
	}
	public void setPaisAcondicionadoraOld(String paisAcondicionadoraOld) {
		this.paisAcondicionadoraOld = paisAcondicionadoraOld;
	}
	public String getPaisAcondicionadoraNew() {
		return paisAcondicionadoraNew;
	}
	public void setPaisAcondicionadoraNew(String paisAcondicionadoraNew) {
		this.paisAcondicionadoraNew = paisAcondicionadoraNew;
	}
	public Long getDrIdOrigen() {
		return drIdOrigen;
	}
	public void setDrIdOrigen(Long drIdOrigen) {
		this.drIdOrigen = drIdOrigen;
	}
	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}
	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}
	public String getNroResolucionOrigen() {
		return nroResolucionOrigen;
	}
	public void setNroResolucionOrigen(String nroResolucionOrigen) {
		this.nroResolucionOrigen = nroResolucionOrigen;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getOrigenFabricante() {
		return origenFabricanteOld;
	}
	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricanteOld = origenFabricante;
	}
	public String getOrigenFabricanteOld() {
		return origenFabricanteOld;
	}
	public void setOrigenFabricanteOld(String origenFabricanteOld) {
		this.origenFabricanteOld = origenFabricanteOld;
	}
	public String getOrigenFabricanteNew() {
		return origenFabricanteNew;
	}
	public void setOrigenFabricanteNew(String origenFabricanteNew) {
		this.origenFabricanteNew = origenFabricanteNew;
	}
	public String getOrigenAcondicionadoraOld() {
		return origenAcondicionadoraOld;
	}
	public void setOrigenAcondicionadoraOld(String origenAcondicionadoraOld) {
		this.origenAcondicionadoraOld = origenAcondicionadoraOld;
	}
	public String getNombreAcondicionadora() {
		return nombreAcondicionadora;
	}
	public void setNombreAcondicionadora(String nombreAcondicionadora) {
		this.nombreAcondicionadora = nombreAcondicionadora;
	}
	public void setDgm049Id(Long dgm049Id) {
		this.dgm049Id = dgm049Id;
	}
	public Long getDgm049Id() {
		return dgm049Id;
	}
	public void setSecuenciaDetalle(Long secuenciaDetalle) {
		this.secuenciaDetalle = secuenciaDetalle;
	}
	public Long getSecuenciaDetalle() {
		return secuenciaDetalle;
	}
	public void setSdrOrigen(Long sdrOrigen) {
		this.sdrOrigen = sdrOrigen;
	}
	public Long getSdrOrigen() {
		return sdrOrigen;
	}
	public void setCodigoFabricanteOld(String codigoFabricanteOld) {
		this.codigoFabricanteOld = codigoFabricanteOld;
	}
	public String getCodigoFabricanteOld() {
		return codigoFabricanteOld;
	}
	public void setNombreFabricanteOld(String nombreFabricanteOld) {
		this.nombreFabricanteOld = nombreFabricanteOld;
	}
	public String getNombreFabricanteOld() {
		return nombreFabricanteOld;
	}
	public void setNombreFabricanteNew(String nombreFabricanteNew) {
		this.nombreFabricanteNew = nombreFabricanteNew;
	}
	public String getNombreFabricanteNew() {
		return nombreFabricanteNew;
	}
	public void setCodigoFabricanteNew(String codigoFabricanteNew) {
		this.codigoFabricanteNew = codigoFabricanteNew;
	}
	public String getCodigoFabricanteNew() {
		return codigoFabricanteNew;
	}
	public void setEsAcondicionadora(String esAcondicionadora) {
		this.esAcondicionadora = esAcondicionadora;
	}
	public String getEsAcondicionadora() {
		return esAcondicionadora;
	}
	public void setCodigoAcondicionadoraOld(String codigoAcondicionadoraOld) {
		this.codigoAcondicionadoraOld = codigoAcondicionadoraOld;
	}
	public String getCodigoAcondicionadoraOld() {
		return codigoAcondicionadoraOld;
	}
	public void setNombreAcondicionadoraOld(String nombreAcondicionadoraOld) {
		this.nombreAcondicionadoraOld = nombreAcondicionadoraOld;
	}
	public String getNombreAcondicionadoraOld() {
		return nombreAcondicionadoraOld;
	}
	public String getOrigenAcondicionadoraNew() {
		return origenAcondicionadoraNew;
	}
	public void setOrigenAcondicionadoraNew(String origenAcondicionadoraNew) {
		this.origenAcondicionadoraNew = origenAcondicionadoraNew;
	}
	public void setCodigoAcondicionadoraNew(String codigoAcondicionadoraNew) {
		this.codigoAcondicionadoraNew = codigoAcondicionadoraNew;
	}
	public String getCodigoAcondicionadoraNew() {
		return codigoAcondicionadoraNew;
	}
	public void setNombreAcondicionadoraNew(String nombreAcondicionadoraNew) {
		this.nombreAcondicionadoraNew = nombreAcondicionadoraNew;
	}
	public String getNombreAcondicionadoraNew() {
		return nombreAcondicionadoraNew;
	}
	public String getGrupoProductoDesc() {
		return grupoProductoDesc;
	}
	public void setGrupoProductoDesc(String grupoProductoDesc) {
		this.grupoProductoDesc = grupoProductoDesc;
	}
	
}