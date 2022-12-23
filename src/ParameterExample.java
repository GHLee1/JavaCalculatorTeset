
public class ParameterExample {

  public void MethodTest(String name, int age, String remark) {
    // 괄호안은 아규먼트
    // 아규먼트 == 파라미터
    System.out.println("name : " + name);
    System.out.println("age : " + age);
    System.out.println("remark : " + remark);
  }

  public static void main(String[] args) {
    ParameterExample pe = new ParameterExample();
    pe.MethodTest("건희", 26, "코딩");
  }
}
