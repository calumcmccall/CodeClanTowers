import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private ArrayList<Guest> guests;
    private int capacity;
    private String name;


    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String name) {
        super(capacity, guests);
        this.name = name;
    }


}
