package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034ExcipienteConservador {

	private Long dgm034Id; 
	private Long secuencia; 
	private String sustancia; 
	private Double cantidad; 
	private String unidadMedida; 
	private String comentario; 
	private List<DGM034SustentoConservadorTA> dgm034sustentoconservadortas = new ArrayList<DGM034SustentoConservadorTA>();
	private List<DGM034SustentoConservadorET> dgm034sustentoconservadorets = new ArrayList<DGM034SustentoConservadorET>();

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
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public List getDgm034sustentoconservadortas() {
		return this.dgm034sustentoconservadortas;
	}
	public void setDgm034sustentoconservadortas (List<DGM034SustentoConservadorTA> dgm034sustentoconservadortas) {
		this.dgm034sustentoconservadortas = dgm034sustentoconservadortas;
	}
	public void addDgm034sustentoconservadortas (DGM034SustentoConservadorTA dgm034sustentoconservadorta) {
		this.dgm034sustentoconservadortas.add(dgm034sustentoconservadorta);
	}
	public List getDgm034sustentoconservadorets() {
		return this.dgm034sustentoconservadorets;
	}
	public void setDgm034sustentoconservadorets (List<DGM034SustentoConservadorET> dgm034sustentoconservadorets) {
		this.dgm034sustentoconservadorets = dgm034sustentoconservadorets;
	}
	public void addDgm034sustentoconservadorets (DGM034SustentoConservadorET dgm034sustentoconservadoret) {
		this.dgm034sustentoconservadorets.add(dgm034sustentoconservadoret);
	}
}
