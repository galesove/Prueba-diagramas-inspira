package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034PrincipioActivo {

	private Long dgm034Id; 
	private Long secuencia; 
	private String sustancia; 
	private Double sustanciaSal; 
	private Double sustanciaBase; 
	private String unidadMedida; 
	private Integer claseFarmacologica; 
	private String comentario; 
	private List<DGM034SustentoPrincipioActivoET> dgm034sustentoprincipioactivoets = new ArrayList<DGM034SustentoPrincipioActivoET>();
	private List<DGM034SustentoPrincipioActivoTA> dgm034sustentoprincipioactivotas = new ArrayList<DGM034SustentoPrincipioActivoTA>();

	
	public void addDgm034sustentoprincipioactivoets (DGM034SustentoPrincipioActivoET dgm034sustentoprincipioactivoet) {
		this.dgm034sustentoprincipioactivoets.add(dgm034sustentoprincipioactivoet);
	}
	public void addDgm034sustentoprincipioactivotas (DGM034SustentoPrincipioActivoTA dgm034sustentoprincipioactivota) {
		this.dgm034sustentoprincipioactivotas.add(dgm034sustentoprincipioactivota);
	}
	public Long getDgm034Id() {
		return dgm034Id;
	}
	public void setDgm034Id(Long dgm034Id) {
		this.dgm034Id = dgm034Id;
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
	public Double getSustanciaSal() {
		return sustanciaSal;
	}
	public void setSustanciaSal(Double sustanciaSal) {
		this.sustanciaSal = sustanciaSal;
	}
	public Double getSustanciaBase() {
		return sustanciaBase;
	}
	public void setSustanciaBase(Double sustanciaBase) {
		this.sustanciaBase = sustanciaBase;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public Integer getClaseFarmacologica() {
		return claseFarmacologica;
	}
	public void setClaseFarmacologica(Integer claseFarmacologica) {
		this.claseFarmacologica = claseFarmacologica;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public List<DGM034SustentoPrincipioActivoET> getDgm034sustentoprincipioactivoets() {
		return dgm034sustentoprincipioactivoets;
	}
	public void setDgm034sustentoprincipioactivoets(
			List<DGM034SustentoPrincipioActivoET> dgm034sustentoprincipioactivoets) {
		this.dgm034sustentoprincipioactivoets = dgm034sustentoprincipioactivoets;
	}
	public List<DGM034SustentoPrincipioActivoTA> getDgm034sustentoprincipioactivotas() {
		return dgm034sustentoprincipioactivotas;
	}
	public void setDgm034sustentoprincipioactivotas(
			List<DGM034SustentoPrincipioActivoTA> dgm034sustentoprincipioactivotas) {
		this.dgm034sustentoprincipioactivotas = dgm034sustentoprincipioactivotas;
	}
	
}
