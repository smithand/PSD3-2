package sessionDB;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import sessionDB.DBMS;
import sessionDB.sessionDbInterface;


public class Activator implements BundleActivator {

	private DBMS dbms;
	private sessionDbInterface sdi;
	
	private ServiceRegistration<sessionDbInterface> 
		sessionDbInterface1;
	//...
	
	public void start(BundleContext context)
		throws Exception {
		
		dbms = new DBMS();
		
		sessionDbHandler handler = 
			new sessionDbHandler(dbms);
		
		sdi = handler;
		;
		
		sessionDbInterface1 = 
			context.registerService(
					sessionDbInterface.class, sdi, null);	
	}	

	public void stop(BundleContext context)
		throws Exception {
		sessionDbInterface1.unregister();
		
	}
}