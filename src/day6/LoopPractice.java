package day6;

public class LoopPractice {
  public static void main(String[] args) {
    // forLoop
    // 1¹ø
    for (int i = 0; i <= 9; i++) {
      System.out.print(i + "\t");
    }
    System.out.println();
    // 2¹ø
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + "\t");
    }
    System.out.println();
    // 3
    for (int i = 1; i <= 10; i += 2) {
      System.out.print(i + "\t");
    }
    System.out.println();
    // 4
    for (int i = 0; i <= 10; i += 2) {
      System.out.print(i + "\t");
    }
    System.out.println();
    // 5
    for (int i = 10; i <= 100; i += 10) {
      System.out.print(i + "\t");
    }
    System.out.println();
    // 6
    for (int i = 5; i > 0; i--) {
      System.out.print(i + "\t");
    }
    System.out.println();
    // 7
    for (int i = 10000; i > 0; i /= 10) {
      System.out.print(i + "\t");
    }



  }
}
