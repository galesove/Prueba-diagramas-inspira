package pe.gob.mincetur.vuce.vc.domain.digemid;

public class DGM036ClaseTaxonomica {

	private Long dgm036Id;
	private Integer secuenciaTaxonomica;
	private String genero;
	private String especie;
	private String nombreComun;
	private String parteUsada;
	private String lugarProcedencia;
	private String datoComplementario;
	
	public Long getDgm036Id() {
		return dgm036Id;
	}

	public void setDgm036Id(Long dgm036Id) {
		this.dgm036Id = dgm036Id;
	}

	public void setSecuenciaTaxonomica(Integer secuenciaTaxonomica) {
		this.secuenciaTaxonomica = secuenciaTaxonomica;
	}

	public Integer getSecuenciaTaxonomica() {
		return secuenciaTaxonomica;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setParteUsada(String parteUsada) {
		this.parteUsada = parteUsada;
	}

	public String getParteUsada() {
		return parteUsada;
	}

	public void setLugarProcedencia(String lugarProcedencia) {
		this.lugarProcedencia = lugarProcedencia;
	}

	public String getLugarProcedencia() {
		return lugarProcedencia;
	}

	public void setDatoComplementario(String datoComplementario) {
		this.datoComplementario = datoComplementario;
	}

	public String getDatoComplementario() {
		return datoComplementario;
	}

}
