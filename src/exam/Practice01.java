package exam;

import java.util.Scanner;

public class Practice01 {
  public static void main(String[] args) {
    // �̸�,����,Ű ���
    Scanner sc = new Scanner(System.in);
    System.out.println("�̸��� �Է��ϼ���");
    String name = sc.next();
    System.out.println("���̸� �Է��ϼ���");
    int age = sc.nextInt();
    System.out.println("Ű�� �Է��ϼ���");
    double height = sc.nextDouble();
    System.out.println("�̸��� " + name + ", ���̴� " + age + "�� , Ű�� " + height + "cm �Դϴ�.");
    sc.close();
  }
}
