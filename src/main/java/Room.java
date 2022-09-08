import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    private double length;
    private double width;
    ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests, double length, double width) {
        this.capacity = capacity;
        this.guests = guests;
        this.length = length;
        this.width = width;
    }


    public static double calcSize( Double width, Double length){
        return length * width;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
}
