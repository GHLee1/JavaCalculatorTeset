
public class ConstructorTest {
  String value;

  public ConstructorTest(String value) {
    // ��üȭ �� ���� ���� ����
    // �����ڴ� ������������ �̹� ������� �ִ�.
    this.value = value;
    // ������� value�� �����ڿ� ������
  }

  public static void main(String[] args) {
    ConstructorTest ct = new ConstructorTest("���");
    ConstructorTest ct1 = new ConstructorTest("����׽�Ʈ2");

    System.out.println(ct.value);
    System.out.println(ct1.value);

  }

}
