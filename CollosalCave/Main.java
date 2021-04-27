package academy.leanprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Location> locations = new HashMap<>();
    public static Map<String, String> vocabulary = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location( "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location( "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location( "You are at the top of a hill"));
        locations.put(3, new Location( "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location( "You are in a valley beside a stream"));
        locations.put(5, new Location( "You are in the forest"));

        vocabulary.put("QUIT", "Q");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("NORTH", "N");


        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
      //  locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
     //   locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
     //   locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
     //   locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
     //   locations.get(5).addExit("Q", 0);


        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are:");
            for(String s : exits.keySet()){
                System.out.print(s + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            String[] words = direction.split(" ");

            for(String word: words){
                if(vocabulary.containsKey(word)){
                    direction = vocabulary.get(word);
                    break;
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction.");
            }
           }
    }
}
