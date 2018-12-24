package pe.prueba.domain.dgm;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DGM007ExcipienteOtros {

	private Long dgm007Id; 
	private Long secuencia; 
	private String sustancia; 
	private BigDecimal cantidad; 
	private String unidadMedida; 
	private String comentario; 
	//private List<DGM007SustentoExipientoOtroTA> dgm007sustentoexipientootrotas = new ArrayList<DGM007SustentoExipientoOtroTA>();
	//private List<DGM007SustentoExipientoOtroET> dgm007sustentoexipientootroets = new ArrayList<DGM007SustentoExipientoOtroET>();

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
	/*public List getDgm007sustentoexipientootrotas() {
		return this.dgm007sustentoexipientootrotas;
	}
	public void setDgm007sustentoexipientootrotas (List<DGM007SustentoExipientoOtroTA> dgm007sustentoexipientootrotas) {
		this.dgm007sustentoexipientootrotas = dgm007sustentoexipientootrotas;
	}
	public void addDgm007sustentoexipientootrotas (DGM007SustentoExipientoOtroTA dgm007sustentoexipientootrota) {
		this.dgm007sustentoexipientootrotas.add(dgm007sustentoexipientootrota);
	}
	public List getDgm007sustentoexipientootroets() {
		return this.dgm007sustentoexipientootroets;
	}
	public void setDgm007sustentoexipientootroets (List<DGM007SustentoExipientoOtroET> dgm007sustentoexipientootroets) {
		this.dgm007sustentoexipientootroets = dgm007sustentoexipientootroets;
	}
	public void addDgm007sustentoexipientootroets (DGM007SustentoExipientoOtroET dgm007sustentoexipientootroet) {
		this.dgm007sustentoexipientootroets.add(dgm007sustentoexipientootroet);
	}*/
}
