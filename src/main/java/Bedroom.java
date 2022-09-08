import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private double roomRate;

    public Bedroom(ArrayList<Guest> guests, int roomNumber, RoomType roomType, double roomRate, double length, double width) {
        super(roomType.getCapacity(), guests, length, width);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomRate = roomRate;
    }

    public double getRoomRate() {
        return roomRate;
    }
}
