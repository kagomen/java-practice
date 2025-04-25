package oop3;

public abstract class Club {
  private String name;

  public Club(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("Club: " + name);
  }

  public abstract void practice();
}
