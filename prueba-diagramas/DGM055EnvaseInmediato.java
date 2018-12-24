package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM055EnvaseInmediato {

	private Integer dgm055Id;

	private Integer secuencia;

	private Integer secEnvaseInmediato;

	private Integer tipo;

	private String tipoTapa;

	private List<DGM055FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato;

	private List<DGM055MaterialEnvaseInm> materialEnvaseInm;

	public Integer getDgm055Id() {
		return dgm055Id;
	}

	public void setDgm055Id(Integer dgm055Id) {
		this.dgm055Id = dgm055Id;
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

	public List<DGM055FuenteReferenciaEnvaseInmediato> getFuentesReferenciaEnvaseInmediato() {
		return fuentesReferenciaEnvaseInmediato;
	}

	public void setFuentesReferenciaEnvaseInmediato(List<DGM055FuenteReferenciaEnvaseInmediato> fuentesReferenciaEnvaseInmediato) {
		this.fuentesReferenciaEnvaseInmediato = fuentesReferenciaEnvaseInmediato;
	}

	public List<DGM055MaterialEnvaseInm> getMaterialEnvaseInm() {
		return materialEnvaseInm;
	}

	public void setMaterialEnvaseInm(List<DGM055MaterialEnvaseInm> materialEnvaseInm) {
		this.materialEnvaseInm = materialEnvaseInm;
	}

}
