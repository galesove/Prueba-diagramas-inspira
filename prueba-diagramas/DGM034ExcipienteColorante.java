package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.ArrayList;
import java.util.List;

public class DGM034ExcipienteColorante {

	private Long dgm034Id; 
	private Long secuencia; 
	private String tipoCatalogoColor; 
	private String codigoColor; 
	private String sustancia; 
	private Double cantidad; 
	private String unidadMedida; 
	private String comentario; 
	private List<DGM034SustentoColoranteTA> dgm034sustentocolorantetas = new ArrayList<DGM034SustentoColoranteTA>();
	private List<DGM034SustentoColoranteET> dgm034sustentocoloranteets = new ArrayList<DGM034SustentoColoranteET>();

	public Long getDgm034Id() {
		return dgm034Id;
	}
	public void setDgm034Id(Long dgm034Id) {
		this.dgm034Id = dgm034Id;
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
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
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
	public List getDgm034sustentocolorantetas() {
		return this.dgm034sustentocolorantetas;
	}
	public void setDgm034sustentocolorantetas (List<DGM034SustentoColoranteTA> dgm034sustentocolorantetas) {
		this.dgm034sustentocolorantetas = dgm034sustentocolorantetas;
	}
	public void addDgm034sustentocolorantetas (DGM034SustentoColoranteTA dgm034sustentocoloranteta) {
		this.dgm034sustentocolorantetas.add(dgm034sustentocoloranteta);
	}
	public List getDgm034sustentocoloranteets() {
		return this.dgm034sustentocoloranteets;
	}
	public void setDgm034sustentocoloranteets (List<DGM034SustentoColoranteET> dgm034sustentocoloranteets) {
		this.dgm034sustentocoloranteets = dgm034sustentocoloranteets;
	}
	public void addDgm034sustentocoloranteets (DGM034SustentoColoranteET dgm034sustentocoloranteet) {
		this.dgm034sustentocoloranteets.add(dgm034sustentocoloranteet);
	}
}
