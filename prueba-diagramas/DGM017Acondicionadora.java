package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM017Acondicionadora {

	private Long dgm017Id;
	private Integer secuenciaAcondicionadora;
	private String origenAcondicionadora;
	private String acondicionadoraNacional;
	private String acondicionadoraExtranjera;
	private String paisAcondicionadora;
	private String nroExpedienteAcondicionadora;
	private String nombreAcondicionadora;

	public String getPaisAcondicionadora() {
		return paisAcondicionadora;
	}

	public void setPaisAcondicionadora(String paisAcondicionadora) {
		this.paisAcondicionadora = paisAcondicionadora;
	}

	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
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

	public String getNombreAcondicionadora() {
		return nombreAcondicionadora;
	}

	public void setNombreAcondicionadora(String nombreAcondicionadora) {
		this.nombreAcondicionadora = nombreAcondicionadora;
	}

}
