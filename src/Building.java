public class Building {

    public int numberOfRooms;

    @Override
    public String toString() {
        String.valueOf(numberOfRooms());
        return ("Building");
    }


    public int numberOfRooms() {
        return numberOfRooms;
    }

    public void setRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms();
    }
}