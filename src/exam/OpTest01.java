package exam;

import java.util.Scanner;

public class OpTest01 {
  public static void main(String[] args) {
    // 변수의 활용, 정수 2개를 입력받고 각각 변수에 저장한 후,두 변수 값을 교환 출력
    Scanner sc = new Scanner(System.in);

    int num1, num2;
    System.out.println("첫 번째 변수를 입력하세요");
    num1 = sc.nextInt();
    System.out.println("두 번째 변수를 입력하세요");
    num2 = sc.nextInt();
    int z;
    z = num1;
    num1 = num2;
    num2 = z;
    System.out.println("x =" + num1 + ",  y = " + num2);
  }
}
