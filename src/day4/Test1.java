package day4;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    // 2개숫자를 입력받고 , 입력된 숫자가 같으면 '정사각형'과 넓이를 출력, 입력한 숫자가 다르면
    // 직사각형과 넓이를 출력한다 만약 입력된 숫자 중 하나가 0과 같거나 작을 경우 프로그램 종료한다.
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자1을 입력해주세요");
    int num1 = sc.nextInt();
    System.out.println("숫자2을 입력해주세요");
    int num2 = sc.nextInt();
    boolean condition = num1 > 0 && num2 > 0;
    if (num1 == num2 && (condition)) {
      System.out.println("정사각형" + ", 넓이: " + num1 * num2);
    } else if ((num1 != num2) && condition) {
      System.out.println("직사각형" + ", 넓이: " + num1 * num2);
    } else
      System.out.println("프로그램 종료");
  }
}
