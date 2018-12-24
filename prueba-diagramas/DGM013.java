package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM013 {

	private Long dgm013Id;
	private Long ordenId;
	private Integer mto;
	private String codigoEstablecimiento;
	private String categoriaEstablecimiento;
	private String direccionEstablecimiento;
	private String idDireccionEstablecimiento;
	private String codigoRegente;
	private String cargoRegente;
	private String representanteLegal;
	private Integer dgmTipoTramite; 
	private String          nsoOrigen;
	private String nombreProducto; 
	private String formaCosmetica; 
	private String marcaProducto; 
	private Long partidaArancelaria; 
	private String codigoDetallePartida; 
	private String          establecimientoFarmTelefono;
	private String          establecimientoFarmEmail;
	private Date            fechaVigenciaNso;
	private String          paicodigo;
	private String          origenProducto;
	private String          nroExpedienteOrigen;
	private Date            fechaVigenciaNsoOrigen;
	private String          grupoProducto;
	private String 	formaCosmeticaTexto;
	private String          nso;
	private String motivoCambio;
	
	private List<DGM013Variedad> dgm013variedades = new ArrayList<DGM013Variedad>();
	private List<DGM013Fabricante> dgm013fabricantes = new ArrayList<DGM013Fabricante>();
	private List<DGM013Marca> dgm013marcas = new ArrayList<DGM013Marca>();
	private List<DGM013GrupoCosmetico> dgm013gruposcosmeticos = new ArrayList<DGM013GrupoCosmetico>();
		
	
	public String getMotivoCambio() {
		return motivoCambio;
	}
	public void setMotivoCambio(String motivoCambio) {
		this.motivoCambio = motivoCambio;
	}
	public String getNso() {
		return nso;
	}
	public void setNso(String nso) {
		this.nso = nso;
	}
	public Long getDgm013Id() {
		return dgm013Id;
	}
	public void setDgm013Id(Long dgm013Id) {
		this.dgm013Id = dgm013Id;
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
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public Integer getDgmTipoTramite() {
		return dgmTipoTramite;
	}
	public void setDgmTipoTramite(Integer dgmTipoTramite) {
		this.dgmTipoTramite = dgmTipoTramite;
	}
	
	public String getNsoOrigen() {
		return nsoOrigen;
	}
	public void setNsoOrigen(String nsoOrigen) {
		this.nsoOrigen = nsoOrigen;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getFormaCosmetica() {
		return formaCosmetica;
	}
	public void setFormaCosmetica(String formaCosmetica) {
		this.formaCosmetica = formaCosmetica;
	}
	public String getMarcaProducto() {
		return marcaProducto;
	}
	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}
	public Long getPartidaArancelaria() {
		return partidaArancelaria;
	}
	public void setPartidaArancelaria(Long partidaArancelaria) {
		this.partidaArancelaria = partidaArancelaria;
	}
	public String getCodigoDetallePartida() {
		return codigoDetallePartida;
	}
	public void setCodigoDetallePartida(String codigoDetallePartida) {
		this.codigoDetallePartida = codigoDetallePartida;
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
	public Date getFechaVigenciaNso() {
		return fechaVigenciaNso;
	}
	public void setFechaVigenciaNso(Date fechaVigenciaNso) {
		this.fechaVigenciaNso = fechaVigenciaNso;
	}
	public String getPaicodigo() {
		return paicodigo;
	}
	public void setPaicodigo(String paicodigo) {
		this.paicodigo = paicodigo;
	}
	public String getOrigenProducto() {
		return origenProducto;
	}
	public void setOrigenProducto(String origenProducto) {
		this.origenProducto = origenProducto;
	}
	public String getNroExpedienteOrigen() {
		return nroExpedienteOrigen;
	}
	public void setNroExpedienteOrigen(String nroExpedienteOrigen) {
		this.nroExpedienteOrigen = nroExpedienteOrigen;
	}
	public Date getFechaVigenciaNsoOrigen() {
		return fechaVigenciaNsoOrigen;
	}
	public void setFechaVigenciaNsoOrigen(Date fechaVigenciaNsoOrigen) {
		this.fechaVigenciaNsoOrigen = fechaVigenciaNsoOrigen;
	}
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public void setDgm013variedades (List<DGM013Variedad> dgm013variedads) {
		this.dgm013variedades = dgm013variedads;
	}
	public List<DGM013Variedad> getDgm013variedades() {
		return this.dgm013variedades;
	}
	public void addDgm013variedades (DGM013Variedad dgm013variedad) {
		this.dgm013variedades.add(dgm013variedad);
	}
	public List<DGM013Fabricante> getDgm013fabricantes() {
		return this.dgm013fabricantes;
	}
	public void setDgm013fabricantes (List<DGM013Fabricante> dgm013fabricantes) {
		this.dgm013fabricantes = dgm013fabricantes;
	}
	public void addDgm013fabricantes (DGM013Fabricante dgm013fabricante) {
		this.dgm013fabricantes.add(dgm013fabricante);
	}
	public String getFormaCosmeticaTexto() {
		return formaCosmeticaTexto;
	}
	public void setFormaCosmeticaTexto(String formaCosmeticaTexto) {
		this.formaCosmeticaTexto = formaCosmeticaTexto;
	}
	public List<DGM013Marca> getDgm013marcas() {
		return this.dgm013marcas;
	}
	public void setDgm013marcas(List<DGM013Marca> dgm013marcas) {
		this.dgm013marcas = dgm013marcas;
	}
	public void addDgm013marcas (DGM013Marca dgm013marca) {
		this.dgm013marcas.add(dgm013marca);
	}
	public List<DGM013GrupoCosmetico> getDgm013gruposcosmeticos() {
		return this.dgm013gruposcosmeticos;
	}
	public void setDgm013gruposcosmeticos(List<DGM013GrupoCosmetico> dgm013gruposcosmeticos) {
		this.dgm013gruposcosmeticos = dgm013gruposcosmeticos;
	}
	public void addDgm013gruposcosmeticos(DGM013GrupoCosmetico dgm013grupocosmetico) {
		this.dgm013gruposcosmeticos.add(dgm013grupocosmetico);
	}
}
