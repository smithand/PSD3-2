package sessionDB;

import java.util.ArrayList;

public interface sessionDbInterface {
    public ArrayList<Object> lectureView(String sessionID);
    public void assignRoom(String roomID, String sessionID);
    public void addSession();
}