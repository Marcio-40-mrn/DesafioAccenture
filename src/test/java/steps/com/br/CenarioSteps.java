package steps.com.br;

import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.com.br.CenarioPage;

public class CenarioSteps extends CenarioPage{
	
	
	@Quando("^preencho Tela Vehicle Data \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e dou click em Next$")
	public void preencho_Tela_Vehicle_Data_e_dou_click_em_Next(String marca, String modelo, String cilindrada, String motor, String fabricacao, String assentos, String combustivel, String carga, String pesoTotal, String valor, String placa, String km) throws Throwable {
		preenchoTelaVehicleData(marca, modelo, cilindrada, motor, fabricacao, assentos, combustivel, carga, pesoTotal, valor, placa, km);
	}

	@E("^preencho a tela Insurant Data \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e dou click em Next$")
	public void preencho_a_tela_Insurant_Data_e_dou_click_em_Next(String nome, String sobrenome, String aniversario, String sexo, String endereco, String pais, String cep, String estado, String cargo, String hobbies, String site) throws Throwable {
		preenchoATelaInsurantData(nome, sobrenome, aniversario, sexo, endereco, pais, cep, estado, cargo, hobbies, site);
	    throw new PendingException();
	}

	@E("^preencho a tela Product Data  \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e dou click em Next$")
	public void preencho_a_tela_Product_Data_e_dou_click_em_Next(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@E("^seleciono o opcao do valor \"([^\"]*)\"$")
	public void seleciono_o_opcao_do_valor(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@E("^preencho \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e dou click em Send$")
	public void preencho_e_dou_click_em_Send(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^eu valido que o email foi enviado com sucesso!$")
	public void eu_valido_que_o_email_foi_enviado_com_sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
