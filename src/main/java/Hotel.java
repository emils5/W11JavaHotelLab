import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public Bedroom findBedroom(int roomNumber) {
        Bedroom result = null;
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getRoomNumber() == roomNumber) {
                result = bedroom;
            }
        }
        return result;
        }

    public void checkInGuestToBedroom(ArrayList<Guest> guests, int roomNumber){
        Bedroom bedroom = findBedroom(roomNumber);
        if (bedroom != null && bedroom.isEmpty() ) {
            for (Guest guest : guests) {
                bedroom.checkInGuest(guest);
            }
        }
    }



}
