import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AprenderCucumber {

	@Given("^que criei o arquvio corretamente$")
	public void que_criei_o_arquvio_corretamente() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		//throw new RuntimeException();
		System.out.println("passou aqui!");
		}

	@When("^executá-lo$")
	public void executá_lo() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^a especificação deve finalizar com sucesso$")
	public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
