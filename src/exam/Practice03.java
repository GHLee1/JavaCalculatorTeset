package exam;

import java.util.Scanner;

public class Practice03 {
  /*
   * 과목 3개 입력, 점수에 따른 합격출력 합격조건 : 평균 60점 이상일 것 한 과목이라도 40점 미만 일 경우에 과락
   * 
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("세가지 과목 점수를 연달아 입력하세요.");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    String result =
        ((num1 + num2 + num3) / 3 >= 60 && (num1 >= 40 && num2 >= 40 && num3 >= 40)) ? "합격" : "불합격";
    System.out.println(result);
  }
}
