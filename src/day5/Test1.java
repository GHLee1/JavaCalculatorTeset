package day5;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    /*
     * 100�� ������ ������ ���������� �Է¹޾� ����� ���Ѵ�
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("������ �Է��ϼ���.");
    int score = sc.nextInt();

    if (score >= 90 && score <= 100)
      System.out.println("��");
    else if (score >= 80 && score < 90)
      System.out.println("��");
    else if (score >= 70 && score < 80)
      System.out.println("��");
    else if (score >= 60 && score < 70)
      System.out.println("��");
    else if (score < 60 && score > 0)
      System.out.println("��");
    else
      System.out.println("�߸� �Է��߽��ϴ�.");


    sc.close();

  }
}
