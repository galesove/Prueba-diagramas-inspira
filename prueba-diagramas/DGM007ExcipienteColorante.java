package pe.prueba.domain.dgm;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DGM007ExcipienteColorante {

	private Long dgm007Id; 
	private Long secuencia; 
	private String tipoCatalogoColor; 
	private String codigoColor; 
	private String sustancia; 
	private BigDecimal cantidad; 
	private String unidadMedida; 
	private String comentario; 
	private String nombreSustanciaTraducida;
	//private List<DGM007SustentoColoranteTA> dgm007sustentocolorantetas = new ArrayList<DGM007SustentoColoranteTA>();
	//private List<DGM007SustentoColoranteET> dgm007sustentocoloranteets = new ArrayList<DGM007SustentoColoranteET>();

	public Long getDgm007Id() {
		return dgm007Id;
	}
	public void setDgm007Id(Long dgm007Id) {
		this.dgm007Id = dgm007Id;
	}
	public Long getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	public String getTipoCatalogoColor() {
		return tipoCatalogoColor;
	}
	public void setTipoCatalogoColor(String tipoCatalogoColor) {
		this.tipoCatalogoColor = tipoCatalogoColor;
	}
	public String getCodigoColor() {
		return codigoColor;
	}
	public void setCodigoColor(String codigoColor) {
		this.codigoColor = codigoColor;
	}
	public String getSustancia() {
		return sustancia;
	}
	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}
	public BigDecimal getCantidad() {
		return cantidad;
	}
	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getNombreSustanciaTraducida() {
		return nombreSustanciaTraducida;
	}
	public void setNombreSustanciaTraducida(String nombreSustanciaTraducida) {
		this.nombreSustanciaTraducida = nombreSustanciaTraducida;
	}
	
}
