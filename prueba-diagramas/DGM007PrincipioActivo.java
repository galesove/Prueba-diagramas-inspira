package pe.prueba.domain.dgm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DGM007PrincipioActivo {

	private Long dgm007Id; 
	private Long secuencia; 
	private String sustancia; 
	private BigDecimal sustanciaSal; 
	private BigDecimal sustanciaBase; 
	private String unidadMedida; 
	//private Integer claseFarmacologica; 
	private String comentario; 
	
	private String          tipoClasificacionAtc;
	private String          clasificacionAtc;
	
	
	//private List<DGM007SustentoPrincipioActivoET> dgm007sustentoprincipioactivoets = new ArrayList<DGM007SustentoPrincipioActivoET>();
	//private List<DGM007SustentoPrincipioActivoTA> dgm007sustentoprincipioactivotas = new ArrayList<DGM007SustentoPrincipioActivoTA>();

	public Long getDgm007Id() {
		return dgm007Id;
	}
	public void setDgm007Id(Long dgm007Id) {
		this.dgm007Id = dgm007Id;
	}
	public Long getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	public String getSustancia() {
		return sustancia;
	}
	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}
	public BigDecimal getSustanciaSal() {
		return sustanciaSal;
	}
	public void setSustanciaSal(BigDecimal sustanciaSal) {
		this.sustanciaSal = sustanciaSal;
	}
	public BigDecimal getSustanciaBase() {
		return sustanciaBase;
	}
	public void setSustanciaBase(BigDecimal sustanciaBase) {
		this.sustanciaBase = sustanciaBase;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	/*
	public Integer getClaseFarmacologica() {
		return claseFarmacologica;
	}
	public void setClaseFarmacologica(Integer claseFarmacologica) {
		this.claseFarmacologica = claseFarmacologica;
	}
	*/
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	/*public List getDgm007sustentoprincipioactivoets() {
		return this.dgm007sustentoprincipioactivoets;
	}
	public void setDgm007sustentoprincipioactivoets (List<DGM007SustentoPrincipioActivoET> dgm007sustentoprincipioactivoets) {
		this.dgm007sustentoprincipioactivoets = dgm007sustentoprincipioactivoets;
	}
	public void addDgm007sustentoprincipioactivoets (DGM007SustentoPrincipioActivoET dgm007sustentoprincipioactivoet) {
		this.dgm007sustentoprincipioactivoets.add(dgm007sustentoprincipioactivoet);
	}
	public List getDgm007sustentoprincipioactivotas() {
		return this.dgm007sustentoprincipioactivotas;
	}
	public void setDgm007sustentoprincipioactivotas (List<DGM007SustentoPrincipioActivoTA> dgm007sustentoprincipioactivotas) {
		this.dgm007sustentoprincipioactivotas = dgm007sustentoprincipioactivotas;
	}
	public void addDgm007sustentoprincipioactivotas (DGM007SustentoPrincipioActivoTA dgm007sustentoprincipioactivota) {
		this.dgm007sustentoprincipioactivotas.add(dgm007sustentoprincipioactivota);
	}*/
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
