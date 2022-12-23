package day7;

public class DiaPractice {
  /*
   * 다이아몬드 만들기
       *
      ***
     *****
      ***
       *
   */
  public static void main(String[] args) {
    // 상단 3개
    for (int i = 1; i <= 3; i++) {
      // 공백
      for (int j = 0; j <= 2 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= 2 * i - 2; j++) {
        System.out.print("*");
      }

      System.out.println();
    }


    // 하단 2개
    for (int i = 1; i <= 2; i++) {
      // 공백
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 5 - 2 * i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }



  }

}
