package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016SuplementoReferencia {

	private Long dgm016Id;
	
	private Integer secuenciaSuplementoReferencia;
	
	private String sustento;

	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public Integer getSecuenciaSuplementoReferencia() {
		return secuenciaSuplementoReferencia;
	}

	public void setSecuenciaSuplementoReferencia(
			Integer secuenciaSuplementoReferencia) {
		this.secuenciaSuplementoReferencia = secuenciaSuplementoReferencia;
	}

	public String getSustento() {
		return sustento;
	}

	public void setSustento(String sustento) {
		this.sustento = sustento;
	}
	
}
