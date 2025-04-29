package class_library;

import java.util.ArrayList;

public class ArrayListSample {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Hello");
    list.add("World");
    list.add("!");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.remove(2);
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
