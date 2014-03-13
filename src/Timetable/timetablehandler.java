package Timetable;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import sessionDB.DBMS;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class timetablehandler implements timetableInterface {

    private DBMS dbms;

    public timetablehandler (DBMS dbms)throws SQLException{
        this.dbms = dbms;
        /*best check if the the database exists */
    }
    
    
    
    @Override
	public ArrayList<String> lectureView() {
		ArrayList<String> timetable = timetableContents();
		for(int i = 0; i < timetable.size(); i++){
		    System.out.println(timetable.get(i));
		}
		return timetable;
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
    
    //Mock Components
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
