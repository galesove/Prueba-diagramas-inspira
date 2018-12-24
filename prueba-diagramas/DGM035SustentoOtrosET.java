package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035SustentoOtrosET {

	private Long dgm035Id;
	private Integer secuenciaExipienteOtro;
	private Integer secuenciaExipienteOtroET;
	private String fuenteReferencia;
	
	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}
	public Long getDgm035Id() {
		return dgm035Id;
	}
	public void setSecuenciaExipienteOtro(Integer secuenciaExipienteOtro) {
		this.secuenciaExipienteOtro = secuenciaExipienteOtro;
	}
	public Integer getSecuenciaExipienteOtro() {
		return secuenciaExipienteOtro;
	}
	public void setSecuenciaExipienteOtroET(Integer secuenciaExipienteOtroET) {
		this.secuenciaExipienteOtroET = secuenciaExipienteOtroET;
	}
	public Integer getSecuenciaExipienteOtroET() {
		return secuenciaExipienteOtroET;
	}
	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}
	public String getFuenteReferencia() {
		return fuenteReferencia;
	}

}
