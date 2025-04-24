package basic;

public class Branch2 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);

    switch (num) {
      case 1:
        System.out.println("入館料: 8,400円");
        break;
      case 2:
        System.out.println("入館料: 7,000円");
        break;
      case 3:
        System.out.println("入館料: 5,000円");
        break;
      default:
        System.out.println("1: 一般, 2: 中高生, 3: 小学生以下");
    }
  }
}
