package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034EnvaseInmediato {

	private Long dgm034Id; 
	private Long secuencia; 
	private Integer tipo; 
	private List<DGM034FuenteReferenciaEnvaseInmediato> dgm034fuentereferenciaenvaseinmediatos = new ArrayList<DGM034FuenteReferenciaEnvaseInmediato>();

	public Long getDgm034Id() {
		return dgm034Id;
	}
	public void setDgm034Id(Long dgm034Id) {
		this.dgm034Id = dgm034Id;
	}
	public Long getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public List getDgm034fuentereferenciaenvaseinmediatos() {
		return this.dgm034fuentereferenciaenvaseinmediatos;
	}
	public void setDgm034fuentereferenciaenvaseinmediatos (List<DGM034FuenteReferenciaEnvaseInmediato> dgm034fuentereferenciaenvaseinmediatos) {
		this.dgm034fuentereferenciaenvaseinmediatos = dgm034fuentereferenciaenvaseinmediatos;
	}
	public void addDgm034fuentereferenciaenvaseinmediatos (DGM034FuenteReferenciaEnvaseInmediato dgm034fuentereferenciaenvaseinmediato) {
		this.dgm034fuentereferenciaenvaseinmediatos.add(dgm034fuentereferenciaenvaseinmediato);
	}
}
