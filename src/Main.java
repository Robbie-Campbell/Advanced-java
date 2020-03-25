import java.util.ArrayList;
import java.util.List; // Different list types
import javax.swing.*; // GUI stuff

// The constructor method ( for initialisation )
public class Main {

    // The main class which calls the function
    public static void main(String[] args) {

        // Create a building and office object then pass them into the build function
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        // Create a building array and add a building and house object to it
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

        // Create an office array and add 2 office objects to it
        List<Office> offices = new ArrayList();
        offices.add(office);
        offices.add(office);
        printBuildings(offices);

        // Create a house array and add 2 house objects to it
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);
        addHouse(houses);
    }

    // Create a function which when a variable is passed in, appends it to the end of a string
        private static void build(Building building){
            System.out.println("Constructing a new " + building);
        }

        // Create a function which displays the current building objects in a string format, the extends wildcard allows
        // for this function to be used with House and Office classes as well as the Building class
        private static void printBuildings( List<? extends Building> buildings){
            for (int i = 0; i < buildings.size(); i++){
                System.out.println(i + 1 + ": " + buildings.get(i).toString());
            }
        }

        // Creates a function which allows for extra houses to be appended to an array, and they prints the full array.
        // The super wildcard allows for the parent class (Building) to be passed into the function
        private static void addHouse(List <? super House> buildings){
            buildings.add(new House());
            System.out.println(buildings);
        }
}