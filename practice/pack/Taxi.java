package pack;

public class Taxi extends Vehicle {
  public Taxi(int crewNum) {
    this.crewNum = crewNum;
  }

  public void showCrewNum() {
    System.out.println("Crew of taxi: " + this.crewNum);
  }
}
