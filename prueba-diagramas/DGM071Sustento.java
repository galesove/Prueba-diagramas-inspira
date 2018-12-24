package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM071Sustento {

	private Long dgm071Id;
	private Integer secuenciaSustento;
	private String dgmTipoSustentoRegistro;
	private String dgmTipoSustentoRegistro2;
	private String cemis;
	private String nroRegistroSanitarioOrigen;
	private String nombreProducto;

	public Long getDgm071Id() {
		return dgm071Id;
	}

	public void setDgm071Id(Long dgm071Id) {
		this.dgm071Id = dgm071Id;
	}

	public Integer getSecuenciaSustento() {
		return secuenciaSustento;
	}

	public void setSecuenciaSustento(Integer secuenciaSustento) {
		this.secuenciaSustento = secuenciaSustento;
	}

	public String getDgmTipoSustentoRegistro() {
		return dgmTipoSustentoRegistro;
	}

	public void setDgmTipoSustentoRegistro(String dgmTipoSustentoRegistro) {
		this.dgmTipoSustentoRegistro = dgmTipoSustentoRegistro;
	}

	public String getDgmTipoSustentoRegistro2() {
		return dgmTipoSustentoRegistro2;
	}

	public void setDgmTipoSustentoRegistro2(String dgmTipoSustentoRegistro2) {
		this.dgmTipoSustentoRegistro2 = dgmTipoSustentoRegistro2;
	}

	public String getCemis() {
		return cemis;
	}

	public void setCemis(String cemis) {
		this.cemis = cemis;
	}

	public String getNroRegistroSanitarioOrigen() {
		return nroRegistroSanitarioOrigen;
	}

	public void setNroRegistroSanitarioOrigen(String nroRegistroSanitarioOrigen) {
		this.nroRegistroSanitarioOrigen = nroRegistroSanitarioOrigen;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

}
