package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM055EnvaseMediato {

	private Integer dgm055Id;
	private Integer secuencia;
	private Integer secEnvaseMediato;
	private Integer tipo;
	private Integer accesorios;
	
	private List<DGM055FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato;	

	private List<DGM055MaterialEnvaseMed> materialEnvaseMed;
	
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

	public Integer getSecEnvaseMediato() {
		return secEnvaseMediato;
	}

	public void setSecEnvaseMediato(Integer secEnvaseMediato) {
		this.secEnvaseMediato = secEnvaseMediato;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Integer accesorios) {
		this.accesorios = accesorios;
	}
	
	public List<DGM055FuenteReferenciaEnvaseMediato> getFuentesReferenciaEnvaseMediato() {
		return fuentesReferenciaEnvaseMediato;
	}

	public void setFuentesReferenciaEnvaseMediato(
			List<DGM055FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato) {
		this.fuentesReferenciaEnvaseMediato = fuentesReferenciaEnvaseMediato;
	}

	public List<DGM055MaterialEnvaseMed> getMaterialEnvaseMed() {
		return materialEnvaseMed;
	}

	public void setMaterialEnvaseMed(List<DGM055MaterialEnvaseMed> materialEnvaseMed) {
		this.materialEnvaseMed = materialEnvaseMed;
	}
}
