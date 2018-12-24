package pe.prueba.domain.dgm;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM007SustentoSolventeTA {

	private Long dgm007Id; 
	private Long secuenciaSolvente; 
	private Long secuencia; 
	private String sustento; 

	public Long getDgm007Id() {
		return dgm007Id;
	}
	public void setDgm007Id(Long dgm007Id) {
		this.dgm007Id = dgm007Id;
	}
	public Long getSecuenciaSolvente() {
		return secuenciaSolvente;
	}
	public void setSecuenciaSolvente(Long secuenciaSolvente) {
		this.secuenciaSolvente = secuenciaSolvente;
	}
	public Long getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	public String getSustento() {
		return sustento;
	}
	public void setSustento(String sustento) {
		this.sustento = sustento;
	}
}
