package day8;

public class CharacterTest {
  // ĳ���� ����
  // ������� ����
  int level;
  int id;
  String name;

  public CharacterTest(int level, int id, String name) {
    this.level = level;
    this.id = id;
    this.name = name;
  }

  public static void main(String[] args) {
    CharacterTest c1 = new CharacterTest(1, 123, "�̸�");

    System.out.println(c1.name);
  }


}
