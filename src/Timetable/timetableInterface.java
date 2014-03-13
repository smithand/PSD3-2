package Timetable;

import java.util.ArrayList;

public interface timetableInterface {

	ArrayList<String> lectureView();
	void assignRoom(String roomID, String time, String sessionID);
	

}