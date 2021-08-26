import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void checkInGuest(Guest guest){
        this.guests.add(guest);
    }

    public boolean isEmpty(){
        return this.getNumberOfGuests()==0;
    }

    //    private RoomType roomType;
//
//    public Room(RoomType roomType){
//        this.roomType = roomType;
//    }
//
//    public RoomType getRoomType() {
//        return this.roomType;
//    }
//
//    public int getValueFromEnum() {
//        return this.roomType.getNumberOfBeds();
//    }
}
