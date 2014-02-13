package user;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import user.admin;
import user.lecturer;
import user.student;
import sessionDB.DBMS;

public class userActivator implements BundleActivator {

	private DBMS dbms;
	private admin admin;
	private student student;
	private lecturer lecturer;
	
	private ServiceRegistration<admin> 
		adminRegistration;
	
	private ServiceRegistration<student> 
		studentRegistration;
		
	private ServiceRegistration<lecturer> 
		lecturerRegistration;

	//...
	
	public void start(BundleContext context)
		throws Exception {
		
		dbms = new DBMS();
		
		userHandler handler = 
			new userHandler(dbms);
		
		admin = handler;
		student = handler;
		lecturer = handler;
		
		adminRegistration = 
			context.registerService(
				admin.class, admin, null);	
		
		studentRegistration = 
				context.registerService(
					student.class, student, null);	
		
		lecturerRegistration = 
				context.registerService(
						lecturer.class, lecturer, null);	
	}	

	public void stop(BundleContext context)
		throws Exception {
		adminRegistration.unregister();
		studentRegistration.unregister();
		lecturerRegistration.unregister();
		
	}
}