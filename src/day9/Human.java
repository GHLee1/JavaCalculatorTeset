package day9;

public class Human {
  // �Ӽ�, �޼ҵ�(����)
  String name;
  int height;
  int dex;

  // ������
  public Human() {

  }

  // ����� ������
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

  // �޼ҵ�
  public void run() {
    System.out.println("���");
  }

}
