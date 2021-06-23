package pages.com.br;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import generics.com.br.Generics;
import hooks.com.br.Hooks;

public class CenarioPage {

	protected WebDriver driver;
	protected Generics generic;
	protected Scenario scenario;

	public CenarioPage() {
		driver = Hooks.getDriver();
		scenario = Hooks.getScenario();
		PageFactory.initElements(driver, this);
		generic = new Generics(driver, scenario);

	}
	//Tela 	Vehicle Data
	
	@FindBy(xpath="//select[@id='make']")
	public WebElement SelectMarca;
	
	@FindBy(xpath="//select[@id='model']")
	public WebElement SelectModel;
	
	@FindBy(xpath="//select[@id='numberofseats']")
	public WebElement SelectAssentos;
	
	@FindBy(xpath="//select[@id='fuel']")
	public WebElement SelectCombustivel;
	
	@FindBy(xpath="//input[@id='payload']")
	public WebElement InputCarga;
	
	@FindBy(xpath="//input[@id='totalweight']")
	public WebElement InputPesoTotal;
	
	@FindBy(xpath="//input[@id='cylindercapacity']")
	public WebElement InputCylinder;
	
	@FindBy(xpath="//input[@id='listprice']")
	public WebElement InputPreco;
	
	@FindBy(xpath="//input[@id='licenseplatenumber']")
	public WebElement InputPlaca;
	
	@FindBy(xpath="//input[@id='annualmileage']")
	public WebElement InputKilometragem;
	
	@FindBy(xpath="//input[@id='engineperformance']")
	public WebElement InputMotor;
	
	@FindBy(xpath="//input[@id='dateofmanufacture']")
	public WebElement InputFabricacao;
	
	@FindBy(xpath="//button[@id='nextenterinsurantdata']")
	public WebElement ButtonNext1;
	
	//Tela Insurant Data
	
	@FindBy(xpath="//section[@class='idealsteps-step']//div[@class='field']//p[@class='group']")
	public WebElement SelectSexo;
	
	@FindBy(xpath="//p[@class='group']//input[@name='Hobbies']") // colocar /..//input[@value=SelectHobbies]")
	public WebElement SelectHobbies;
	
	@FindBy(xpath="//p[@class='group']//input[@value='Other']")
	public WebElement HobbieOther;
	
	@FindBy(xpath="//select[@id='country']")
	public WebElement SelectPais;
	
	@FindBy(xpath="//select[@id='occupation']")
	public WebElement SelectCargo;
	
	@FindBy(xpath="//input[@id='city']")
	public WebElement InputEstado;
	
	@FindBy(xpath="//input[@id='zipcode']")
	public WebElement InputCep;
	
	@FindBy(xpath="//input[@id='streetaddress']")
	public WebElement InputEndereco;
	
	@FindBy(xpath="//input[@id='birthdate']")
	public WebElement InputAniversario;
	
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement InputSobrenome;
	
	@FindBy(xpath="//input[@id='firstname']")
	public WebElement InputNome;
	
	@FindBy(xpath="//input[@id='website']")
	public WebElement InputSite;
	
	@FindBy(xpath="//button[@id='nextenterproductdata']")
	public WebElement ButtonNext2;
	
	//Tela Product Data
	
	@FindBy(xpath="//select[@id='insurancesum']")
	public WebElement SelectSomaSeguro;
	
	@FindBy(xpath="//select[@id='meritrating']")
	public WebElement SelectMerito;
	
	@FindBy(xpath="//select[@id='damageinsurance']")
	public WebElement SelectSeguroDanos;
	
	@FindBy(xpath="//p[@class='group']//input[@name='Optional Products[]']") // colocar /..//input[@value=SelectOpcaoProduto]")
	public WebElement SelectOpcaoProduto;
	
	@FindBy(xpath="//select[@id='courtesycar']")
	public WebElement SelectCarroReserva;
	
	@FindBy(xpath="//input[@id='startdate']")
	public WebElement InputDataInicio;
	
	@FindBy(xpath="//button[@id='nextselectpriceoption']")
	public WebElement ButtonNext3;
	
	//Tela Price Option
	
	@FindBy(xpath="//input[@value='Ultimate']") // colocar /..//input[@value=InputSelect]")
	public WebElement InputSelect;
	
	@FindBy(xpath="//button[@id='nextsendquote']")
	public WebElement ButtonNext4;
	
	//Tela Send Quote
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement InputEmail;
	
	@FindBy(xpath="//input[@id='phone']")
	public WebElement InputCelular;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement InputUsuario;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement InputSenha;
	
	@FindBy(xpath="//input[@id='confirmpassword']")
	public WebElement InputConfirmaSenha;
	
	@FindBy(xpath="//textarea[@id='Comments']")
	public WebElement TextComentarios;
	
	@FindBy(xpath="//button[@id='sendemail']")
	public WebElement ButtonSend;
	
	@FindBy(xpath="//div[@class='sweet-alert showSweetAlert visible']")
	public WebElement BoxMensagem;
	
	// Comandos Steps
	
				
	public void preenchoTelaVehicleData(String marca, String modelo, String cilindrada, String motor,  String fabricacao, String assentos, String combustivel, String carga, String pesoTotal, String valor, String placa, String km) throws InterruptedException {
		generic.verificaPreencheComboBox(SelectMarca, marca);
		Thread.sleep(1000);
		generic.verificaPreencheComboBox(SelectModel, modelo);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputCylinder, cilindrada);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputMotor, motor);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputFabricacao, fabricacao);
		Thread.sleep(1000);
		generic.verificaPreencheComboBox(SelectAssentos, assentos);
		Thread.sleep(1000);
		generic.verificaPreencheComboBox(SelectCombustivel, combustivel);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputCarga, carga);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputPesoTotal, pesoTotal);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputPreco, valor);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputPlaca, placa);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputKilometragem, km);
		Thread.sleep(1000);
		generic.click(ButtonNext1);
		
	}
	
	public void preenchoATelaInsurantData(String nome, String sobrenome, String aniversario, String sexo, String endereco, String pais, String cep, String estado, String cargo, String hobbies, String site) throws InterruptedException {
		generic.verificaPreencheInput(InputNome, nome);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputSobrenome, sobrenome);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputAniversario, aniversario);
		Thread.sleep(1000);
//		generic.verificaSexo(SelectSexo, sexo);
//		Thread.sleep(1000);
		generic.verificaPreencheInput(InputEndereco, endereco);
		Thread.sleep(1000);
		generic.verificaPreencheInput(SelectPais, pais);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputCep, cep);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputEstado, estado);
		Thread.sleep(1000);
		generic.click(HobbieOther);
		generic.verificaPreencheComboBox(SelectCargo, cargo);
//		generic.verificaSelecionaHobbie(SelectHobbies, hobbies);
		Thread.sleep(1000);
		generic.verificaPreencheInput(InputSite, site);
		Thread.sleep(1000);
		generic.click(ButtonNext2);
		
		
	}
	
}