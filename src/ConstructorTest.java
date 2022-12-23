
public class ConstructorTest {
  String value;

  public ConstructorTest(String value) {
    // 객체화 시 가장 먼저 사용됨
    // 생성자는 보이진않지만 이미 만들어져 있다.
    this.value = value;
    // 멤버변수 value를 생성자에 저장함
  }

  public static void main(String[] args) {
    ConstructorTest ct = new ConstructorTest("밸류");
    ConstructorTest ct1 = new ConstructorTest("밸류테스트2");

    System.out.println(ct.value);
    System.out.println(ct1.value);

  }

}
