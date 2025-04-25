public class CarDrive4 {
  public static void main(String[] args) {
    new Car4();
    System.out.println("====================");
    new Car4(2525);
    System.out.println("====================");
    new Taxi2();
    System.out.println("====================");
    new Taxi2(2525);
    System.out.println("====================");
    new Taxi2("2525");
  }
}

/*
Car()
====================
Car(int no)
====================
Car(int no)
Taxi2(int no)
Taxi2()
====================
Car(int no)
Taxi2(int no)
====================
Car()
Taxi2(String no)
 */
