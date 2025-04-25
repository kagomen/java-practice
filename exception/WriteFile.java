package exception;

import java.io.IOException;

public class WriteFile {
  public void open() {
    System.out.println("Open File");
  }

  public void write() throws IOException {
    throw new IOException();
  }

  public void close() {
    System.out.println("Close File");
  }
}
