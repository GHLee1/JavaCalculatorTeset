package testest;

public class CarTest {
  // ���� ���� �ϴ� ��
  // Ŭ������ ������ = new Ŭ������();
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.name = "�ҳ�Ÿ";
    c1.Carcolor = "�Ķ�";
    c1.wheel = 4;

    System.out.println(c1.name);
    c1.run();

  }
}
