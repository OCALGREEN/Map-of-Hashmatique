import java.util.HashMap; 
import java.util.Set; 

public class TestHashMap {
    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>(); 

        trackList.put("Fade to Black", "Life, it seems, will fade away"); 
        trackList.put("Turn the Page", "On a long and lonesome highway"); 
        trackList.put("Time", "Ticking away the moments that make up a dull day"); 
        trackList.put("Time Flies", "I was born in '67"); 

        String lyric = trackList.get("Turn the Page"); 
        System.out.println(lyric); 


        Set<String> keys = trackList.keySet(); // getting all the keys and puting them in a Set list where there are no duplicates allowed. 
        for(String key : keys) { // enhanced for loop
            System.out.println(key); // outputs all the keys
            System.out.println(trackList.get(key)); // will output all the values
        }
















    }
}