package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM059 {

	private Long            dgm059Id;
	private Long            ordenId;
	private Integer         mto;
	private String          codigoEstablecimiento;
	private String          categoriaEstablecimiento;
	private String          direccionEstablecimiento;
	private String          idDireccionEstablecimiento;	
	//private String          codigoDireccion;
	private String          representanteLegal;
	private String          codigoRegente;
	private String          cargoRegente;
	private String          establecimientoFarmTelefono;
	private String          establecimientoFarmEmail;
	private String          nsoOrigen;
	private String          nroExpedienteOrigen;
	private Date            fechaVigenciaNsoOrigen;
	private String          nombreProducto;
	private Long            partidaArancelaria;
	private String          codigoDetallePartida;
	//private String          esPhd;
	//private String          esPahp;
	private String          formulaInicial;
	private String          formulaReemplazo;
	private String          descripcionCambio;
	private Integer         grupo;
	private String          grupoProducto;
	private Integer formaCosmetica;	
	private String tipoGrupo;
	private String 	formaCosmeticaTexto;
	
	private List<DGM059Fabricante> dgm059fabricantes = new ArrayList<DGM059Fabricante>();
	private List<DGM059Variedad> dgm059variedades = new ArrayList<DGM059Variedad>();
	private List<DGM059Marca> dgm059marcas = new ArrayList<DGM059Marca>();
	
	
	
	public String getFormaCosmeticaTexto() {
		return formaCosmeticaTexto;
	}
	public void setFormaCosmeticaTexto(String formaCosmeticaTexto) {
		this.formaCosmeticaTexto = formaCosmeticaTexto;
	}
	public Long getDgm059Id() {
		return dgm059Id;
	}
	public void setDgm059Id(Long dgm059Id) {
		this.dgm059Id = dgm059Id;
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
	/*public String getCodigoDireccion() {
		return codigoDireccion;
	}
	public void setCodigoDireccion(String codigoDireccion) {
		this.codigoDireccion = codigoDireccion;
	}*/
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
	public String getNsoOrigen() {
		return nsoOrigen;
	}
	public void setNsoOrigen(String nsoOrigen) {
		this.nsoOrigen = nsoOrigen;
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
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
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
	public String getFormulaInicial() {
		return formulaInicial;
	}
	public void setFormulaInicial(String formulaInicial) {
		this.formulaInicial = formulaInicial;
	}
	public String getFormulaReemplazo() {
		return formulaReemplazo;
	}
	public void setFormulaReemplazo(String formulaReemplazo) {
		this.formulaReemplazo = formulaReemplazo;
	}
	public String getDescripcionCambio() {
		return descripcionCambio;
	}
	public void setDescripcionCambio(String descripcionCambio) {
		this.descripcionCambio = descripcionCambio;
	}
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
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
	public List<DGM059Fabricante> getDgm059fabricantes() {
		return dgm059fabricantes;
	}
	public void setDgm059fabricantes(List<DGM059Fabricante> dgm059fabricantes) {
		this.dgm059fabricantes = dgm059fabricantes;
	}
	public List<DGM059Variedad> getDgm059variedades() {
		return this.dgm059variedades;
	}
	public void setDgm059variedades(List<DGM059Variedad> dgm059variedades) {
		this.dgm059variedades = dgm059variedades;
	}
	public List<DGM059Marca> getDgm059marcas() {
		return this.dgm059marcas;
	}
	public void setDgm059marcas(List<DGM059Marca> dgm059marcas) {
		this.dgm059marcas = dgm059marcas;
	}
}
