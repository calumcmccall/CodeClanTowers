import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    Booking booking;
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public String diningRoomName(String diningNumber){
        DiningRoom diningRoom = diningRooms.get(diningNumber);
        return diningRoom.getName();
    }

    public ArrayList<Bedroom> avaRooms(){
       ArrayList<Bedroom> vacant = new ArrayList<Bedroom>();
        for (Bedroom room : bedrooms) {
            if(room.guests.size() == 0){
                vacant.add(room);
            }
        }
        return vacant;
    }

    public Booking addGuestRoom(Guest guest, int nights) {
        for (Bedroom room : bedrooms) {
            if (room.guests.size() == 0) {
                room.guests.add(guest);
                return bookRoom(room, nights);
            }
        }
        return null;
    }

    public Booking addGuestRoom(Guest guest, Guest guest2, int nights) {
        for (Bedroom room : bedrooms) {
            if (room.guests.size() == 0 && room.capacity == 2){
                room.guests.add(guest);
                room.guests.add(guest2);
                return bookRoom(room, nights);
            }
        }
        return null;
    }

    public void checkOut(Guest guest) {
        for (Bedroom room : bedrooms) {
            if(room.guests.contains(guest)) {
                room.guests.clear();
            }
        }
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
      return booking = new Booking(bedroom, nights);
    }
}
