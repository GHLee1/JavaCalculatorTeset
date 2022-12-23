package day4;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    // 정수 3개를 입력받아 가장 큰 수 를 출력

    Scanner sc = new Scanner(System.in);
    System.out.println("정수 3개를 입력하세요.");
    System.out.println("첫번째 정수를 입력하세요");
    int n1 = sc.nextInt();
    System.out.println("두번째 정수를 입력하세요");
    int n2 = sc.nextInt();
    System.out.println("세번째 정수를 입력하세요");
    int n3 = sc.nextInt();
    /*
     * int max = n1 ; if(max <n2) { max = n2; } if(max <n3) { max = n3; }
     */

    System.out.println("======================================");
    if (n1 > n2 && n1 > n3) {
      System.out.printf("%d,%d,%d중 가장 큰 수는 %d", n1, n2, n3, n1);
    } else if (n2 > n3) {
      System.out.printf("%d,%d,%d중 가장 큰 수는 %d", n1, n2, n3, n2);
    } else {
      System.out.printf("%d,%d,%d중 가장 큰 수는 %d", n1, n2, n3, n3);
    }
    System.out.println("======================================");


  }
}
