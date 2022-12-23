
public class ReturnVoidTest {
  public String returnMethod(String paramValue) {
    String returnValue = paramValue;
    return returnValue;
  }

  public void voidMethod() {
    System.out.println("no return");
    // void 메소드는 return 값이 없음
  }

  public static void main(String[] args) {
    ReturnVoidTest rvt = new ReturnVoidTest();
    System.out.println(rvt.returnMethod("call"));
    rvt.voidMethod();
  }
}
