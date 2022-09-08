import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;

    public DiningRoom(int capacity, ArrayList<Guest> guests, String name, double length, double width) {
        super(capacity, guests, length, width);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
