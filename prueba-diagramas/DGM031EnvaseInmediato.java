package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;
import org.jlis.core.util.HashUtil;

public class DGM031EnvaseInmediato {

	private Long dgm031Id; 
	private Integer secuencia; 
	private Integer tipo; 
	private Integer material; 
	private Integer color; 
	private List<DGM031FuenteReferenciaEnvaseInmediato> dgm031fuentereferenciaenvaseinmediatos = new ArrayList<DGM031FuenteReferenciaEnvaseInmediato>();

	public Long getDgm031Id() {
		return dgm031Id;
	}
	public void setDgm031Id(Long dgm031Id) {
		this.dgm031Id = dgm031Id;
	}
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Integer getMaterial() {
		return material;
	}
	public void setMaterial(Integer material) {
		this.material = material;
	}
	public Integer getColor() {
		return color;
	}
	public void setColor(Integer color) {
		this.color = color;
	}
	public List getDgm031fuentereferenciaenvaseinmediatos() {
		return this.dgm031fuentereferenciaenvaseinmediatos;
	}
	public void setDgm031fuentereferenciaenvaseinmediatos (List<DGM031FuenteReferenciaEnvaseInmediato> dgm031fuentereferenciaenvaseinmediatos) {
		this.dgm031fuentereferenciaenvaseinmediatos = dgm031fuentereferenciaenvaseinmediatos;
	}
	public void addDgm031fuentereferenciaenvaseinmediatos (DGM031FuenteReferenciaEnvaseInmediato dgm031fuentereferenciaenvaseinmediato) {
		this.dgm031fuentereferenciaenvaseinmediatos.add(dgm031fuentereferenciaenvaseinmediato);
	}
}
