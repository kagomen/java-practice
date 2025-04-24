public class CarDrive {
  public static void main(String[] args) {
    Car car = new Car();
    car.setNo(11);
    car.run(80);
    car.display();
    car.stop();
    car.display();
  }
}
