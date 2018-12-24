package pe.gob.mincetur.vuce.vc.domain.digemid;


public class DGM008Acondicionadora {

	private Long dgm008Id; 
	private int secuenciaAcondicionadora; 
	private String esEnvasado;
	private String esAcondicionado;
	private String origenEmpresa;
	private String nombreEmpresa;
	private String empresaNacional;
	private String empresaExtranjera;
	private String paraLaEmpresa;
	private String paisEmpresa;
	
	private String          esEnsamblado;
	private String          paisParaEmpresa;
	private String esOtro;
	
	public String getPaisEmpresa() {
		return paisEmpresa;
	}
	public void setPaisEmpresa(String paisEmpresa) {
		this.paisEmpresa = paisEmpresa;
	}
	public String getEsEnvasado() {
		return esEnvasado;
	}
	public void setEsEnvasado(String esEnvasado) {
		this.esEnvasado = esEnvasado;
	}
	public String getEsAcondicionado() {
		return esAcondicionado;
	}
	public void setEsAcondicionado(String esAcondicionado) {
		this.esAcondicionado = esAcondicionado;
	}
	public String getOrigenEmpresa() {
		return origenEmpresa;
	}
	public void setOrigenEmpresa(String origenEmpresa) {
		this.origenEmpresa = origenEmpresa;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getEmpresaNacional() {
		return empresaNacional;
	}
	public void setEmpresaNacional(String empresaNacional) {
		this.empresaNacional = empresaNacional;
	}
	public String getEmpresaExtranjera() {
		return empresaExtranjera;
	}
	public void setEmpresaExtranjera(String empresaExtranjera) {
		this.empresaExtranjera = empresaExtranjera;
	}
	public String getParaLaEmpresa() {
		return paraLaEmpresa;
	}
	public void setParaLaEmpresa(String paraLaEmpresa) {
		this.paraLaEmpresa = paraLaEmpresa;
	}
	public Long getDgm008Id() {
		return dgm008Id;
	}
	public void setDgm008Id(Long dgm008Id) {
		this.dgm008Id = dgm008Id;
	}
	public String getEsEnsamblado() {
		return esEnsamblado;
	}
	public void setEsEnsamblado(String esEnsamblado) {
		this.esEnsamblado = esEnsamblado;
	}
	public String getPaisParaEmpresa() {
		return paisParaEmpresa;
	}
	public void setPaisParaEmpresa(String paisParaEmpresa) {
		this.paisParaEmpresa = paisParaEmpresa;
	}
	
	public String getEsOtro() {
		return esOtro;
	}
	public void setEsOtro(String esOtro) {
		this.esOtro = esOtro;
	}
	public int getSecuenciaAcondicionadora() {
		return secuenciaAcondicionadora;
	}
	public void setSecuenciaAcondicionadora(int secuenciaAcondicionadora) {
		this.secuenciaAcondicionadora = secuenciaAcondicionadora;
	}
	
}