package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM044EnvaseInmediato {

	private Integer dgm044Id;

	private Integer secuencia;

	private Integer secEnvaseInmediato;

	private Integer tipo;

	private String tipoTapa;

	private List<DGM044FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato;

	private List<DGM044MaterialEnvaseInm> materialEnvaseInm;

	public Integer getDgm044Id() {
		return dgm044Id;
	}

	public void setDgm044Id(Integer dgm044Id) {
		this.dgm044Id = dgm044Id;
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

	public String getTipoTapa() {
		return tipoTapa;
	}

	public void setTipoTapa(String tipoTapa) {
		this.tipoTapa = tipoTapa;
	}

	public List<DGM044FuenteReferenciaEnvaseInmediato> getFuentesReferenciaEnvaseInmediato() {
		return fuentesReferenciaEnvaseInmediato;
	}

	public void setFuentesReferenciaEnvaseInmediato(List<DGM044FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato) {
		this.fuentesReferenciaEnvaseInmediato = fuentesReferenciaEnvaseInmediato;
	}

	public List<DGM044MaterialEnvaseInm> getMaterialEnvaseInm() {
		return materialEnvaseInm;
	}

	public void setMaterialEnvaseInm(List<DGM044MaterialEnvaseInm> materialEnvaseInm) {
		this.materialEnvaseInm = materialEnvaseInm;
	}

}
