package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM002EnvaseInmediato {

	private Integer dgm002Id;
	
	private Integer secuencia;
	
	private Integer secEnvaseInmediato;
	
	private Integer tipo;
	
	/*private Integer material;
	
	private Integer color;
	*/
	private String tipoTapa;
	
	private List<DGM002FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato;
	
	private List<DGM002MaterialEnvaseInm> materialEnvaseInm;

	public Integer getDgm002Id() {
		return dgm002Id;
	}

	public void setDgm002Id(Integer dgm002Id) {
		this.dgm002Id = dgm002Id;
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

	public List<DGM002FuenteReferenciaEnvaseInmediato> getFuentesReferenciaEnvaseInmediato() {
		return fuentesReferenciaEnvaseInmediato;
	}

	public void setFuentesReferenciaEnvaseInmediato(
			List<DGM002FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato) {
		this.fuentesReferenciaEnvaseInmediato = fuentesReferenciaEnvaseInmediato;
	}

	public List<DGM002MaterialEnvaseInm> getMaterialEnvaseInm() {
		return materialEnvaseInm;
	}

	public void setMaterialEnvaseInm(List<DGM002MaterialEnvaseInm> materialEnvaseInm) {
		this.materialEnvaseInm = materialEnvaseInm;
	}
	
}
