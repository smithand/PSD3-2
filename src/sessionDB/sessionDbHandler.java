package sessionDB;
import java.sql.SQLException;
import java.util.ArrayList;

public class sessionDbHandler implements sessionDbInterface {

    private DBMS dbms;

    public sessionDbHandler (DBMS dbms)throws SQLException{
        this.dbms = dbms;
        /*best check if the the database exists */
    }

	@Override
	public void assignRoom(String roomID, String sessionID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSession() {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Object> lectureView(String sessionID) {
		// TODO Auto-generated method stub
		System.out.println("LECTURE VIEW");
		return null;
	}
	
	public void importCourse(){
	
}
	public void signUp(){
		
	}
	
	public void checkCompulsory(){
		
	}




}