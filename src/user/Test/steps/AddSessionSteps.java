package user.Test.steps;

import user.userHandler;
import user.Session;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AddSessionSteps {
	private Session testSession;
	
	@Given("a relevant teaching session")
	public void aSession(){
		this.testSession = new Session();		
	}
	
	@When("lecturer wants to let the student identify the slots they need to attend")
	public void sessionIsSelected(String sessionName){
		
		testSession = user.Session.setSession(testSession);
	}
	
	

	@Then("sessions for a course will be added to the relevant parties timetables when seen")
	public void sessionAddition(Session expected){
		
		user.userHandler.addSession(testSession);
		assertThat(testSession, equalTo(expected));
	}
	
	

}
