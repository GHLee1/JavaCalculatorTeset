package day5;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    // 근무시간을 입력받아 급여를 계산하여 출력한다.
    // 조건 50시간까지의 급여는 10000원이다. 50시간을 초과한 금액에 대해서는 10%를 더 지급한다.
    // 근무시간 65 면 665000 10%를 더 지급 650000 15000원 붙음 초과한 시간에 10%
    Scanner sc = new Scanner(System.in);
    int hourPay = 10000;
    int pay = 0;
    System.out.println("근무시간 :");
    int workTime = sc.nextInt();
    if (workTime <= 50) {
      System.out.println("급여는" + workTime * 10000);
    } else {
      System.out.println("급여는" + ((workTime - 50) * 1000 + workTime * 10000));
    }

    // if (workTime <= 50) {
    // pay = workTime * hourPay;
    // } else {
    // pay = (int) ((50 * hourPay) + ((workTime - 50) * hourPay * 1.1));
    //
    // }
    System.out.println("급여 :" + pay);



  }
}
