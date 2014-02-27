package user;

import sessionDB.DBMS;
import sessionDB.sessionDbHandler;

public class userHandler implements student, admin, lecturer {
	sessionDbHandler model;

	public userHandler(DBMS dbms) {
		// TODO Auto-generated constructor stub
	}

	public void userHandler(sessionDbHandler model, String sid, String course){
		this.model = model;
	}

	@Override
	public void viewTimetable() {
		System.out.println("Time Table view");
		model.lectureView("test");
		
	}

	
	public void lectureView() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void importCourse() {
		// TODO Auto-generated method stub
		
	}

	public static void addSession(Session session) {
		
	}

	@Override
	public void assignRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkCompulsory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSession() {
		// TODO Auto-generated method stub
		
	}
}