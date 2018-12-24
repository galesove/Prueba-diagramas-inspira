package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;


public class DGM041EnvaseInmediato {

	private Long dgm041Id; 
	private Integer secuenciaEnvInmediato; 
	private Integer tipoEnvaseAnterior; 
	//private Integer materialEnvaseAnterior; 
	//private Integer colorEnvaseAnterior; 
	private Integer tipoEnvaseNuevo; 
	//private Integer materialEnvaseNuevo; 
	//private Integer colorEnvaseNuevo; 
	private String tipoTapaAnterior;
    private String tipoTapaNuevo;
    
    private List<DGM041MaterialEnvaseInm> dgm041MaterialEnvaseInmediatos = new ArrayList<DGM041MaterialEnvaseInm>();    
    
	public Long getDgm041Id() {
		return dgm041Id;
	}

	public List<DGM041MaterialEnvaseInm> getDgm041MaterialEnvaseInmediatos() {
		return dgm041MaterialEnvaseInmediatos;
	}

	public void setDgm041MaterialEnvaseInmediatos(
			List<DGM041MaterialEnvaseInm> dgm041MaterialEnvaseInmediatos) {
		this.dgm041MaterialEnvaseInmediatos = dgm041MaterialEnvaseInmediatos;
	}
	
	public void addDgm041MaterialEnvaseInmediatos(
			DGM041MaterialEnvaseInm dgm041MaterialEnvaseInmediatos) {
		this.dgm041MaterialEnvaseInmediatos.add(dgm041MaterialEnvaseInmediatos);
	}	

	public void setDgm041Id(Long dgm041Id) {
		this.dgm041Id = dgm041Id;
	}
	public Integer getSecuenciaEnvInmediato() {
		return secuenciaEnvInmediato;
	}
	public void setSecuenciaEnvInmediato(Integer secuenciaEnvInmediato) {
		this.secuenciaEnvInmediato = secuenciaEnvInmediato;
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
	}
	public Integer getColorEnvaseAnterior() {
		return colorEnvaseAnterior;
	}
	public void setColorEnvaseAnterior(Integer colorEnvaseAnterior) {
		this.colorEnvaseAnterior = colorEnvaseAnterior;
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
	}
	public Integer getColorEnvaseNuevo() {
		return colorEnvaseNuevo;
	}
	public void setColorEnvaseNuevo(Integer colorEnvaseNuevo) {
		this.colorEnvaseNuevo = colorEnvaseNuevo;
	}*/
	public void setTipoTapaAnterior(String tipoTapaAnterior) {
		this.tipoTapaAnterior = tipoTapaAnterior;
	}
	public String getTipoTapaNuevo() {
		return tipoTapaNuevo;
	}
	public void setTipoTapaNuevo(String tipoTapaNuevo) {
		this.tipoTapaNuevo = tipoTapaNuevo;
	}
	public String getTipoTapaAnterior() {
		return tipoTapaAnterior;
	}
	
}
