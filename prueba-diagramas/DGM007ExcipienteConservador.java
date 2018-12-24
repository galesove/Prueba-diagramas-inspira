package pe.prueba.domain.dgm;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DGM007ExcipienteConservador {

	private Long dgm007Id; 
	private Long secuencia; 
	private String sustancia; 
	private BigDecimal cantidad; 
	private String unidadMedida; 
	private String comentario; 
	//private List<DGM007SustentoConservadorTA> dgm007sustentoconservadortas = new ArrayList<DGM007SustentoConservadorTA>();
	//private List<DGM007SustentoConservadorET> dgm007sustentoconservadorets = new ArrayList<DGM007SustentoConservadorET>();

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
	public BigDecimal getCantidad() {
		return cantidad;
	}
	public void setCantidad(BigDecimal cantidad) {
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
	/*public List getDgm007sustentoconservadortas() {
		return this.dgm007sustentoconservadortas;
	}
	public void setDgm007sustentoconservadortas (List<DGM007SustentoConservadorTA> dgm007sustentoconservadortas) {
		this.dgm007sustentoconservadortas = dgm007sustentoconservadortas;
	}
	public void addDgm007sustentoconservadortas (DGM007SustentoConservadorTA dgm007sustentoconservadorta) {
		this.dgm007sustentoconservadortas.add(dgm007sustentoconservadorta);
	}
	public List getDgm007sustentoconservadorets() {
		return this.dgm007sustentoconservadorets;
	}
	public void setDgm007sustentoconservadorets (List<DGM007SustentoConservadorET> dgm007sustentoconservadorets) {
		this.dgm007sustentoconservadorets = dgm007sustentoconservadorets;
	}
	public void addDgm007sustentoconservadorets (DGM007SustentoConservadorET dgm007sustentoconservadoret) {
		this.dgm007sustentoconservadorets.add(dgm007sustentoconservadoret);
	}*/
}
