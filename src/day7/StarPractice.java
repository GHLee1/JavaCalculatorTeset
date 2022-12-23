package day7;

public class StarPractice {
  public static void main(String[] args) {
    /*
           1번
           *
           **
           ***
           ****
           *****
           
           2번
           *****
           ****
           ***
           **
           *
          
      */
    for (int i = 0; i <= 4; i++) {

      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();

    }
    System.out.println("============");
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= 4 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    /*
       3번
               *
              **
             ***
            ****
           *****
           4번
           *****
            ****
             ***
              **
               *
     */
    // 3
    System.out.println("=====================");
    for (int i = 1; i <= 5; i++) {
      // 공백
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();

    }
    // 4번
    System.out.println("=====================");
    for (int i = 1; i <= 5; i++) {
      // 공백
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= 6 - i; j++) {
        System.out.print("*");
      }



      System.out.println();
    }

  }
}
