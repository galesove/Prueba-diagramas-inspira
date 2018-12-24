package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM035SustentoRegistro {

	private Long dgm035Id;
	
	private Integer secuenciaSustentoRegistro;
	
	private String fuenteReferencia;

	public void setDgm035Id(Long dgm035Id) {
		this.dgm035Id = dgm035Id;
	}

	public Long getDgm035Id() {
		return dgm035Id;
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
