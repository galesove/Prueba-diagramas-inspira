package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;


public class DGM041EnvaseMediato {

	private Long dgm041Id; 
	private Integer secuenciaEnvMediato; 
	private Integer tipoEnvaseAnterior; 
	//private Integer materialEnvaseAnterior; 
	private Integer tipoEnvaseNuevo; 
	//private Integer materialEnvaseNuevo; 
	
	private List<DGM041MaterialEnvaseMed> dgm041MaterialEnvaseMediatos = new ArrayList<DGM041MaterialEnvaseMed>();

	
	public List<DGM041MaterialEnvaseMed> getDgm041MaterialEnvaseMediatos() {
		return dgm041MaterialEnvaseMediatos;
	}
	public void setDgm041MaterialEnvaseMediatos(
			List<DGM041MaterialEnvaseMed> dgm041MaterialEnvaseMediatos) {
		this.dgm041MaterialEnvaseMediatos = dgm041MaterialEnvaseMediatos;
	}
	public void addDgm041MaterialEnvaseMediatos(
			DGM041MaterialEnvaseMed dgm041MaterialEnvaseMediatos) {
		this.dgm041MaterialEnvaseMediatos.add(dgm041MaterialEnvaseMediatos);
	}	

	
	
	public Long getDgm041Id() {
		return dgm041Id;
	}
	public void setDgm041Id(Long dgm041Id) {
		this.dgm041Id = dgm041Id;
	}
	public Integer getSecuenciaEnvMediato() {
		return secuenciaEnvMediato;
	}
	public void setSecuenciaEnvMediato(Integer secuenciaEnvMediato) {
		this.secuenciaEnvMediato = secuenciaEnvMediato;
	}
	public Integer getTipoEnvaseAnterior() {
		return tipoEnvaseAnterior;
	}
	public void setTipoEnvaseAnterior(Integer tipoEnvaseAnterior) {
		this.tipoEnvaseAnterior = tipoEnvaseAnterior;
	}
	/*public Integer getMaterialEnvaseAnterior() {
		return materialEnvaseAnterior;
	}
	public void setMaterialEnvaseAnterior(Integer materialEnvaseAnterior) {
		this.materialEnvaseAnterior = materialEnvaseAnterior;
	}*/
	public Integer getTipoEnvaseNuevo() {
		return tipoEnvaseNuevo;
	}
	public void setTipoEnvaseNuevo(Integer tipoEnvaseNuevo) {
		this.tipoEnvaseNuevo = tipoEnvaseNuevo;
	}
	/*public Integer getMaterialEnvaseNuevo() {
		return materialEnvaseNuevo;
	}
	public void setMaterialEnvaseNuevo(Integer materialEnvaseNuevo) {
		this.materialEnvaseNuevo = materialEnvaseNuevo;
	}*/
}
