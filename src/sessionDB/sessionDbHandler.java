package sessionDB;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class sessionDbHandler implements sessionDbInterface {

    private DBMS dbms;

    public sessionDbHandler (DBMS dbms)throws SQLException{
        this.dbms = dbms;
        /*best check if the the database exists */
    }

	

    public void assignRoom(String roomID, String time, String sessionID) {
                    String id = roomID + "-" + time;
                    Map<String,String> rooms = roomStub();
                    if(rooms.containsKey(id)){
                            String roomValue = rooms.get(id);
                            if(roomValue.equals("N")){
                                    rooms.put(id, sessionID);
                                    System.out.println("Room Booked");
                            }
                            else{
                                    System.out.println("The Room is already booked.");
                            }
                    }
                    else{
                            System.out.println("The room doesn't exist");
                    }
     
            }

	@Override
	public void addSession(String time, String room, String name) {
		ArrayList<String> sessions = timetableContents();
		sessions.add(time + "," + room  + "," + name);

	}

	@Override
	public ArrayList<String> lectureView() {
		ArrayList<String> timetable = timetableContents();
		for(int i = 0; i < timetable.size(); i++){
		    System.out.println(timetable.get(i));
		}
		return timetable;
	}
	
	public String importCourse(String courseToBeImported){
		String course = null;
		ArrayList<String> courses = myCampusStub();
		for(String increment: courses){
			if(increment==courseToBeImported){
				course = increment;
				
			}
			
			return increment;
		}
		System.out.print(course);
		return course;
		
	
}
	public void signUp(){
		ArrayList<String> times = new ArrayList();
		
	}
	
	public void checkCompulsory(){
		
	}
	
	//Stub to be used for methods which require myCampus
	public 	ArrayList myCampusStub(){
		ArrayList<String> courses = new ArrayList();
		courses.add("Computing Science");
		courses.add("Sociology");
		courses.add("Exploring The Cosmos");
		return courses;
		
	}
	
	public ArrayList timetableContents(){
		ArrayList<String> sessionHold = new ArrayList();
		sessionHold.add("S03,2PM,BO406,Steven");
		sessionHold.add("S01,3PM,BO334,Bill");
		sessionHold.add("S02,3:30PM,BO222,Chris");
		
		return sessionHold;
		
	}

public Map<String, String> roomStub(){
                Map<String,String> rooms = new HashMap<String,String>();
                 rooms.put("BO507-2","N");
                 rooms.put("BO507-9","PSD3");
                 rooms.put("SAS321","N");
                 return rooms;
       
        }



}
