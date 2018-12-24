package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035Acondicionadora {

	private Long dgm035Id;
	private Integer secuenciaAcondicionadora;
	private String origenAcondicionadora;
	private String acondicionadoraNacional;
	private String acondicionadoraExtranjera;
	
	public Long getDgm035Id() {
		return dgm035Id;
	}

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
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
