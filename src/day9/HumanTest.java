package day9;

public class HumanTest {

  public static void main(String[] args) {
    // ����
    // ���1 �⺻ �����ڸ� �����ؾ���
    Human h1 = new Human();
    h1.name = "ȫ�浿";
    h1.height = 120;
    h1.dex = 5;
    // ���2 ����� ������
    Human h2 = new Human("�Ѹ�", 150, 7);

    Human h3 = new Human("��浿", 15);

    System.out.println(h1.name);
    System.out.println(h2.name + "�� Ű��" + h2.height);

    System.out.println(h3.name + h3.dex);

    h3.run();

    Human ���� = new Human();
    ����.name = "������";
    System.out.println(����.name);
  }
}
