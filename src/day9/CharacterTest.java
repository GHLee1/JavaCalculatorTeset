package day9;

public class CharacterTest {

  public static void main(String[] args) {
    // ĳ���� (name,level,job,str,dex,intel)
    // 1. ȫ�浿 , 10 ,���� ,8 ,9 ,10
    // 2 . �Ѹ� ,1, �ʽ��� , 1, 3, 5
    // 3. ��ų(�⺻����)
    Character c1 = new Character("ȫ�浿 ", 10, "����", 8, 9, 10);
    Character c2 = new Character("�Ѹ� ", 1, "�ʽ���", 1, 3, 5);
    c1.skillPrint();
    c2.skill();
  }
}
