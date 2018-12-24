package pe.prueba.domain.dgm;

import java.math.BigDecimal;

public class DGM007Solvente {

	private Long dgm007Id; 
	private Long secuencia; 
	private String sustancia; 
	private BigDecimal sustanciaSal; 
	private BigDecimal sustanciaBase; 
	private String unidadMedida; 
	private String comentario; 
	/*private List<DGM007SustentoSolventeTA> dgm007sustentosolventetas = new ArrayList<DGM007SustentoSolventeTA>();
	private List<DGM007SustentoSolventeET> dgm007sustentosolventeets = new ArrayList<DGM007SustentoSolventeET>();
*/
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
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	/*public List getDgm007sustentosolventetas() {
		return this.dgm007sustentosolventetas;
	}
	public void setDgm007sustentosolventetas (List<DGM007SustentoSolventeTA> dgm007sustentosolventetas) {
		this.dgm007sustentosolventetas = dgm007sustentosolventetas;
	}
	public void addDgm007sustentosolventetas (DGM007SustentoSolventeTA dgm007sustentosolventeta) {
		this.dgm007sustentosolventetas.add(dgm007sustentosolventeta);
	}
	public List getDgm007sustentosolventeets() {
		return this.dgm007sustentosolventeets;
	}
	public void setDgm007sustentosolventeets (List<DGM007SustentoSolventeET> dgm007sustentosolventeets) {
		this.dgm007sustentosolventeets = dgm007sustentosolventeets;
	}
	public void addDgm007sustentosolventeets (DGM007SustentoSolventeET dgm007sustentosolventeet) {
		this.dgm007sustentosolventeets.add(dgm007sustentosolventeet);
	}*/
}
