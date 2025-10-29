package exercise3;

public class Car {
    public double fuelLevel;
    public double mileage;
    public String licensePlate;
    public double fuelConsumption;
    public double fuelCapacity;


    //declare vars

    //Create constructor
    public Car(String licensePlate, double fuelLevel, double mileage, double fuelConsumption, double fuelCapacity) {
        this.licensePlate = licensePlate;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;

    }

    public void drive(int distance) {
        //do stuff
        double maxdistance = fuelLevel / fuelConsumption;
        System.out.println("Max distance: " + maxdistance);
        double distanceToDrive = distance;
        System.out.println(fuelLevel);
        if (distance > maxdistance) {
            distanceToDrive = maxdistance;
        }
        this.fuelLevel -= distanceToDrive * this.fuelConsumption;
        this.mileage = Math.round((this.mileage + distanceToDrive) * 100.0) / 100.0;
        if (this.fuelLevel < 0) {
            this.fuelLevel = 0;

        }
    }

    public void refuel(int amount) {
        //do stuff

        if (this.fuelLevel + amount > fuelCapacity) {
            this.fuelLevel = fuelCapacity;
        } else {
            this.fuelLevel = this.fuelLevel + amount;
        }


    }

    //add toString
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", mileage=" + mileage +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}


