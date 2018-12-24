package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM065Maquila {

	private Long dgm065Id;
	private Integer secuenciaFabricante;
	private Integer secuenciaMaquila;
	private String origen;
	private Integer dgmTipoMaquila;
	private String esCatalogo;
	private String nombreEmpresa;
	private String empresaNacional;
	private String empresaExtranjera;
	
	public Long getDgm065Id() {
		return dgm065Id;
	}

	public void setDgm065Id(Long dgm065Id) {
		this.dgm065Id = dgm065Id;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Integer getDgmTipoMaquila() {
		return dgmTipoMaquila;
	}

	public void setDgmTipoMaquila(Integer dgmTipoMaquila) {
		this.dgmTipoMaquila = dgmTipoMaquila;
	}

	public String getEsCatalogo() {
		return esCatalogo;
	}

	public void setEsCatalogo(String esCatalogo) {
		this.esCatalogo = esCatalogo;
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

}
