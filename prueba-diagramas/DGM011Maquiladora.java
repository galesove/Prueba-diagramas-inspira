package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

import org.jlis.core.util.HashUtil;

public class DGM011Maquiladora {

	private Long dgm011Id; 
	private Integer secuencia; 
	private String origen; 
	private String maquiladoraNacional; 
	private String maquiladoraExtranjera; 
	private String paisMaquiladora;
	private Integer dgmTipoMaquila;
	
	//AEP 01/02: DGM-002-2017 
	private String esMaquiladoraCata;
	private String nombreMaquiladora;
	
	public String getPaisMaquiladora() {
		return paisMaquiladora;
	}
	public void setPaisMaquiladora(String paisMaquiladora) {
		this.paisMaquiladora = paisMaquiladora;
	}
	public Long getDgm011Id() {
		return dgm011Id;
	}
	public void setDgm011Id(Long dgm011Id) {
		this.dgm011Id = dgm011Id;
	}
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getMaquiladoraNacional() {
		return maquiladoraNacional;
	}
	public void setMaquiladoraNacional(String maquiladoraNacional) {
		this.maquiladoraNacional = maquiladoraNacional;
	}
	public String getMaquiladoraExtranjera() {
		return maquiladoraExtranjera;
	}
	public void setMaquiladoraExtranjera(String maquiladoraExtranjera) {
		this.maquiladoraExtranjera = maquiladoraExtranjera;
	}
	public Integer getDgmTipoMaquila() {
		return dgmTipoMaquila;
	}
	public void setDgmTipoMaquila(Integer dgmTipoMaquila) {
		this.dgmTipoMaquila = dgmTipoMaquila;
	}
	public String getEsMaquiladoraCata() {
		return esMaquiladoraCata;
	}
	public void setEsMaquiladoraCata(String esMaquiladoraCata) {
		this.esMaquiladoraCata = esMaquiladoraCata;
	}
	public String getNombreMaquiladora() {
		return nombreMaquiladora;
	}
	public void setNombreMaquiladora(String nombreMaquiladora) {
		this.nombreMaquiladora = nombreMaquiladora;
	}
}
