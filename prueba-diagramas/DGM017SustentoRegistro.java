package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM017SustentoRegistro {

	private Long dgm017Id;
	
	private Integer secuenciaSustentoRegistro;
	
	private String sustento;

	public void setDgm017Id(Long dgm017Id) {
		this.dgm017Id = dgm017Id;
	}

	public Long getDgm017Id() {
		return dgm017Id;
	}

	public void setSecuenciaSustentoRegistro(Integer secuenciaSustentoRegistro) {
		this.secuenciaSustentoRegistro = secuenciaSustentoRegistro;
	}

	public Integer getSecuenciaSustentoRegistro() {
		return secuenciaSustentoRegistro;
	}

	public void setSustento(String sustento) {
		this.sustento = sustento;
	}

	public String getSustento() {
		return sustento;
	}
	
}
