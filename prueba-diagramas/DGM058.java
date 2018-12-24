package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM058 {
	
	private Long            dgm058Id;
	private Long            ordenId;
	private Integer         mto;
	private String          codigoEstablecimiento;
	private String          categoriaEstablecimiento;
	private String          direccionEstablecimiento;
	private String          idDireccionEstablecimiento;
	private String          representanteLegal;
	private String          codigoRegente;
	private String          cargoRegente;
	private Integer         dgmTipoTramite;
	private String          nsoOrigen;
	private String          nombreProducto;
	//private String          esPhd;
	//private String          esPahp;
	private Integer         grupo;
	private Long            partidaArancelaria;
	private String          codigoDetallePartida;
	private String          establecimientoFarmTelefono;
	private String          establecimientoFarmEmail;
	private Date            fechaVigenciaNso;
	private String          nroLote;
	private String          nroExpedienteOrigen;
	private Date            fechaVigenciaNsoOrigen;
	private String          grupoProducto;
	private Integer formaCosmetica;	
	private String tipoGrupo;
	private String 	formaCosmeticaTexto;

	private List<DGM058Variedad> dgm058variedades = new ArrayList<DGM058Variedad>();
	private List<DGM058Marca> dgm058marcas = new ArrayList<DGM058Marca>();
	private List<DGM058Fabricante> dgm058fabricantes = new ArrayList<DGM058Fabricante>();
	
	
	public String getFormaCosmeticaTexto() {
		return formaCosmeticaTexto;
	}
	public void setFormaCosmeticaTexto(String formaCosmeticaTexto) {
		this.formaCosmeticaTexto = formaCosmeticaTexto;
	}
	public Long getDgm058Id() {
		return dgm058Id;
	}
	public void setDgm058Id(Long dgm058Id) {
		this.dgm058Id = dgm058Id;
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
	/*public String getEsPhd() {
		return esPhd;
	}
	public void setEsPhd(String esPhd) {
		this.esPhd = esPhd;
	}
	public String getEsPahp() {
		return esPahp;
	}
	public void setEsPahp(String esPahp) {
		this.esPahp = esPahp;
	}*/
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
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
	public String getNroLote() {
		return nroLote;
	}
	public void setNroLote(String nroLote) {
		this.nroLote = nroLote;
	}
	public String getNroExpedienteOrigen() {
		return nroExpedienteOrigen;
	}
	public void setNroExpedienteOrigen(String nroExpedienteOrigen) {
		this.nroExpedienteOrigen = nroExpedienteOrigen;
	}
	public List<DGM058Fabricante> getDgm058fabricantes() {
		return dgm058fabricantes;
	}
	public void setDgm058fabricantes(List<DGM058Fabricante> dgm058fabricantes) {
		this.dgm058fabricantes = dgm058fabricantes;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
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
	public Integer getFormaCosmetica() {
		return formaCosmetica;
	}
	public void setFormaCosmetica(Integer formaCosmetica) {
		this.formaCosmetica = formaCosmetica;
	}
	public String getTipoGrupo() {
		return tipoGrupo;
	}
	public void setTipoGrupo(String tipoGrupo) {
		this.tipoGrupo = tipoGrupo;
	}
	public List<DGM058Variedad> getDgm058variedades() {
		return dgm058variedades;
	}
	public void setDgm058variedades(List<DGM058Variedad> dgm058variedades) {
		this.dgm058variedades = dgm058variedades;
	}
	public List<DGM058Marca> getDgm058marcas() {
		return dgm058marcas;
	}
	public void setDgm058marcas(List<DGM058Marca> dgm058marcas) {
		this.dgm058marcas = dgm058marcas;
	}
}
