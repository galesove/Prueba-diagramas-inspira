package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016SustentoOtrosET {

	private Long dgm016Id;
	private Integer secuenciaExipienteOtro;
	private Integer secuenciaExipienteOtroET;
	private String fuenteReferencia;
	
	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}
	public Long getDgm016Id() {
		return dgm016Id;
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
