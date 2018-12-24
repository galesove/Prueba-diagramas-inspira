package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM008EnvaseInmediato {

	private Long dgm008Id; 
	private Integer secuenciaEnvInmediato; 
	private String envaseInmediato; 
	private String material;
	
	// Version II
	private Integer codigoEnvase;
	private Integer codigoMaterial;
	
	//VERSION III
	private String esCatalogado;
	private String tipoEnvaseInmediato;
	private String materialEnvaseInmediato;
	
	public Long getDgm008Id() {
		return dgm008Id;
	}
	public void setDgm008Id(Long dgm008Id) {
		this.dgm008Id = dgm008Id;
	}
	public Integer getSecuenciaEnvInmediato() {
		return secuenciaEnvInmediato;
	}
	public void setSecuenciaEnvInmediato(Integer secuenciaEnvInmediato) {
		this.secuenciaEnvInmediato = secuenciaEnvInmediato;
	}
	public String getEnvaseInmediato() {
		return envaseInmediato;
	}
	public void setEnvaseInmediato(String envaseInmediato) {
		this.envaseInmediato = envaseInmediato;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Integer getCodigoEnvase() {
		return codigoEnvase;
	}
	public void setCodigoEnvase(Integer codigoEnvase) {
		this.codigoEnvase = codigoEnvase;
	}
	public Integer getCodigoMaterial() {
		return codigoMaterial;
	}
	public void setCodigoMaterial(Integer codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}
	public String getEsCatalogado() {
		return esCatalogado;
	}
	public void setEsCatalogado(String esCatalogado) {
		this.esCatalogado = esCatalogado;
	}
	public String getTipoEnvaseInmediato() {
		return tipoEnvaseInmediato;
	}
	public void setTipoEnvaseInmediato(String tipoEnvaseInmediato) {
		this.tipoEnvaseInmediato = tipoEnvaseInmediato;
	}
	public String getMaterialEnvaseInmediato() {
		return materialEnvaseInmediato;
	}
	public void setMaterialEnvaseInmediato(String materialEnvaseInmediato) {
		this.materialEnvaseInmediato = materialEnvaseInmediato;
	}
}