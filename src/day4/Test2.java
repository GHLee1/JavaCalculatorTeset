package day4;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    // ���� 3���� �Է¹޾� ���� ū �� �� ���

    Scanner sc = new Scanner(System.in);
    System.out.println("���� 3���� �Է��ϼ���.");
    System.out.println("ù��° ������ �Է��ϼ���");
    int n1 = sc.nextInt();
    System.out.println("�ι�° ������ �Է��ϼ���");
    int n2 = sc.nextInt();
    System.out.println("����° ������ �Է��ϼ���");
    int n3 = sc.nextInt();
    /*
     * int max = n1 ; if(max <n2) { max = n2; } if(max <n3) { max = n3; }
     */

    System.out.println("======================================");
    if (n1 > n2 && n1 > n3) {
      System.out.printf("%d,%d,%d�� ���� ū ���� %d", n1, n2, n3, n1);
    } else if (n2 > n3) {
      System.out.printf("%d,%d,%d�� ���� ū ���� %d", n1, n2, n3, n2);
    } else {
      System.out.printf("%d,%d,%d�� ���� ū ���� %d", n1, n2, n3, n3);
    }
    System.out.println("======================================");


  }
}
