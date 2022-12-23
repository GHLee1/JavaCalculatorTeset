package day8;

public class CharacterTest {
  // 캐릭터 정의
  // 멤버변수 정의
  int level;
  int id;
  String name;

  public CharacterTest(int level, int id, String name) {
    this.level = level;
    this.id = id;
    this.name = name;
  }

  public static void main(String[] args) {
    CharacterTest c1 = new CharacterTest(1, 123, "이름");

    System.out.println(c1.name);
  }


}
