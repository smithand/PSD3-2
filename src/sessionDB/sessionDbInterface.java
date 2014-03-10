package sessionDB;

import java.util.ArrayList;

public interface sessionDbInterface {
    public ArrayList<String> lectureView();
    public void assignRoom(String roomID, String sessionID);
    public void addSession();
}