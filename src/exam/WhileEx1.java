package exam;

import java.util.Scanner;

public class WhileEx1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
     * 1~100���� ���� �� 3�� ����� ����ϴ� ���α׷�
     * 
     */
    // int a = 1;
    // while (a <= 100) {
    // a++;
    // if (a % 3 == 0) {
    // System.out.println(a);
    // }
    //
    // }

    /*
     * ����ڷκ��� ���� �Է¹޾� �������� ��� ���� �Է��ϼ��� : 3 -----3��---- 3*1 = 3 3*2 = 6 .. 3*9 = 27
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("���� �Է��ϼ��� : ");
    int i = sc.nextInt();
    System.out.println("----" + i + "��----");
    int j = 1;
    while (j <= 9) {
      System.out.println(i + "*" + j + "=" + (i * j));
      j++;
    }

    sc.close();
  }

}
