package exam;

import java.util.Scanner;

public class Practice01 {
  public static void main(String[] args) {
    // 이름,나이,키 출력
    Scanner sc = new Scanner(System.in);
    System.out.println("이름을 입력하세요");
    String name = sc.next();
    System.out.println("나이를 입력하세요");
    int age = sc.nextInt();
    System.out.println("키를 입력하세요");
    double height = sc.nextDouble();
    System.out.println("이름은 " + name + ", 나이는 " + age + "세 , 키는 " + height + "cm 입니다.");
    sc.close();
  }
}
