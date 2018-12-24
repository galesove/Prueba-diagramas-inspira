package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM036SustentoRegistro {

	private Long dgm036Id;
	
	private Integer secuenciaSustentoRegistro;
	
	private String sustento;

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
	}

	public Long getDgm036Id() {
		return dgm036Id;
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
