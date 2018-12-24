package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM007RegistroPais {
	
	private Long dgm007Id;
	private Long secuencia;
	private String pais;
	private String paisOtro;
	
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPaisOtro() {
		return paisOtro;
	}
	public void setPaisOtro(String paisOtro) {
		this.paisOtro = paisOtro;
	}

}
