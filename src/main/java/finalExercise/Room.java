package finalExercise;

public class Room {

    public int roomNumber;
    public int capacity;
    public boolean isBooked;

    public Room(int roomNumber, int capacity, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.isBooked = isBooked;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
