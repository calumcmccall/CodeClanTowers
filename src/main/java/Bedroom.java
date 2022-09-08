import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(ArrayList<Guest> guests, int roomNumber, RoomType roomType) {
        super(roomType.getCapacity(), guests);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

}
