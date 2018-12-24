package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.Date;
import java.util.List;

public class DGM070Maquila {	
	private Long            dgm070Id;
	private Integer         secuenciaFabricante;
	private Integer         secuenciaMaquila;
	private String          origenEmpresa;
	private Integer         dgmTipoMaquila;
	private String          nombreEmpresa;
	private String          empresaNacional;
	private String          empresaExtranjera;
	private String          paraLaEmpresa;
	
	public Long getDgm070Id() {
		return dgm070Id;
	}
	public void setDgm070Id(Long dgm070Id) {
		this.dgm070Id = dgm070Id;
	}
	public Integer getSecuenciaFabricante() {
		return secuenciaFabricante;
	}
	public void setSecuenciaFabricante(Integer secuenciaFabricante) {
		this.secuenciaFabricante = secuenciaFabricante;
	}
	public Integer getSecuenciaMaquila() {
		return secuenciaMaquila;
	}
	public void setSecuenciaMaquila(Integer secuenciaMaquila) {
		this.secuenciaMaquila = secuenciaMaquila;
	}
	public String getOrigenEmpresa() {
		return origenEmpresa;
	}
	public void setOrigenEmpresa(String origenEmpresa) {
		this.origenEmpresa = origenEmpresa;
	}
	public Integer getDgmTipoMaquila() {
		return dgmTipoMaquila;
	}
	public void setDgmTipoMaquila(Integer dgmTipoMaquila) {
		this.dgmTipoMaquila = dgmTipoMaquila;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getEmpresaNacional() {
		return empresaNacional;
	}
	public void setEmpresaNacional(String empresaNacional) {
		this.empresaNacional = empresaNacional;
	}
	public String getEmpresaExtranjera() {
		return empresaExtranjera;
	}
	public void setEmpresaExtranjera(String empresaExtranjera) {
		this.empresaExtranjera = empresaExtranjera;
	}
	public String getParaLaEmpresa() {
		return paraLaEmpresa;
	}
	public void setParaLaEmpresa(String paraLaEmpresa) {
		this.paraLaEmpresa = paraLaEmpresa;
	}
	
	
	
}
