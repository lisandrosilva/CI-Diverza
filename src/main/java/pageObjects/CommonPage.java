package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPage {
	
	public WebDriver driver;
	
	    //CONSEPTO
        By BottonImpuestosRete= By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
        By BottonImTranslados = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div");
        
        By BottonImpPedimento = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div");
        
        By BottonDatosDePartesOComp = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By BottonInfAdicional = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By ImpuestoRetenido  = By.cssSelector("[data-id='retention_tax']");
        
        By ISRRetenido = By.linkText("001 - ISR");
        
        By IVARetenido = By.linkText("002 - IVA");
        
        By IEPSRetenido = By.linkText("003 - IEPS");
        
        By FactorRetenido = By.cssSelector("[data-id='retention_factor_type']");
        
        By TasaRetenido = By.linkText("Tasa");
        
        By CuotaRetenido = By.linkText("Cuota");
        
        By Arrow = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[4]/form/div/div[2]/div[1]/div[2]/div/div/div[2]/div");
        
        By TasaOcuTaRetenido = By.id("retention_rate_or_fee");
        
        By AddRetention = By.id("add-retention");
        //TRANSLADOS 
        By TaxTranslado = By.cssSelector("[data-id='transfer_tax']");
        
        By IVATranslado = By.linkText("002 - IVA");
        
        By IEPSTranslado = By.linkText("003 - IEPS");
        
        By TypeFactorTranslado = By.cssSelector("[data-id='transfer_factor_type']");
        
        By TasaTranslado = By.linkText("Tasa");
        
        By CuotaTranslado = By.linkText("Cuota");
        
        By TasaOcuTaTranslado = By.id("transfer_rate_or_fee");
        
        By ExtentoTranslado = By.linkText("Exento");
        
        By ArrowTranslado = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[8]/form/div/div[2]/div[1]/div[2]/div/div/div[2]/div");
        
        By AddTranslado = By.id("add-transfer");
        
        // PEDIMENTO
        By AnoValidPedimento = By.id("customs_validation_year");
        
        By AduanaPedimento = By.id("customs_customs_clearance");
        
        By PatentePedimento = By.id("customs_patent_number");
        
        By ProgressionPedimento = By.id("customs_consecutive");
        
        By AddPedimento = By.id("add-customs");
        //DATOS DE PARTES COMPONENTES
        By ClaveDelProdComp = By.id("part_prod_serv_id");
        
        By CantidadComponent = By.id("part_quantity");
        
        By DescriptComponente = By.id("part_description");
        
        By AddComponente = By.id("add-part");
        //PARTES INFORMACION ADUANERA
        By BottonPartesAduaneras= By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[16]/div[1]/div[1]/div");
        
        By AnoAduanera = By.id("part_customs_validation_year");
        
        By AduanaDespacho = By.id("part_customs_customs_clearance");
        
        By NumeroAduanaPatente = By.id("part_customs_patent_number");
        
        By AnoProgreAduana = By.id("part_customs_consecutive");
        
        // INFORMACION ADICIONAL
        By BotonInfAdicional = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div");
        
        By DescriptInfo = By.id("additional_concept_descripcion_extranjera");
        
        By ReferAdicInf = By.id("additional_concept_mensaje");
        
        By AddInfoAdicional = By.id("add-additional_concept");
        // DATOS PERSONALIZADOS
        By BottonDatosPers = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By ExtraDatoNombre = By.id("additional_concept_extras_atributo");
        
        By ExtraValorDato = By.id("additional_concept_extras_valor");
        
        By AddExtra = By.id("add-additional_concept_extras");
        // COMPROBANTES RELACIONADOS
        By BottonComprRelacionados = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        
        By SelectRelacionado = By.cssSelector("[data-id='receipt_related_cfdis_type']");
        
        By AgregarRelacionado = By.cssSelector("[href='#modal-add-related-cfdi']");
        
        By FolioFiscalRelacionado = By.id("related_cfdi_uuid");
        
        By AddRelacionado = By.id("add-related_cfdi");
        // ADENDA DIVERZA
        By BottonAdendaDiverza = By.xpath("//input[@id='show-adenda-diverza']");
        
        By DatosGeneAdenda = By.cssSelector("[href='#section-additional_general']");
        
        By ImporteLetraGene = By.id("receipt_additional_total_con_letra");
        
        By NumeroDeOrdenGen = By.id("receipt_additional_numero_orden");
        
        By ObservacionesGen = By.id("receipt_additional_observaciones");
        
        By DateGeneral = By.id("receipt_additional_fecha_tipo_cambio");
        //DATOS TRANSPORTE
        By DatosTranspAdenda = By.xpath("//a[@href='#section-additional_transport']");
        
        By NumerEntregaTrans = By.id("receipt_additional_numero_entrega");
        
        By DateEntrega = By.id("receipt_additional_fecha_entrega");
        
        By DriverName = By.id("receipt_additional_nombre_transportista");
        
        By LugarDestino = By.id("[receiver][destino][codigo_sitio]");
        
        By StreetTransp = By.id("[receiver][destino][calle]");
        
        By InteriorOrexteriorNum = By.id("[receiver][destino][numero]");
        
        By ColoniaTransp = By.id("[receiver][destino][colonia]");
        
        By CidadTranp = By.id("receipt_additional_ciudad");
        
        By Estado = By.id("[receiver][destino][estado]");
        
        By Pais = By.id("receipt_additional_pais");
        
        By CodigoPost = By.id("[receiver][destino][codigo_postal]");
        //DATOS DEL VENDEDOR
        
        By DatosVendedorAdenda = By.cssSelector("[href='#section-additional_emitter']");
        
        By ClaveDelVend = By.id("receipt_additional_vendedor");
        
        By NumeroDelProvedor = By.id("receipt_additional_numero_proveedor");
        
        By GNLVendedor = By.id("receipt_additional_gln");
        
        By TelefoVendedor = By.id("[emitter][contact][telefono]");
        //DATOS DEL CLIENTE
        By DatosClientAdenda = By.cssSelector("[href='#section-additional_receiver']");
        
        By NumDelClient = By.id("receipt_additional_num_cliente");
        
        By NumOrClaveDelComp = By.id("receipt_additional_comprador");
        
        By TelefoComprador = By.id("[receiver][contact][telefono]");
        
        By EmailContact = By.id("[receiver][contact][email_contacto]");
        
        By StreetClient = By.id("[receiver][location][calle]");
        
        By NumExtInt = By.id("[receiver][location][numero]");
        
        By Coloniaclient = By.id("[receiver][location][colonia]");
        
        By MunicipioClient = By.id("[receiver][location][municipio]");
        
        By EstadoClient = By.id("[receiver][location][estado]");
        
        By PaisClient = By.id("receipt_additional_pais");
        
        By CodigoPostalClient = By.id("[receiver][location][codigo_postal]");
        // DATOS PERSONALIZADOS
        By DatosPersAdenda = By.cssSelector("[href='#section-additional_extras']");
        
        By AgrgarPersnAdenda = By.cssSelector("[href='#modal-add-additional_extras']");
        
        By NombreDelDato = By.id("additional_extras_atributo");
        
        By ValorDelDato = By.id("additional_extras_valor");
        
        By AddDatosExtr = By.xpath("//*[@id=\"add-additional_extras\"]");
        // COMPROVANTES RELACIONADOS
        By BottonCompRela = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        
        By SelectTipoDeRel = By.cssSelector("[data-id='receipt_related_cfdis_type']");
        
        By AgregarRelated = By.cssSelector("[href='#modal-add-related-cfdi']");
        
        By FolioRelacionado = By.id("related_cfdi_uuid");
        
        By AddFolioRela = By.id("add-related_cfdi");
        // FACTURA DETALLISTA
        By BottonEntregMerDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[7]/div/label");
        
        By DeliveryDataDetal = By.id("[delivery_note][reference_date]");
        
        By DeliveryFolioDetal = By.id("[delivery_note][reference_identification][0]");
        
        By AddDelivFolioDetal = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[8]/div/div[2]/div/div/div/button");
        
        By BottonInstEspecDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[9]/div/label");
        
        By SelectTipoInstrDetail = By.cssSelector("[title='Selecciona el tipo instrucción comercial...']");
        
        By InstruccionDetail = By.id("[special_instruction][0][text][0]");
        
        By AddInstrEspDetail = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[10]/div/div/div[2]/div[2]/div/div/div/button");
        
        By BottonVendedorDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[11]/div/label");
        
        By VendedorGNLDetail = By.xpath("//input[@class='form-control']");
        
        By SelectTipoDeIDSecDetail = By.cssSelector("[title='Selecciona el tipo de identificación secundaria...']");
        
        By NumeroInternoSecDatail = By.linkText("Número interno del proveedor");
        
        By RefeSignaIEPSSecDetail = By.linkText("Referencia signada para el IEPS");
        
        By IDSecundarVendedor = By.id("[seller][alternate_party_identification]");
        
        By BottonInfEnvMercanciaDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[13]/div/label");
        
        By GNLEnvioMercaDetail = By.id("[shipto][gln]");
        
        By LugarDeEntrga = By.id("[shipto][name_and_address][1][name]");
        
        By DomicilioEntregaDetail = By.id("[shipto][name_and_address][1][street_address_one]");
        
        By DeliveryCityDetail = By.id("[shipto][name_and_address][1][city]");
        
        By DeliveryCodPostDetail = By.id("[shipto][name_and_address][1][postal_code]");
        
        By AddInfDetail = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[14]/div[2]/div/button[1]");
        
        By BottonInfDelEmisorDelCfdiDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[15]/div/label");
        
        By SelectTipoEmisorCfdiDetail = By.cssSelector("[title='Selecciona el tipo de identificación secundaria...']");
        
        By IdentTributaraCfdiDetail = By.linkText("VA - Identificación Tributaria");
        
        By NumIntProvCfdiDetail = By.linkText("IA - Número interno del proveedor");
        
        By GNLEmisorCfdi = By.id("[invoice_creator][gln]");
        
        By IDEmisor = By.id("[invoice_creator][alternate_party_identification]");
        
        By NombreEmisor = By.id("[invoice_creator][name_and_address][name]");
        
        By DomicilioEmisor = By.id("[invoice_creator][name_and_address][street_address_one]");
        
        By CidadEmisor = By.id("[invoice_creator][name_and_address][city]");
        
        By CodigoPostEmisor = By.id("[invoice_creator][name_and_address][postal_code]");
         
        By BottonInfAduanaDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[17]/div/label");
        
        By GNLAduana = By.id("[customs_info][0][gln]");
        
        By AddAduana = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[18]/div/div/div/div/div/button");
        
        By BottonInfDeMonedaDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[19]/div/label");
        
        By SelectTipoDemonedaDetail = By.cssSelector("[title='Tipo de moneda']");
        
        By PesoMexDetail = By.linkText("MXN - Peso Mexicano");
        
        By EURODetail = By.linkText("XEU - Euro");
        
        By DolarDetail = By.linkText("USD - Dólar");
        
        By TipoDeCambio = By.id("[currency][0][rate_of_change]");
        
        By FuncionMonedaDetail = By.cssSelector("[title='Función']");
        
        By BottonInfTerminosDePagoDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[21]/div/label");
        
        By SelectRefTiempoPago = By.cssSelector("[data-id='[payment_terms][payment_terms_event]']");
        
        By DateOfInvoice = By.linkText("DATE_OF_INVOICE");
        
        By EffectiveDate = By.linkText("EFFECTIVE_DATE");
        
        By SelectTerminoDeRelacionDePago = By.cssSelector("[data-id='[payment_terms][payment_terms_relation_time]']");
        
        By ReferenceAfterRelacDePago = By.linkText("REFERENCE_AFTER");
        
        By SelectCondDePago = By.cssSelector("[title='Selecciona las condiciones de pago...']");
        
        By SelectCalifPerc = By.cssSelector("[data-id='[payment_terms][discount_type]']");
        
        By AllowanceByPaymentOnTime = By.linkText("ALLOWANCE_BY_PAYMENT_ON_TIME");
        
        By Sanction = By.linkText("SANCTION");
        
        By Percentage = By.id("[payment_terms][percentage]");
        
        By BottonInfDescGlobCargDetalista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[23]/div/label");
        
        By SelectIndCargoDescuento = By.cssSelector("[data-id='[allowance_charge][0][allowance_charge_type]']");
        
        By AllowanceGlobal = By.linkText("ALLOWANCE_GLOBAL");
        
        By ChargeGlobal = By.linkText("CHARGE_GLOBAL");
        
        By SelectImpDescuento = By.cssSelector("[data-id='[allowance_charge][0][settlement_type]']");
        
        By Reclamacion = By.linkText("BILL_BACK - Reclamación");
        
        By Invoice = By.linkText("OFF_INVOICE - Fuera de factura");
        
        By SelectTipoDeDescuento = By.cssSelector("[title='Selecciona el tipo de descuento o cargo....']");
        
        By SecuenCalc = By.id("[allowance_charge][0][sequence_number]");
        
        By PercentageGlobal = By.id("[allowance_charge][0][percentage]");
        
        By BottonCoseptosDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[25]/div/label");
        
        By NumeroSecConsDetail = By.id("[line_item][0][secuencial_number]");
        
        By CodigoEANConsptDetail = By.id("[line_item][0][gtin]");
        
        By SelectTipoDeIdAdic = By.cssSelector("[data-id='[line_item][0][alternate_trade_item_identification][0][type]']");
        
        By BuyerAsigned = By.linkText("BUYER_ASSIGNED");
        
        By SuplierAsigned = By.linkText("SUPPLIER_ASSIGNED");
        
        By SerialNumb = By.linkText("SERIAL_NUMBER");
        
        By GlobalTrade = By.linkText("GLOBAL_TRADE_ITEM_IDENTIFICATION");
        
        By IDConseptDetail = By.id("[line_item][0][alternate_trade_item_identification][0][item_identification]");
        
        By DescriptConseptDetail = By.id("[line_item][0][long_text]");
        
        By SelectLanguage = By.cssSelector("[data-id='[line_item][0][language]']");
        
        By Espanol = By.linkText("ES - Español");
        
        By Ingles = By.linkText("EN - Ingles");
        
        By CantidadConseptDetail = By.id("[line_item][0][invoiced_quantity]");
        
        By MedidaConseptDetail = By.id("[line_item][0][unit_of_measure]");
        
        By CantidadAdicConsDetail = By.id("[line_item][0][aditional_quantity][0][quantity]");
        
        By SelectCodTipoDeCantidad = By.cssSelector("[data-id='[line_item][0][aditional_quantity][0][quantity_type]']");
        
        By NumeroUniDeCons = By.linkText("Número unidades de consumo en unidad comercializada");
        
        By CantidadGratisDeMerc = By.linkText("Cantidad gratis de mercancía");
        
        By PUBRUTO = By.id("[line_item][0][gross_price_amount]");
        
        By PUNETO = By.id("[line_item][0][net_price_amount]");
        
        By ImpBruto = By.id("[line_item][0][gross_amount]");
        
        By ImpNeto = By.id("[line_item][0][net_amount]");
        
        By SelectTipoDeRf = By.cssSelector("[data-id='[line_item][0][reference_type]']");
        
        By NumeroOrdComp = By.linkText("Número de órden de compra");
        
        By GNLConseptDetail = By.id("[line_item][0][customs][0][gln]");
        
        By PedimentoConsDetail = By.id("[line_item][0][customs][0][party_identification]");
        
        By DateConsDetail = By.id("[line_item][0][customs][0][reference_date]");
        
        By NameConseptDetail = By.id("[line_item][0][customs][0][name]");
        // INFORMACION LOGISTICA
        By Identificador = By.id("[line_item][0][serial_shipping_container_code]");
        
        By SelectCodNumId = By.cssSelector("[data-id='[line_item][0][serial_shipping_type]']");
        
        By BJCodigoSeriadoUnEnv = By.linkText("BJ - Código Seriado de Unidad de Envío");
        
        By SRV = By.linkText("SRV - Número global de unidades de comercialización (GTIN - Código EAN/UPC)");
        // INFORMACION DE EMPAQUE
        By NumeroDePaquetes = By.id("[line_item][0][pallet_quantity]");
        
        By DescriptEmpaq = By.id("[line_item][0][pallet_description]");
        
        By SelectTipoDeEmpaq = By.cssSelector("[data-id='[line_item][0][pallet_description_type]']");
        
        By SelectMethPgo = By.cssSelector("[data-id='[line_item][0][method_of_payment]']");
        
        By Prepaid = By.linkText("PREPAID_BY_SELLER - Pagado por el proveedor");
        
        By PaydBuyer = By.linkText("PAID_BY_BUYER - Pagado por el comprador");
        // INFORMACION DE LOTES
        By NumeroDeLote = By.id("[line_item][0][extended_attributes][0][lot_number]");
        
        By FechaProd = By.id("[line_item][0][extended_attributes][0][production_date]");
        //INFORMACION SOBRE CARGO O DESCUENTO AL PRODUCTO
        By SelectIndicDeCargoOPro = By.cssSelector("[data-id='[line_item][0][allowance_charge][0][allowance_charge_type]']");
        
        By Descuento = By.linkText("Descuento");
        
        By Cargo = By.linkText("Cargo");
        
        By Percentaje = By.id("[line_item][0][allowance_charge][0][percentage_per_unit]");
        
        By SelectImputDelDescOCargo = By.cssSelector("[data-id='[line_item][0][allowance_charge][0][settlement_type]']");
        
        By SelectTipoDeDescCargo = By.cssSelector("[data-id='[line_item][0][allowance_charge][0][special_services_type]']");
        
        By PercentageCargo = By.id("[line_item][0][allowance_charge][0][percentage_per_unit]");
        //INFORMACION DE IMPUESTOS
        By SelectTipoDeArancelImpuesto = By.cssSelector("[data-id='[line_item][0][trade_item_tax_info][0][tax_type_description]']");
        
        By NumeroRef = By.id("[line_item][0][trade_item_tax_info][0][reference_number]");
        
        By Percent = By.id("[line_item][0][trade_item_tax_info][0][tax_percentage]");
        
        By Monto = By.id("[line_item][0][trade_item_tax_info][0][tax_amount]");
        
        By SelectIdentImpRet = By.cssSelector("[data-id='[line_item][0][trade_item_tax_info][0][tax_category]']");
        
        By ImpTransf = By.linkText("TRANSFERIDO");
        
        By ImpRet = By.linkText("RETENIDO");
        //MONTO TOTAL DE LAS LINEAS DE ARTICULO
        By MontoTotalLineasArtDetallista = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[27]/div/label");
        By MontoLineasArtic = By.id("[total_amount]");
        //INFORMACION SOBRE MONTO TOTAL
        By BottonInfMontoTotalDeCargoODescDetallist = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div/div[29]/div/label");
        By SelectCargosDescConsol = By.cssSelector("[data-id='[total_allowance_charge][0][allowance_or_charge_type]']");
        
        By AllowanceMontoTotal = By.linkText("ALLOWANCE");
        
        By ChargeMontoTotal = By.linkText("CHARGE");
        
        By SelectTipoDescuentoMontoTotal = By.cssSelector("[data-id='[total_allowance_charge][0][special_services_type]']");
        
        By MontoTotalCargo = By.id("[total_allowance_charge][0][amount]");
        
        By BottonInfAdicionalDetallista = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
        By BottonCfdiRelacDetallista = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        
        By SelectRelacionDetail = By.cssSelector("[data-id='receipt_related_cfdis_type']");
        
        By AgregarCompRelDetallista = By.cssSelector("[href='#modal-add-related-cfdi']");
        
        By TypeComprRel = By.id("related_cfdi_uuid");
        
        By AddRelacioDetail = By.id("add-related_cfdi");
        //IMPUESTO LOCAL
        By ImpuestoLocal = By.cssSelector("[data-id='local_tax_description']");
        
        By BottonImpuestosLocales = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
        By BottonRetenidoLocal = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public WebElement CantidadAdicioConsDetail() {
        	return driver.findElement(CantidadAdicConsDetail);
        }
        public WebElement MedidaConseptDetail() {
        	return driver.findElement(MedidaConseptDetail);
        }
        public WebElement DescriptConsptDetail() {
        	return driver.findElement(DescriptConseptDetail);
        }
        public WebElement ReferenceAfterRelaPago() {
        	return driver.findElement(ReferenceAfterRelacDePago);
        }
        public CommonPage(WebDriver driver2) {
			
        	this.driver= driver2;
		}
        public WebElement BottonImpuestosRet() {
        	return driver.findElement(BottonImpuestosRete);
        	}
        public WebElement ImpuestoLocal() {
        	return driver.findElement(ImpuestoLocal);
        }
        public WebElement ArrowRetenido() {
        	return driver.findElement(Arrow);
        }
        public WebElement ArrowTranslado() {
        	return driver.findElement(ArrowTranslado);
        }
        public WebElement ButtonLocalRetention() {
        	return driver.findElement(BottonRetenidoLocal);
        }
        public WebElement ButtonLocalTaxes() {
        	return driver.findElement(BottonImpuestosLocales);
        }
        public WebElement ButtonAdicionalInfo() {
        	return driver.findElement(BotonInfAdicional);
        }
        public WebElement TasaOcutaRetenido() {
        	return driver.findElement(TasaOcuTaRetenido);
        }
        public WebElement TasaOcuTaTranslado() {
        	return driver.findElement(TasaOcuTaTranslado);
        }
        public WebElement ButtonImpTranslados() {
        	return driver.findElement(BottonImTranslados);
        }
        public WebElement ButtonPedimento() {
        	return driver.findElement(BottonImpPedimento);
        }
        public WebElement ButtonDatosDPartesOComp() {
        	return driver.findElement(BottonDatosDePartesOComp);
        }
        public WebElement ButtonPartesAduaneras() {
        	return driver.findElement(BottonPartesAduaneras);
        }
        public WebElement AnoAduanera() {
        	return driver.findElement(AnoAduanera);
        }
        public WebElement AduanaDespacho() {
        	return driver.findElement(AduanaDespacho);
        }
        public WebElement NumeroAduanaPatente() {
        	return driver.findElement(NumeroAduanaPatente);
        }
        public WebElement AnoProgressAduana() {
        	return driver.findElement(AnoProgreAduana);
        }
        public WebElement ButtonInfoAdicional() {
        	return driver.findElement(BottonInfAdicional);
        }
        public WebElement ImpuestRetenido() {
        	return driver.findElement(ImpuestoRetenido);
        }
        public WebElement ISRRetenido() {
        	return driver.findElement(ISRRetenido);
        }
        public WebElement IVARetenido() {
        	return driver.findElement(IVARetenido);
        }
        public WebElement IEPSRetenido() {
        	return driver.findElement(IEPSRetenido);
        }
        public WebElement FactorRetenido() {
        	return driver.findElement(FactorRetenido);
        }
        public WebElement TasaRetenido() {
        	return driver.findElement(TasaRetenido);
        }
        public WebElement CuotaRetenido() {
        	return driver.findElement(CuotaRetenido);
        }
        public WebElement AddRetention() {
        	return driver.findElement(AddRetention);
        }
        public WebElement TaxTranslado() {
        	return driver.findElement(TaxTranslado);
        }
        public WebElement IVATranslado() {
        	return driver.findElement(IVATranslado);
        }
        public WebElement IEPSTranslado() {
        	return driver.findElement(IEPSTranslado);
        }
        public WebElement TypeFactorTranslado() {
        	return driver.findElement(TypeFactorTranslado);
        }
        public WebElement TasaTranslado() {
        	return driver.findElement(TasaTranslado);
        }
        public WebElement CuotaTranslado() {
        	return driver.findElement(CuotaTranslado);
        }
        public WebElement ExtentoTranslado() {
        	return driver.findElement(ExtentoTranslado);
        }
        public WebElement AddTranslado() {
        	return driver.findElement(AddTranslado);
        }
        public WebElement AnoValidacionPedimento() {
        	return driver.findElement(AnoValidPedimento);
        }
        public WebElement AduanaPedimento() {
        	return driver.findElement(AduanaPedimento);
        }
        public WebElement PatentePedimento() {
        	return driver.findElement(PatentePedimento);
        }
        public WebElement ProgressionPedimento() {
        	return driver.findElement(ProgressionPedimento);
        }
        public WebElement Addpedimento() {
        	return driver.findElement(AddPedimento);
        }
        public WebElement ClaveDelProductCompr() {
        	return driver.findElement(ClaveDelProdComp);
        }
        public WebElement CantidadComponente() {
        	return driver.findElement(CantidadComponent);
        }
        public WebElement DescriptComponente() {
        	return driver.findElement(DescriptComponente);
        }
        public WebElement AddComponente() {
        	return driver.findElement(AddComponente);
        }
        public WebElement DescriptInformacion() {
        	return driver.findElement(DescriptInfo);
        }
        public WebElement RefAdicInfo() {
        	return driver.findElement(ReferAdicInf);
        }
        public WebElement AddInfoAdicional() {
        	return driver.findElement(AddInfoAdicional);
        }
        public WebElement ButtonDatosPersonalizados() {
        	return driver.findElement(BottonDatosPers);
        }
        public WebElement ExtraDatoNombre() {
        	return driver.findElement(ExtraDatoNombre);
        }
        public WebElement ExtraValorDato() {
        	return driver.findElement(ExtraValorDato);
        }
        public WebElement AddExtra() {
        	return driver.findElement(AddExtra);
        }
        public WebElement ButtonCoprobRelacionado() {
        	return driver.findElement(BottonComprRelacionados);
        }
        public WebElement SelectRelacionado() {
        	return driver.findElement(SelectRelacionado);
        }
        public WebElement AgregarRelacionado() {
        	return driver.findElement(AgregarRelacionado);
        }
        public WebElement FolioFiscalRelacionado() {
        	return driver.findElement(FolioFiscalRelacionado);
        }
        public WebElement AddRelacionado() {
        	return driver.findElement(AddRelacionado);
        }
        public WebElement ButtonAdendaDiverza() {
        	return driver.findElement(BottonAdendaDiverza);
        }
        public WebElement DatosGeneralesAdenda() {
        	return driver.findElement(DatosGeneAdenda);
        }
        public WebElement ImportLetraGeneral() {
        	return driver.findElement(ImporteLetraGene);
        }
        public WebElement ObservacionesGeneral() {
        	return driver.findElement(ObservacionesGen);
        }
        public WebElement NumeroDeOrdenGeneral() {
        	return driver.findElement(NumeroDeOrdenGen);
        }
        public WebElement DateGeneral() {
        	return driver.findElement(DateGeneral);
        }
        public WebElement DatosTranpAdenda() {
        	return driver.findElement(DatosTranspAdenda);
        }
        public WebElement NumeroEntregaTransporte() {
        	return driver.findElement(NumerEntregaTrans);
        }
        public WebElement DateEntregaTransporte() {
        	return driver.findElement(DateEntrega);
        }
        public WebElement DriverName() {
        	return driver.findElement(DriverName);
        }
        public WebElement LugarDestino() {
        	return driver.findElement(LugarDestino);
        }
        public WebElement StreetTransport() {
        	return driver.findElement(StreetTransp);
        }
        public WebElement InteriorOrExteriorNum() {
        	return driver.findElement(InteriorOrexteriorNum);
        }
        public WebElement ColoniaTransp() {
        	return driver.findElement(ColoniaTransp);
        }
        public WebElement CidadTransp() {
        	return driver.findElement(CidadTranp);
        }
        public WebElement Estado() {
        	return driver.findElement(Estado);
        }
        public WebElement Pais() {
        	return driver.findElement(Pais);
        }
        public WebElement CodigoPost() {
        	return driver.findElement(CodigoPost);
        }
        public WebElement DatosVendedorAdenda() {
        	return driver.findElement(DatosVendedorAdenda);
        }
        public WebElement ClaveDelVendedor() {
        	return driver.findElement(ClaveDelVend);
        }
        public WebElement NumeroDelProvedor() {
        	return driver.findElement(NumeroDelProvedor);
        }
        public WebElement GNLVendedor() {
        	return driver.findElement(GNLVendedor);
        }
        public WebElement TelephoVendor() {
        	return driver.findElement(TelefoVendedor);
        }
        public WebElement DatosClientAdenda() {
        	return driver.findElement(DatosClientAdenda);
        }
        public WebElement NumeroDelClient() {
        	return driver.findElement(NumDelClient);
        }
        public WebElement NumeroOrClaveDelComp() {
        	return driver.findElement(NumOrClaveDelComp);
        }
        public WebElement TelefComprador() {
        	return driver.findElement(TelefoComprador);
        }
        public WebElement EmailContacto() {
        	return driver.findElement(EmailContact);
        }
        public WebElement StreetClient() {
        	return driver.findElement(StreetClient);
        }
        public WebElement NumExtInt() {
        	return driver.findElement(NumExtInt);
        }
        public WebElement ColoniaClient() {
        	return driver.findElement(Coloniaclient);
        }
        public WebElement MunicipioClient() {
        	return driver.findElement(MunicipioClient);
        }
        public WebElement EstadoClient() {
        	return driver.findElement(EstadoClient);
        }
        public WebElement PaisClient() {
        	return driver.findElement(PaisClient);
        }
        public WebElement CodigoPostalClient() {
        	return driver.findElement(CodigoPostalClient);
        }
        public WebElement DatosPersAdenda() {
        	return driver.findElement(DatosPersAdenda);
        }
        public WebElement AgregarPersonalAdenda() {
        	return driver.findElement(AgrgarPersnAdenda);
        }
        public WebElement NombreDelDato() {
        	return driver.findElement(NombreDelDato);
        }
        public WebElement ValorDelDato() {
        	return driver.findElement(ValorDelDato);
        }
        public WebElement AddDatosExtras() {
        	return driver.findElement(AddDatosExtr);
        }
        public WebElement ButtonComprRelacionado() {
        	return driver.findElement(BottonCompRela);
        }
        public WebElement SelectTipoDRelacionado() {
        	return driver.findElement(SelectTipoDeRel);
        }
        public WebElement AgregarRelated() {
        	return driver.findElement(AgregarRelated);
        }
        public WebElement FolioRelacionado() {
        	return driver.findElement(FolioRelacionado);
        }
        public WebElement AddFolioRela() {
        	return driver.findElement(AddFolioRela);
        }
        public WebElement ButtonEntregaMercDetail() {
        	return driver.findElement(BottonEntregMerDetallista);
        }
        public WebElement DeliveryDataDetail() {
        	return driver.findElement(DeliveryDataDetal);
        }
        public WebElement DeliveryFolioDetail() {
        	return driver.findElement(DeliveryFolioDetal);
        }
        public WebElement AddDeliveryFolioDetail() {
        	return driver.findElement(AddDelivFolioDetal);
        }
        public WebElement ButtonInspDetail() {
        	return driver.findElement(BottonInstEspecDetallista);
        }
        public WebElement SelectTipoInstrDetail() {
        	return driver.findElement(SelectTipoInstrDetail);
        }
        public WebElement InstruccionDetail() {
        	return driver.findElement(InstruccionDetail);
        }
        public WebElement AddIntrucEspecDetail() {
        	return driver.findElement(AddInstrEspDetail);
        }
        public WebElement ButtonVendedorDetail() {
        	return driver.findElement(BottonVendedorDetallista);
        }
        public WebElement VendedorGNLDetail() {
        	return driver.findElement(VendedorGNLDetail);
        }
        public WebElement SelectTipoDIDSecDeatail() {
        	return driver.findElement(SelectTipoDeIDSecDetail);
        }
        public WebElement NumeroInternoSecDetail() {
        	return driver.findElement(NumeroInternoSecDatail);
        }
        public WebElement ReferenciaAsignIESPSecDetail() {
        	return driver.findElement(RefeSignaIEPSSecDetail);
        }
        public WebElement IDSecundarVendedor() {
        	return driver.findElement(IDSecundarVendedor);
        }
        public WebElement ButtonInformacionEnviarMercancia() {
        	return driver.findElement(BottonInfEnvMercanciaDetallista);
        }
        public WebElement GNLEnviarMercanciaDetallista() {
        	return driver.findElement(GNLEnvioMercaDetail);
        }
        public WebElement LugarDentrega() {
        	return driver.findElement(LugarDeEntrga);
        }
        public WebElement DomicilioEntregaDetail() {
        	return driver.findElement(DomicilioEntregaDetail);
        }
        public WebElement DeliveryCityDetail() {
        	return driver.findElement(DeliveryCityDetail);
        }
        public WebElement DeliveryPostCodeDetail() {
        	return driver.findElement(DeliveryCodPostDetail);
        }
        public WebElement AddInfoDetail() {
        	return driver.findElement(AddInfDetail);
        }
        public WebElement ButtonInfoEmisorDetail() {
        	return driver.findElement(BottonInfDelEmisorDelCfdiDetallista);
        }
        public WebElement SelectTipoEmisorCfdiDetail() {
        	return driver.findElement(SelectTipoEmisorCfdiDetail);
        }
        public WebElement IdentifTributariaCfdiDetail() {
        	return driver.findElement(IdentTributaraCfdiDetail);
        }
        public WebElement NumeroInstProveCfdiDetail() {
        	return driver.findElement(NumIntProvCfdiDetail);
        }
        public WebElement GNLEmisorCfdi() {
        	return driver.findElement(GNLEmisorCfdi);
        }
        public WebElement IDEmisor() {
        	return driver.findElement(IDEmisor);
        }
        public WebElement NombreEmisor() {
        	return driver.findElement(NombreEmisor);
        }
        public WebElement DomicilioEmisor() {
        	return driver.findElement(DomicilioEmisor);
        }
        public WebElement CidadEmisor() {
        	return driver.findElement(CidadEmisor);
        }
        public WebElement CodigoPostalEmisor() {
        	return driver.findElement(CodigoPostEmisor);
        }
        public WebElement ButtonInfoAduanaDetail() {
        	return driver.findElement(BottonInfAduanaDetallista);
        }
        public WebElement GNLAduana() {
        	return driver.findElement(GNLAduana);
        }
        public WebElement AddAduana() {
        	return driver.findElement(AddAduana);
        }
        public WebElement ButtonInfoDeMonedaDetail() {
        	return driver.findElement(BottonInfDeMonedaDetallista);
        }
        public WebElement SelectTipoDeMonedaDetallista() {
        	return driver.findElement(SelectTipoDemonedaDetail);
        }
        public WebElement PesoMexicanoDetail() {
        	return driver.findElement(PesoMexDetail);
        }
        public WebElement EURODetail() {
        	return driver.findElement(EURODetail);
        }
        public WebElement DolarDetail() {
        	return driver.findElement(DolarDetail);
        }
        public WebElement TipoDeCambio() {
        	return driver.findElement(TipoDeCambio);
        }
        public WebElement FunccionMonedaDetail() {
        	return driver.findElement(FuncionMonedaDetail);
        }
        public WebElement ButtonInfoTerminosDePago() {
        	return driver.findElement(BottonInfTerminosDePagoDetallista);
        }
        public WebElement SelectRefTiempoDePago() {
        	return driver.findElement(SelectRefTiempoPago);
        }
        public WebElement DateOfInvoice() {
        	return driver.findElement(DateOfInvoice);
        }
        public WebElement EffectiveDate() {
        	return driver.findElement(EffectiveDate);
        }
        public WebElement SelectTerminoRelacPago() {
        	return driver.findElement(SelectTerminoDeRelacionDePago);
        }
        public WebElement SelectCondicionPago() {
        	return driver.findElement(SelectCondDePago);
        }
        public WebElement SelectCalifPercentage() {
        	return driver.findElement(SelectCalifPerc);
        }
        public WebElement AllowanceByPaymentOnTime() {
        	return driver.findElement(AllowanceByPaymentOnTime);
        }
        public WebElement Sanction() {
        	return driver.findElement(Sanction);
        }
        public WebElement Percentage() {
        	return driver.findElement(Percentage);
        }
        public WebElement ButtonInfoDescuentoGlobalCargoDetail() {
        	return driver.findElement(BottonInfDescGlobCargDetalista);
        }
        public WebElement SelectIndCargoDescuento() {
        	return driver.findElement(SelectIndCargoDescuento);
        }
        public WebElement AllowanceGlobal() {
        	return driver.findElement(AllowanceGlobal);
        }
        public WebElement ChargeGlobal() {
        	return driver.findElement(ChargeGlobal);
        }
        public WebElement SelectImpDescuento() {
        	return driver.findElement(SelectImpDescuento);
        }
        public WebElement Reclamacion() {
        	return driver.findElement(Reclamacion);
        }
        public WebElement Invoice() {
        	return driver.findElement(Invoice);
        }
        public WebElement SelectTipoDeDescuento() {
        	return driver.findElement(SelectTipoDeDescuento);
        }
        public WebElement SecuenciaCalc() {
        	return driver.findElement(SecuenCalc);
        }
        public WebElement PercentageGlobal() {
        	return driver.findElement(PercentageGlobal);
        }
        public WebElement ButtonConseptDetallista() {
        	return driver.findElement(BottonCoseptosDetallista);
        }
        public WebElement NumeroSeqConsDetail() {
        	return driver.findElement(NumeroSecConsDetail);
        }
        public WebElement CodigoEANConseptDetail() {
        	return driver.findElement(CodigoEANConsptDetail);
        }
        public WebElement SelectTipoIdAdicional() {
        	return driver.findElement(SelectTipoDeIdAdic);
        }
        public WebElement BuyerAsigned() {
        	return driver.findElement(BuyerAsigned);
        }
        public WebElement SupplierAsigned() {
        	return driver.findElement(SuplierAsigned);
        }
        public WebElement SerialNumber() {
        	return driver.findElement(SerialNumb);
        }
        public WebElement GlobalTrade() {
        	return driver.findElement(GlobalTrade);
        }
        public WebElement IDConseptDetail() {
        	return driver.findElement(IDConseptDetail);
        }
        public WebElement SelectLanguage() {
        	return driver.findElement(SelectLanguage);
        }
        public WebElement Espanol() {
        	return driver.findElement(Espanol);
        }
        public WebElement Ingles() {
        	return driver.findElement(Ingles);
        }
        public WebElement CantidadConseptDetail() {
        	return driver.findElement(CantidadConseptDetail);
        }
        public WebElement SelectCodigTipoDeCantidad() {
        	return driver.findElement(SelectCodTipoDeCantidad);
        }
        public WebElement NumeroUnidadConsept() {
        	return driver.findElement(NumeroUniDeCons);
        }
        public WebElement CantidadGratisDeMercancia() {
        	return driver.findElement(CantidadGratisDeMerc);
        }
        public WebElement PUBruto() {
        	return driver.findElement(PUBRUTO);
        }
        public WebElement PUNeto() {
        	return driver.findElement(PUNETO);
        }
        public WebElement ImporteBruto() {
        	return driver.findElement(ImpBruto);
        }
        public WebElement ImporteNeto() {
        	return driver.findElement(ImpNeto);
        }
        public WebElement SelectTipoDeRef() {
        	return driver.findElement(SelectTipoDeRf);
        }
        public WebElement NumeroDeOrdenComprobante() {
        	return driver.findElement(NumeroOrdComp);
        }
        public WebElement GNLConseptDetail() {
        	return driver.findElement(GNLConseptDetail);
        }
        public WebElement PedimentoConseptDetail() {
        	return driver.findElement(PedimentoConsDetail);
        }
        public WebElement DateConseptDetail() {
        	return driver.findElement(DateConsDetail);
        }
        public WebElement NameConseptDetail() {
        	return driver.findElement(NameConseptDetail);
        }
        public WebElement Identificador() {
        	return driver.findElement(Identificador);
        }
        public WebElement SelectCodigNumID() {
        	return driver.findElement(SelectCodNumId);
        }
        public WebElement BJCodigoSeriado() {
        	return driver.findElement(BJCodigoSeriadoUnEnv);
        }
        public WebElement SVRConsept() {
        	return driver.findElement(SRV);
        }
        public WebElement NumeroDPaquetes() {
        	return driver.findElement(NumeroDePaquetes);
        }
        public WebElement DescripcionEmpaq() {
        	return driver.findElement(DescriptEmpaq);
        }
        public WebElement SelectTipoDeEmpaq() {
        	return driver.findElement(SelectTipoDeEmpaq);
        }
        public WebElement SelectMethPg() {
        	return driver.findElement(SelectMethPgo);
        }
        public WebElement Prepaid() {
        	return driver.findElement(Prepaid);
        }
        public WebElement PayBuyer() {
        	return driver.findElement(PaydBuyer);
        }
        public WebElement NumeroDeLote() {
        	return driver.findElement(NumeroDeLote);
        }
        public WebElement FechaDeProduccion() {
        	return driver.findElement(FechaProd);
        }
        public WebElement SelectIndicDeCargoOProduccion() {
        	return driver.findElement(SelectIndicDeCargoOPro);
        }
        public WebElement Descuento() {
        	return driver.findElement(Descuento);
        }
        public WebElement Cargo() {
        	return driver.findElement(Cargo);
        }
        public WebElement Percentaje() {
        	return driver.findElement(Percentaje);
        }
        public WebElement SelectImpuestoDelDescOCargo() {
        	return driver.findElement(SelectImputDelDescOCargo);
        }
        public WebElement SelectTipoDeDescCargo() {
        	return driver.findElement(SelectTipoDeDescCargo);
        }
        public WebElement PercentageCargo() {
        	return driver.findElement(PercentageCargo);
        }
        public WebElement SelectTipoDeArancelImpuesto() {
        	return driver.findElement(SelectTipoDeArancelImpuesto);
        }
        public WebElement NumeroRef() {
        	return driver.findElement(NumeroRef);
        }
        public WebElement Percent() {
        	return driver.findElement(Percent);
        }
        public WebElement Monto() {
        	return driver.findElement(Monto);
        }
        public WebElement SelectIdentImpuestRet() {
        	return driver.findElement(SelectIdentImpRet);
        }
        public WebElement ImpuestoTransferido() {
        	return driver.findElement(ImpTransf);
        }
        public WebElement ImpuestoRetenido() {
        	return driver.findElement(ImpRet);
        }
        public WebElement MontoTotalLineasArtesDetail() {
        	return driver.findElement(MontoTotalLineasArtDetallista);
        }
        public WebElement MontoLineasArt() {
        	return driver.findElement(MontoLineasArtic);
        }
        public WebElement ButtonInfMontoTotalDCargoODescDetail() {
        	return driver.findElement(BottonInfMontoTotalDeCargoODescDetallist);
        }
        public WebElement SelectCargosDesConsol() {
        	return driver.findElement(SelectCargosDescConsol);
        }
        public WebElement AllowanceMontoTotal() {
        	return driver.findElement(AllowanceMontoTotal);
        }
        public WebElement ChargeMontoTotal() {
        	return driver.findElement(ChargeMontoTotal);
        }
        public WebElement SelectTipoDescuentoMontoTotal() {
        	return driver.findElement(SelectTipoDescuentoMontoTotal);
        }
        public WebElement MontoTotalCargo() {
        	return driver.findElement(MontoTotalCargo);
        }
        public WebElement ButtonInfAdicionalDetail() {
        	return driver.findElement(BottonInfAdicionalDetallista);
        	
        }
        public WebElement ButtonCfdiRelacionDetail() {
        	return driver.findElement(BottonCfdiRelacDetallista);
        }
        public WebElement AgregarCompRelDetallista() {
        	return driver.findElement(AgregarCompRelDetallista);
        }
        public WebElement TypeComprRel() {
        	return driver.findElement(TypeComprRel);
        }
        public WebElement AddRelacionDetail() {
        	return driver.findElement(AddRelacioDetail);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}