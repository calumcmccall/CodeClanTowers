import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    private double legnth;
    private double width;
    ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests, double legnth, double width) {
        this.capacity = capacity;
        this.guests = guests;
    }



    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
}
