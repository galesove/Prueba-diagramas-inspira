package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM031FuenteReferenciaEnvaseInmediato {

	private Long dgm031Id; 
	private Long secuenciaEnvaseInmediato; 
	private Long secuencia; 
	private String sustento; 

	public Long getDgm031Id() {
		return dgm031Id;
	}
	public void setDgm031Id(Long dgm031Id) {
		this.dgm031Id = dgm031Id;
	}
	public Long getSecuenciaEnvaseInmediato() {
		return secuenciaEnvaseInmediato;
	}
	public void setSecuenciaEnvaseInmediato(Long secuenciaEnvaseInmediato) {
		this.secuenciaEnvaseInmediato = secuenciaEnvaseInmediato;
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
