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
	
	@Given("a relevant teaching session that is part of the course")
	public void aSession(){
		this.testSession = new Session();		
	}
	
	@When("the lecturer wants to let the student identify the slots they need to attend")
	public void sessionIsSelected(Session sessionName){
		
		testSession = user.Session.setSession(sessionName);
	}
	
	@When("the lecturer wants to track the teaching sessions")
	public void sessionTrack(Session tracking){
		
		testSession = user.Session.setSession(tracking);
	}
	

	@Then("the sessions for a course will be identified")
	public void sessionAddition(Session expected){
		
		user.userHandler.addSession(testSession);
		assertThat(testSession, equalTo(expected));
	}
	
	

}
