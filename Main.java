package academy.leanprogramming;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Location location = new Location(0, "Bezvezni opis");
        location.addExit("S", "south");
        location.addExit("W", "west");
        location.addExit("N", "north");



        Map<String, String> exits = location.getExits();
        Map<String, String> blabla = new HashMap<>();


        for(String exit: exits.keySet()){
            System.out.print(exit + " ");
        }
        System.out.println();

        exits.put("E", "east");
        blabla = location.getExits();

        for(String bla: blabla.keySet()){
            System.out.print(bla + " ");
        }
        System.out.println();
        for(String exit: exits.keySet()){
            System.out.print(exit + " ");
        }
        System.out.println();
        for(String exit: location.getExits().keySet()){
            System.out.print(exit + " ");
        }

    }
}
