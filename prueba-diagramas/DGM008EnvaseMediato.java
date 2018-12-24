package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM008EnvaseMediato {

	private Long dgm008Id; 
	private Integer secuenciaEnvMediato; 
	private Integer envaseMediato; //verificar el nombre de este atributo -- campo=envase_mediato ## avisar a cotolin cuando se corrija, si se corrije!!!!
	private Integer material;    
	
	//VERSION III
	private String esCatalogado;
	private String tipoEnvaseMediato;
	private String materialEnvaseMediato;
	
	public Long getDgm008Id() {
		return dgm008Id;
	}
	public void setDgm008Id(Long dgm008Id) {
		this.dgm008Id = dgm008Id;
	}
	public Integer getSecuenciaEnvMediato() {
		return secuenciaEnvMediato;
	}
	public void setSecuenciaEnvMediato(Integer secuenciaEnvMediato) {
		this.secuenciaEnvMediato = secuenciaEnvMediato;
	}
	public Integer getEnvaseMediato() {
		return envaseMediato;
	}
	public void setEnvaseMediato(Integer envaseMediato) {
		this.envaseMediato = envaseMediato;
	}
	public Integer getMaterial() {
		return material;
	}
	public void setMaterial(Integer material) {
		this.material = material;
	}
	public String getEsCatalogado() {
		return esCatalogado;
	}
	public void setEsCatalogado(String esCatalogado) {
		this.esCatalogado = esCatalogado;
	}
	public String getTipoEnvaseMediato() {
		return tipoEnvaseMediato;
	}
	public void setTipoEnvaseMediato(String tipoEnvaseMediato) {
		this.tipoEnvaseMediato = tipoEnvaseMediato;
	}
	public String getMaterialEnvaseMediato() {
		return materialEnvaseMediato;
	}
	public void setMaterialEnvaseMediato(String materialEnvaseMediato) {
		this.materialEnvaseMediato = materialEnvaseMediato;
	}
}