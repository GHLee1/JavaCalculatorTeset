package exam;

import java.util.Scanner;

public class Ifex1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
     * �ǽ����� 1.����ڷκ��� ������ �Է¹޾� ������ ��� �����Է� : -3 ��� -3�� ������ 3�Դϴ�.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("������ ������ �Է��ϼ��� ");
    int integer = sc.nextInt();
    sc.close();
    if (integer < 0) {
      System.out.println("���-3�� ������" + Math.abs(integer) + "�Դϴ�.");
    } else {
      System.out.println("�Է¹��� ������ ����Դϴ�.");
    }
  }

}
