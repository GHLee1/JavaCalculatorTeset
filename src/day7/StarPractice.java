package day7;

public class StarPractice {
  public static void main(String[] args) {
    /*
           1��
           *
           **
           ***
           ****
           *****
           
           2��
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
       3��
               *
              **
             ***
            ****
           *****
           4��
           *****
            ****
             ***
              **
               *
     */
    // 3
    System.out.println("=====================");
    for (int i = 1; i <= 5; i++) {
      // ����
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();

    }
    // 4��
    System.out.println("=====================");
    for (int i = 1; i <= 5; i++) {
      // ����
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
