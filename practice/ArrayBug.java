class ArrayBug {
  public static void main(String[] args) {
    String[] name = new String[4];

    name[0] = "太郎";
    name[1] = "二郎";
    name[2] = "三郎";
    name[3] = "四郎";
    // name[4] = "五郎";

    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    // System.out.println(name[4]);
  }
}
