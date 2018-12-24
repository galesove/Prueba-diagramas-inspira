package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034EnvaseMediato {

	private Long dgm034Id; 
	private Long secuencia; 
	private Integer tipo; 
	private Integer material; 
	
	private List<DGM034FuenteReferenciaEnvaseMediato> dgm034fuentereferenciaenvasemediatos = new ArrayList<DGM034FuenteReferenciaEnvaseMediato>();

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
	public Integer getMaterial() {
		return material;
	}
	public void setMaterial(Integer material) {
		this.material = material;
	}
	public List getDgm034fuentereferenciaenvasemediatos() {
		return this.dgm034fuentereferenciaenvasemediatos;
	}
	public void setDgm034fuentereferenciaenvasemediatos (List<DGM034FuenteReferenciaEnvaseMediato> dgm034fuentereferenciaenvasemediatos) {
		this.dgm034fuentereferenciaenvasemediatos = dgm034fuentereferenciaenvasemediatos;
	}
	public void addDgm034fuentereferenciaenvasemediatos (DGM034FuenteReferenciaEnvaseMediato dgm034fuentereferenciaenvasemediato) {
		this.dgm034fuentereferenciaenvasemediatos.add(dgm034fuentereferenciaenvasemediato);
	}
}
