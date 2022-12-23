package exam;

import java.util.Scanner;

public class Ifex1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
     * 실습문제 1.사용자로부터 정수를 입력받아 절댓값을 출력 술자입력 : -3 결과 -3의 절댓값은 3입니다.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("음수인 정수를 입력하세요 ");
    int integer = sc.nextInt();
    sc.close();
    if (integer < 0) {
      System.out.println("결과-3의 절댓값은" + Math.abs(integer) + "입니다.");
    } else {
      System.out.println("입력받은 정수가 양수입니다.");
    }
  }

}
