
public class ReturnVoidTest {
  public String returnMethod(String paramValue) {
    String returnValue = paramValue;
    return returnValue;
  }

  public void voidMethod() {
    System.out.println("no return");
    // void �޼ҵ�� return ���� ����
  }

  public static void main(String[] args) {
    ReturnVoidTest rvt = new ReturnVoidTest();
    System.out.println(rvt.returnMethod("call"));
    rvt.voidMethod();
  }
}
