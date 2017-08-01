import java.util.*;
import java.lang.*;

public class Hashmap{
  HashMap<String, String> trackMap = new HashMap<>();

  public void tracks(){
    // trackMap.put(track, lyric);
    trackMap.put("Song", "lyrics lyrics lyrics");
    trackMap.put("omg", "lyrics lyrics ");
    trackMap.put("another", "lyrics lyrics lyrics");
    trackMap.put("big choon", "lyrics lyrics lyrics lyrics");
    String choon1 = trackMap.get("omg");
    System.out.println(choon1);
    // String choon2 = trackMap.get(lyric);
    Set keys = trackMap.keySet();
    
    
    System.out.println(trackMap.keySet());

    for (Map.Entry entry : trackMap.entrySet()) {
    System.out.println(entry.getKey() + ", " + entry.getValue());
    }
  }   

}