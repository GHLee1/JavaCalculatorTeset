package exam;

import java.util.Scanner;

public class Practice02 {
  public static void main(String[] args) {
    /*
     * ������� ���Ǹ� ���ϴ� ���α׷� ������ , ���� �Է¹ް� ���Ǹ� ���Ͻÿ� ���Ǵ� �Ǽ��� ������ ���� �� ������� ���� = ������(3.14) * ������ * ������*����
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("�������� �Է��ϼ���");
    double radius = sc.nextDouble();
    System.out.println("������ �Է��ϼ���");
    double height = sc.nextDouble();
    System.out.println("������� ���Ǵ� " + (Math.PI * radius * radius * height) + "�Դϴ�.");
    sc.close();
  }
}
