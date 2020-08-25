package com.mkyong.hashing.busonfiscal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageBuson {
	
	public WebDriver driver;
	
       private By Email = By.id("session_username");
       private By Password = By.id("session_password");
       private By Ingresar = By.cssSelector("[type='submit']");
       private By Advanced = By.id("details-button");
       private By Proceed = By.id("proceed-link");
       private By DropFistP = By.cssSelector("div[class*=mc-wrap]");
       private By CrearCompr = By.xpath("//*[@id=\"billing-menu\"]/ul[1]/li[2]/a");
       private By Factura = By.xpath("//*[@id=\"new_receipt_list\"]/li[1]/div/a");
       private By NotadeCredito = By.xpath("//*[@id=\"new_receipt_list\"]/li[2]/div/a");
       private By CartaPorte = By.xpath("//*[@id=\"new_receipt_list\"]/li[3]/div/a");
       private By Pagos = By.xpath("//*[@id=\"new_receipt_list\"]/li[4]/div/a");
        
       private By SideBar = By.xpath("//div[@class='mc-wrap']");
        
       private By ServiciosMenu = By.xpath("//i[contains(text(),'apps')]");
        
       private By TimbreFiscal = By.xpath("/html/body/header/ul/li[2]/ul/li[2]/form/a/span[2]");
        
       private By ConectorFiscal = By.id("Capa_1");
        
       private By BuzonFiscal = By.id("Layer_1");
      
       private By ValidacionOK = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
       private By ListaRFC = By.id("rfc_list");
        
       private By CloseSearch = By.xpath("/html/body/header/div[2]/div/form/i[1]");
        
       private By Search = By.xpath("/html/body/header/ul/li[1]/a/i");
        
       private By ImpresionFiscal = By.linkText("Impresión Fiscal");
        
       private By PlantillasImpresion = By.xpath("/html/body/section/section/div/div/div[1]/a/i");
        
       private By ImpresionBasica = By.cssSelector("[href='/templates/1_invoice']");
        
       private By FormatoCartaImprBasic = By.cssSelector("[title='Formato - Carta']");
        
       private  By FormatoCartaHorizBasic = By.linkText("Formato - Carta horizontal");
        
       private  By TemplateName = By.id("template_name");
        
       private  By TemplateNote = By.id("template_note");
        
       private By NominaImpresionFiscal = By.cssSelector("[href='#tab-2']");
        
       private By PagoImprFiscal = By.cssSelector("[href='#tab-3']");
        
       private  By TemplatePagoImpr = By.cssSelector("[href='/templates/3_payment']");
        
       private By TemplateNominaImpr = By.cssSelector("[href='/templates/5_payroll']");
        
       private By CrearTemplate = By.xpath("/html/body/section/section/div/form/div[2]/div/div/div[2]/button");
        
       private By SearchRFC = By.xpath("/html/body/header/div[2]/div/form/i[2]");
        
       private By MenuDropDown = By.xpath("//span[contains(text(),'Facturación')]");
        
       private  By NominaFiscal = By.xpath("//span[contains(text(),'Nómina Fiscal')]");
        
       private By DescargaNomina = By.xpath("//a[contains(text(),'Descargar el formato de ejemplo')]");
        
       private  By ImportarNomina = By.xpath("/html/body/section/aside[2]/div[2]/ul[2]/li[2]/a");
        
       private  By ListaDeProcessoNomina = By.xpath("//a[contains(text(),'Ver lista de procesos')]");
        
       private By CargarNomina = By.cssSelector("[href='/paysheets/new']");
        
       private  By ContinuarNomina = By.xpath("/html/body/section/section/div/div/div[2]/div/div/form/div[4]/div/button");
        
       private  By EmitirNomina  = By.xpath("/html/body/section/section/div/div/div[2]/div[2]/form/div/div/button");
       // CONCILIACION
       private By ConciliacionMenu = By.xpath("//span[contains(text(),'Conciliación Fiscal')]");
       
       private By Conciliar = By.xpath("//i[contains(text(),'done_all')]");
       
       private By SelecionarBase = By.xpath("//span[contains(text(),'Seleccionar Base...')]");
       
       private By ConsultarCnsil = By.id("btn-conciliation");
       
       private By Find = By.xpath("//button[contains(text(),'Buscar')]");
       
       private By Ver = By.xpath("//a[@data-original-title='Ver']");
       
       private By VerPDF = By.xpath("//a[@data-original-title='Ver PDF']");
       
       private By DownloadXML = By.xpath("//a[@data-original-title='Descargar XML']");
       
       private By BusqByRepConc = By.id("show-search-receipt-advanced");
       //Boveda
       
       private By BovedaFiscal = By.xpath("//span[contains(text(),'Bóveda Fiscal')]");
        
       private  By Servicios = By.cssSelector("[data-ma-action*='submenu-toggle']");
        
       private  By Configuration = By.xpath("/html/body/section/aside[2]/div[2]/ul[2]/li[6]/a");
        
       private By SignOut = By.cssSelector("[stroke*='#000']");
        
       private By LogBotClose = By.xpath("//i[contains(text(),'power_settings_new')]");
        
       private By DatosFiscales = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[1]/a");
        
       private By Sucursales = By.cssSelector("[href*='/branches']");
        
       private  By Certificados = By.cssSelector("[href*='/certificates']");
        
       private  By SelectSucCert = By.cssSelector("[data-id='certificate_branch_office_id']");
        
       private  By Producto = By.cssSelector("[href*='/products']");
        
       private  By SeriesFolio = By.cssSelector("[href*='/serials']");
        
       private  By Usuarios = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[6]/a");
        
       private By Perfiles = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[7]/a");
        
       private  By AddCertificado = By.cssSelector("[href*='/certificates/new']");
        
       private  By AddArchivoCer = By.xpath("//*[@id=\"certificate_cer_file\"]");
        
       private  By AddArchivoKey = By.xpath("//*[@id=\"certificate_key_file\"]");
        
       private By AddPassword = By.id("certificate_passphrase");
        
       private By UploadCertificate = By.xpath("/html/body/section/section/div/div/div[2]/div/form/div[9]/div/button");
        
        
       private By AddSucursal = By.cssSelector("[href*='/branches/new']");
        
       private By SucursalBranch = By.id("branch_name");
        
       private  By SucursalAlias = By.id("branch_alias");
        
       private By SucursalZip = By.id("branch_zip_code");
        
       private By SaveSucursal = By.xpath("/html/body/section/section/div/div/div[2]/div/form/div[5]/div/button");
        
       private By ActivarSucursal = By.id("branch_is_active");
        
       private By PrincipalSucursal = By.id("branch_is_main");
        
       private By AddFolios = By.cssSelector(".btn-float");
        
       private By SerieFolio = By.id("serial_serial_number");
        
       private By ValorInicialFolio = By.id("serial_begin");
        
       private By ValorFinalFolio = By.name("serial[end]");
        
       private By AgregarFolio = By.cssSelector("[type*='submit']");
        
       private By AddProducto = By.cssSelector("[href*='/products/new?page=']");
        
       private By NameProduct = By.id("product_name");
        
       private By ClaveDelProducto = By.id("product_key_product_service");
        
       private By ClaveDeUnidadPro = By.id("product_key_unit");
        
       private By ValorUnitarioProduct = By.id("product_unit_value");
        
       private By DescripcionDelPro = By.id("product_description");
        
       private By GuardarProduct = By.cssSelector("button.pull-right");
        
       private By Client = By.cssSelector("[href*='/customers']");
        
       private By AddClient = By.cssSelector("[href*='/customers/new?page=']");
         
       private By RFCClient = By.id("customer_rfc");
        
       private By GuardarClient = By.cssSelector("button.pull-right");
        
       private By Emitidos = By.cssSelector("#billing-menu > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
        
       private By EmitidoRFC = By.id("document_rfc_receiver");
        
       private By EmitidoSerie = By.id("document_receipt_serie");
        
       private  By EmitidoFolio = By.id("document_receipt_folio");
        
       private By EmitidoDataInicial = By.id("document_init_date");
        
       private By EmitidoDataFinal = By.id("document_end_date");
        
       private  By CheckBoxEmitido = By.cssSelector("[type*='checkbox']");
        
       private  By CheckFistOpEmi = By.cssSelector(".select-box");
        
       private  By ExportarEmitido = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
       private  By EnviarEmitido = By.xpath("//button[@class='btn btn-default btn-anyrfc btn-sent']");
        
       private By DescargarEmitido = By.cssSelector("button.btn:nth-child(4)");
        
       private  By BuscarEmitido = By.cssSelector("button.btn-primary:nth-child(1)");
        
       private By DescargarEmitidoXML = By.cssSelector("[data-value*='xml']");
        
       private  By DescargarEmitidoPDF = By.cssSelector("[data-value*='pdf']");
        
       private  By DescargarEmitidoBoth = By.cssSelector("[data-value*='zip']");
        
       private By DescargaFinal = By.cssSelector(".swal2-confirm");
        
       private By EstatusEmitido = By.cssSelector("tr.active > td:nth-child(12) > div:nth-child(1) > a:nth-child(6)");
        
       private By DuplicarEmitido = By.cssSelector("[data-original-title*='Duplicar']");
        
       private By DuplicacionEmitido = By.id("duplicate_receipt");
        
       private  By EmitirDuplicado = By.cssSelector("button.btn-lg");
        
       private  By VistaRapidaEmitido = By.cssSelector("tr.active > td:nth-child(12) > div:nth-child(1) > a:nth-child(1)");
        
       private By SalirVistaEmitido = By.cssSelector(".btn-link");
        
       private By PDFVistaEmitido = By.cssSelector("[data-original-title*='Ver PDF']");
        
       private  By XMLVistaEmitido = By.cssSelector("[data-original-title*='Descargar XML']");
        
       private  By ExportarPaginaActivaEm = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
       private By IdentificarStatusEmit = By.cssSelector(".swal2-confirm");
       
       private By CorreoEstatus = By.xpath("//input[@placeholder='Correo electrónico']");
       
       private By Notificar = By.xpath("//button[contains(text(),'Notificar')]");
       
       private By Nonotificar = By.xpath("//button[contains(text(),'No notificar')]");
        
       private By AceptarStatusEmit = By.xpath("//button[contains(text(),'Aceptar')]");
        
       private By ExportarCFDI = By.xpath("//*[@class='btn btn-default btn-export']");
        
       private By ClientName = By.id("customer_business_name");
        
       private  By PhoneClient = By.id("customer_telefono");
        
       private By EmailClient = By.id("customer_email");
        
       private By ClientCountry = By.id("customer_pais");
        
       private By ClientState = By.id("customer_estado");
        
       private By ClientMunicipio = By.id("customer_municipio");
        
       private By ClientColonia = By.id("customer_colonia");
        
       private  By ClientCalle = By.id("customer_calle");
        
       private By ClientActivo = By.id("customer_active");
        
       private By ActivateProduct = By.id("product_is_active");
        
       private By BusonFiscal = By.xpath("/html/body/header/ul/li[2]/ul/li[1]/form/a");
        
       private By CrearComprobanteBuson = By.cssSelector("[href*='/receipts/new']");
        
       private By BottonSendXMLPDF = By.cssSelector("[title='XML - PDF']");
        
       private By SendEmail = By.name("data[emails][0]");
        
       private By Enviar = By.id("send-receipt");
        
       private By SaveDraft = By.id("save_draft");
        
       private By DraftBox = By.xpath("//input[@class='swal2-input']");
        
       private  By SaveText = By.cssSelector("button.swal2-confirm.swal2-styled");
        
       private By OkBotton = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
       private By Borradores = By.xpath("/html/body/section/aside[2]/div[2]/ul[2]/li[2]/a");
        
       private By CancelarComprobante = By.cssSelector("[data-original-title='Cancelar']");
        
       private By IdentificarStatusCancelacion = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
       private  By AceptarCancelacion = By.xpath("//button[contains(text(),'Aceptar')]");
        
       private By SolicitarCancelacion = By.xpath("//button[contains(text(),'Solicita la cancelación')]");
        
       private  By DuplicadoComercioExtIngreso = By.cssSelector("[data-href='/i/ce']");
        
       private  By DuplicadoComercioExtTranslado = By.cssSelector("[data-href='/t/ce']");
        
       private  By DuplicarInstituicionesEdu = By.cssSelector("[data-href='/i/iedu']");
        
       private  By DuplicarLeyendasFiscales = By.cssSelector("[data-href='/i/lf']");
        
       private By DuplicarNotariosPublicos = By.cssSelector("[data-href='/i/np']");
        
       private By DuplicarDonatarios = By.cssSelector("[data-href='/i/d']");
        
       private By DuplicarPagoEnEspecies = By.cssSelector("[data-href='/i/kp']");
        
       private By DuplicarPersonasFisicas = By.cssSelector("[data-href='/i/pfic']");
        
       private By DuplicarServiciosParceales = By.cssSelector("[data-href='/i/cp']");
        
       private By DuplicarTuristasYPassageros = By.cssSelector("[data-href='/i/tpe']");
        
       private By DuplicarFacturaSimples = By.cssSelector("[data-href='/i']");
        
       private By CloneEmail = By.xpath("/html/body/section/section/div/div[2]/form[1]/div[3]/div/div/div[2]/div/div/button/i");
        
       private By DuplicarINE = By.cssSelector("[data-href='/i/ine']");
        
       private By DuplicarNotaDeCredito = By.cssSelector("[data-href='/e']");
        
       private By DuplicarVehiculoUsado = By.cssSelector("[data-href='/i/v']");
        
       private By DuplicadoCartaPorte = By.cssSelector("[data-href='/t']");
        
       private  By SelectTipoDeCFDI = By.xpath("//div[@class='btn-group bootstrap-select billing_receipt_type_select']");
        
       private By CFDII = By.linkText("Ingreso");
        
       private By CFDIE = By.linkText("Egreso");
        
       private By CFDIT = By.linkText("Traslado");
        
       private By CFDIP = By.linkText("Pago");
        
       private By BusquedaAvanzada = By.id("show-search-receipt-advanced");
        
        // BUSQUEDA FORMA DE PAGO
       private By SelectBusquedaFormaDPago = By.cssSelector("[data-id='document_payment_way_id']");
        
       private By DacionEnPago = By.linkText("Dación en pago");
        
       private By ValesDeDespensa = By.linkText("Vales de despensa");
        
       private By DineroElectronico = By.linkText("Dinero electrónico");
        
       private By MonederoElectronico = By.linkText("Monedero electrónico");
        
       private By TarjetaDeCredito = By.linkText("Tarjeta de crédito");
        
       private By TransferenciaElectronica = By.linkText("Transferencia electrónica");
        
       private By ChequeNominativo = By.linkText("Cheque nominativo");
        
       private By Efectivo = By.linkText("Efectivo");
        // ESTATUS
       private By SelectStatus = By.cssSelector("[data-id='document_status']");
        
       private By StatusCancelado = By.linkText("Cancelado");
        
       private By StatusPendientesDeAprov = By.linkText("Pendientes de aprobación");
        
       private By StatusEntregadoSat = By.linkText("Entregado SAT");
        
       private By StatusEmitido = By.linkText("Emitido");
        // REGISTROS
       private By Registros = By.cssSelector("[data-id='document_total_page']");
        
       private By Registro5000 = By.linkText("5000");
        
       private By Registro2000 = By.linkText("2000");
        
       private By Registro1000 = By.linkText("1000");
        
       private By Registro500 = By.linkText("500");
        //BUSQUEDA POR METHODO DE PAGO
       private By BusquedaMethodDPago = By.cssSelector("[data-id='document_payment_method_id']");
        
       private By PagoUnaSolaExib = By.linkText("PUE - Pago en una sola exhibición");
        
       private By PagoEnParcealidades = By.linkText("PPD - Pago en parcialidades o diferido");
        
       private By CodigoDeConfirm = By.id("document_confirm_code");
        
       private By FolioFiscal = By.id("document_uuid");
        
       private By Ticket = By.id("document_ref_id");
        
       private By Serie = By.id("document_receipt_serie");
        
       private By Folio = By.id("document_receipt_folio");
        // CONCILIACION FISCAL
       private By FolioFisc = By.id("document_received_folio");
       
       private By DataIncialConc = By.id("document_received_payment_init_date");
       
       private By DataFinalConc = By.id("document_received_payment_end_date");
       // Busqueda por CFDI Ingreso
       private By FolioFiscalUid = By.id("document_received_uuid");
       
       private By CuentaBancaria = By.id("document_received_internal_bank_account");
        
       private By RFCProvedor = By.id("document_received_issuer_rfc");
        
       private By DataInicIngreConc = By.id("document_received_init_date");
        
       private By DataFinalIngresConc = By.id("document_received_end_date");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public WebElement DataFinalIngresConc() {
        	return driver.findElement(DataFinalIngresConc);
        }
        public WebElement DataInicIngress() {
        	return driver.findElement(DataInicIngreConc);
        }
        public WebElement RfcProvedor() {
        	return driver.findElement(RFCProvedor);
        }
        public WebElement CuentaBancaria() {
        	return driver.findElement(CuentaBancaria);
        }
        public WebElement FolioFiscalUid() {
        	return driver.findElement(FolioFiscalUid);
        }
        public WebElement DataFinalConc() {
        	return driver.findElement(DataFinalConc);
        }
        public WebElement DataInicConc() {
        	return driver.findElement(DataIncialConc);
        }
        public WebElement FolioFisc(){
        	return driver.findElement(FolioFisc);
        }
        public WebElement DownloadXML() {
        	return driver.findElement(DownloadXML);
        }
        public WebElement VerPDF() {
        	return driver.findElement(VerPDF);
        }
        public WebElement Ver() {
        	return driver.findElement(Ver);
        }
        public WebElement BovedaFiscal() {
        	return driver.findElement(BovedaFiscal);
        }
        public WebElement FindByRepoConc() {
        	return driver.findElement(BusqByRepConc);
        }
        public WebElement FindConciliacion() {
        	return driver.findElement(Find);
        }
        public WebElement ConsultarConsil() {
        	return driver.findElement(ConsultarCnsil);
        }
        public WebElement SelecionarBase() {
        	return driver.findElement(SelecionarBase);
        }
        public WebElement ConciliarButton() {
        	return driver.findElement(Conciliar);
        }
        public WebElement ConciliacionMenu() {
        	return driver.findElement(ConciliacionMenu);
        }
        public WebElement SideBar() {
        	return driver.findElement(SideBar);
        }
        public WebElement TimbreFiscal() {
        	return driver.findElement(TimbreFiscal);
        }
        public WebElement ConectorFiscal() {
        	return driver.findElement(ConectorFiscal);
        }
        public WebElement BuzonFiscal() {
        	return driver.findElement(BuzonFiscal);
        }
        public WebElement ServiciosMenu() {
        	return driver.findElement(ServiciosMenu);
        }
        public WebElement UploadCertificate() {
        	return driver.findElement(UploadCertificate);
        }
        public WebElement FormatoCartaHorizBasic() {
        	return driver.findElement(FormatoCartaHorizBasic);
        }
        public WebElement FormatoCartaImpBasic() {
        	return driver.findElement(FormatoCartaImprBasic);
        }
        public WebElement TemplatePagoImprFiscal() {
        	return driver.findElement(TemplatePagoImpr);
        }
        public WebElement PagoImprFiscal() {
        	return driver.findElement(PagoImprFiscal);
        }
        public WebElement NominaImpresionFiscal() {
        	return driver.findElement(NominaImpresionFiscal);
        }
        public WebElement CrearTemplate() {
        	return driver.findElement(CrearTemplate);
        }
        public WebElement TemplateNominaImpr() {
        	return driver.findElement(TemplateNominaImpr);
        }
        public WebElement TemplateNote() {
        	return driver.findElement(TemplateNote);
        }
        public WebElement TemplateName() {
        	return driver.findElement(TemplateName);
        }
        public WebElement ImpresionBasica() {
        	return driver.findElement(ImpresionBasica);
        }
        public WebElement Plantillas() {
        	return driver.findElement(PlantillasImpresion);
        }
        public WebElement ImpresionFiscal() {
        	return driver.findElement(ImpresionFiscal);
        }
        public WebElement DescargaNomina() {
        	return driver.findElement(DescargaNomina);
        }
        public WebElement ListaProceNomina() {
        	return driver.findElement(ListaDeProcessoNomina);
        }
        public WebElement CloseSearch() {
        	return driver.findElement(CloseSearch);
        }
        public WebElement SearchRFC() {
        	return driver.findElement(SearchRFC);
        }
        public WebElement ValidacionOK() {
        	return driver.findElement(ValidacionOK);
        }
        public WebElement ListaRFC() {
        	return driver.findElement(ListaRFC);
        }
        public WebElement Search() {
        	return driver.findElement(Search);
        }
        public WebElement EmitirNomina() {
        	return driver.findElement(EmitirNomina);
        }
        public WebElement ContinuarNomina() {
        	return driver.findElement(ContinuarNomina);
        }
        public WebElement cargarNomina() {
        	return driver.findElement(CargarNomina);
        }
        public WebElement ImportarNomina() {
        	return driver.findElement(ImportarNomina);
        }
        public WebElement NominaFiscal() {
        	return driver.findElement(NominaFiscal);
        }
        public WebElement MenuDropDown() {
        	return driver.findElement(MenuDropDown);
        }
        public WebElement ChequeNominativo() {
        	return driver.findElement(ChequeNominativo);
        }
        public WebElement Folio() {
        	return driver.findElement(Folio);
        }
        public WebElement Serie() {
        	return driver.findElement(Serie);
        }
        public WebElement Ticket() {
        	return driver.findElement(Ticket);
        }
        public WebElement FolioFiscal() {
        	return driver.findElement(FolioFiscal);
        }
        public WebElement CodigoDeConfirmacion() {
        	return driver.findElement(CodigoDeConfirm);
        }
        public WebElement PagoEnParcealedades() {
        	return driver.findElement(PagoEnParcealidades);
        }
        public WebElement PagoEnUnaSolaExib() {
        	return driver.findElement(PagoUnaSolaExib);
        }
        public WebElement BusquedaMethodPago() {
        	return driver.findElement(BusquedaMethodDPago);
        }
        public WebElement Registro500() {
        	return driver.findElement(Registro500);
        }
        public WebElement Registro1000() {
        	return driver.findElement(Registro1000);
        }
        public WebElement Registro2000() {
        	return driver.findElement(Registro2000);
        }
        public WebElement Registro5000() {
        	return driver.findElement(Registro5000);
        }
        public WebElement Registros() {
        	return driver.findElement(Registros);
        }
        public WebElement StatusEmitido() {
        	return driver.findElement(StatusEmitido);
        }
        public WebElement StatusEntregadoSat() {
        	return driver.findElement(StatusEntregadoSat);
        }
        public WebElement StatusPendientesDeApr() {
        	return driver.findElement(StatusPendientesDeAprov);
        }
        public WebElement StatusCancelado() {
        	return driver.findElement(StatusCancelado);
        }
        public WebElement SelectStatus() {
        	return driver.findElement(SelectStatus);
        }
        public WebElement Efectivo() {
        	return driver.findElement(Efectivo);
        }
        public WebElement TransferenciaElectronica() {
        	return driver.findElement(TransferenciaElectronica);
        }
        public WebElement TarjetaDeCredito() {
        	return driver.findElement(TarjetaDeCredito);
        }
        public WebElement MonederoElectronico() {
        	return driver.findElement(MonederoElectronico);
        }
        public WebElement DineroElectronico() {
        	return driver.findElement(DineroElectronico);
        }
        public WebElement ValesDeDespensa() {
        	return driver.findElement(ValesDeDespensa);
        }
        public WebElement DacionEnPago() {
        	return driver.findElement(DacionEnPago);
        }
        public WebElement SelectBusquedaFormaDPago() {
        	return driver.findElement(SelectBusquedaFormaDPago);
        }
        public WebElement BusquedaAvanzada() {
        	return driver.findElement(BusquedaAvanzada);
        }
        public WebElement ExportarCFDI() {
        	return driver.findElement(ExportarCFDI);
        }
        public WebElement CFDIP() {
        	return driver.findElement(CFDIP);
        }
        public WebElement CFDIT() {
        	return driver.findElement(CFDIT);
        }
        public WebElement CFDIE() {
        	return driver.findElement(CFDIE);
        }
        public WebElement CFDII() {
        	return driver.findElement(CFDII);
        }
        public WebElement SelectTipoDeCFDI() {
        	return driver.findElement(SelectTipoDeCFDI);
        }
        public WebElement DuplicarCartaPorte() {
        	return driver.findElement(DuplicadoCartaPorte);
        }
        public WebElement DuplicarFacturaSimples() {
        	return driver.findElement(DuplicarFacturaSimples);
        }
        public WebElement DuplicarVehiculoUsado() {
        	return driver.findElement(DuplicarVehiculoUsado);
        }
        public WebElement DuplicarNotaDeCredito() {
        	return driver.findElement(DuplicarNotaDeCredito);
        }
        public WebElement DuplicarINE() {
        	return driver.findElement(DuplicarINE);
        }
        public WebElement CloneEmail() {
        	return driver.findElement(CloneEmail);
        }
        public WebElement DuplicarTuristasYpassageros() {
        	return driver.findElement(DuplicarTuristasYPassageros);
        }
        public WebElement DuplicarServiciosParcelConst() {
        	return driver.findElement(DuplicarServiciosParceales);
        }
        public WebElement DuplicarPersonasFisicas() {
        	return driver.findElement(DuplicarPersonasFisicas);
        }
        public WebElement DuplicarPagoEnEspecie() {
        	return driver.findElement(DuplicarPagoEnEspecies);
        }
        public WebElement DuplicarDonatarios() {
        	return driver.findElement(DuplicarDonatarios);
        }
        public WebElement DuplicarNotarioPublico() {
        	return driver.findElement(DuplicarNotariosPublicos);
        }
        public WebElement DuplicarLeyendasFiscales() {
        	return driver.findElement(DuplicarLeyendasFiscales);
        }
        public WebElement DuplicarInstEducativas() {
        	return driver.findElement(DuplicarInstituicionesEdu);
        }
        public WebElement DuplicadoComercioTranslado() {
        	return driver.findElement(DuplicadoComercioExtTranslado);
        }
        public WebElement DuplicadoComercioIngreso() {
        	return driver.findElement(DuplicadoComercioExtIngreso);
        }
        public WebElement SolicitarCancelacion() {
        	return driver.findElement(SolicitarCancelacion);
        }
        public WebElement AceptarCancelacion() {
        	return driver.findElement(AceptarCancelacion);
        }
        public WebElement IdentificarStatusCancelacion() {
        	return driver.findElement(IdentificarStatusCancelacion);
        }
        public WebElement CancelarComprobante() {
        	return driver.findElement(CancelarComprobante);
        }
        public WebElement SelectSucursalCertificado() {
        	return driver.findElement(SelectSucCert);
        }
        public WebElement Borradores() {
        	return driver.findElement(Borradores);
        }
        public WebElement OkButton() {
        	return driver.findElement(OkBotton);
        }
        public WebElement SaveText() {
        	return driver.findElement(SaveText);
        }
        public WebElement DraftBox() {
        	return driver.findElement(DraftBox);
        }
        public WebElement SaveDraft() {
        	return driver.findElement(SaveDraft);
        }
        public WebElement Enviar() {
        	return driver.findElement(Enviar);
        }
        public WebElement SendEmail() {
        	return driver.findElement(SendEmail);
        }
        public WebElement SendXMLPDF() {
        	return driver.findElement(BottonSendXMLPDF);
        }
        public LandingPageBuson(WebDriver driver2) {
			
        	this.driver= driver2;
		}

		public WebElement ingPortal()
		{
			return driver.findElement(Email);
			 
          }
		public WebElement DuplicacionEmitido() {
			return driver.findElement(DuplicacionEmitido);
		}
		public WebElement EmitirDuplicado() {
			return driver.findElement(EmitirDuplicado);
		}
		public WebElement SalirVistaEmitido() {
			return driver.findElement(SalirVistaEmitido);
		}
		public WebElement EmitidoFirstOpt() {
			return driver.findElement(CheckFistOpEmi);
		}
		public WebElement CertificadoSucursal() {
			return driver.findElement(SelectSucCert);
		}
		public WebElement ExportarPaginaActEm() {
			return driver.findElement(ExportarPaginaActivaEm);
		}
		public WebElement BusonFiscal() {
			return driver.findElement(BusonFiscal);
		}
		public WebElement Servicios() {
			return driver.findElement(Servicios);
		} 
		public WebElement EmitidoRFC() {
			return driver.findElement(EmitidoRFC);
		}
		public WebElement IdentificarStatusEmit() {
			return driver.findElement(IdentificarStatusEmit);
		}
		public WebElement CorreoEstatus() {
			return driver.findElement(CorreoEstatus);
		}
		public WebElement Notificar() {
			return driver.findElement(Notificar);
		}
		public WebElement Nonotificar() {
			return driver.findElement(Nonotificar);
		}
		public WebElement AceptarStatus() {
			return driver.findElement(AceptarStatusEmit);
		}
		public WebElement CheckBoxComprobanteEmitido() {
			return driver.findElement(CheckBoxEmitido);
		}
		public WebElement ExportarEmitido() {
			return driver.findElement(ExportarEmitido);
		}
		public WebElement EnviarEmitido() {
			return driver.findElement(EnviarEmitido);
		}
		public WebElement DescargarEmitido() {
			return driver.findElement(DescargarEmitido);
		}
		public WebElement DescargarEmitidoXML() {
			return driver.findElement(DescargarEmitidoXML);
		}
		public WebElement DescargarEmitidoPDF() {
			return driver.findElement(DescargarEmitidoPDF);
		}
		public WebElement DescargarBoth() {
			return driver.findElement(DescargarEmitidoBoth);
		}
		public WebElement BottonDescarga() {
			return driver.findElement(DescargaFinal);
		}
		public WebElement EstatusEmitido() {
			return driver.findElement(EstatusEmitido);
		}
		public WebElement DuplicarEmitido() {
			return driver.findElement(DuplicarEmitido);
		}
		public WebElement VistaRapiraEmitido() {
			return driver.findElement(VistaRapidaEmitido);
			
		}
		public WebElement PDFVistaRapidaEmitido() {
			return driver.findElement(PDFVistaEmitido);
		}
		public WebElement XMLVistaRapidaEmitido() {
			return driver.findElement(XMLVistaEmitido);
		}
		public WebElement EmitidoDataInicial() {
			return driver.findElement(EmitidoDataInicial);
		}
		public WebElement EmitidoDataFinal() {
			return driver.findElement(EmitidoDataFinal);
		}
		public WebElement BuscarEmitidos() {
			return driver.findElement(BuscarEmitido);
		}
		public WebElement EmitidoSerie() {
			return driver.findElement(EmitidoSerie);
		}
		public WebElement EmitidoFolio() {
			return driver.findElement(EmitidoFolio);
		}
		public WebElement ComprobanteEmitido() {
			return driver.findElement(Emitidos);
		}
		public WebElement ActivateClient() {
			return driver.findElement(ClientActivo);
		}
		 public WebElement Emitidos() {
			 return driver.findElement(Emitidos);
		 }
		 public WebElement ActivateProducto() {
			 return driver.findElement(ActivateProduct);
		 }
		 public WebElement ClientName() {
			 return driver.findElement(ClientName);
		 }
		 public WebElement ClientPhone(){
			 return driver.findElement(PhoneClient);
		 }
		 public WebElement EmailClient() {
			 return driver.findElement(EmailClient);
		 }
		 public WebElement ClintCountry() {
			 return driver.findElement(ClientCountry);
		 }
		 public WebElement ClientState() {
			 return driver.findElement(ClientState);
		 }
		 public WebElement ClientMunicipio() {
			 return driver.findElement(ClientMunicipio);
		 }
		 public WebElement ClientColonia() {
			 return driver.findElement(ClientColonia);
		 }
		 public WebElement ClientCalle() {
			 return driver.findElement(ClientCalle);
		 }
		 public WebElement RFCClient() {
			 return driver.findElement(RFCClient);
		 }
		 
		public WebElement Cliente() {
			return driver.findElement(Client);
		}
		public WebElement AgregarClient() {
			return driver.findElement(AddClient);
		}
		public WebElement GuardarClient() {
			return driver.findElement(GuardarClient);
		}
		public WebElement ClaveUnidadProducto() {
			return driver.findElement(ClaveDeUnidadPro);
		}
		public WebElement AddProducto() {
			return driver.findElement(AddProducto);
		}
		public WebElement ProductName() {
			return driver.findElement(NameProduct);
		}
		public WebElement ClaveDelProducto() {
			return driver.findElement(ClaveDelProducto);
		}
		public WebElement ValorUnitarioProd() {
			return driver.findElement(ValorUnitarioProduct);
		}
		public WebElement DescripcionProduct() {
			return driver.findElement(DescripcionDelPro);
		}
		public WebElement GuardarProduct() {
			return driver.findElement(GuardarProduct);
		}
		public WebElement ingPortal1()
		{
			return driver.findElement(Password);
		}
		public WebElement ingPortal11()
		{
			return driver.findElement(Ingresar);
		}	 
		public WebElement ingPortalAdv()
		{
			return driver.findElement(Advanced);
		}	 
		public WebElement ingPortalProc()
		{
			return driver.findElement(Proceed);
		}	
		public WebElement ingdropPortal()
		{
			return driver.findElement(DropFistP);
		}
		
		public WebElement ingCrearCopr()
		{
			return driver.findElement(CrearCompr);
		}
		public WebElement ingFactura() {
			return driver.findElement(Factura);
		}
		public WebElement ingNotadeCredito() {
			return driver.findElement(NotadeCredito);
		}
		public WebElement ingCartaPorte() {
			return driver.findElement(CartaPorte);
			
		}
      public WebElement ingPagos() {
	       return driver.findElement(Pagos);
       }
      public WebElement ConfigBotton() {
   	   return driver.findElement(Configuration);
       }
      public WebElement SignOut() {
   	   return driver.findElement(SignOut);
      }
      public WebElement DatosFiscales() {
   	   return driver.findElement(DatosFiscales);
      }
      public WebElement Sucursales() {
      	   return driver.findElement(Sucursales);
         }
      public WebElement Certificados() {
      	   return driver.findElement(Certificados);
         }
      
         
      public WebElement FolioSeries() {
      	   return driver.findElement(SeriesFolio);
         }
      public WebElement Usuarios() {
      	   return driver.findElement(Usuarios);
         }
      public WebElement Perfiles() {
      	   return driver.findElement(Perfiles);
         }
      public WebElement CloseBotton() {
     	   return driver.findElement(LogBotClose);
        }

       public WebElement AddArchivoCer() {
	   return driver.findElement(AddArchivoCer);
       }
       public WebElement AddArchivoKey() {
    	   return driver.findElement(AddArchivoKey);
           }
       public WebElement AddPassword() {
    	   return driver.findElement(AddPassword);
           }
       
       public WebElement AddCertificado() {
    	   return driver.findElement(AddCertificado);
           }
      
        public WebElement AddSucursal() {
        	return driver.findElement(AddSucursal);
        }
       public WebElement SucursalBranch() {
	        return driver.findElement(SucursalBranch);
}
       public WebElement SucursalAlias() {
    	   return driver.findElement(SucursalAlias);
       }
      public WebElement SucursalZip() {
    	  return driver.findElement(SucursalZip);
     }
	public WebElement GuardarSucursal() {
		return driver.findElement(SaveSucursal);
	}
	public WebElement ActivarSucursal() {
		return driver.findElement(ActivarSucursal);
	}
	public WebElement AddFolio() {
		return driver.findElement(AddFolios);
	}
	public WebElement SerieFolio() {
		return driver.findElement(SerieFolio);
	}
	public WebElement ValorInicialFolio() {
		return driver.findElement(ValorInicialFolio);
	}
	public WebElement ValorFinalFolio() {
		return driver.findElement(ValorInicialFolio);
	}
	public WebElement AgregarFolio() {
		return driver.findElement(AgregarFolio);
	}
	public WebElement Producto() {
		return driver.findElement(Producto);
	}
}
