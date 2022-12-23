package day9;

public class PersonTest {

  public static void main(String[] args) {
    // 기본 생성자를 통한 객체 생성
    Person p1 = new Person("홍길동", 180, 60);
    // println은 printStream에서 정의된 오버로딩메서드임
    System.out.println(p1.height);

    // 인스턴스생성
    Person p2 = new Person();
    // 기본생성자 인스턴스 이름 출력
    p2.name = "p2.홍길동";
    System.out.println(p2.name);

  }
}
