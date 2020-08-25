package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public WebDriver driver;
	
       private   By SelectRegimeFiscal= By.cssSelector("[title*='Selecciona el regimen fiscal...']");
        
       private  By PersonasMorales = By.cssSelector("[class='text']");
        
       private By RFC = By.id("receipt_receiver_rfc");
        
       private By SelectCFDI = By.cssSelector("[title*='Selecciona el uso del CFDI...']") ;
        
       private By CFDIGastosGenerales = By.xpath("//*[@id=\"content\"]/div/form/div[2]/div[2]/div[1]/div[3]/div/div/div/ul/li[4]/a/span[1]");
        
       private By formaPago = By.id("receipt_exchange_rate");
        
       private By Moneda = By.cssSelector("[data-id='receipt_currency']");
        
       private By HotP = By.id("hotp-request-input");
        
       private By ConfirmationCode = By.cssSelector("[href='#modal-hotp-confirmation-code']");
        
       private By SelectformaPago1 = By.cssSelector("[title*='Selecciona la Forma de pago...']");
        
       private By SelectFormaPago2 = By.xpath("//*[@id=\"content\"]/div/form/div[3]/div[2]/div[1]/div[3]/div/div/div/ul/li[5]/a/span[1]");
        
       private By SelectMethodPago = By.xpath("//button[@title='Selecciona el Método de pago...']");
        
       private By MethodPago1Exhibicion = By.linkText("PUE - Pago en una sola exhibición");
        
       private By PAGOparcialidades = By.linkText("PPD - Pago en parcialidades o diferido");
        
       private  By AgregarComplPago = By.cssSelector("[href='#modal-add-complement']");
        
       private  By FechaDePago = By.id("complement_fecha_pago");
        
       private By SelectFormaPagoP = By.cssSelector("[title='Selecciona la forma de pago...']");
        
       private By MontoDePago = By.id("complement_monto");
        
       private  By TipoDeCambioPago = By.id("complement_tipo_cambio_p");
        
       private By PagoSwitch = By.xpath("//*[@id=\"modal-add-complement\"]/div/div/div[2]/div[2]/div[1]/div/label");
        
       private  By MethodPagoPago = By.cssSelector("[title='Selecciona el método de pago...']");
        
       private By PPDPago = By.linkText("PPD - Pago en parcialidades o diferido");
        
       private  By DocRelaPago = By.id("related_cfdi_complement_id_documento");
        
       private By ImportePago = By.id("related_cfdi_complement_imp_pagado");
        
       private By ParcialidPagos = By.id("related_cfdi_complement_num_parcialidad");
        
       private  By ImpSaldAntPago = By.id("related_cfdi_complement_imp_saldo_ant");
        
       private By CambioPago = By.id("related_cfdi_complement_tipo_cambio_dr");
       
       private By ComplementoRelacionadoPago = By.id("related_cfdi_complement_id_documento");
       
       private  By List = By.xpath("//ul[contains(@class,'list')]//li");
       
       private By SelectMethodPagoComprobantes = By.cssSelector("[data-id='related_cfdi_complement_metodo_de_pago_dr']");
        
       private By AgregarComprDePago = By.id("add-related_cfdi_complement");
       
       private By FolioPago = By.id("related_cfdi_complement_folio");
       
       private  By ImporteSaldoInsoPago = By.id("related_cfdi_complement_imp_saldo_insoluto");
       
       private By NumeroDeParcialidad = By.id("related_cfdi_complement_num_parcialidad");
        
       private  By AddPagoCompl = By.id("add-complement");
        
       private By agregarConsept = By.xpath("//*[@id=\"content\"]/div/form/div[4]/div[4]/button");
        
       private  By claveDelProducto = By.id("concept_prod_serv_id");
        
       private  By cantidadConsept = By.id("concept_quantity");
        
       private By claveDeUnidad = By.id("concept_unit_id");
        
       private  By descriptConsept = By.id("concept_description");
        
       private   By valorUnitConsept = By.id("concept_unit_value");
        
       private By importConsept = By.id("concept_amount");
        
       private  By addConsept = By.id("add-concept");
        
       private By Emitir = By.cssSelector("[type='submit']");
        
        
       private By ImpuestosRetenidosBotton = By.xpath("//*[@id=\"modal-add-concept\"]/div/div/div[2]/div[1]/div/label");
        
       private By ImpuestosDeTranslados = By.xpath("//*[@id=\"modal-add-concept\"]/div/div/div[2]/div[5]/div/label");
        
       private By ImpRetBase = By.id("retention_base");
        
       private  By SelectImpuestRet = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[2]/div/div/button/span[1]");
        
       private By ISRRetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[2]/div/div/div/ul/li[2]/a");
        
       private By IVARetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[2]/div/div/div/ul/li[3]/a");
        
       private By IEPSRetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[2]/div/div/div/ul/li[4]/a");
        
       private By SelectFactor = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[3]/div/div/button/span[1]");
        
       private By TasaRetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[3]/div/div/div/ul/li[2]/a");
        
       private  By CuotaRetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[3]/div/div/div/ul/li[3]/a");
        
       private By CampoTasaOCuota = By.id("retention_rate_or_fee");
        
       private By ImporteRetenido = By.id("retention_amount");
        
       private By AgregarRetenido = By.id("add-retention");
        
       private By TransladoButton = By.xpath("//*[@id=\"modal-add-concept\"]/div/div/div[2]/div[5]/div/label");
        
       private  By TransladosBase = By.id("transfer_base");
        
       private By SelectImpuestoTransla = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[2]/div/div/button/span[1]");
        
       private By IVATranslado = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[2]/div/div/div/ul/li[2]/a");
        
       private By IEPSTranslado = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[2]/div/div/div/ul/li[3]/a");
        
       private By SelectFactorTranslado = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[3]/div/div/div/button/span[1]");
        
       private By TasaTransladoFact = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[3]/div/div/div/div/ul/li[2]/a");
        
       private By CuotaTransladoFact = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[3]/div/div/div/div/ul/li[3]/a");
        
       private By ExtentoTransladoFact = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[3]/div/div/div/div/ul/li[4]/a");
        
       private By TasaOCuotaTranslado = By.id("transfer_rate_or_fee");
        
       private  By AgregarTranslado = By.id("add-transfer");
        
       private By CartaPorteBasica = By.cssSelector("[href*='/receipts/t/new']");
        
       private By FuncionDeMensagenDeta = By.cssSelector("[title='Selecciona la función del mensaje...']");
        
       private  By TipoDeTransDetallista = By.cssSelector("[title='Selecciona el tipo de transacción...']");
        
       private By NumeroPedidoDetallista = By.id("[order_identification][reference_identification][0]");
        
       private  By CloneButtonDetallista = By.cssSelector("[.btn.btn-default.btn-add-clone]");
        
       private By GNLDetallista = By.id("[buyer][gln]");
        
       private  By CodigoDeRefAdDetallista = By.cssSelector("[title='Selecciona el código de referencia adicional...']");
        
       private By NumeroDetallista = By.id("[additional_information][0][reference_identification]");
        
       private By OriginalDetallista = By.linkText("ORIGINAL");
        
       private By CopyDetallista = By.linkText("COPY");
        
       private  By ReemplazaDetallista = By.linkText("REEMPLAZA");
        
       private By DeleteDetallista = By.linkText("DELETE");
        
       private By Numerodonativo = By.id("receipt_donation_no_authorization");
        
       private By FechaAuthoDonativo = By.id("receipt_donation_authorization_date");
        
       private  By TipoDeProcesoINE = By.cssSelector("[title='Selecciona el Tipo de Proceso...']");
        
       private  By TipoDeComiteINE = By.cssSelector("[title='Selecciona el Tipo de Comité...']");
        
       private  By ProcesoOrdinario = By.linkText("Ordinario");
        
       private By ProcesoPreCampana = By.linkText("Precampaña");
        
       private By ProcesoCampana = By.linkText("Campaña");
        
       private By EjecutivoNacionalComit = By.linkText("Ejecutivo Nacional");
        
       private By EjecutivoEstatal = By.linkText("Ejecutivo Estatal");
        
       private  By DirectivoEstatal = By.linkText("Directivo Estatal");
        
       private   By ClaveVehiPersFisicas = By.id("receipt_pfic_pfic_clave_vehicular");
        
       private   By PlacaPersonasFisicas = By.id("receipt_pfic_pfic_placa");
        
       private By ClaveVehicular = By.id("vehicle_clave_vehicular");
        
       private  By NIVVehicular = By.id("vehicle_niv");
        
       private  By AgregarVentaVehic = By.id("add-vehicle");
        
       private By AgreComplVehiUsado = By.cssSelector("[href*='#modal-add-used_vehicle']");
        
       private  By AddUsedVehicle = By.id("add-used_vehicle");
        
       private By MontoAdqVehUsado = By.id("used_vehicle_monto_adquisicion");
        
       private  By MontoEnajecVehiUsado = By.id("used_vehicle_monto_enajenacion");
        
       private  By ClaveVehiUsado = By.id("used_vehicle_uv_clave_vehicular");
        
       private By MarcaVehiculoUsado = By.id("used_vehicle_uv_marca");
        
       private By TipoVehicUsado = By.id("used_vehicle_uv_tipo");
        
       private  By ModeloVehicUsado = By.id("used_vehicle_uv_modelo");
        
       private By ValorVehicUsado = By.id("used_vehicle_uv_valor");
        
        // NOTARIOS PUBLICOS
        
       private  By NumeroInstrNotarial = By.id("[operation_data][notary_instrument_number]");
        
       private  By FechaInstNotarial = By.id("[operation_data][notary_instrument_date]");
        
       private By MontoInstNotarial = By.id("[operation_data][notary_amount]");
        
       private  By IvaInstNotarial = By.id("[operation_data][notary_iva]");
        
       private By SubTotalInstNotarial = By.id("[operation_data][notary_subtotal]");
        
       private  By CurpInstNotarial = By.id("[notary_data][notary_curp]");
        
       private  By NumeroNotaria = By.id("[notary_data][notary_number]");
        
       private By EntidadNotarial = By.cssSelector("[title='Selecciona la Entidad Federativa...']");
        
       private  By TipoDeImuebleNotarial = By.cssSelector("[title='Selecciona el tipo de inmueble...']");
        
       private  By CalleNotarial = By.id("[property_description][0][notary_calle]");
        
       private By MunicipioNotarial = By.id("[property_description][0][notary_municipio]");
        
       private By EstadoNotarial = By.cssSelector("[title='Selecciona el Estado...']");
        
       private By PaisNotarial = By.cssSelector("[data-id='[property_description][0][notary_pais]']");
        
       private By CodigoPostalNotarial = By.id("[property_description][0][notary_codigo_postal]");
        
        // DATOS ENAJENANTES
        
       private By NombreNotarial = By.id("[property_seller][0][notary_nombre]");
        
       private By ApellidoPaternNotarial = By.id("[property_seller][0][apellido_paterno]");
        
       private By RFCNotarial = By.id("[property_seller][0][notary_sb_rfc]");
        
       private By CurpEnajeNotarial = By.id("[property_seller][0][notary_sb_curp]");
        
        // DATOS ADUIRIENTE
        
       private By NombreAdqNotarial = By.id("[property_buyer][0][notary_nombre]");
        
       private By RFCAdquiriente = By.id("[property_buyer][0][notary_sb_rfc]");
        
        // SERVICIOS PARCEALES DE CONSTRUCCION
        
       private By AuthorizcionConstruccion = By.id("construction_num_perlicoaut");
        
       private By CalleContruccion = By.id("construction_construction_calle");
        
       private By MunicipioConstruccion = By.id("construction_construction_municipio");
        
       private By EstadoConstruccion = By.cssSelector("[data-id='construction_construction_estado']");
        
       private By CodigoPostalConstruccion = By.id("construction_construction_codigo_postal");
        
       private By AddContrucion = By.id("add-construction");
        
       private By AgregarComplConstruccion = By.cssSelector("[href='#modal-add-construction']");
        
        //CFDI COMERCIO EXTERIOR
       private By PrecioUnitarioMerc = By.id("external_commerce_item_ce_valor_unitario_aduana");
        
       private By CFDIComercioExt = By.cssSelector("[data-id='receipt_receiver_cfdi_usage']");
        
       private  By NumeroDeIDComercio = By.id("concept_identification_num");
        
       private By OperaComercioExt = By.cssSelector("[data-id='receipt_external_commerce_ce_tipo_operacion']");
        
       private By ExportOperation = By.linkText("2 - Exportación");
        
       private By ClavePedimentoExport = By.cssSelector("[data-id='receipt_external_commerce_ce_clave_de_pedimento']");
        
       private  By ImpDefinitPedimento = By.linkText("A1 - IMPORTACION O EXPORTACION DEFINITIVA");
        
       private By CertiOrigenExport = By.cssSelector("[data-id='receipt_external_commerce_ce_certificado_origen']");
        
       private By NonCertExp = By.linkText("0 - No Funge como certificado de origen");
        
       private By CertExp = By.linkText("1 - Funge como certificado de origen");
        
       private By ClaveIncoTermExpo = By.cssSelector("[data-id='receipt_external_commerce_ce_incoterm']");
        
       private By SubdFactExp = By.cssSelector("[data-id='receipt_external_commerce_ce_subdivision']");
        
       private By NonSubdFactExp = By.linkText("0 - No tiene subdivisión");
        
       private By WithSubFactExp = By.linkText("1 - Si tiene subdivisión");
        
       private By EquiValeXport = By.id("receipt_external_commerce_ce_tipo_cambio_usd");
        
       private By MercanciaIDNumber = By.cssSelector("[data-id='external_commerce_item_ce_no_identificacion']");
        
       private By DescriptMercancia = By.id("external_commerce_item_description_ce_marca");
        
       private By AgregarDescrMercancia = By.id("add-external_commerce_item_description");
        
       private By AddMercancia = By.id("add-external_commerce_item");
        
       private  By AgregarMercancia = By.xpath("//button[contains(text(),'Agregar Mercancia')]");
        
       private By MercanciaDolares = By.id("external_commerce_item_ce_valor_dolares");
        
       private By CFDIAdquisicDeMerc = By.linkText("G01 - Adquisición de mercancias");
        
        // OBRAS ARTES DE ANTEGUEDAD
       private By TipoDeBienObras = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div[1]/div/div/button");
        
       private  By TituloAdObras = By.cssSelector("[data-id='receipt_workart_workart_title']");
        
       private By CaracteristicaObras = By.cssSelector("[data-id='receipt_workart_workart_description']");
        
       private By DateObrasYArtes = By.id("receipt_workart_acquisition_date");
        // PAGO EN ESPECIES
       private  By ClaveDeInscriptEspec = By.id("receipt_kind_payment_kp_picture_key");
        
       private By NumeroFolioEspec = By.id("receipt_kind_payment_kp_donation_request_folio");
        
       private By NombreDePiezaEspec = By.id("receipt_kind_payment_kp_piece_art_name");
        
       private By TecnicaDeProdEspec = By.id("receipt_kind_payment_kp_production_technique");
        
       private By AnoDeProdPiezEspec = By.id("receipt_kind_payment_kp_production_year");
        
       private By DimensionsPiezEspec = By.id("receipt_kind_payment_kp_art_piece_dimentions");
        
        // TURISTA PASAGERO
       private By TipoDeTransito = By.cssSelector("[data-id='[tpe][tpe_tipo_transito]']");
        
       private By FechaDeTransito = By.id("[tpe][tpe_fecha_transito]");
        
       private By ViaDeTransito = By.cssSelector("[data-id='[transit_data][tpe_via]']");
        
       private By IdentifTransport = By.id("[transit_data][tpe_tipo_id]");
        
       private By NumeroIdentTransp = By.id("[transit_data][tpe_numero_id]");
        
       private By NacionalidadTransp = By.id("[transit_data][tpe_nacionalidad]");
        
       private By TranspCompany = By.id("[transit_data][tpe_empresa_transporte]");
        
        // LEYENDAS FISCALES
       private By AgregarLeyenda = By.cssSelector("[href='#modal-add-lf']");
        
       private  By TextoLeyenda = By.id("lf_lf_legend_text");
        
       private By AddLeyenda = By.id("add-lf");
        
       private By SelectPaisComercioExt = By.cssSelector("[data-id='receipt_receiver_tax_residence']");
        
       private By NumeroComercioExt = By.id("receipt_receiver_tax_identity_number");
        
       private By ClaveFraccionAncel = By.id("external_commerce_item_ce_fraccion_arancelaria");
        
       private  By PrecioUnitaroExt = By.id("external_commerce_item_ce_valor_unitario_aduana");
        
       private  By CurrencyComericoExt = By.cssSelector("[data-id='receipt_currency']");
        
       private By TipoDeCambioExt = By.id("receipt_exchange_rate");
        
       private By RazonSocial = By.id("receipt_receiver_name");
        
       private By CantidadBienesAduana = By.id("external_commerce_item_ce_cantidad_aduana");
        
       private By ClaveDeUnidadMerc = By.cssSelector("[data-id='external_commerce_item_ce_unidad_aduana']");
        
       private  By GenerarCodigo = By.xpath("/html/body/div[1]/div/div/div[3]/button[2]");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public WebElement NumeroDeParcialidad() {
        	return driver.findElement(NumeroDeParcialidad);
        }
        public WebElement FolioPago() {
        	return driver.findElement(FolioPago);
        }
        public WebElement AgregarComprDePago() {
        	return driver.findElement(AgregarComprDePago);
        }
        public WebElement MethodDePagoComprobantes() {
        	return driver.findElement(SelectMethodPagoComprobantes);
        }
        public java.util.List<WebElement> ListofElements() {
        	return driver.findElements(List);
        }
        public WebElement ComplementoRelacionadoPago() {
        	return driver.findElement(ComplementoRelacionadoPago);
        }
        public WebElement PrecioUniMerc() {
        	return driver.findElement(PrecioUnitarioMerc);
        }
        public WebElement GenerarCodigo() {
        	return driver.findElement(GenerarCodigo);
        }
        public WebElement HotP() {
        	return driver.findElement(HotP);
        }
        public WebElement ConfirmationCode() {
        	return driver.findElement(ConfirmationCode);
        }
        public WebElement Moneda() {
        	return driver.findElement(Moneda);
        }
        public WebElement ClaveUnidadMerca() {
        	return driver.findElement(ClaveDeUnidadMerc);
        }
        public WebElement CantidadBienesAduana() {
        	return driver.findElement(CantidadBienesAduana);
        }
        public WebElement RazonSocialExt() {
        	return driver.findElement(RazonSocial);
        }
        public WebElement TipoDeCambioExt() {
        	return driver.findElement(TipoDeCambioExt);
        }
        public WebElement CurrencyComercioExt() {
        	return driver.findElement(CurrencyComericoExt);
        }
        public WebElement PrecoUnitarioExterior() {
        	return driver.findElement(PrecioUnitaroExt);
        }
        public WebElement ClaveFraccionAncel() {
        	return driver.findElement(ClaveFraccionAncel);
        }
        public WebElement NumeroComercioExt() {
        	return driver.findElement(NumeroComercioExt);
        }
        public WebElement SelectPaisComercioExterior() {
        	return driver.findElement(SelectPaisComercioExt);
        }
        public SearchPage(WebDriver driver2) {
			
        	this.driver= driver2;
		}
        public WebElement AgregarLeyenda() {
        	return driver.findElement(AgregarLeyenda);
        }
        public WebElement TextLeyenda() {
        	return driver.findElement(TextoLeyenda);
        }
        public WebElement AddLeyenda() {
        	return driver.findElement(AddLeyenda);
        }
        public WebElement TipoDeTransito() {
        	return driver.findElement(TipoDeTransito);
        }
        public WebElement DateTransit() {
        	return driver.findElement(FechaDeTransito);
        }
        public WebElement ViaDeTransito() {
        	return driver.findElement(ViaDeTransito);
        }
        public WebElement TransportIdentication() {
        	return driver.findElement(IdentifTransport);
        }
        public WebElement TransportIdentificationNumber() {
        	return driver.findElement(NumeroIdentTransp);
        }
        public WebElement PassenegerNacionality() {
        	return driver.findElement(NacionalidadTransp);
        }
        public WebElement TransportCompany() {
        	return driver.findElement(TranspCompany);
        }
        public WebElement ClaveDeInscrEspec() {
        	return driver.findElement(ClaveDeInscriptEspec);
        }
        public WebElement FolioNumberEspec() {
        	return driver.findElement(NumeroFolioEspec);
        }
        public WebElement NamePieceEspecie() {
        	return driver.findElement(NombreDePiezaEspec);
        }
        public WebElement TechProdEspecie() {
        	return driver.findElement(TecnicaDeProdEspec);
        }
        public WebElement AnoDeProdPiezaEspec() {
        	return driver.findElement(AnoDeProdPiezEspec);
        }
        public WebElement DimensPiezaEspec() {
        	return driver.findElement(DimensionsPiezEspec);
        }
        public WebElement TipoDeBienObrasArtes() {
        	return driver.findElement(TipoDeBienObras);
        }
        public WebElement TituloObrasArtes() {
        	return driver.findElement(TituloAdObras);
        }
        public WebElement CaractObrasArtes() {
        	return driver.findElement(CaracteristicaObras);
        }
        public WebElement DateObrasArtes() {
        	return driver.findElement(DateObrasYArtes);
        }
        public WebElement AddDescriptMercancia() {
        	return driver.findElement(AgregarDescrMercancia);
        }
        public WebElement CurrencyMercancia() {
        	return driver.findElement(MercanciaDolares);
        }
        public WebElement AdquiDeMercCFDI() {
        	return driver.findElement(CFDIAdquisicDeMerc);
        }
        public WebElement AddMercancia() {
        	return driver.findElement(AddMercancia);
        }
        public WebElement AgregarMercancia() {
        	return driver.findElement(AgregarMercancia);
        }
        public WebElement MercanciaIDNumb() {
        	return driver.findElement(MercanciaIDNumber);
        }
        public WebElement MercanciaDescript() {
        	return driver.findElement(DescriptMercancia);
        }
        public WebElement ClaveDePedimentoComerc() {
        	return driver.findElement(ClavePedimentoExport);
        }
        public WebElement ClaveIncoTermExport() {
        	return driver.findElement(ClaveIncoTermExpo);
        }
        public WebElement ExportOperation() {
        	return driver.findElement(ExportOperation);
        }
        public WebElement SubdivisionFacturaExp() {
        	return driver.findElement(SubdFactExp);
        }
        public WebElement EquiValentExport() {
        	return driver.findElement(EquiValeXport);
        }
        public WebElement WithSubdFactExpo() {
        	return driver.findElement(WithSubFactExp);
        }
        public WebElement NonSubdFactExport() {
        	return driver.findElement(NonSubdFactExp);
        }
        public WebElement CertExpot() {
        	return driver.findElement(CertExp);
        }
        public WebElement NonCertiExpo() {
        	return driver.findElement(NonCertExp);
        }
        public WebElement ImportDefPedimentoComer() {
        	return driver.findElement(ImpDefinitPedimento);
        }
        public WebElement CertifOrigExport() {
        	return driver.findElement(CertiOrigenExport);
        }
        public WebElement OperaComerExt() {
        	return driver.findElement(OperaComercioExt);
        }
        public WebElement NumIDComercioExt() {
        	return driver.findElement(NumeroDeIDComercio);
        }
        public WebElement CFDIComercioExt() {
        	return driver.findElement(CFDIComercioExt);
        }
        public WebElement AuthoConstruccion() {
        	return driver.findElement(AuthorizcionConstruccion);
        }
        public WebElement CalleConstruccion() {
        	return driver.findElement(CalleContruccion);
        }
        public WebElement MunicipioCostruccion() {
        	return driver.findElement(MunicipioConstruccion);
        }
        public WebElement EstadoConstruccion() {
        	return driver.findElement(EstadoConstruccion);
        }
        public WebElement CodigoPostalConstr() {
        	return driver.findElement(CodigoPostalConstruccion);
        }
        public WebElement AddContruccion() {
        	return driver.findElement(AddContrucion);
        }
        public WebElement AgregCompleConstruccion() {
        	return driver.findElement(AgregarComplConstruccion);
        }
        public WebElement DocRelacPago() {
        	return driver.findElement(DocRelaPago);
        }
        public WebElement MethodPagoPago() {
        	return driver.findElement(MethodPagoPago);
        }
        public WebElement PPDPago() {
        	return driver.findElement(PPDPago);
        }
        public WebElement CambioPago() {
        	return driver.findElement(CambioPago);
        }
        public WebElement ImportePago() {
        	return driver.findElement(ImportePago);
        }
        public WebElement ImporteSaldoInsolutPago() {
        	return driver.findElement(ImporteSaldoInsoPago);
        }
        public WebElement ImpSaldoAntePago() {
        	return driver.findElement(ImpSaldAntPago);
        }
        public WebElement ParcialidadesPago() {
        	return driver.findElement(ParcialidPagos);
        }
        public WebElement TaggleSwitchPago() {
        	return driver.findElement(PagoSwitch);
        }
        public WebElement NumeroInstNotarial() {
        	return driver.findElement(NumeroInstrNotarial);
        }
        public WebElement DateNotarial() {
        	return driver.findElement(FechaInstNotarial);
        }
        public WebElement MontoInstNotarial() {
        	return driver.findElement(MontoInstNotarial);
        }
        public WebElement IvaInstNotarial() {
        	return driver.findElement(IvaInstNotarial);
        }
        public WebElement SubTotalInstNotarial() {
        	return driver.findElement(SubTotalInstNotarial);
        }
        public WebElement CurpInstNotarial() {
        	return driver.findElement(CurpInstNotarial);
        }
        public WebElement NumeroDelNotario() {
        	return driver.findElement(NumeroNotaria);
        }
        public WebElement EntidadNotarial() {
        	return driver.findElement(EntidadNotarial);
        }
        public WebElement IMUEBLENotarial() {
        	return driver.findElement(TipoDeImuebleNotarial);
        }
        public WebElement CalleNotarial() {
        	return driver.findElement(CalleNotarial);
        }
        public WebElement MunicipioNotarial() {
        	return driver.findElement(MunicipioNotarial);
        }
        public WebElement EstadoNotarial() {
        	return driver.findElement(EstadoNotarial);
        }
        public WebElement PaisNotarial() {
        	return driver.findElement(PaisNotarial);
        }
        public WebElement CodigoPostalNotarial() {
        	return driver.findElement(CodigoPostalNotarial);
        }
        public WebElement NombreNotarial() {
        	return driver.findElement(NombreNotarial);
        }
        public WebElement ApellidoPaternoNotarial() {
        	return driver.findElement(ApellidoPaternNotarial);
        }
        public WebElement RFCNotarial() {
        	return driver.findElement(RFCNotarial);
        }
        public WebElement CurpEnajNotarial() {
        	return driver.findElement(CurpEnajeNotarial);
        }
        public WebElement NombreAdquiNotarial() {
        	return driver.findElement(NombreAdqNotarial);
        }
        public WebElement RFCAdquiNotarial() {
        	return driver.findElement(RFCAdquiriente);
        }
        public WebElement CartaPorteBasica() {
        	return driver.findElement(CartaPorteBasica);
        }
        public WebElement ClavePersonasFisicas() {
        	return driver.findElement(ClaveVehiPersFisicas);
        }
        public WebElement PlacaPersonasFisicas() {
        	return driver.findElement(PlacaPersonasFisicas);
        }
        public WebElement ModeloVehicUsado() {
        	return driver.findElement(ModeloVehicUsado);
        }
        public WebElement ValorVehicUsado() {
        	return driver.findElement(ValorVehicUsado);
        }
        public WebElement TipoVehicUsado() {
        	return driver.findElement(TipoVehicUsado);
        }
        public WebElement MarcaVehicUsado () {
        	return driver.findElement(MarcaVehiculoUsado);
        }
        public WebElement ClaveVehiUsado() {
        	return driver.findElement(ClaveVehiUsado);
        }
        public WebElement MontoEnajVehicUsado() {
        	return driver.findElement(MontoEnajecVehiUsado);
        }
        public WebElement MontoAquiVehiUsado() {
        	return driver.findElement(MontoAdqVehUsado);
        }
        public WebElement AddUsedVehicle() {
        	return driver.findElement(AddUsedVehicle);
        }
        public WebElement AgregarComplVehiUsado() {
        	return driver.findElement(AgreComplVehiUsado);
        }
        public WebElement AgregarVentaVehicular() {
        	return driver.findElement(AgregarVentaVehic);
        }
        public WebElement NIVVehicular() {
        	return driver.findElement(NIVVehicular);
        }
        public WebElement ClaveVehicular() {
        	return driver.findElement(ClaveVehicular);
        }
        public WebElement FuncOriginalDeta() {
        	return driver.findElement(OriginalDetallista);
        }
        public WebElement FuncCopyDetallista() {
        	return driver.findElement(CopyDetallista);
        }
        public WebElement FuncDeleteDetallista() {
        	return driver.findElement(DeleteDetallista);
        }
        public WebElement FuncReemplazaDetallista() {
        	return driver.findElement(ReemplazaDetallista);
        }
        public WebElement PrecampanaINE() {
        	return driver.findElement(ProcesoPreCampana);
        }
        public WebElement EjecutivoEstatalINE() {
        	return driver.findElement(EjecutivoEstatal);
        }
        public WebElement DirectivoEstatalINE() {
        	return driver.findElement(DirectivoEstatal);
        }
        public WebElement EjecutivoNacionalINE() {
        	return driver.findElement(EjecutivoNacionalComit);
        }
        public WebElement CampanaINE() {
        	return driver.findElement(ProcesoCampana);
        }
        public WebElement OrdinarioINE() {
        	return driver.findElement(ProcesoOrdinario);
        }
        public WebElement PagoParcialidades() {
        	return driver.findElement(PAGOparcialidades);
        }
        public WebElement TipoDeProcesoINE() {
        	return driver.findElement(TipoDeProcesoINE);
        }
        public WebElement TipoDeComiteINE() {
        	return driver.findElement(TipoDeComiteINE);
        }
        public WebElement DonationDate() {
        	return driver.findElement(FechaAuthoDonativo);
        }
        public WebElement NumeroDeDonativo() {
        	return driver.findElement(Numerodonativo);
        }
        public WebElement NumeroDetallista() {
        	return driver.findElement(NumeroDetallista);
        }
        public WebElement CodigoRefAdDetallista() {
        	return driver.findElement(CodigoDeRefAdDetallista);
        }
        public WebElement GNLDetallista() {
        	return driver.findElement(GNLDetallista);
        }
        public WebElement CloneButtonDetallista() {
        	return driver.findElement(CloneButtonDetallista);
        }
        public WebElement NumeroDePedidoDetallista() {
        	return driver.findElement(NumeroPedidoDetallista);
        }
        public WebElement TipoTransactionDetallista() {
        	return driver.findElement(TipoDeTransDetallista);
        }
        public WebElement FuncionMSNDetallista() {
        	return driver.findElement(FuncionDeMensagenDeta);
        }
		public WebElement BasicaSelectFiscal()
		{
			return driver.findElement(SelectRegimeFiscal);
		}
		public WebElement FormaPagoP() {
			return driver.findElement(SelectFormaPagoP);
		}
		public WebElement TipoDeCambioPago(){
			return driver.findElement(TipoDeCambioPago);
		}
		public WebElement FechaDePago() {
			return driver.findElement(FechaDePago);
		}
		public WebElement MontoDePago() {
			return driver.findElement(MontoDePago);
		}
		public WebElement AddPagoComplement() {
			return driver.findElement(AddPagoCompl);
		}
		public WebElement AgregarCompPago() {
			return driver.findElement(AgregarComplPago);
		}
		public WebElement CuotaTransladoFact() {
			return driver.findElement(CuotaTransladoFact);
		}	
		public WebElement TransladoButton() {
			return driver.findElement(TransladoButton);
		}
        public WebElement BaseTranslado() {
        	return driver.findElement(TransladosBase);
        } 
		public WebElement SelectImpTranslado() {
			return driver.findElement(SelectImpuestoTransla);
		}
		public WebElement SelectTipoFactorTransla() {
			return driver.findElement(SelectFactorTranslado);
		}
		public WebElement TasaoCuotaTranslado() {
			return driver.findElement(TasaOCuotaTranslado);
		}
		public WebElement AgregarTranslado() {
			return driver.findElement(AgregarTranslado);
		}	
		public WebElement IvaTranslado() {
			return driver.findElement(IVATranslado);
		}
        public WebElement TasaTranslado() {
        	return driver.findElement(IEPSTranslado);
        }
		public WebElement PersonasMorales()
		{
			return driver.findElement(PersonasMorales);
		}
		public WebElement RFC()
		{
			return driver.findElement(RFC);
		}	 
		public WebElement SelectCFDI()
		{
			return driver.findElement(SelectCFDI);
		}	 
		public WebElement formaPago()
		{
			return driver.findElement(formaPago);
		}	
		public WebElement SelectformaPago1()
		{
			return driver.findElement(SelectformaPago1);
		}	
		public WebElement SelectFormaPago2()
		{
			return driver.findElement(SelectFormaPago2);
		}
		public WebElement SelectMethodPago()
		{
			return driver.findElement(SelectMethodPago);
		}
		public WebElement MethodPago1Exhibicion()
		{
			return driver.findElement(MethodPago1Exhibicion);
		}	
       public WebElement AgregarConsept()
{
	    return driver.findElement(agregarConsept);
}	
       public WebElement ClaveDelProducto()
		{
			return driver.findElement(claveDelProducto);
		}	
       public WebElement CantidadConsept()
		{
			return driver.findElement(cantidadConsept);
		}	
       public WebElement DescripticionConsept()
		{
			return driver.findElement(descriptConsept);
		}
       public WebElement ValorUnitarioConsept()
		{
			return driver.findElement(valorUnitConsept);
		}	
       public WebElement ImportConsept()
		{
			return driver.findElement(importConsept);
		}	
       public WebElement AddConsept()
		{
			return driver.findElement(addConsept);
		}	
       public WebElement EmitirFactura()
		{
			return driver.findElement(Emitir);
		}	
       public WebElement CfdiGastosGenerales()
		{
			return driver.findElement(CFDIGastosGenerales);
		}	
       public WebElement ClaveDeUnidad()
		{
			return driver.findElement(claveDeUnidad);
		}	
      
       
}