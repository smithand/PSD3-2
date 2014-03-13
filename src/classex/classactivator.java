package classex;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import sessionDB.DBMS;
import classex.classInterface;


public class classactivator implements BundleActivator {

	private DBMS dbms;
	private classInterface sdi;
	
	private ServiceRegistration<classInterface> 
		classInterface1;
	//...
	
	public void start(BundleContext context)
		throws Exception {
		
		dbms = new DBMS();
		
		classhandler handler = 
			new classhandler(dbms);
		
		sdi = handler;
		;
		
		classInterface1 = 
			context.registerService(
					classInterface.class, sdi, null);	
	}	

	public void stop(BundleContext context)
		throws Exception {
		classInterface1.unregister();
		
	}
}