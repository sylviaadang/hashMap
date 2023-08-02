import java.util.hashMap;

public class TrackList {

    public static void main (String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Dancing in the Moonlight", "Toploader");
        trackList.put("Amazing", "Rex Orange County");
        trackList.put("New Light", "John Mayer");
        trackList.put("Come With Me", "Surfaces");

        Set<String> keys = trackList.keySet();
        for(String key : keys);
            System.out.println(key);
            System.out.println(trackList.get(keys));
    }

    // System.out.println(map.get("Amazing"))
    // for (String: key : map.keyset()) {
        // System.out.println(String.format("Track: %s = Lyrics: %s", key, map.get(key)));
    // }
}
