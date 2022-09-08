import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests) {
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
