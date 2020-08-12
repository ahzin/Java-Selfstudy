package sec02.exam04;

public class DriverExample {
  public static void main(String[] args) {

    Driver driver = new Driver();

    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    //    public void drive(Vehicle vehicle) {
    //      vehicle.run();
    //    }

    driver.drive(bus); //자동타입변환 Vehicle vehicle = bus;
    driver.drive(taxi); //자동타입변환 Vehicle vehicle = taxi;
  }
}
