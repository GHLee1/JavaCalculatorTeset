package day9;

public class CharacterTest {

  public static void main(String[] args) {
    // 캐릭터 (name,level,job,str,dex,intel)
    // 1. 홍길동 , 10 ,전사 ,8 ,9 ,10
    // 2 . 둘리 ,1, 초심자 , 1, 3, 5
    // 3. 스킬(기본공격)
    Character c1 = new Character("홍길동 ", 10, "전사", 8, 9, 10);
    Character c2 = new Character("둘리 ", 1, "초심자", 1, 3, 5);
    c1.skillPrint();
    c2.skill();
  }
}
