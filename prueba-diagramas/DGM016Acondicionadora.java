package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016Acondicionadora {

	private Long dgm016Id;
	private Integer secuenciaAcondicionadora;
	private String origenAcondicionadora;
	private String acondicionadoraNacional;
	private String acondicionadoraExtranjera;
	private String paisAcondicionadora;
	
	
	public String getPaisAcondicionadora() {
		return paisAcondicionadora;
	}

	public void setPaisAcondicionadora(String paisAcondicionadora) {
		this.paisAcondicionadora = paisAcondicionadora;
	}

	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public void setSecuenciaAcondicionadora(Integer secuenciaAcondicionadora) {
		this.secuenciaAcondicionadora = secuenciaAcondicionadora;
	}

	public Integer getSecuenciaAcondicionadora() {
		return secuenciaAcondicionadora;
	}

	public void setOrigenAcondicionadora(String origenAcondicionadora) {
		this.origenAcondicionadora = origenAcondicionadora;
	}

	public String getOrigenAcondicionadora() {
		return origenAcondicionadora;
	}

	public void setAcondicionadoraNacional(String acondicionadoraNacional) {
		this.acondicionadoraNacional = acondicionadoraNacional;
	}

	public String getAcondicionadoraNacional() {
		return acondicionadoraNacional;
	}

	public void setAcondicionadoraExtranjera(String acondicionadoraExtranjera) {
		this.acondicionadoraExtranjera = acondicionadoraExtranjera;
	}

	public String getAcondicionadoraExtranjera() {
		return acondicionadoraExtranjera;
	}

}
