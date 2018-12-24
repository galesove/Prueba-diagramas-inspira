package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034ExcipienteOtros {

	private Long dgm034Id; 
	private Long secuencia; 
	private String sustancia; 
	private Double cantidad; 
	private String unidadMedida; 
	private String comentario; 
	private List<DGM034SustentoExipientoOtroTA> dgm034sustentoexipientootrotas = new ArrayList<DGM034SustentoExipientoOtroTA>();
	private List<DGM034SustentoExipientoOtroET> dgm034sustentoexipientootroets = new ArrayList<DGM034SustentoExipientoOtroET>();

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
	public List getDgm034sustentoexipientootrotas() {
		return this.dgm034sustentoexipientootrotas;
	}
	public void setDgm034sustentoexipientootrotas (List<DGM034SustentoExipientoOtroTA> dgm034sustentoexipientootrotas) {
		this.dgm034sustentoexipientootrotas = dgm034sustentoexipientootrotas;
	}
	public void addDgm034sustentoexipientootrotas (DGM034SustentoExipientoOtroTA dgm034sustentoexipientootrota) {
		this.dgm034sustentoexipientootrotas.add(dgm034sustentoexipientootrota);
	}
	public List getDgm034sustentoexipientootroets() {
		return this.dgm034sustentoexipientootroets;
	}
	public void setDgm034sustentoexipientootroets (List<DGM034SustentoExipientoOtroET> dgm034sustentoexipientootroets) {
		this.dgm034sustentoexipientootroets = dgm034sustentoexipientootroets;
	}
	public void addDgm034sustentoexipientootroets (DGM034SustentoExipientoOtroET dgm034sustentoexipientootroet) {
		this.dgm034sustentoexipientootroets.add(dgm034sustentoexipientootroet);
	}
}
