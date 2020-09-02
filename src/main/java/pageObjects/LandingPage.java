package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
      private  By Email = By.id("session_username");
      private By Password = By.id("session_password");
      private  By Ingresar = By.cssSelector("[type='submit']");
      private  By Advanced = By.id("details-button");
      private  By Proceed = By.id("proceed-link");
      private By DropFistP = By.cssSelector("div[class*=mc-wrap]");
      private  By CrearCompr = By.xpath("//*[@id=\"billing-menu\"]/ul[1]/li[2]/a");
      private By Factura = By.xpath("//*[@id=\"new_receipt_list\"]/li[1]/div/a");
      private By NotadeCredito = By.xpath("//*[@id=\"new_receipt_list\"]/li[2]/div/a");
      private  By CartaPorte = By.xpath("//*[@id=\"new_receipt_list\"]/li[3]/div/a");
      private By Pagos = By.xpath("//*[@id=\"new_receipt_list\"]/li[4]/div/a");
        
      private By Configuration = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/a");
        
      private By SignOut = By.cssSelector("[stroke*='#000']");
        
      private By LogBotClose = By.xpath("//*[@id=\"header\"]/ul/li[4]/ul/li[3]/form/a");
        
      private By DatosFiscales = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[1]/a");
        
      private By Sucursales = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[2]/a");
        
      private By Certificados = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[3]/a");
        
      private By Producto = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[6]/ul/li[2]/a");
        
      private By SeriesFolio = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[4]/a");
        
      private By Usuarios = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[6]/a");
        
      private By Perfiles = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[7]/a");
        
      private By AddCertificado = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
        
      private By AddArchivoCer = By.id("certificate_cer_file");
        
      private By AddArchivoKey = By.id("certificate_key_file");
        
      private By AddPassword = By.id("certificate_passphrase");
        
      private By UploadCertif = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[9]/div/button");
        
      private By SucursalCertificado = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[1]/div/div/div/button/span[1]");
        
      private By SucursalPrincipalCert = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[1]/div/div/div/div/ul/li[2]/a");
        
      private By AddSucursal = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
        
      private By SucursalBranch = By.id("branch_name");
        
      private By SucursalAlias = By.id("branch_alias");
        
      private By SucursalZip = By.id("branch_zip_code");
        
      private By SaveSucursal = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[5]/div/button");
        
      private By ActivarSucursal = By.id("branch_is_active");
        
      private By AddFolios = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
        
      private By SerieFolio = By.id("serial_serial_number");
        
      private  By ValorInicialFolio = By.id("serial_begin");
        
      private By ValorFinalFolio = By.cssSelector(".form-control");
        
      private  By AgregarFolio = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[4]/div/button");
        
      private By AddProducto = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
        
      private By NameProduct = By.id("product_name");
        
      private By ClaveDelProducto = By.id("product_key_product_service");
        
      private By ClaveDeUnidadPro = By.id("product_key_unit");
        
      private  By ValorUnitarioProduct = By.id("product_unit_value");
        
      private By DescripcionDelPro = By.id("product_description");
        
      private  By GuardarProduct = By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[4]/div/button");
        
      private  By Client = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[6]/ul/li[1]/a");
        
      private  By AddClient = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
         
      private By RFCClient = By.id("customer_rfc");
        
      private  By GuardarClient = By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[8]/div/button");
        
      private  By Emitidos = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[1]/a");
        
      private By EmitidoRFC = By.id("document_rfc_receiver");
        
      private By EmitidoSerie = By.id("document_receipt_serie");
        
      private By EmitidoFolio = By.id("document_receipt_folio");
        
      private  By EmitidoDataInicial = By.id("document_init_date");
        
      private By EmitidoDataFinal = By.id("document_end_date");
        
      private By CheckBoxEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[1]/div/label/input");
        
      private By ExportarEmitido = By.cssSelector(".btn.btn-default.btn-export");
        
      private By EnviarEmitido = By.xpath("//*[@id=\"data-table-receipts-header\"]/div/div/div[3]/button[3]");
        
      private By DescargarEmitido = By.xpath("//*[@id=\"data-table-receipts-header\"]/div/div/div[3]/button[4]");
        
      private By BuscarEmitido = By.xpath("//*[@id=\"content\"]/div/div[1]/div[2]/form/div[1]/div[8]/div/button");
        
      private  By DescargarEmitidoXML = By.xpath("//*[@id=\"swal2-content\"]/div[1]/div[1]");
        
      private  By DescargarEmitidoPDF = By.xpath("//*[@id=\"swal2-content\"]/div[1]/div[2]/div");
        
      private By DescargarEmitidoBoth = By.xpath("//*[@id=\"swal2-content\"]/div[1]/div[3]/div");
        
      private By DescargaFinal = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
      private  By EstatusEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[6]/span");
        
      private  By DuplicarEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[4]/span");
        
      private  By VistaRapidaEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[1]/span");
        
      private By PDFVistaEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[2]/span");
        
      private  By XMLVistaEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[3]/span");
        
      private By ExportarPaginaActivaEm = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
      private By IdentificarStatusEmit = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
      private By AceptarStatusEmit = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
      private By ClientName = By.id("customer_business_name");
        
      private  By PhoneClient = By.id("customer_telefono");
        
      private By EmailClient = By.id("customer_email");
        
      private By ClientCountry = By.id("customer_pais");
        
      private By ClientState = By.id("customer_estado");
        
      private By ClientMunicipio = By.id("customer_municipio");
        
      private By ClientColonia = By.id("customer_colonia");
        
      private By ClientCalle = By.id("customer_calle");
        
      private  By ClientActivo = By.id("customer_active");
        
      private By ActivateProduct = By.id("product_is_active");
        
      private  By BottonFunk = By.xpath("//div[contains(text(),'KARLA FUENTE ')]");
      
      private By BottonApellido = By.xpath("//*[text()='Nombre ApellidoP ApellidoM']");
      
      private By MenuButton = By.xpath("//div[@class='pull-left']");
        
      private By BottonMartin = By.xpath("//div[contains(text(),'Martin Arbaiza Quiroz')]"); 
      
      private By BottonEsfera = By.xpath("//div[contains(text(),'ESFERA Empresa de cv ')]");
        
      private By BottonJes = By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]");
        
      private By RFCSUL = By.xpath("//div[contains(text(),'Nombre ApellidoP ApellidoM')]");
        
      private By SelectRegFiscalGratis = By.cssSelector("[data-id='receipt_emitter_tax_regime']");
        
      private By RegimeMoral = By.linkText("603 - Personas Morales con Fines no Lucrativos");
        
      private By SelectCFDIGratis = By.cssSelector("[data-id='receipt_receiver_cfdi_usage']");
        
      private By CFDIGastosGeneralesGratis = By.linkText("G03 - Gastos en general");
        
      private By FacturaBasicaGratis = By.xpath("//a[@href='/receipts/i/new']");
        
      private By SucursalGratis = By.cssSelector("[data-id='branch_branch_office_id']");
        
      private By FormaDePagoGratis = By.cssSelector("[data-id='receipt_payment_form']");
        
      private By PagoEfectivoGratis = By.linkText("01 - Efectivo");
        
      private By CodigoPostalGratis = By.id("receipt_expedition_place");
        
      private By LogBottonGratis = By.cssSelector("[fill='#ffffff']");
        
      private By CloseBottonGratis = By.linkText("Cerrar Sesión");
        
      private By AddConseptGratis = By.id("add-concept");
        
      private By FormaPagoPGratis = By.cssSelector("[data-id='complement_forma_de_pago_p']");
        
      private By BottonCompRelaGratis = By.xpath("/html/body/section/section/div/form/div[5]/div[1]/div[1]/div/div[1]/div/label");
        
      private By SelectTipoRelaGratis = By.cssSelector("[data-id='receipt_related_cfdis_type']");
        
      private By SustituicionPrevios = By.linkText("04 - Sustitución de los CFDI previos");
        
      private By BaseRetenido = By.id("retention_base");
        
      private By ImporteRetenido = By.id("retention_amount");
        
      private By BaseTranslado = By.id("transfer_base");
        
      private By ImporteTranslado = By.id("transfer_amount");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public WebElement BottonApellido() {
        	return driver.findElement(BottonApellido);
        }
        public WebElement MenuButton() {
        	return driver.findElement(MenuButton);
        }
        public WebElement BottonEsfera() {
        	return driver.findElement(BottonEsfera);
        }
        public WebElement BottonMartin() {
        	return driver.findElement(BottonMartin);
        }
        public WebElement ImporteTransladoGratis() {
        	return driver.findElement(ImporteTranslado);
        }
        public WebElement BaseTransladoGratis() {
        	return driver.findElement(BaseTranslado);
        }
        public WebElement ImporteRetenidoGratis() {
        	return driver.findElement(ImporteRetenido);
        }
        public WebElement BaseRetenidoGratis() {
        	return driver.findElement(BaseRetenido);
        }
        public WebElement SustituicionPrevios() {
        	return driver.findElement(SustituicionPrevios);
        }
        public WebElement SelectTipoRelaGratis() {
        	return driver.findElement(SelectTipoRelaGratis);
        }
        public WebElement ButtonCompRelaGratis() {
        	return driver.findElement(BottonCompRelaGratis);
        }
        public WebElement FormaPagoPGR() {
        	return driver.findElement(FormaPagoPGratis);
        }
        public WebElement AddConseptGratis() {
        	return driver.findElement(AddConseptGratis);
        }
        public WebElement ButtonCloseGratis() {
        	return driver.findElement(CloseBottonGratis);
        }
        public WebElement ButtonLogGratis() {
        	return driver.findElement(LogBottonGratis);
        }
        public WebElement CodigoPostalGratis() {
        	return driver.findElement(CodigoPostalGratis);
        }
        public WebElement PagoEfectivoGratis() {
        	return driver.findElement(PagoEfectivoGratis);
        }
        public WebElement FormaDePagoGratis() {
        	return driver.findElement(FormaDePagoGratis);
        }
        public WebElement SucursalGratis() {
        	return driver.findElement(SucursalGratis);
        }
        public WebElement FacturaBasicaGratis() {
        	return driver.findElement(FacturaBasicaGratis);
        }
        public WebElement SelectCFDIGratis() {
        	return driver.findElement(SelectCFDIGratis);
        }
        public WebElement CFDIGastosGeneralesGratis() {
        	return driver.findElement(CFDIGastosGeneralesGratis);
        }
        public WebElement RegimeMoral() {
        	return driver.findElement(RegimeMoral);
        }
        public WebElement SelectRegGratis() {
        	return driver.findElement(SelectRegFiscalGratis);
        }
        public WebElement ButtonSUL() {
        	return driver.findElement(RFCSUL);
        }
        public WebElement ButtonJes() {
        	return driver.findElement(BottonJes);
        }
        public WebElement ButtonFunk() {
        	return driver.findElement(BottonFunk);
        }
        public LandingPage(WebDriver driver2) {
			
        	this.driver= driver2;
		}

		public WebElement ingPortal()
		{
			return driver.findElement(Email);
			 
          }
		public WebElement ExportarPaginaActEm() {
			return driver.findElement(ExportarPaginaActivaEm);
		}
		public WebElement EmitidoRFC() {
			return driver.findElement(EmitidoRFC);
		}
		public WebElement IdentificarStatusEmit() {
			return driver.findElement(IdentificarStatusEmit);
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
       public WebElement UploadCerificate() {
    	   return driver.findElement(UploadCertif);
           }
       public WebElement AddCertificado() {
    	   return driver.findElement(AddCertificado);
           }
       public WebElement SucursalCertif() {
    	   return driver.findElement(SucursalPrincipalCert);
       }
        public WebElement PrincipalSucursalCert() {
        	return driver.findElement(SucursalCertificado);
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
