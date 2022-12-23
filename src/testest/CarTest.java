package testest;

public class CarTest {
  // 차를 생산 하는 곳
  // 클래스명 변수명 = new 클래스명();
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.name = "소나타";
    c1.Carcolor = "파랑";
    c1.wheel = 4;

    System.out.println(c1.name);
    c1.run();

  }
}
