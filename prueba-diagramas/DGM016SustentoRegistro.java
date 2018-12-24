package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM016SustentoRegistro {

	private Long dgm016Id;
	
	private Integer secuenciaSustentoRegistro;
	
	private String fuenteReferencia;

	public void setDgm016Id(Long dgm016Id) {
		this.dgm016Id = dgm016Id;
	}

	public Long getDgm016Id() {
		return dgm016Id;
	}

	public void setSecuenciaSustentoRegistro(Integer secuenciaSustentoRegistro) {
		this.secuenciaSustentoRegistro = secuenciaSustentoRegistro;
	}

	public Integer getSecuenciaSustentoRegistro() {
		return secuenciaSustentoRegistro;
	}

	public void setFuenteReferencia(String fuenteReferencia) {
		this.fuenteReferencia = fuenteReferencia;
	}

	public String getFuenteReferencia() {
		return fuenteReferencia;
	}
	
}
