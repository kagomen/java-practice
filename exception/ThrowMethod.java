package exception;

import java.io.IOException;

public class ThrowMethod {
  public static void main(String[] args) {
    WriteFile wf = new WriteFile();
    try {
      wf.open();
      wf.write();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      wf.close();
    }
  }
}
