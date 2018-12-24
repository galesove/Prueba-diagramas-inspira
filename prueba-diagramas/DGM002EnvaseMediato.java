package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.util.List;

public class DGM002EnvaseMediato {

	private Integer dgm002Id;
	
	private Integer secuencia;
	
	private Integer secEnvaseMediato;
	
	private Integer tipo;
	
	private List<DGM002FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato;	

	private List<DGM002MaterialEnvaseMed> materialEnvaseMed;

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

	public List<DGM002FuenteReferenciaEnvaseMediato> getFuentesReferenciaEnvaseMediato() {
		return fuentesReferenciaEnvaseMediato;
	}

	public void setFuentesReferenciaEnvaseMediato(
			List<DGM002FuenteReferenciaEnvaseMediato> fuentesReferenciaEnvaseMediato) {
		this.fuentesReferenciaEnvaseMediato = fuentesReferenciaEnvaseMediato;
	}

	public List<DGM002MaterialEnvaseMed> getMaterialEnvaseMed() {
		return materialEnvaseMed;
	}

	public void setMaterialEnvaseMed(List<DGM002MaterialEnvaseMed> materialEnvaseMed) {
		this.materialEnvaseMed = materialEnvaseMed;
	}

	
	
}
