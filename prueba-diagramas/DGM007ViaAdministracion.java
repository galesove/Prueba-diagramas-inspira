package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM007ViaAdministracion {

	private Long dgm007Id; 
	private Long secuencia; 
	private String viaAdministracion; 

	public Long getDgm007Id() {
		return dgm007Id;
	}
	public void setDgm007Id(Long dgm007Id) {
		this.dgm007Id = dgm007Id;
	}
	public Long getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	public String getViaAdministracion() {
		return viaAdministracion;
	}
	public void setViaAdministracion(String viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
	}
}
