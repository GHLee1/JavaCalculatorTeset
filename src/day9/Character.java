package day9;

public class Character {
  String name;// 이름
  int level; // 레벨
  String job; // 직업
  private int str; // 힘


  private int dex; // 민첩
  private int intel; // 지능


  public Character() {}

  public Character(String name, int level, String job, int str, int dex, int intel) {
    this.name = name;
    this.level = level;
    this.job = job;
    this.str = str;
    this.dex = dex;
    this.intel = intel;
  }

  public void setStr(int str) {
    this.str = str;
  }

  public void setDex(int dex) {
    this.dex = dex;
  }

  public void setIntel(int intel) {
    this.intel = intel;
  }

  public int getStr() {
    return str;
  }

  public int getDex() {
    return dex;
  }

  public int getIntel() {
    return intel;
  }

  public void skillPrint() {
    System.out.println("기본공격!");
  }

  public void skill() {
    System.out.println("test");
  }


}
