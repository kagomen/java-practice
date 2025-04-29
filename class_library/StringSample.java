package class_library;

public class StringSample {
  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = new String("Java");
    String s3 = "Java";

    System.out.println("s1.equals(s2): " + s1.equals(s2));
    System.out.println("s1.equals(s3): " + s1.equals(s3));
    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1 == s3: " + (s1 == s3));

    // 文字列の長さを取得
    System.out.println("s1.length(): " + s1.length());
    // -> 4

    // n番目の文字列を取得
    System.out.println("s1.substring(1): " + s1.substring(0));
    // -> J

    // n番目からm番目までの文字列を取得
    System.out.println("s1.substring(1, 3): " + s1.substring(0, 3));
    // -> Java
  }
}
