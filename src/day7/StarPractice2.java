package day7;

public class StarPractice2 {

  public static void main(String[] args) {
    /*
             *
            ***
           *****
          *******
         *********
    */
    for (int i = 1; i <= 5; i++) {
      // 공백
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    /*
        *********
         *******
          *****
           ***
            * 
     */
    System.out.println();

    for (int i = 1; i <= 5; i++) {
      // 공백증가
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 11 - 2 * i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }



  }
}
