package day5;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    /*
     * 100점 만점의 정수를 정수형으로 입력받아 등급을 평가한다
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("정수를 입력하세요.");
    int score = sc.nextInt();

    if (score >= 90 && score <= 100)
      System.out.println("수");
    else if (score >= 80 && score < 90)
      System.out.println("우");
    else if (score >= 70 && score < 80)
      System.out.println("미");
    else if (score >= 60 && score < 70)
      System.out.println("양");
    else if (score < 60 && score > 0)
      System.out.println("가");
    else
      System.out.println("잘못 입력했습니다.");


    sc.close();

  }
}
