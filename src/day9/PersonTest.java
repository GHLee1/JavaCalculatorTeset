package day9;

public class PersonTest {

  public static void main(String[] args) {
    // �⺻ �����ڸ� ���� ��ü ����
    Person p1 = new Person("ȫ�浿", 180, 60);
    // println�� printStream���� ���ǵ� �����ε��޼�����
    System.out.println(p1.height);

    // �ν��Ͻ�����
    Person p2 = new Person();
    // �⺻������ �ν��Ͻ� �̸� ���
    p2.name = "p2.ȫ�浿";
    System.out.println(p2.name);

  }
}
