package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utils.MassadeDados;

public class LoginTeste2 extends MassadeDados{

	Metodos metodos = new Metodos();

	Elementos elementos = new Elementos();

	MassadeDados massadedados = new MassadeDados();
	
	
	@Given("dado que eu esteja logado e na tela de usar pontos")
	public void dado_que_eu_esteja_logado_e_na_tela_de_usar_pontos() throws InterruptedException {
	    Executa.abrirNavegador();
		Thread.sleep(7000);
	}

	@Given("clicar em usar pontos")
	public void clicar_em_usar_pontos() throws InterruptedException {
	    metodos.clicar(elementos.usarpontos);
		Thread.sleep(2000);
	}

	@Given("clicar em pontos viram dinheiro")
	public void clicar_em_pontos_viram_dinheiro() throws InterruptedException {
	    metodos.clicar(elementos.pontosviramdinheiro);
		Thread.sleep(40000);
	}

	@Given("clicar em transferencia unica")
	public void clicar_em_transferencia_unica() throws InterruptedException {
	    metodos.clicar(elementos.transferenciaunica);
		Thread.sleep(2000);
	}

	@Given("clicar quantos pontos deseja resgatar?")
	public void clicar_quantos_pontos_deseja_resgatar() {
	    metodos.clicar(elementos.pontosresgatar);
	}

	@Given("clicar em instituicao financeira")
	public void clicar_em_instituicao_financeira() throws InterruptedException {
	    metodos.clicar(elementos.instituicao);
		Thread.sleep(2000);
	}

	@Given("clicar em tipo de conta")
	public void clicar_em_tipo_de_conta() throws InterruptedException {
	   metodos.clicar(elementos.tipoconta);
		Thread.sleep(2000);
	}

	@Given("preencher conta")
	public void preencher_conta() throws InterruptedException {
	  metodos.escrever(elementos.conta,massadedados.conta);
		Thread.sleep(2000);
	}

	@Given("preencher agencia")
	public void preencher_agencia() throws InterruptedException {
	    metodos.escrever(elementos.agencia, massadedados.agencia);
		Thread.sleep(2000);
	}

	@Given("preencher digito")
	public void preencher_digito() throws InterruptedException {
	   metodos.escrever(elementos.digito, massadedados.digito);
		Thread.sleep(2000);
	}

	@Given("clicar em salvar informacoes")
	public void clicar_em_salvar_informacoes() throws InterruptedException {
	    metodos.clicar(elementos.salvarinformacoes);
		Thread.sleep(2000);
	}

	@Given("clicar em continuar")
	public void clicar_em_continuar() throws InterruptedException {
	    metodos.clicar(elementos.continuar);
		Thread.sleep(2000);
	}

	@When("clicar em enviar código")
	public void clicar_em_enviar_código() throws InterruptedException {
	    metodos.clicar(elementos.enviarcodigo);
		Thread.sleep(2000);
	}

	@Then("código recebido com sucesso")
	public void código_recebido_com_sucesso() throws InterruptedException {
		Thread.sleep(2000);
		
	    
	}

	
	
	
	
	
	@Given("clicar em transferencia recorrente")
	public void clicar_em_transferencia_recorrente() throws InterruptedException {
	    metodos.clicar(elementos.transferenciarecorrente);
		Thread.sleep(2000);
	}

	@When("clicar em ativar")
	public void clicar_em_ativar() throws InterruptedException {
	    metodos.clicar(elementos.ativar);
		Thread.sleep(2000);
	}

	@Then("clicar em Ok entendi")
	public void clicar_em_ok_entendi() throws InterruptedException {
	    metodos.clicar(elementos.okentendi);
		Thread.sleep(2000);
	}


}
