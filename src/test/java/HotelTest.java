import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class HotelTest {
    Hotel hotel;

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    Bedroom bedroomSingle;
    Bedroom bedroomDouble;

    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;

    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    HashMap<String, DiningRoom> diningRooms;

    @Before
    public void setUp() {
        guest1 = new Guest("Amy");
        guest2 = new Guest("Mark");
        guest3 = new Guest("Trevor");
        guest4 = new Guest("Mary");

        bedroomSingle = new Bedroom(new ArrayList<Guest>(), 1, RoomType.SINGLE, 257.00, 18.00, 25.00);
        bedroomDouble = new Bedroom(new ArrayList<Guest>(), 2, RoomType.DOUBLE, 584.00, 27.00, 32.00);
        

        conferenceRoom = new ConferenceRoom(10, new ArrayList<Guest>(), "Meeting Room", 112.00, 85.00);
        diningRoom = new DiningRoom(24, new ArrayList<Guest>(), "Grand Ballroom", 120.00, 85.00);
        diningRooms = new HashMap<String, DiningRoom>();
        diningRooms.put("one",diningRoom);
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroomSingle);
        bedrooms.add(bedroomDouble);
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom);
        hotel = new Hotel("bobs", bedrooms, conferenceRooms, diningRooms);
                
    }

    @Test
    public void diningRoomName() {
        assertEquals("Grand Ballroom", hotel.diningRoomName("one"));
    }

    @Test
    public void avaRooms() {
        assertEquals(2, hotel.avaRooms().size());
    }

    @Test
    public void addGuestRoom() {
        Booking booking = hotel.addGuestRoom(guest1,10);
        assertEquals(2570.0, booking.getTotalBill(), 0.0);
    }

    @Test
    public void testAddGuestRoom() {
        Booking booking = hotel.addGuestRoom(guest1,guest2,10);
        assertEquals(5840.0, booking.getTotalBill(), 0.0);
    }

    @Test
    public void checkOut() {
        hotel.addGuestRoom(guest1,guest2,10);
        hotel.checkOut(guest1);
        assertEquals(2, hotel.avaRooms().size());
    }

    @Test
    public void checkFullRooms() {
        hotel.addGuestRoom(guest1, 5);
        hotel.addGuestRoom(guest2,guest3, 4);
        hotel.addGuestRoom(guest4, 4);
        assertEquals(0, hotel.avaRooms().size());
    }

}