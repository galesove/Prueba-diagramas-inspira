package pe.gob.mincetur.vuce.vc.domain.digemid;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import sun.misc.BASE64Encoder;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CosmeticosVUCE", propOrder = {
    "codigoTramite",
    "codigoEmpresa",
    "rubroEmpresa",
    "razonSocial",
    "nombreComercial",
    "rucEmpresa",
    "codigoRegente",
    "codigoRepresentanteLegal",
    "descripcionProducto",
    "orden",
    "nso",
    "direccionEmpresa",
    "montoPagadoSUCE",
    "numeroCPB",
    "fechaPagoCPB",
    "tipoPago",
    "banco",
    "suce",
    "codigoExpediente",
    "montosTramite",
    "tupa",
    "formato",
    
    "fechaSolicitud",
    "tasa",
    "grupoProducto",
    "tipoCategoriaProducto",
    "tipoProducto",
    //"productoNotificado", // Tipo Tramite
    "tipoTramite",
    "tipoExpedienteCalculoTasa",
    "esPhd",
    "esPahp"
})
public class CosmeticosVUCE {
    
	private static final long serialVersionUID = 1L;
    
    @XmlElement(name = "CodigoTramite", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String codigoTramite;
    
    @XmlElement(name = "CodigoEmpresa", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String codigoEmpresa;
    
    @XmlElement(name = "RubroEmpresa", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String rubroEmpresa;
    
    @XmlElement(name = "RazonSocial", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String razonSocial;
    
    @XmlElement(name = "NombreComercial", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String nombreComercial;
    
    @XmlElement(name = "RucEmpresa", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String rucEmpresa;
    
    @XmlElement(name = "CodigoRegente", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String codigoRegente;
    
    @XmlElement(name = "CodigoRepresentanteLegal", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String codigoRepresentanteLegal;
    
    @XmlElement(name = "DescripcionProducto", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String descripcionProducto;
    
	@XmlElement(name = "Orden", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String orden;
	
	@XmlElement(name = "Nso", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String nso;
		
    @XmlElement(name = "DireccionEmpresa", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String direccionEmpresa;
    
    @XmlElement(name = "MontoPagadoSUCE", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private Double montoPagadoSUCE;
    
    @XmlElement(name = "NumeroCPB", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String numeroCPB;
    
    @XmlElement(name = "FechaPagoCPB", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String fechaPagoCPB;
    
    @XmlElement(name = "TipoPago", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String tipoPago;
    
    @XmlElement(name = "Banco", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String banco;
    
    @XmlElement(name = "Suce", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String suce;
    
    @XmlElement(name = "CodigoExpediente", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String codigoExpediente;
    
    @XmlElement(name = "MontosTramite", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String montosTramite;
    
    @XmlElement(name = "Tupa", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String tupa;
    
    @XmlElement(name = "Formato", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String formato;
    
    @XmlElement(name = "FechaSolicitud", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String fechaSolicitud;
    
    @XmlElement(name = "Tasa", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String tasa;
    
    @XmlElement(name = "GrupoProducto", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String grupoProducto;
    
    @XmlElement(name = "TipoCategoriaProducto", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String tipoCategoriaProducto;
    
    @XmlElement(name = "TipoProducto", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String tipoProducto;
    
    /*@XmlElement(name = "ProductoNotificado", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String productoNotificado;
    */
    @XmlElement(name = "TipoTramite", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String tipoTramite;
    
    @XmlElement(name = "TipoExpedienteCalculoTasa", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String tipoExpedienteCalculoTasa;
    
    @XmlElement(name = "EsPhd", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String esPhd;
    
    @XmlElement(name = "EsPahp", namespace="http://wsdigemid.minsa.gob.pe.vuce/")
    private String esPahp;
    
	transient private DataHandler ebXML;
	
    transient private DataHandler adjuntos;
    
    transient private boolean copiarAdjuntosDirectorioCompartido;
    
    transient private byte [] zipAdjuntos;
    
    public CosmeticosVUCE() {
    }
    
    public CosmeticosVUCE(pe.gob.mincetur.vuce.vc.remoting.ws.entidad.resolutor.DatosGeneralesSUCE datosGeneralesSUCE) {
    	this.montoPagadoSUCE = datosGeneralesSUCE.getMontoPagadoSUCE();
        this.suce = datosGeneralesSUCE.getSuce();
        this.numeroCPB = datosGeneralesSUCE.getNumeroCPB();
        this.tupa = datosGeneralesSUCE.getTupa();
        this.formato = datosGeneralesSUCE.getFormato();
        this.fechaSolicitud = datosGeneralesSUCE.getFechaSolicitud();
        this.tasa = datosGeneralesSUCE.getTasa();
        
        this.rucEmpresa = datosGeneralesSUCE.getNumeroDocumentoSolicitante();
        this.razonSocial = datosGeneralesSUCE.getNombreSolicitante();
        this.nombreComercial = datosGeneralesSUCE.getNombreSolicitante();
        
        imprimir();
    }

    public void imprimir() {
    	System.out.println("--------------------");
		System.out.println("suce: "+suce);
		System.out.println("formato: "+formato);
		System.out.println("tupa: "+tupa);
		System.out.println("montoPagadoSUCE: "+montoPagadoSUCE);
		System.out.println("numeroCPB: "+numeroCPB);
		System.out.println("fechaPagoCPB: "+fechaPagoCPB);
		System.out.println("tipoPago: "+tipoPago);
		System.out.println("banco: "+banco);
		System.out.println("codigoTramite: "+codigoTramite);
		System.out.println("fechaSolicitud: "+fechaSolicitud);
		System.out.println("tasa: "+tasa);
		System.out.println("rucEmpresa: "+rucEmpresa);
		System.out.println("razonSocial: "+razonSocial);
		System.out.println("nombreComercial: "+nombreComercial);
    	System.out.println("--------------------");
    }
    
	public String getCodigoTramite() {
		return codigoTramite;
	}

	public void setCodigoTramite(String codigoTramite) {
		this.codigoTramite = codigoTramite;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getRubroEmpresa() {
		return rubroEmpresa;
	}

	public void setRubroEmpresa(String rubroEmpresa) {
		this.rubroEmpresa = rubroEmpresa;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getRucEmpresa() {
		return rucEmpresa;
	}

	public void setRucEmpresa(String rucEmpresa) {
		this.rucEmpresa = rucEmpresa;
	}

	public String getCodigoRegente() {
		return codigoRegente;
	}

	public void setCodigoRegente(String codigoRegente) {
		this.codigoRegente = codigoRegente;
	}

	public String getCodigoRepresentanteLegal() {
		return codigoRepresentanteLegal;
	}

	public void setCodigoRepresentanteLegal(String codigoRepresentanteLegal) {
		this.codigoRepresentanteLegal = codigoRepresentanteLegal;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getNso() {
		return nso;
	}

	public void setNso(String nso) {
		this.nso = nso;
	}

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public Double getMontoPagadoSUCE() {
		return montoPagadoSUCE;
	}

	public void setMontoPagadoSUCE(Double montoPagadoSUCE) {
		this.montoPagadoSUCE = montoPagadoSUCE;
	}

	public String getSuce() {
		return suce;
	}

	public void setSuce(String suce) {
		this.suce = suce;
	}

	public String getNumeroCPB() {
		return numeroCPB;
	}

	public void setNumeroCPB(String numeroCPB) {
		this.numeroCPB = numeroCPB;
	}

	public String getFechaPagoCPB() {
		return fechaPagoCPB;
	}

	public void setFechaPagoCPB(String fechaPagoCPB) {
		this.fechaPagoCPB = fechaPagoCPB;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getCodigoExpediente() {
		return codigoExpediente;
	}

	public void setCodigoExpediente(String codigoExpediente) {
		this.codigoExpediente = codigoExpediente;
	}

	public String getMontosTramite() {
		return montosTramite;
	}

	public void setMontosTramite(String montosTramite) {
		this.montosTramite = montosTramite;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getTupa() {
		return tupa;
	}

	public void setTupa(String tupa) {
		this.tupa = tupa;
	}

	public String getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getTasa() {
		return tasa;
	}

	public void setTasa(String tasa) {
		this.tasa = tasa;
	}

	public String getGrupoProducto() {
		return grupoProducto;
	}

	public void setGrupoProducto(String grupoProducto) {
		this.grupoProducto = grupoProducto;
	}

	public String getTipoCategoriaProducto() {
		return tipoCategoriaProducto;
	}

	public void setTipoCategoriaProducto(String tipoCategoriaProducto) {
		this.tipoCategoriaProducto = tipoCategoriaProducto;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	/*public String getProductoNotificado() {
		return productoNotificado;
	}

	public void setProductoNotificado(String productoNotificado) {
		this.productoNotificado = productoNotificado;
	}
    */
	public String getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public String getTipoExpedienteCalculoTasa() {
		return tipoExpedienteCalculoTasa;
	}

	public void setTipoExpedienteCalculoTasa(String tipoExpedienteCalculoTasa) {
		this.tipoExpedienteCalculoTasa = tipoExpedienteCalculoTasa;
	}

	public String getEsPhd() {
		return esPhd;
	}

	public void setEsPhd(String esPhd) {
		this.esPhd = esPhd;
	}

	public String getEsPahp() {
		return esPahp;
	}

	public void setEsPahp(String esPahp) {
		this.esPahp = esPahp;
	}

	public DataHandler getAdjuntos() {
		return adjuntos;
	}

	public void setAdjuntos(DataHandler adjuntos) {
		this.adjuntos = adjuntos;
	}
    
	public DataHandler getEbXML() {
		return ebXML;
	}

	public void setEbXML(DataHandler ebXML) {
		this.ebXML = ebXML;
	}

	public boolean isCopiarAdjuntosDirectorioCompartido() {
		return copiarAdjuntosDirectorioCompartido;
	}

	public void setCopiarAdjuntosDirectorioCompartido(boolean copiarAdjuntosDirectorioCompartido) {
		this.copiarAdjuntosDirectorioCompartido = copiarAdjuntosDirectorioCompartido;
	}

	public byte[] getZipAdjuntos() {
		return zipAdjuntos;
	}

	public void setZipAdjuntos(byte[] zipAdjuntos) {
		this.zipAdjuntos = zipAdjuntos;
	}
	
	public static void main(String [] args) {
		try {
		    String filename= "c:\\revision_previa.txt";
		    File file = new File(filename);
		    if (!file.exists()) {
		    	file.createNewFile();
		    }
		    
		    FileWriter fw = new FileWriter(filename, true);
		    //fw.write("HOLA"+System.lineSeparator());
		    fw.close();
		} catch(IOException e) {
		    e.printStackTrace();
		}
	}
	
	public void logTramaRevisionPreviaAsignarEvaluador() {
		String trama = ""+codigoTramite+"|"+codigoEmpresa+"|"+rubroEmpresa+"|"+razonSocial+"|"+nombreComercial+"|"+rucEmpresa+"|"+codigoRegente+"|"+codigoRepresentanteLegal+
			           "|"+descripcionProducto+"|"+orden+"|"+nso+"|"+direccionEmpresa+"|"+montoPagadoSUCE+"|"+numeroCPB+"|"+fechaPagoCPB+"|"+tipoPago+
			           "|"+banco+"|"+suce+"|"+codigoExpediente+"|"+montosTramite+"|"+formato+"|"+fechaSolicitud+"\r\n";
		try {
		    String filename= "/tmp/revision_previa.txt";
		    File file = new File(filename);
		    if (!file.exists()) {
		    	file.createNewFile();
		    }
		    
		    FileWriter fw = new FileWriter(filename, true);
		    fw.write(trama);
		    fw.close();
		} catch(IOException e) {
		    e.printStackTrace();
		}
	}
	
	public String getSOAPEnvelopeRevisionPrevia() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			   "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
			   "<soap:Body>"+
				   "<RevisionPreviaAsignarEvaluador xmlns=\"http://wsdigemid.minsa.gob.pe.vuce/\">"+
					   "<CosmeticoVUCE>"+
					   (codigoTramite!=null?"<CodigoTramite>"+codigoTramite+"</CodigoTramite>":"")+
					   (codigoEmpresa!=null?"<CodigoEmpresa>"+codigoEmpresa+"</CodigoEmpresa>":"")+
					   (rubroEmpresa!=null?"<RubroEmpresa>"+rubroEmpresa+"</RubroEmpresa>":"")+
					   (razonSocial!=null?"<RazonSocial><![CDATA["+razonSocial+"]]></RazonSocial>":"")+
					   (nombreComercial!=null?"<NombreComercial><![CDATA["+nombreComercial+"]]></NombreComercial>":"")+
					   (rucEmpresa!=null?"<RucEmpresa>"+rucEmpresa+"</RucEmpresa>":"")+
					   (codigoRegente!=null?"<CodigoRegente>"+codigoRegente+"</CodigoRegente>":"")+
					   (codigoRepresentanteLegal!=null?"<CodigoRepresentanteLegal>"+codigoRepresentanteLegal+"</CodigoRepresentanteLegal>":"")+
					   (descripcionProducto!=null?"<DescripcionProducto><![CDATA["+descripcionProducto+"]]></DescripcionProducto>":"")+
					   (orden!=null?"<Orden>"+orden+"</Orden>":"")+
					   (nso!=null?"<Nso>"+nso+"</Nso>":"")+
					   (direccionEmpresa!=null?"<DireccionEmpresa><![CDATA["+direccionEmpresa+"]]></DireccionEmpresa>":"")+
					   (montoPagadoSUCE!=null?"<MontoPagadoSUCE>"+montoPagadoSUCE+"</MontoPagadoSUCE>":"")+
					   (numeroCPB!=null?"<NumeroCPB>"+numeroCPB+"</NumeroCPB>":"")+
					   (fechaPagoCPB!=null?"<FechaPagoCPB>"+fechaPagoCPB+"</FechaPagoCPB>":"")+
					   (tipoPago!=null?"<TipoPago>"+tipoPago+"</TipoPago>":"")+
					   (banco!=null?"<Banco>"+banco+"</Banco>":"")+
					   (suce!=null?"<Suce>"+suce+"</Suce>":"")+
					   (codigoExpediente!=null?"<CodigoExpediente>"+codigoExpediente+"</CodigoExpediente>":"")+
					   (montosTramite!=null?"<MontosTramite>"+montosTramite+"</MontosTramite>":"")+
					   (formato!=null?"<Formato>"+formato+"</Formato>":"")+
					   (fechaSolicitud!=null?"<FechaSolicitud>"+fechaSolicitud+"</FechaSolicitud>":"")+
					   (tasa!=null?"<Tasa>"+tasa+"</Tasa>":"")+
					   (grupoProducto!=null?"<GrupoProducto>"+grupoProducto+"</GrupoProducto>":"")+
					   (tipoCategoriaProducto!=null?"<TipoCategoriaProducto>"+tipoCategoriaProducto+"</TipoCategoriaProducto>":"")+
					   (tipoProducto!=null?"<TipoProducto>"+tipoProducto+"</TipoProducto>":"")+
					   //(productoNotificado!=null?"<ProductoNotificado>"+productoNotificado+"</ProductoNotificado>":"")+
					   (tipoTramite!=null?"<TipoTramite>"+tipoTramite+"</TipoTramite>":"")+
					   (tipoExpedienteCalculoTasa!=null?"<TipoExpedienteCalculoTasa>"+tipoExpedienteCalculoTasa+"</TipoExpedienteCalculoTasa>":"")+
					   (esPhd!=null?"<EsPhd>"+esPhd+"</EsPhd>":"")+
					   (esPahp!=null?"<EsPahp>"+esPahp+"</EsPahp>":"")+
					   "</CosmeticoVUCE>"+
				   "</RevisionPreviaAsignarEvaluador>"+
			   "</soap:Body>"+
			"</soap:Envelope>";
	}
	
	public void logTramaApruebaSolicitudRevisionPrevia() {
		String trama = ""+codigoTramite+"|"+codigoEmpresa+"|"+rubroEmpresa+"|"+razonSocial+"|"+nombreComercial+"|"+rucEmpresa+"|"+codigoRegente+"|"+codigoRepresentanteLegal+
			           "|"+descripcionProducto+"|"+orden+"|"+nso+"|"+direccionEmpresa+"|"+montoPagadoSUCE+"|"+numeroCPB+"|"+fechaPagoCPB+"|"+tipoPago+
			           "|"+banco+"|"+suce+"|"+codigoExpediente+"|"+montosTramite+"|"+formato+"|"+fechaSolicitud+"\r\n";
		try {
		    String filename= "/tmp/genera_expediente_revision_previa.txt";
		    File file = new File(filename);
		    if (!file.exists()) {
		    	file.createNewFile();
		    }
		    
		    FileWriter fw = new FileWriter(filename, true);
		    fw.write(trama);
		    fw.close();
		} catch(IOException e) {
		    e.printStackTrace();
		}
	}
	
	public String getSOAPEnvelopeApruebaSolicitudRevisionPrevia() {
		BASE64Encoder base64Encoder = new BASE64Encoder();
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			   "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
			   "<soap:Body>"+
				   "<ApruebaSolicitudRevisionPrevia xmlns=\"http://wsdigemid.minsa.gob.pe.vuce/\">"+
					   "<CosmeticoVUCE>"+
					   (codigoTramite!=null?"<CodigoTramite>"+codigoTramite+"</CodigoTramite>":"")+
					   (codigoEmpresa!=null?"<CodigoEmpresa>"+codigoEmpresa+"</CodigoEmpresa>":"")+
					   (rubroEmpresa!=null?"<RubroEmpresa>"+rubroEmpresa+"</RubroEmpresa>":"")+
					   (razonSocial!=null?"<RazonSocial><![CDATA["+razonSocial+"]]></RazonSocial>":"")+
					   (nombreComercial!=null?"<NombreComercial><![CDATA["+nombreComercial+"]]></NombreComercial>":"")+
					   (rucEmpresa!=null?"<RucEmpresa>"+rucEmpresa+"</RucEmpresa>":"")+
					   (codigoRegente!=null?"<CodigoRegente>"+codigoRegente+"</CodigoRegente>":"")+
					   (codigoRepresentanteLegal!=null?"<CodigoRepresentanteLegal>"+codigoRepresentanteLegal+"</CodigoRepresentanteLegal>":"")+
					   (descripcionProducto!=null?"<DescripcionProducto><![CDATA["+descripcionProducto+"]]></DescripcionProducto>":"")+
					   (orden!=null?"<Orden>"+orden+"</Orden>":"")+
					   (nso!=null?"<Nso>"+nso+"</Nso>":"")+
					   (direccionEmpresa!=null?"<DireccionEmpresa><![CDATA["+direccionEmpresa+"]]></DireccionEmpresa>":"")+
					   (montoPagadoSUCE!=null?"<MontoPagadoSUCE>"+montoPagadoSUCE+"</MontoPagadoSUCE>":"")+
					   (numeroCPB!=null?"<NumeroCPB>"+numeroCPB+"</NumeroCPB>":"")+
					   (fechaPagoCPB!=null?"<FechaPagoCPB>"+fechaPagoCPB+"</FechaPagoCPB>":"")+
					   (tipoPago!=null?"<TipoPago>"+tipoPago+"</TipoPago>":"")+
					   (banco!=null?"<Banco>"+banco+"</Banco>":"")+
					   (suce!=null?"<Suce>"+suce+"</Suce>":"")+
					   (codigoExpediente!=null?"<CodigoExpediente>"+codigoExpediente+"</CodigoExpediente>":"")+
					   (montosTramite!=null?"<MontosTramite>"+montosTramite+"</MontosTramite>":"")+
					   (formato!=null?"<Formato>"+formato+"</Formato>":"")+
					   (fechaSolicitud!=null?"<FechaSolicitud>"+fechaSolicitud+"</FechaSolicitud>":"")+
					   (tasa!=null?"<Tasa>"+tasa+"</Tasa>":"")+
					   (grupoProducto!=null?"<GrupoProducto>"+grupoProducto+"</GrupoProducto>":"")+
					   (tipoCategoriaProducto!=null?"<TipoCategoriaProducto>"+tipoCategoriaProducto+"</TipoCategoriaProducto>":"")+
					   (tipoProducto!=null?"<TipoProducto>"+tipoProducto+"</TipoProducto>":"")+
					   //(productoNotificado!=null?"<ProductoNotificado>"+productoNotificado+"</ProductoNotificado>":"")+
					   (tipoTramite!=null?"<TipoTramite>"+tipoTramite+"</TipoTramite>":"")+
					   (tipoExpedienteCalculoTasa!=null?"<TipoExpedienteCalculoTasa>"+tipoExpedienteCalculoTasa+"</TipoExpedienteCalculoTasa>":"")+
					   (esPhd!=null?"<EsPhd>"+esPhd+"</EsPhd>":"")+
					   (esPahp!=null?"<EsPahp>"+esPahp+"</EsPahp>":"")+
					   "</CosmeticoVUCE>"+
					   //(this.arrayEbXML!=null?"<formatoEBXML xmlns=\"http://wsdigemid.minsa.gob.pe.vuce/\">"+base64Encoder.encode(this.arrayEbXML)+"</formatoEBXML>":"")+
					   (this.zipAdjuntos!=null?"<Adjuntos xmlns=\"http://wsdigemid.minsa.gob.pe.vuce/\">"+base64Encoder.encode(this.zipAdjuntos)+"</Adjuntos>":"")+
				   "</ApruebaSolicitudRevisionPrevia>"+
			   "</soap:Body>"+
			"</soap:Envelope>";
	}
	
}
