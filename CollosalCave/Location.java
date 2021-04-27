package academy.leanprogramming;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Location {
    private final int locationID;
    private final String description;
    private final Map<String, String> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
    }

    public void addExit(String direction, String location){
        exits.put(direction, location);
    }

    public Map<String, String> getExits() {
        return exits;
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }
}
