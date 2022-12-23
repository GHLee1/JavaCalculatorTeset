package day9;

public class HumanTest {

  public static void main(String[] args) {
    // 선언
    // 방법1 기본 생성자를 생성해야함
    Human h1 = new Human();
    h1.name = "홍길동";
    h1.height = 120;
    h1.dex = 5;
    // 방법2 명시적 생성자
    Human h2 = new Human("둘리", 150, 7);

    Human h3 = new Human("고길동", 15);

    System.out.println(h1.name);
    System.out.println(h2.name + "의 키는" + h2.height);

    System.out.println(h3.name + h3.dex);

    h3.run();

    Human 문자 = new Human();
    문자.name = "쓰레기";
    System.out.println(문자.name);
  }
}
