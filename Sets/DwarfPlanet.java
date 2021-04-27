package academy.leanprogramming;

public class DwarfPlanet extends  HeavenlyBody {
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.DWARF_PLANET) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
