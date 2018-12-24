package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM001EnvaseMediato {

	private Integer dgm001Id;
	
	private Integer secuencia;
	
	private Integer secEnvaseMediato;
	
	private Integer tipo;
	
	private List<DGM001FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato;	

	private List<DGM001MaterialEnvaseMed> materialEnvaseMed;

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

	public List<DGM001FuenteReferenciaEnvaseMediato> getFuentesReferenciaEnvaseMediato() {
		return fuentesReferenciaEnvaseMediato;
	}

	public void setFuentesReferenciaEnvaseMediato(
			List<DGM001FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato) {
		this.fuentesReferenciaEnvaseMediato = fuentesReferenciaEnvaseMediato;
	}

	public List<DGM001MaterialEnvaseMed> getMaterialEnvaseMed() {
		return materialEnvaseMed;
	}

	public void setMaterialEnvaseMed(List<DGM001MaterialEnvaseMed> materialEnvaseMed) {
		this.materialEnvaseMed = materialEnvaseMed;
	}

	
	
}
