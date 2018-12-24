package pe.prueba.domain.dgm;
import java.util.List;
import java.util.ArrayList;

public class DGM007EnvaseInmediato {

	private Long dgm007Id; 
	private Long secuencia; 
	private Integer tipo; 
	private String tipoTapa;
	
	private List<DGM007MaterialEnvaseInm> dgm007MaterialEnvaseInm = new ArrayList<DGM007MaterialEnvaseInm>();

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

	public List<DGM007MaterialEnvaseInm> getDgm007MaterialEnvaseInm() {
		return dgm007MaterialEnvaseInm;
	}
	public void setDgm007MaterialEnvaseInm(
			List<DGM007MaterialEnvaseInm> dgm007MaterialEnvaseInm) {
		this.dgm007MaterialEnvaseInm = dgm007MaterialEnvaseInm;
	}
	public void addDgm007MaterialEnvaseInm (DGM007MaterialEnvaseInm dgm07MaterialEnvaseInm) {
		this.dgm007MaterialEnvaseInm.add(dgm07MaterialEnvaseInm);
	}
	public String getTipoTapa() {
		return tipoTapa;
	}
	public void setTipoTapa(String tipoTapa) {
		this.tipoTapa = tipoTapa;
	}
	
}
