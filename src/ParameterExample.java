
public class ParameterExample {

  public void MethodTest(String name, int age, String remark) {
    // ��ȣ���� �ƱԸ�Ʈ
    // �ƱԸ�Ʈ == �Ķ����
    System.out.println("name : " + name);
    System.out.println("age : " + age);
    System.out.println("remark : " + remark);
  }

  public static void main(String[] args) {
    ParameterExample pe = new ParameterExample();
    pe.MethodTest("����", 26, "�ڵ�");
  }
}
