import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        hotel = new Hotel(bedrooms, conferenceRooms);
        bedroom = new Bedroom(2, guests, 4, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(10, guests,"Cobra");
    }

    @Test
    public void hasBedrooms(){
        hotel.addBedroomToHotel(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        hotel.addConferenceRoomToHotel(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

}
