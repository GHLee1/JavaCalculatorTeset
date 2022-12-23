package day7;

public class Practice {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      for (int j = i; j <= 5; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    System.out.println("====2¹ø====");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j == i) {
          System.out.print(j);
        } else
          System.out.print(0);

      }
      System.out.println();
    }


  }
}
