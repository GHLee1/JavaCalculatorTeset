package day4;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("������ �Է��ϼ���");
    int num1 = sc.nextInt();
    if (num1 % 2 == 0) {
      System.out.printf("%d : ¦���Դϴ�.", num1);
    } else {
      System.out.printf("%d : Ȧ���Դϴ�.", num1);
    }
    sc.close();

  }
}
