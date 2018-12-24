package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM018Maquila {

	private Long dgm018Id; 
	private Integer secuenciaFabricante; 
	private Integer secuenciaMaquila; 
	//private String esEnvasado; 
	//private String esEmpacado; 
	//private String esAcondicionado; 
	private String origenEmpresa; 
	private String nombreEmpresa; 
	private String empresaNacional; 
	private String empresaExtranjera; 
	private String paraLaEmpresa;
	private Integer dgmTipoMaquila;

	public Long getDgm018Id() {
		return dgm018Id;
	}
	public void setDgm018Id(Long dgm018Id) {
		this.dgm018Id = dgm018Id;
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
	public void setParaLaEmpresa(String paraLaEmpresa) {
		this.paraLaEmpresa = paraLaEmpresa;
	}
	public String getParaLaEmpresa() {
		return paraLaEmpresa;
	}
	public Integer getDgmTipoMaquila() {
		return dgmTipoMaquila;
	}
	public void setDgmTipoMaquila(Integer dgmTipoMaquila) {
		this.dgmTipoMaquila = dgmTipoMaquila;
	}
	
}
