package exam;

import java.util.Scanner;

public class Practice02 {
  public static void main(String[] args) {
    /*
     * 원기둥의 부피를 구하는 프로그램 반지름 , 높이 입력받고 부피를 구하시오 부피는 실수의 값으로 선언 후 원기둥의 부피 = 원주율(3.14) * 반지름 * 반지름*높이
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("반지름을 입력하세요");
    double radius = sc.nextDouble();
    System.out.println("높이을 입력하세요");
    double height = sc.nextDouble();
    System.out.println("원기둥의 부피는 " + (Math.PI * radius * radius * height) + "입니다.");
    sc.close();
  }
}
