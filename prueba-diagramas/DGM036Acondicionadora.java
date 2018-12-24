package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM036Acondicionadora {

	private Long dgm036Id;
	private Integer secuenciaAcondicionadora;
	private String origenAcondicionadora;
	private String acondicionadoraNacional;
	private String acondicionadoraExtranjera;
	private String paisAcondicionadora;
	private String nroExpedienteAcondicionadora;

	public String getPaisAcondicionadora() {
		return paisAcondicionadora;
	}

	public void setPaisAcondicionadora(String paisAcondicionadora) {
		this.paisAcondicionadora = paisAcondicionadora;
	}

	public Long getDgm036Id() {
		return dgm036Id;
	}

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
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

	public String getNroExpedienteAcondicionadora() {
		return nroExpedienteAcondicionadora;
	}

	public void setNroExpedienteAcondicionadora(String nroExpedienteAcondicionadora) {
		this.nroExpedienteAcondicionadora = nroExpedienteAcondicionadora;
	}

}
