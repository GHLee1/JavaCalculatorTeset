package day6;

import java.util.Scanner;

public class LoopPractice2 {
  public static void main(String[] args) {
    // ���� 5���� �Է¹޾� �հ踦 ���Ͻÿ�.
    Scanner sc = new Scanner(System.in);
    System.out.println("����5���� �Է����ּ���.");
    int num = 0;
    int sum = 0;

    for (int i = 1; i <= 5; i++) {
      System.out.println(i + "��° ���� �Է�: ");
      num = sc.nextInt();
      sum += num;
    }
    System.out.println(sum);
  }
}
