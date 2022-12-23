package exam;

import java.util.Scanner;

public class WhileEx1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
     * 1~100사이 정수 중 3의 배수만 출력하는 프로그램
     * 
     */
    // int a = 1;
    // while (a <= 100) {
    // a++;
    // if (a % 3 == 0) {
    // System.out.println(a);
    // }
    //
    // }

    /*
     * 사용자로부터 단을 입력받아 구구단을 출력 단을 입력하세요 : 3 -----3단---- 3*1 = 3 3*2 = 6 .. 3*9 = 27
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("단을 입력하세요 : ");
    int i = sc.nextInt();
    System.out.println("----" + i + "단----");
    int j = 1;
    while (j <= 9) {
      System.out.println(i + "*" + j + "=" + (i * j));
      j++;
    }

    sc.close();
  }

}
