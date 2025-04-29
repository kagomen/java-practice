import java.util.ArrayList;
import java.util.Iterator;

public class NameArray2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("佐藤");
    names.add("鈴木");
    names.add("高橋");
    names.add("田中");

    String search = args[0];
    boolean result = false;

    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      if (search.equals(it.next())) {
        result = true;
        break;
      }
    }

    if (result) {
      System.out.println(search + "は含まれます");
      return;
    }

    System.out.println(search + "は含まれません");

    // if (names.contains(search)) {
    //   System.out.println(search + "は含まれます");
    //   return;
    // }
    // System.out.println(search + "は含まれません");
  }
}
