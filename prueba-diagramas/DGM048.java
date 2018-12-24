package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM048 {

	private Long            dgm048Id;
	private Long            ordenId;
	private Integer         mto;
	private String          codigoEstablecimiento;
	private String          categoriaEstablecimiento;
	private String          direccionEstablecimiento;
	private String          representanteLegal;
	private String          codigoRegente;
	private String          cargoRegente;
	private String          numDocSolicitanteNew;
	private Integer         tipoDocSolicitanteNew;
	private String          nombreEmpresaNew;
	private String          numDocRepLegalNew;
	private Integer         tipoDocRepLegalNew;
	private String          nombreRepLegalNew;
	private String          codigoEstablecimientoNew;
	private String          categoriaEstablecimientoNew;
	private String          direccionEstablecimientoNew;
	private String          representanteLegalNew;
	private String          codigoRegenteNew;
	private String          cargoRegenteNew;
	private Long            usuarioIdNew;
	private String          idDireccionEstablecimiento;
	private String          idDireccionEstablecimientoNew;
	
	private String          nombreCargoRegenteNew;
	private String          tipoDocSolicitanteNewDesc;
	private String          tipoDocRepLegalNewDesc;
	//private Long         tupaIdAModificar;
	
	private List<DGM048Detalle> dgm048detalles = new ArrayList<DGM048Detalle>();

	public Long getDgm048Id() {
		return dgm048Id;
	}

	public void setDgm048Id(Long dgm048Id) {
		this.dgm048Id = dgm048Id;
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

	public String getNumDocSolicitanteNew() {
		return numDocSolicitanteNew;
	}

	public void setNumDocSolicitanteNew(String numDocSolicitanteNew) {
		this.numDocSolicitanteNew = numDocSolicitanteNew;
	}

	public Integer getTipoDocSolicitanteNew() {
		return tipoDocSolicitanteNew;
	}

	public void setTipoDocSolicitanteNew(Integer tipoDocSolicitanteNew) {
		this.tipoDocSolicitanteNew = tipoDocSolicitanteNew;
	}

	public String getNombreEmpresaNew() {
		return nombreEmpresaNew;
	}

	public void setNombreEmpresaNew(String nombreEmpresaNew) {
		this.nombreEmpresaNew = nombreEmpresaNew;
	}

	public String getNumDocRepLegalNew() {
		return numDocRepLegalNew;
	}

	public void setNumDocRepLegalNew(String numDocRepLegalNew) {
		this.numDocRepLegalNew = numDocRepLegalNew;
	}

	public Integer getTipoDocRepLegalNew() {
		return tipoDocRepLegalNew;
	}

	public void setTipoDocRepLegalNew(Integer tipoDocRepLegalNew) {
		this.tipoDocRepLegalNew = tipoDocRepLegalNew;
	}

	public String getNombreRepLegalNew() {
		return nombreRepLegalNew;
	}

	public void setNombreRepLegalNew(String nombreRepLegalNew) {
		this.nombreRepLegalNew = nombreRepLegalNew;
	}

	public String getCodigoEstablecimientoNew() {
		return codigoEstablecimientoNew;
	}

	public void setCodigoEstablecimientoNew(String codigoEstablecimientoNew) {
		this.codigoEstablecimientoNew = codigoEstablecimientoNew;
	}

	public String getCategoriaEstablecimientoNew() {
		return categoriaEstablecimientoNew;
	}

	public void setCategoriaEstablecimientoNew(String categoriaEstablecimientoNew) {
		this.categoriaEstablecimientoNew = categoriaEstablecimientoNew;
	}

	public String getDireccionEstablecimientoNew() {
		return direccionEstablecimientoNew;
	}

	public void setDireccionEstablecimientoNew(String direccionEstablecimientoNew) {
		this.direccionEstablecimientoNew = direccionEstablecimientoNew;
	}

	public String getRepresentanteLegalNew() {
		return representanteLegalNew;
	}

	public void setRepresentanteLegalNew(String representanteLegalNew) {
		this.representanteLegalNew = representanteLegalNew;
	}

	public String getCodigoRegenteNew() {
		return codigoRegenteNew;
	}

	public void setCodigoRegenteNew(String codigoRegenteNew) {
		this.codigoRegenteNew = codigoRegenteNew;
	}

	public String getCargoRegenteNew() {
		return cargoRegenteNew;
	}

	public void setCargoRegenteNew(String cargoRegenteNew) {
		this.cargoRegenteNew = cargoRegenteNew;
	}

	public Long getUsuarioIdNew() {
		return usuarioIdNew;
	}

	public void setUsuarioIdNew(Long usuarioIdNew) {
		this.usuarioIdNew = usuarioIdNew;
	}

	public String getIdDireccionEstablecimiento() {
		return idDireccionEstablecimiento;
	}

	public void setIdDireccionEstablecimiento(String idDireccionEstablecimiento) {
		this.idDireccionEstablecimiento = idDireccionEstablecimiento;
	}

	public List<DGM048Detalle> getDgm048detalles() {
		return dgm048detalles;
	}

	public void setDgm048detalles(List<DGM048Detalle> dgm048detalles) {
		this.dgm048detalles = dgm048detalles;
	}

	public String getIdDireccionEstablecimientoNew() {
		return idDireccionEstablecimientoNew;
	}

	public void setIdDireccionEstablecimientoNew(
			String idDireccionEstablecimientoNew) {
		this.idDireccionEstablecimientoNew = idDireccionEstablecimientoNew;
	}

	public String getNombreCargoRegenteNew() {
		return nombreCargoRegenteNew;
	}

	public void setNombreCargoRegenteNew(String nombreCargoRegenteNew) {
		this.nombreCargoRegenteNew = nombreCargoRegenteNew;
	}

	public String getTipoDocSolicitanteNewDesc() {
		return tipoDocSolicitanteNewDesc;
	}

	public void setTipoDocSolicitanteNewDesc(String tipoDocSolicitanteNewDesc) {
		this.tipoDocSolicitanteNewDesc = tipoDocSolicitanteNewDesc;
	}

	public String getTipoDocRepLegalNewDesc() {
		return tipoDocRepLegalNewDesc;
	}

	public void setTipoDocRepLegalNewDesc(String tipoDocRepLegalNewDesc) {
		this.tipoDocRepLegalNewDesc = tipoDocRepLegalNewDesc;
	}
    /*
	public Long getTupaIdAModificar() {
		return tupaIdAModificar;
	}

	public void setTupaIdAModificar(Long tupaIdAModificar) {
		this.tupaIdAModificar = tupaIdAModificar;
	}*/




}
