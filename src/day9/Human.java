package day9;

public class Human {
  // 속성, 메소드(동작)
  String name;
  int height;
  int dex;

  // 생성자
  public Human() {

  }

  // 명시적 생성자
  public Human(String name, int height, int dex) {
    this.name = name;
    this.height = height;
    this.dex = dex;
  }

  public Human(String name, int dex) {
    super();
    this.name = name;
    this.dex = dex;
  }

  // 메소드
  public void run() {
    System.out.println("출발");
  }

}
