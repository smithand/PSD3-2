package Timetable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import sessionDB.DBMS;
import Timetable.timetableInterface;


public class timetableactivator implements BundleActivator {

	private DBMS dbms;
	private timetableInterface sdi;
	
	private ServiceRegistration<timetableInterface> 
		timetableInterface1;
	//...
	
	public void start(BundleContext context)
		throws Exception {
		
		dbms = new DBMS();
		
		timetablehandler handler = 
			new timetablehandler(dbms);
		
		sdi = (timetableInterface) handler;
		;
		
		timetableInterface1 = 
			context.registerService(
					timetableInterface.class, sdi, null);	
	}	

	public void stop(BundleContext context)
		throws Exception {
		timetableInterface1.unregister();
		
	}
}