package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.math.BigDecimal;
import java.util.List;

public class DGM001PrincipioActivo {

	private Integer dgm001Id;
	
	private Integer secuencia;
	
	private Integer secPrincipioActivo; 
	
	private String codigoSustancia;
	
	private String otroPrincipioActivo;
	
	private BigDecimal cantidadSustanciaSal;
	
	private BigDecimal cantidadSustanciaEnBase;
	
	private String unidadMedida;
	
	//private String codigoClaseFarmacologica;	

	private String otraClasificacionFarmacologica;
	
	private List<DGM001SustentoPrincipioActivoET> sustentosPrincipioActivoET;
	
	private List<DGM001SustentoPrincipioActivoTA> sustentosPrincipioActivoTA;
	
	private String comentario;
	
	private String          tipoClasificacionAtc;
	private String          clasificacionAtc;

	public Integer getDgm001Id() {
		return dgm001Id;
	}

	public void setDgm001Id(Integer dgm001Id) {
		this.dgm001Id = dgm001Id;
	}

	public Integer getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}

	public Integer getSecPrincipioActivo() {
		return secPrincipioActivo;
	}

	public void setSecPrincipioActivo(Integer secPrincipioActivo) {
		this.secPrincipioActivo = secPrincipioActivo;
	}

	public String getCodigoSustancia() {
		return codigoSustancia;
	}

	public void setCodigoSustancia(String codigoSustancia) {
		this.codigoSustancia = codigoSustancia;
	}

	public String getOtroPrincipioActivo() {
		return otroPrincipioActivo;
	}

	public void setOtroPrincipioActivo(String otroPrincipioActivo) {
		this.otroPrincipioActivo = otroPrincipioActivo;
	}

	public BigDecimal getCantidadSustanciaSal() {
		return cantidadSustanciaSal;
	}

	public void setCantidadSustanciaSal(BigDecimal cantidadSustanciaSal) {
		this.cantidadSustanciaSal = cantidadSustanciaSal;
	}

	public BigDecimal getCantidadSustanciaEnBase() {
		return cantidadSustanciaEnBase;
	}

	public void setCantidadSustanciaEnBase(BigDecimal cantidadSustanciaEnBase) {
		this.cantidadSustanciaEnBase = cantidadSustanciaEnBase;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getOtraClasificacionFarmacologica() {
		return otraClasificacionFarmacologica;
	}

	public void setOtraClasificacionFarmacologica(
			String otraClasificacionFarmacologica) {
		this.otraClasificacionFarmacologica = otraClasificacionFarmacologica;
	}

	public List<DGM001SustentoPrincipioActivoET> getSustentosPrincipioActivoET() {
		return sustentosPrincipioActivoET;
	}

	public void setSustentosPrincipioActivoET(
			List<DGM001SustentoPrincipioActivoET> sustentosPrincipioActivoET) {
		this.sustentosPrincipioActivoET = sustentosPrincipioActivoET;
	}

	public List<DGM001SustentoPrincipioActivoTA> getSustentosPrincipioActivoTA() {
		return sustentosPrincipioActivoTA;
	}

	public void setSustentosPrincipioActivoTA(
			List<DGM001SustentoPrincipioActivoTA> sustentosPrincipioActivoTA) {
		this.sustentosPrincipioActivoTA = sustentosPrincipioActivoTA;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	/*
	public String getCodigoClaseFarmacologica() {
		return codigoClaseFarmacologica;
	}

	public void setCodigoClaseFarmacologica(String codigoClaseFarmacologica) {
		this.codigoClaseFarmacologica = codigoClaseFarmacologica;
	}
	*/

	public String getTipoClasificacionAtc() {
		return tipoClasificacionAtc;
	}

	public void setTipoClasificacionAtc(String tipoClasificacionAtc) {
		this.tipoClasificacionAtc = tipoClasificacionAtc;
	}

	public String getClasificacionAtc() {
		return clasificacionAtc;
	}

	public void setClasificacionAtc(String clasificacionAtc) {
		this.clasificacionAtc = clasificacionAtc;
	}
	
}