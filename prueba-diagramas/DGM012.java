package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM012 {

	private Long    dgm012Id; 
	private Long    ordenId; 
	private Integer mto; 
	private Integer dr_id; 
	private Integer sdr; 
	private String  codigoEstablecimiento; 
	private String  categoriaEstablecimiento;
	private String  idDireccionEstablecimiento; 
	private String  direccionEstablecimiento; 
	private String  codigoRegente; 
	private String  cargoRegente; 
	private String  nroRegistroSanitarioOrigen; 
	private Integer dgm_tipo_tramite; 
	private String  nombreProducto; 
	private String  origenProducto; 
	private Long    partidaArancelaria; 
	private String  codigoDetallePartida; 
	private Integer vidaUtil; 
	private String  origenFabricante; 
	private String  formaPresentacion; 
	private String  fabricanteNacional; 
	private String  fabricanteExtranjero; 
	private String  esMaquila; 
	private String  esFabricacionEncargo; 
	private String  fabricacionEncargo; 
	private String  licenciaDe; 
	private String  paisFabricante;
	private String  direccionFabricante;
	private String anoOrigen;
	private String drOrigen;

	private List<DGM012Producto> dgm012productos = new ArrayList<DGM012Producto>();
	private List<DGM012Maquiladora> dgm012maquiladoras = new ArrayList<DGM012Maquiladora>();
	private List<DGM012EnvaseInmediato> dgm012envaseinmediatos = new ArrayList<DGM012EnvaseInmediato>();
	private List<DGM012EnvaseMediato> dgm012envasemediatos = new ArrayList<DGM012EnvaseMediato>();
	private List<DGM012FormulaCualCuan> dgm012formulacualcuans = new ArrayList<DGM012FormulaCualCuan>();
	private List<DGM012ResultadoAnalisis> dgm012resultadoanalisiss = new ArrayList<DGM012ResultadoAnalisis>();
	private List<DGM012Uso> dgm012usos = new ArrayList<DGM012Uso>();
	private List<DGM012Lote> dgm012lotes = new ArrayList<DGM012Lote>();
	
	public String getAnoOrigen() {
		return anoOrigen;
	}
	public void setAnoOrigen(String anoOrigen) {
		this.anoOrigen = anoOrigen;
	}
	public String getDrOrigen() {
		return drOrigen;
	}
	public void setDrOrigen(String drOrigen) {
		this.drOrigen = drOrigen;
	}
	public Long getDgm012Id() {
		return dgm012Id;
	}
	public void setDgm012Id(Long dgm012Id) {
		this.dgm012Id = dgm012Id;
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
	public Integer getDr_id() {
		return dr_id;
	}
	public void setDr_id(Integer dr_id) {
		this.dr_id = dr_id;
	}
	public Integer getSdr() {
		return sdr;
	}
	public void setSdr(Integer sdr) {
		this.sdr = sdr;
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
	public void setCategoriaEstablecimiento(String categoria_establecimiento) {
		this.categoriaEstablecimiento = categoria_establecimiento;
	}
	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}
	public void setDireccionEstablecimiento(String direccion_establecimiento) {
		this.direccionEstablecimiento = direccion_establecimiento;
	}
	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}
	
	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}
	public String getCodigoRegente() {
		return codigoRegente;
	}
	public void setCodigoRegente(String codigo_regente) {
		this.codigoRegente = codigo_regente;
	}
	public String getCargoRegente() {
		return cargoRegente;
	}
	public void setCargoRegente(String cargo_regente) {
		this.cargoRegente = cargo_regente;
	}

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}
	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}
	public Integer getDgm_tipo_tramite() {
		return dgm_tipo_tramite;
	}
	public void setDgm_tipo_tramite(Integer dgm_tipo_tramite) {
		this.dgm_tipo_tramite = dgm_tipo_tramite;
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
	public Integer getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(Integer vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public String getOrigenFabricante() {
		return origenFabricante;
	}
	public void setOrigenFabricante(String origenFabricante) {
		this.origenFabricante = origenFabricante;
	}
	public String getFormaPresentacion() {
		return formaPresentacion;
	}
	public void setFormaPresentacion(String formaPresentacion) {
		this.formaPresentacion = formaPresentacion;
	}
	public String getFabricanteNacional() {
		return fabricanteNacional;
	}
	public void setFabricanteNacional(String fabricanteNacional) {
		this.fabricanteNacional = fabricanteNacional;
	}
	public String getFabricanteExtranjero() {
		return fabricanteExtranjero;
	}
	public void setFabricanteExtranjero(String fabricanteExtranjero) {
		this.fabricanteExtranjero = fabricanteExtranjero;
	}
	public String getEsMaquila() {
		return esMaquila;
	}
	public void setEsMaquila(String esMaquila) {
		this.esMaquila = esMaquila;
	}
	public String getEsFabricacionEncargo() {
		return esFabricacionEncargo;
	}
	public void setEsFabricacionEncargo(String esFabricacionEncargo) {
		this.esFabricacionEncargo = esFabricacionEncargo;
	}
	public String getFabricacionEncargo() {
		return fabricacionEncargo;
	}
	public void setFabricacionEncargo(String fabricacionEncargo) {
		this.fabricacionEncargo = fabricacionEncargo;
	}
	public String getLicenciaDe() {
		return licenciaDe;
	}
	public void setLicenciaDe(String licenciaDe) {
		this.licenciaDe = licenciaDe;
	}

	public void setDGM012Productos (List<DGM012Producto> dgm012productos) {
		this.dgm012productos = dgm012productos;
	}
	public void addDGM012Productos (DGM012Producto dgm012producto) {
		this.dgm012productos.add(dgm012producto);
	}

	public void setDGM012Maquiladoras (List<DGM012Maquiladora> dgm012maquiladoras) {
		this.dgm012maquiladoras = dgm012maquiladoras;
	}
	public void addDGM012Maquiladoras (DGM012Maquiladora dgm012maquiladora) {
		this.dgm012maquiladoras.add(dgm012maquiladora);
	}

	public void setDGM012EnvaseInmediatos (List<DGM012EnvaseInmediato> dgm012envaseinmediatos) {
		this.dgm012envaseinmediatos = dgm012envaseinmediatos;
	}
	public void addDGM012EnvaseInmediatos (DGM012EnvaseInmediato dgm012envaseinmediato) {
		this.dgm012envaseinmediatos.add(dgm012envaseinmediato);
	}

	public void setDGM012EnvaseMediatos (List<DGM012EnvaseMediato> dgm012envasemediatos) {
		this.dgm012envasemediatos = dgm012envasemediatos;
	}
	public void addDGM012EnvaseMediatos (DGM012EnvaseMediato dgm012envasemediato) {
		this.dgm012envasemediatos.add(dgm012envasemediato);
	}

	public void setDGM012FormulaCualCuans (List<DGM012FormulaCualCuan> dgm012formulacualcuans) {
		this.dgm012formulacualcuans = dgm012formulacualcuans;
	}
	public void addDGM012FormulaCualCuans (DGM012FormulaCualCuan dgm012formulacualcuan) {
		this.dgm012formulacualcuans.add(dgm012formulacualcuan);
	}

	public void setDGM012ResultadoAnalisiss (List<DGM012ResultadoAnalisis> dgm012resultadoanalisiss) {
		this.dgm012resultadoanalisiss = dgm012resultadoanalisiss;
	}
	public void addDGM012ResultadoAnalisiss (DGM012ResultadoAnalisis dgm012resultadoanalisis) {
		this.dgm012resultadoanalisiss.add(dgm012resultadoanalisis);
	}

	public void setDGM012Usos (List<DGM012Uso> dgm012usos) {
		this.dgm012usos = dgm012usos;
	}
	public void addDGM012Usos (DGM012Uso dgm012uso) {
		this.dgm012usos.add(dgm012uso);
	}

	public void setDGM012Lotes (List<DGM012Lote> dgm012lotes) {
		this.dgm012lotes = dgm012lotes;
	}
	public void addDGM012Lotes (DGM012Lote dgm012lote) {
		this.dgm012lotes.add(dgm012lote);
	}
	public String getPaisFabricante() {
		return paisFabricante;
	}
	public void setPaisFabricante(String paisFabricante) {
		this.paisFabricante = paisFabricante;
	}
	public String getDireccionFabricante() {
		return direccionFabricante;
	}
	public void setDireccionFabricante(String direccionFabricante) {
		this.direccionFabricante = direccionFabricante;
	}
	public List<DGM012Producto> getDgm012productos() {
		return dgm012productos;
	}
	public void setDgm012productos(List<DGM012Producto> dgm012productos) {
		this.dgm012productos = dgm012productos;
	}
	public List<DGM012Maquiladora> getDgm012maquiladoras() {
		return dgm012maquiladoras;
	}
	public void setDgm012maquiladoras(List<DGM012Maquiladora> dgm012maquiladoras) {
		this.dgm012maquiladoras = dgm012maquiladoras;
	}
	public List<DGM012EnvaseInmediato> getDgm012envaseinmediatos() {
		return dgm012envaseinmediatos;
	}
	public void setDgm012envaseinmediatos(
			List<DGM012EnvaseInmediato> dgm012envaseinmediatos) {
		this.dgm012envaseinmediatos = dgm012envaseinmediatos;
	}
	public List<DGM012EnvaseMediato> getDgm012envasemediatos() {
		return dgm012envasemediatos;
	}
	public void setDgm012envasemediatos(
			List<DGM012EnvaseMediato> dgm012envasemediatos) {
		this.dgm012envasemediatos = dgm012envasemediatos;
	}
	public List<DGM012FormulaCualCuan> getDgm012formulacualcuans() {
		return dgm012formulacualcuans;
	}
	public void setDgm012formulacualcuans(
			List<DGM012FormulaCualCuan> dgm012formulacualcuans) {
		this.dgm012formulacualcuans = dgm012formulacualcuans;
	}
	public List<DGM012ResultadoAnalisis> getDgm012resultadoanalisiss() {
		return dgm012resultadoanalisiss;
	}
	public void setDgm012resultadoanalisiss(
			List<DGM012ResultadoAnalisis> dgm012resultadoanalisiss) {
		this.dgm012resultadoanalisiss = dgm012resultadoanalisiss;
	}
	public List<DGM012Uso> getDgm012usos() {
		return dgm012usos;
	}
	public void setDgm012usos(List<DGM012Uso> dgm012usos) {
		this.dgm012usos = dgm012usos;
	}
	public List<DGM012Lote> getDgm012lotes() {
		return dgm012lotes;
	}
	public void setDgm012lotes(List<DGM012Lote> dgm012lotes) {
		this.dgm012lotes = dgm012lotes;
	}
	
	
}
