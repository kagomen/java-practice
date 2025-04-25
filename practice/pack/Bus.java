package pack;

public class Bus extends Vehicle implements Stoppable {
  public Bus(int crewNum) {
    this.crewNum = crewNum;
  }

  public void showCrewNum() {
    System.out.println("Crew of bus: " + this.crewNum);
  }

  public void stop() {
    System.out.println("bus will stop at the next bus stop.");
  }
}
