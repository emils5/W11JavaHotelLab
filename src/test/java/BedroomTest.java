import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    ArrayList<Guest> guests;


    @Before
    public void before(){
        bedroom = new Bedroom(2, guests, 4, RoomType.DOUBLE);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(4, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

}
