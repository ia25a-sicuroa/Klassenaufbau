package exercise3;

public class Car {
  public int fuelLevel;
  public int mileage;
  public String licensePlate;
  public double fuelConsumption;
  public double fuelCapacity;


  //declare vars

  //Create constructor
    public Car(String licensePlate, int fuelLevel, int mileage, double fuelConsumption, double fuelCapacity) {
      this.licensePlate = licensePlate;
      this.fuelConsumption = fuelConsumption;
      this.fuelCapacity = fuelCapacity;
      this.mileage = mileage;
      this.fuelLevel = fuelLevel;

    }


    public void drive(int distance) {
    //do stuff


  }

  public void refuel(int amount) {
    //do stuff
  }

  //add toString
    public String toString(){

        return "";
    }


}
