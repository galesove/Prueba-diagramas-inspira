package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DGM070 {	
	private Long            dgm070Id;
	private Long            ordenId;
	private Integer         mto;
	private String          codigoEstablecimiento;
	private String          categoriaEstablecimiento;
	private String          direccionEstablecimiento;
	private String          codigoDireccion;
	private String          telefonoEstablecimiento;
	private String          establecimientoFarmTelefono;
	private String          emailEstablecimiento;
	private String          establecimientoFarmEmail;
	private String          codigoRegente;
	private String          cargoRegente;
	private String          nroColegiaturaDirector;
	private String          telefonoDirector;
	private String          emailDirector;
	private String          representanteLegal;
	private String          telefonoRepLegal;
	private String          telefonoRepresentanteLegal;
	private String          emailRepresentanteLegal;
	private String          emailRepLegal;
	private String          grupoProducto;
	private String          nsoOrigen;
	private String          nroExpedienteOrigen;
	private Date            fechaVigenciaNsoOrigen;
	private String          nombreProducto;
	private String          origenProducto;
	private Long            partidaArancelaria;
	private String          codigoDetallePartida;
	private Integer         formaCosmetica;
	private String          formaCosmeticaTexto;
	private Integer         grupo;
	private String          motivoCambioAmpNso;
	private String          motivoCambioProducto;
	private String          motivoCambioFabricante;
	private String          motivoCambioFormula;
	private String          motivoCambioEnvase;
	private String          motivoCambioRotulado;
	private String          motivoCambioPresentacion;
	private Integer         tiempoVidaUtil;
	private String          unidadTiempoVida;
	private String 			idDireccionEstablecimiento;
	private Integer 		numeroMarca;
	private String 			informacionCambioMarca;
	private String 			informacionCambioFabricante; //
	private Integer 		motivoAgotamiento; //
	private String 			informacionAgotamiento;
	private Integer 		tiempoAgotamiento;
	private String 			razonSocialAnterior;
	private String 			razonSocialNuevo;
	private String 			fabricanteActualOrigen;
	private String 			fabricanteActualNombre;
	private String 			fabricanteNuevoOrigen;
	private String 			fabricanteNuevoNombre;
	private String 			fabricanteNuevoDireccion;
	private String 			fabricanteNuevoDistritoId;
	private String 			fabricanteNuevoPais;
	
	//AEP 07/12/17 Acta:DGM-001-2017 Datos Sunat - Unidad Funcional Productos Sanitarios
	private String 			nroExpCAceptado;
	private Date            fechaExpCAceptado;
	private String 			nroExpAgotaStock;	
	private Date            fechaVencAgotaStock;
	
	private List<DGM070Marca> marcas = new ArrayList<DGM070Marca>();
	private List<DGM070GrupoCosmetico> gruposCosmeticos = new ArrayList<DGM070GrupoCosmetico>();
	private List<DGM070Variedad> varidades = new ArrayList<DGM070Variedad>();
	private List<DGM070Fabricante> fabricantes = new ArrayList<DGM070Fabricante>();
	private List<DGM070Maquila> maquilas;
	private List<DGM070Procedimiento> procedimiento = new ArrayList<DGM070Procedimiento>();
	
	
	public Long getDgm070Id() {
		return dgm070Id;
	}
	public void setDgm070Id(Long dgm070Id) {
		this.dgm070Id = dgm070Id;
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
	public String getCodigoDireccion() {
		return codigoDireccion;
	}
	public void setCodigoDireccion(String codigoDireccion) {
		this.codigoDireccion = codigoDireccion;
	}
	public String getTelefonoEstablecimiento() {
		return telefonoEstablecimiento;
	}
	public void setTelefonoEstablecimiento(String telefonoEstablecimiento) {
		this.telefonoEstablecimiento = telefonoEstablecimiento;
	}
	public String getEmailEstablecimiento() {
		return emailEstablecimiento;
	}
	public void setEmailEstablecimiento(String emailEstablecimiento) {
		this.emailEstablecimiento = emailEstablecimiento;
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
	public String getNroColegiaturaDirector() {
		return nroColegiaturaDirector;
	}
	public void setNroColegiaturaDirector(String nroColegiaturaDirector) {
		this.nroColegiaturaDirector = nroColegiaturaDirector;
	}
	public String getTelefonoDirector() {
		return telefonoDirector;
	}
	public void setTelefonoDirector(String telefonoDirector) {
		this.telefonoDirector = telefonoDirector;
	}
	public String getEmailDirector() {
		return emailDirector;
	}
	public void setEmailDirector(String emailDirector) {
		this.emailDirector = emailDirector;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getTelefonoRepLegal() {
		return telefonoRepLegal;
	}
	public void setTelefonoRepLegal(String telefonoRepLegal) {
		this.telefonoRepLegal = telefonoRepLegal;
	}
	public String getEmailRepLegal() {
		return emailRepLegal;
	}
	public void setEmailRepLegal(String emailRepLegal) {
		this.emailRepLegal = emailRepLegal;
	}
	public String getGrupoProducto() {
		return grupoProducto;
	}
	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
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
	public String getOrigenProducto() {
		return origenProducto;
	}
	public void setOrigenProducto(String origenProducto) {
		this.origenProducto = origenProducto;
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
	public Integer getFormaCosmetica() {
		return formaCosmetica;
	}
	public void setFormaCosmetica(Integer formaCosmetica) {
		this.formaCosmetica = formaCosmetica;
	}
	public String getFormaCosmeticaTexto() {
		return formaCosmeticaTexto;
	}
	public void setFormaCosmeticaTexto(String formaCosmeticaTexto) {
		this.formaCosmeticaTexto = formaCosmeticaTexto;
	}
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}
	public String getMotivoCambioAmpNso() {
		return motivoCambioAmpNso;
	}
	public void setMotivoCambioAmpNso(String motivoCambioAmpNso) {
		this.motivoCambioAmpNso = motivoCambioAmpNso;
	}
	public String getMotivoCambioProducto() {
		return motivoCambioProducto;
	}
	public void setMotivoCambioProducto(String motivoCambioProducto) {
		this.motivoCambioProducto = motivoCambioProducto;
	}
	public String getMotivoCambioFabricante() {
		return motivoCambioFabricante;
	}
	public void setMotivoCambioFabricante(String motivoCambioFabricante) {
		this.motivoCambioFabricante = motivoCambioFabricante;
	}
	public String getMotivoCambioFormula() {
		return motivoCambioFormula;
	}
	public void setMotivoCambioFormula(String motivoCambioFormula) {
		this.motivoCambioFormula = motivoCambioFormula;
	}
	public String getMotivoCambioEnvase() {
		return motivoCambioEnvase;
	}
	public void setMotivoCambioEnvase(String motivoCambioEnvase) {
		this.motivoCambioEnvase = motivoCambioEnvase;
	}
	public String getMotivoCambioRotulado() {
		return motivoCambioRotulado;
	}
	public void setMotivoCambioRotulado(String motivoCambioRotulado) {
		this.motivoCambioRotulado = motivoCambioRotulado;
	}
	public String getMotivoCambioPresentacion() {
		return motivoCambioPresentacion;
	}
	public void setMotivoCambioPresentacion(String motivoCambioPresentacion) {
		this.motivoCambioPresentacion = motivoCambioPresentacion;
	}
	public Integer getTiempoVidaUtil() {
		return tiempoVidaUtil;
	}
	public void setTiempoVidaUtil(Integer tiempoVidaUtil) {
		this.tiempoVidaUtil = tiempoVidaUtil;
	}
	public String getUnidadTiempoVida() {
		return unidadTiempoVida;
	}
	public void setUnidadTiempoVida(String unidadTiempoVida) {
		this.unidadTiempoVida = unidadTiempoVida;
	}
	public List<DGM070Marca> getMarcas() {
		return marcas;
	}
	public void setMarcas(List<DGM070Marca> marcas) {
		this.marcas = marcas;
	}
	public List<DGM070GrupoCosmetico> getGruposCosmeticos() {
		return gruposCosmeticos;
	}
	public void setGruposCosmeticos(List<DGM070GrupoCosmetico> gruposCosmeticos) {
		this.gruposCosmeticos = gruposCosmeticos;
	}
	public List<DGM070Variedad> getVariedades() {
		return varidades;
	}
	public void setVariedades(List<DGM070Variedad> variedades) {
		this.varidades = variedades;
	}
	public List<DGM070Fabricante> getFabricantes() {
		return fabricantes;
	}
	public void setFabricantes(List<DGM070Fabricante> fabricantes) {
		this.fabricantes = fabricantes;
	}
	public List<DGM070Maquila> getMaquilas() {
		return maquilas;
	}
	public void setMaquilas(List<DGM070Maquila> maquilas) {
		this.maquilas = maquilas;
	}
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
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
	public String getTelefonoRepresentanteLegal() {
		return telefonoRepresentanteLegal;
	}
	public void setTelefonoRepresentanteLegal(String telefonoRepresentanteLegal) {
		this.telefonoRepresentanteLegal = telefonoRepresentanteLegal;
	}
	public String getEmailRepresentanteLegal() {
		return emailRepresentanteLegal;
	}
	public void setEmailRepresentanteLegal(String emailRepresentanteLegal) {
		this.emailRepresentanteLegal = emailRepresentanteLegal;
	}
	
	public List<DGM070Procedimiento> getProcedimiento() {
		return procedimiento;
	}
	public void setProcedimiento(List<DGM070Procedimiento> procedimiento) {
		this.procedimiento = procedimiento;
	}
	public Integer getNumeroMarca() {
		return numeroMarca;
	}
	public void setNumeroMarca(Integer numeroMarca) {
		this.numeroMarca = numeroMarca;
	}
	public String getInformacionCambioMarca() {
		return informacionCambioMarca;
	}
	public void setInformacionCambioMarca(String informacionCambioMarca) {
		this.informacionCambioMarca = informacionCambioMarca;
	}
	public String getInformacionCambioFabricante() {
		return informacionCambioFabricante;
	}
	public void setInformacionCambioFabricante(String informacionCambioFabricante) {
		this.informacionCambioFabricante = informacionCambioFabricante;
	}
	public Integer getMotivoAgotamiento() {
		return motivoAgotamiento;
	}
	public void setMotivoAgotamiento(Integer motivoAgotamiento) {
		this.motivoAgotamiento = motivoAgotamiento;
	}
	public String getInformacionAgotamiento() {
		return informacionAgotamiento;
	}
	public void setInformacionAgotamiento(String informacionAgotamiento) {
		this.informacionAgotamiento = informacionAgotamiento;
	}
	public Integer getTiempoAgotamiento() {
		return tiempoAgotamiento;
	}
	public void setTiempoAgotamiento(Integer tiempoAgotamiento) {
		this.tiempoAgotamiento = tiempoAgotamiento;
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
	public String getFabricanteNuevoDireccion() {
		return fabricanteNuevoDireccion;
	}
	public void setFabricanteNuevoDireccion(String fabricanteNuevoDireccion) {
		this.fabricanteNuevoDireccion = fabricanteNuevoDireccion;
	}
	public String getFabricanteNuevoDistritoId() {
		return fabricanteNuevoDistritoId;
	}
	public void setFabricanteNuevoDistritoId(String fabricanteNuevoDistritoId) {
		this.fabricanteNuevoDistritoId = fabricanteNuevoDistritoId;
	}
	public String getFabricanteNuevoPais() {
		return fabricanteNuevoPais;
	}
	public void setFabricanteNuevoPais(String fabricanteNuevoPais) {
		this.fabricanteNuevoPais = fabricanteNuevoPais;
	}
	//AEP 201712 Acta:DGM-001-2017 Datos Sunat - Unidad Funcional Productos Sanitarios
	public String getNroExpCAceptado() {
		return nroExpCAceptado;
	}
	public void setNroExpCAceptado(String nroExpCAceptado) {
		this.nroExpCAceptado = nroExpCAceptado;
	}
	public Date getFechaExpCAceptado() {
		return fechaExpCAceptado;
	}
	public void setFechaExpCAceptado(Date fechaExpCAceptado) {
		this.fechaExpCAceptado = fechaExpCAceptado;
	}
	public String getNroExpAgotaStock() {
		return nroExpAgotaStock;
	}
	public void setNroExpAgotaStock(String nroExpAgotaStock) {
		this.nroExpAgotaStock = nroExpAgotaStock;
	}
	public Date getFechaVencAgotaStock() {
		return fechaVencAgotaStock;
	}
	public void setFechaVencAgotaStock(Date fechaVencAgotaStock) {
		this.fechaVencAgotaStock = fechaVencAgotaStock;
	}
	
}
