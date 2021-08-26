import java.util.ArrayList;

public class Bedroom extends Room{
    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int capacity, ArrayList<Guest> guests, int roomNumber, RoomType roomType) {
        super(capacity, guests);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

}
