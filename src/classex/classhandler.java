package classex;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import sessionDB.DBMS;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class classhandler implements classInterface {

    private DBMS dbms;

    public classhandler (DBMS dbms)throws SQLException{
        this.dbms = dbms;
        /*best check if the the database exists */
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
	
	public String checkCompulsory(ArrayList chosenSessions,ArrayList checkSessions){
	ArrayList compulsorySessions=new ArrayList();
	for(int i=0;i<=checkSessions.size();i++){
		String isCompulsory=((Map<String, String>) checkSessions.get(i)).get(1);
		if(!checkSessions.isEmpty()){
			compulsorySessions.add(isCompulsory);
		}
	}
	for(int j=0;j<=compulsorySessions.size();j++){
		for(int i=0;i<=chosenSessions.size();i++){
			if(((Map<String, String>) chosenSessions.get(i)).get(0)==(((Map<String, String>) compulsorySessions.get(j)).get(0))){
				j++;	
				i=0;
			}
			else{
				i++;
			}
		}
		
	}
	return"Not all compulsory sessions chosen";
}
	
	//Mock Components
	public 	ArrayList myCampusStub(){
		ArrayList<String> courses = new ArrayList();
		courses.add("Computing Science");
		courses.add("Sociology");
		courses.add("Exploring The Cosmos");
		return courses;
		
	}

}
