package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM001EnvaseInmediato {

	private Integer dgm001Id;
	
	private Integer secuencia;
	
	private Integer secEnvaseInmediato;
	
	private Integer tipo;
	
	/*private Integer material;
	
	private Integer color;
	*/
	private String tipoTapa;
	
	private List<DGM001FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato;
	
	private List<DGM001MaterialEnvaseInm> materialEnvaseInm;

	public Integer getDgm001Id() {
		return dgm001Id;
	}

	public void setDgm001Id(Integer dgm001Id) {
		this.dgm001Id = dgm001Id;
	}

	public Integer getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}

	public Integer getSecEnvaseInmediato() {
		return secEnvaseInmediato;
	}

	public void setSecEnvaseInmediato(Integer secEnvaseInmediato) {
		this.secEnvaseInmediato = secEnvaseInmediato;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	/*public Integer getMaterial() {
		return material;
	}

	public void setMaterial(Integer material) {
		this.material = material;
	}

	public Integer getColor() {
		return color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}
    */
	public String getTipoTapa() {
		return tipoTapa;
	}

	public void setTipoTapa(String tipoTapa) {
		this.tipoTapa = tipoTapa;
	}

	public List<DGM001FuenteReferenciaEnvaseInmediato> getFuentesReferenciaEnvaseInmediato() {
		return fuentesReferenciaEnvaseInmediato;
	}

	public void setFuentesReferenciaEnvaseInmediato(
			List<DGM001FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato) {
		this.fuentesReferenciaEnvaseInmediato = fuentesReferenciaEnvaseInmediato;
	}

	public List<DGM001MaterialEnvaseInm> getMaterialEnvaseInm() {
		return materialEnvaseInm;
	}

	public void setMaterialEnvaseInm(List<DGM001MaterialEnvaseInm> materialEnvaseInm) {
		this.materialEnvaseInm = materialEnvaseInm;
	}
	
}
