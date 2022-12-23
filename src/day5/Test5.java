package day5;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    /*
     * 윤년구하기 연도를 입력받고 윤년인데 평년인지 여부를 출력 조건 1.연도가 4로 나누어 떨어지는 해는 윤년 2.연도가 100으로 나누어 떨어지는 않는 해는 평년
     * 3.연도가 400으로 나누어 떨어지는 해는 윤년 4.그외는 평년
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("입력:");
    int year = sc.nextInt();
    String result = "평년";
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      result = "윤년";
    }

    System.out.printf("%d년은 %s이다.", year, result);



  }
}
