
public class ArgumentTest {
  // 메소드
  public String test_method(String send) {
    // 접근제어자 뒤에 String은 리턴값 메소드명뒤 괄호안에 값은 Argument
    System.out.println("method inside");
    String sendValue = send + "값 들어옴";
    return sendValue;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArgumentTest me = new ArgumentTest();
    System.out.println(me.test_method("파라미터"));
  }

}
