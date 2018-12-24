package pe.prueba.domain.dgm;
import java.util.ArrayList;
import java.util.List;

public class DGM007EnvaseMediato {

	private Long dgm007Id; 
	private Long secuencia; 
	private Integer tipo; 
	private Integer material; 
	
	private List<DGM007MaterialEnvaseMed> dgm007MaterialEnvaseMed = new ArrayList<DGM007MaterialEnvaseMed>();
	//private List<DGM007FuenteReferenciaEnvaseMediato> dgm007fuentereferenciaenvasemediatos = new ArrayList<DGM007FuenteReferenciaEnvaseMediato>();

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
	/*public List getDgm007fuentereferenciaenvasemediatos() {
		return this.dgm007fuentereferenciaenvasemediatos;
	}
	public void setDgm007fuentereferenciaenvasemediatos (List<DGM007FuenteReferenciaEnvaseMediato> dgm007fuentereferenciaenvasemediatos) {
		this.dgm007fuentereferenciaenvasemediatos = dgm007fuentereferenciaenvasemediatos;
	}
	public void addDgm007fuentereferenciaenvasemediatos (DGM007FuenteReferenciaEnvaseMediato dgm007fuentereferenciaenvasemediato) {
		this.dgm007fuentereferenciaenvasemediatos.add(dgm007fuentereferenciaenvasemediato);
	}*/
	public List<DGM007MaterialEnvaseMed> getDgm007MaterialEnvaseMed() {
		return dgm007MaterialEnvaseMed;
	}
	public void setDgm007MaterialEnvaseMed(
			List<DGM007MaterialEnvaseMed> dgm007MaterialEnvaseMed) {
		this.dgm007MaterialEnvaseMed = dgm007MaterialEnvaseMed;
	}
}
