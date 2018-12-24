package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034Solvente {

	private Long dgm034Id; 
	private Long secuencia; 
	private String sustancia; 
	private double sustanciaSal; 
	private double sustanciaBase; 
	private String unidadMedida; 
	private String comentario; 
	private List<DGM034SustentoSolventeTA> dgm034sustentosolventetas = new ArrayList<DGM034SustentoSolventeTA>();
	private List<DGM034SustentoSolventeET> dgm034sustentosolventeets = new ArrayList<DGM034SustentoSolventeET>();

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
	public double getSustanciaSal() {
		return sustanciaSal;
	}
	public void setSustanciaSal(double sustanciaSal) {
		this.sustanciaSal = sustanciaSal;
	}
	public double getSustanciaBase() {
		return sustanciaBase;
	}
	public void setSustanciaBase(double sustanciaBase) {
		this.sustanciaBase = sustanciaBase;
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
	public List getDgm034sustentosolventetas() {
		return this.dgm034sustentosolventetas;
	}
	public void setDgm034sustentosolventetas (List<DGM034SustentoSolventeTA> dgm034sustentosolventetas) {
		this.dgm034sustentosolventetas = dgm034sustentosolventetas;
	}
	public void addDgm034sustentosolventetas (DGM034SustentoSolventeTA dgm034sustentosolventeta) {
		this.dgm034sustentosolventetas.add(dgm034sustentosolventeta);
	}
	public List getDgm034sustentosolventeets() {
		return this.dgm034sustentosolventeets;
	}
	public void setDgm034sustentosolventeets (List<DGM034SustentoSolventeET> dgm034sustentosolventeets) {
		this.dgm034sustentosolventeets = dgm034sustentosolventeets;
	}
	public void addDgm034sustentosolventeets (DGM034SustentoSolventeET dgm034sustentosolventeet) {
		this.dgm034sustentosolventeets.add(dgm034sustentosolventeet);
	}
}
