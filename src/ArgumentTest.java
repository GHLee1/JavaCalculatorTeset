
public class ArgumentTest {
  // �޼ҵ�
  public String test_method(String send) {
    // ���������� �ڿ� String�� ���ϰ� �޼ҵ��� ��ȣ�ȿ� ���� Argument
    System.out.println("method inside");
    String sendValue = send + "�� ����";
    return sendValue;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArgumentTest me = new ArgumentTest();
    System.out.println(me.test_method("�Ķ����"));
  }

}
