import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

        List<Office> offices = new ArrayList();
        offices.add(office);
        offices.add(office);
        printBuildings(offices);

        List<House> houses = new ArrayList();
        houses.add(new House());
        printBuildings(houses);
        addHouse(houses);
    }

        static void build(Building building){
            System.out.println("Constructing a new " + building);
        }
        static void printBuildings( List<? extends Building> buildings){
            for (int i = 0; i < buildings.size(); i++){
                System.out.println(i + 1 + ": " + buildings.get(i).toString());
            }
        }
        static void addHouse(List <? super House> buildings){
            buildings.add(new House());
            System.out.println(buildings);
        }
}