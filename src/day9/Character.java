package day9;

public class Character {
  String name;// �̸�
  int level; // ����
  String job; // ����
  private int str; // ��


  private int dex; // ��ø
  private int intel; // ����


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
    System.out.println("�⺻����!");
  }

  public void skill() {
    System.out.println("test");
  }


}
