package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM054 {

	private Integer dgm054Id; 
	private Integer ordenId; 
	private Integer mto; 
	private String nroRegistroSanitarioOrigen; 
	private String codigoEstablecimiento; 
	private String categoriaEstablecimiento; 
	private String direccionEstablecimiento;
	//private String codigoDireccion;
	private String idDireccionEstablecimiento;
	private String representanteLegal; 
	private String codigoRegente; 
	private String cargoRegente; 
	//private String nombreProducto;
	private String nombreProductoOld;
	private String nombreProductoNew;
	private String grupoProducto;
	private String grupoProductoDesc;
	//private Integer tupaIdModificado;
	private String expedienteReinscripcion;
	private String establecimientoFarmTelefono;
	private String establecimientoFarmEmail;
	private String nsoOrigen;
	private String nroExpedienteOrigen;
	private String nroResolucionOrigen;
	private Date fechaVigenciaNsoOrigen;
	private Long partidaArancelaria;
	private String codigoDetallePartida;
	private String esPhd;
	private String esPahp;
	private String formaCosmetica;
	private Integer grupo;
	private String tipoGrupo;
	private String 	formaCosmeticaTexto;
	
	private List<DGM054Variedad> dgm054variedades = new ArrayList<DGM054Variedad>();
	private List<DGM054Fabricante> dgm054fabricantes = new ArrayList<DGM054Fabricante>();
	private List<DGM054Marca> dgm054marcas = new ArrayList<DGM054Marca>();
	private List<DGM054GrupoCosmetico> dgm054gruposcosmeticos = new ArrayList<DGM054GrupoCosmetico>();
	
	
	public String getFormaCosmeticaTexto() {
		return formaCosmeticaTexto;
	}
	public void setFormaCosmeticaTexto(String formaCosmeticaTexto) {
		this.formaCosmeticaTexto = formaCosmeticaTexto;
	}
	public Integer getDgm054Id() {
		return dgm054Id;
	}
	public void setDgm054Id(Integer dgm054Id) {
		this.dgm054Id = dgm054Id;
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
	
	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}
	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}
	public void setCodigoEstablecimiento(String codigoEstablecimiento) {
		this.codigoEstablecimiento = codigoEstablecimiento;
	}
	public String getCodigoEstablecimiento() {
		return codigoEstablecimiento;
	}
	public void setCategoriaEstablecimiento(String categoriaEstablecimiento) {
		this.categoriaEstablecimiento = categoriaEstablecimiento;
	}
	public String getCategoriaEstablecimiento() {
		return categoriaEstablecimiento;
	}
	public void setDireccionEstablecimiento(String direccionEstablecimiento) {
		this.direccionEstablecimiento = direccionEstablecimiento;
	}
	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setCodigoRegente(String codigoRegente) {
		this.codigoRegente = codigoRegente;
	}
	public String getCodigoRegente() {
		return codigoRegente;
	}
	public void setCargoRegente(String cargoRegente) {
		this.cargoRegente = cargoRegente;
	}
	public String getCargoRegente() {
		return cargoRegente;
	}
	/*public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}*/
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
	/*public Integer getTupaIdModificado() {
		return tupaIdModificado;
	}
	public void setTupaIdModificado(Integer tupaIdModificado) {
		this.tupaIdModificado = tupaIdModificado;
	}*/
	public String getExpedienteReinscripcion() {
		return expedienteReinscripcion;
	}
	public void setExpedienteReinscripcion(String expedienteReinscripcion) {
		this.expedienteReinscripcion = expedienteReinscripcion;
	}

	public String getEstablecimientoFarmTelefono() {
		return establecimientoFarmTelefono;
	}
	public void setEstablecimientoFarmTelefono(
			String establecimientoFarmTelefono) {
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
	public String getNroResolucionOrigen() {
		return nroResolucionOrigen;
	}
	public void setNroResolucionOrigen(String nroResolucionOrigen) {
		this.nroResolucionOrigen = nroResolucionOrigen;
	}
	public Date getFechaVigenciaNsoOrigen() {
		return fechaVigenciaNsoOrigen;
	}
	public void setFechaVigenciaNsoOrigen(Date fechaVigenciaNsoOrigen) {
		this.fechaVigenciaNsoOrigen = fechaVigenciaNsoOrigen;
	}
	public String getNombreProductoOld() {
		return nombreProductoOld;
	}
	public void setNombreProductoOld(String nombreProductoOld) {
		this.nombreProductoOld = nombreProductoOld;
	}
	public String getNombreProductoNew() {
		return nombreProductoNew;
	}
	public void setNombreProductoNew(String nombreProductoNew) {
		this.nombreProductoNew = nombreProductoNew;
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
	public String getNroExpedienteOrigen() {
		return nroExpedienteOrigen;
	}
	public void setNroExpedienteOrigen(String nroExpedienteOrigen) {
		this.nroExpedienteOrigen = nroExpedienteOrigen;
	}
	public String getFormaCosmetica() {
		return formaCosmetica;
	}
	public void setFormaCosmetica(String formaCosmetica) {
		this.formaCosmetica = formaCosmetica;
	}
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}
	public String getTipoGrupo() {
		return tipoGrupo;
	}
	public void setTipoGrupo(String tipoGrupo) {
		this.tipoGrupo = tipoGrupo;
	}
	
	public List<DGM054Marca> getDgm054marcas() {
		return this.dgm054marcas;
	}
	public void setDgm054marcas(List<DGM054Marca> dgm054marcas) {
		this.dgm054marcas = dgm054marcas;
	}
	public void addDgm054marcas (DGM054Marca dgm054marca) {
		this.dgm054marcas.add(dgm054marca);
	}
	public List<DGM054GrupoCosmetico> getDgm054gruposcosmeticos() {
		return this.dgm054gruposcosmeticos;
	}
	public void setDgm054gruposcosmeticos(List<DGM054GrupoCosmetico> dgm054gruposcosmeticos) {
		this.dgm054gruposcosmeticos = dgm054gruposcosmeticos;
	}
	public void addDgm054gruposcosmeticos(DGM054GrupoCosmetico dgm054grupocosmetico) {
		this.dgm054gruposcosmeticos.add(dgm054grupocosmetico);
	}
	public void setDgm054variedades (List<DGM054Variedad> dgm054variedads) {
		this.dgm054variedades = dgm054variedads;
	}
	public List<DGM054Variedad> getDgm054variedades() {
		return this.dgm054variedades;
	}
	public void addDgm054variedades (DGM054Variedad dgm054variedad) {
		this.dgm054variedades.add(dgm054variedad);
	}
	public List<DGM054Fabricante> getDgm054fabricantes() {
		return this.dgm054fabricantes;
	}
	public void setDgm054fabricantes (List<DGM054Fabricante> dgm054fabricantes) {
		this.dgm054fabricantes = dgm054fabricantes;
	}
	public void addDgm054fabricantes (DGM054Fabricante dgm054fabricante) {
		this.dgm054fabricantes.add(dgm054fabricante);
	}
}
