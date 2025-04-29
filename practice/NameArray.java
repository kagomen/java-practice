public class NameArray {
  public static void main(String[] args) {
    String[] names = {"佐藤", "鈴木", "高橋", "田中"};
    String search = args[0];
    boolean result = false;

    for (int i = 0; i < names.length; i++) {
      if (names[i].equals(search)) {
        result = true;
        break;
      }
    }

    if (result == true) {
      System.out.println(search + "は含まれます");
    } else {
      System.out.println(search + "は含まれません");
    }
  }
}
