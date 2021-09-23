package StepDef;

import io.cucumber.java.en.Given;

public class stepDef {

	@Given("a successful step")
	public void a_successful_step() throws Throwable {
        System.out.println("a successful step");
	}
	@Given("a not successful step")
	public void a_not_successful_step() throws Throwable {
        System.out.println("a not successful step");
	  
	}
}
