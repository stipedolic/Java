package academy.leanprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {
	    HeavenlyBody temp = new Planet("Mercury", 88);
	    solarSystem.put(temp.getKey(), temp);
	    planets.add(temp);


        temp = new DwarfPlanet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        System.out.println("Planets:");
        for(HeavenlyBody i: planets){
            System.out.println(i.toString());
        }
        System.out.println();

        HeavenlyBody body = solarSystem.get(temp.getKey());
        System.out.println("Moons of " + body.getKey());
        System.out.println("trajlabe");
        for(HeavenlyBody j : body.getSatellites()){
            System.out.println(j.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        moons.addAll(body.getSatellites());
        System.out.println();

        for(HeavenlyBody k: moons){
            System.out.println(k.getKey());
        }

        HeavenlyBody pluto = new Planet("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody i: planets){
            System.out.println(i.toString());
        }


        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

    }
}
