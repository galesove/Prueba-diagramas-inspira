package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM013Variedad {

	private Long dgm013Id; 
	private Integer secuenciaVariedad; 
	private String nombreVariedad; 
	private String flagCambio; 

	public Long getDgm013Id() {
		return dgm013Id;
	}
	public void setDgm013Id(Long dgm013Id) {
		this.dgm013Id = dgm013Id;
	}
	public Integer getSecuenciaVariedad() {
		return secuenciaVariedad;
	}
	public void setSecuenciaVariedad(Integer secuenciaVariedad) {
		this.secuenciaVariedad = secuenciaVariedad;
	}
	public String getNombreVariedad() {
		return nombreVariedad;
	}
	public void setNombreVariedad(String nombreVariedad) {
		this.nombreVariedad = nombreVariedad;
	}
	public String getFlagCambio() {
		return flagCambio;
	}
	public void setFlagCambio(String flagCambio) {
		this.flagCambio = flagCambio;
	}
}
