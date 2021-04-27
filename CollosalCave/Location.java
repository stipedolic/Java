package academy.leanprogramming;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String description;
    private final Map<String, Integer> exits;

    public Location( String description) {
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        exits.put("Q", 0);
    }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }


    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
