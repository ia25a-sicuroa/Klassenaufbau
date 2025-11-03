package finalExercise;

import exercise4.BankAccount;

import java.util.ArrayList;

public class Company {

    public String name;
    public String address;
    public int roomCount;
    public int manRoomCapacity;
    ArrayList<Room> bankAccounts = new ArrayList<Room>();


    public Company(String name, String address, int roomCount, int manRoomCapacity) {
        this.name = name;
        this.address = address;
        this.roomCount = roomCount;
        this.manRoomCapacity = manRoomCapacity;

    }

    public void  addRom(int capacity) {

    }

    public void searchRoom(int capacity) {

    }

    public void freeRooms(){

    }

    public void bookRoom(String bookingName) {
    }
}
