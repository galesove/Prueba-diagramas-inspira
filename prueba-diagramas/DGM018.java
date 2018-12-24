
package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM018 {
	
	private Long            dgm018Id;
	private Long            ordenId;
	private Integer         mto;
	private String          codigoEstablecimiento;
	private String          categoriaEstablecimiento;
	private String          direccionEstablecimiento;
	private String          idDireccionEstablecimiento;
	private String          codigoRegente;
	private String          cargoRegente;
	private String representanteLegal;
	private Integer         dgmTipoTramite;
	private String          nsoOrigen;
	private String          nombreProducto;
	private String          esPhd;
	private String          esPahp;
	private Integer         grupo;
	private Long            partidaArancelaria;
	private String          codigoDetallePartida;
	private String          establecimientoFarmTelefono;
	private String          establecimientoFarmEmail;
	//private Date            fechaVigenciaNso;
	private String          paicodigo;
	private String          origenProducto;
	private String          tipoGrupo;
	private String          tipoPresentacion;
	private String          nroLote;
	private String          nroExpedienteOrigen;
	private Date            fechaVigenciaNsoOrigen;
	private String          nso;
	private String motivoCambio;
	private String grupoProducto;
	private Integer         subgrupo;
	
	private List<DGM018Variedad> dgm018variedades = new ArrayList<DGM018Variedad>();
	private List<DGM018Fabricante> dgm018fabricantes = new ArrayList<DGM018Fabricante>();
	private List<DGM018Marca> dgm018marcas = new ArrayList<DGM018Marca>();
	
	
	
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
	public Long getDgm018Id() {
		return dgm018Id;
	}
	public void setDgm018Id(Long dgm018Id) {
		this.dgm018Id = dgm018Id;
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
	public String getEsPhd() {
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
	}
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
	/*public Date getFechaVigenciaNso() {
		return fechaVigenciaNso;
	}
	public void setFechaVigenciaNso(Date fechaVigenciaNso) {
		this.fechaVigenciaNso = fechaVigenciaNso;
	}*/
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
	public String getTipoGrupo() {
		return tipoGrupo;
	}
	public void setTipoGrupo(String tipoGrupo) {
		this.tipoGrupo = tipoGrupo;
	}
	public String getTipoPresentacion() {
		return tipoPresentacion;
	}
	public void setTipoPresentacion(String tipoPresentacion) {
		this.tipoPresentacion = tipoPresentacion;
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
	public Date getFechaVigenciaNsoOrigen() {
		
		return fechaVigenciaNsoOrigen;
	}
	public void setFechaVigenciaNsoOrigen(Date fechaVigenciaNsoOrigen) {
		this.fechaVigenciaNsoOrigen = fechaVigenciaNsoOrigen;
	}
	public List<DGM018Variedad> getDgm018variedades() {
		return this.dgm018variedades;
	}
	public void setDgm018variedades(List<DGM018Variedad> dgm018variedades) {
		this.dgm018variedades = dgm018variedades;
	}
	public List<DGM018Fabricante> getDgm018fabricantes() {
		return this.dgm018fabricantes;
	}
	public void setDgm018fabricantes(List<DGM018Fabricante> dgm018fabricantes) {
		this.dgm018fabricantes = dgm018fabricantes;
	}
	public List<DGM018Marca> getDgm018marcas() {
		return this.dgm018marcas;
	}
	public void setDgm018marcas(List<DGM018Marca> dgm018marcas) {
		this.dgm018marcas = dgm018marcas;
	}

	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}
	public Integer getSubgrupo() {
		return subgrupo;
	}
	public void setSubgrupo(Integer subgrupo) {
		this.subgrupo = subgrupo;
	}
	
}
