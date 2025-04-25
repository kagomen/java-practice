import pack.Bus;
import pack.Stoppable;
import pack.Train;
import pack.Vehicle;

public class UseVehicle {
  public static void main(String[] args) {
    Vehicle[] v = new Vehicle[3];
    v[0] = new pack.Taxi(4); // importを使わずにこのように書くことも可能
    v[1] = new Bus(20);
    v[2] = new Train(1200);

    for (int i = 0; i < v.length; i++) {
      v[i].showCrewNum();
      if (v[i] instanceof Stoppable) {
        Stoppable s = (Stoppable) v[i];
        s.stop();
      }
    }
  }
}
