import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

//    bedrooms[0].this.guests.put(guest)

    public void addGuestRoom(Guest guest) {
        for (Room room : bedrooms) {
            if (room.guests.size() == 0) {
                room.guests.add(guest);
            }
        }
    }

    public void addGuestRoom(Guest guest, Guest guest2) {
        for (Bedroom room : bedrooms) {
            if (room.guests.size() == 0 && room.capacity == 2) {
                room.guests.add(guest);
                room.guests.add(guest2);
            }
        }
    }

    public void checkOut(Guest guest) {
        for (Bedroom room : bedrooms) {
            if(room.guests.contains(guest)) {
                room.guests.clear();
            }
        }
    }
}



