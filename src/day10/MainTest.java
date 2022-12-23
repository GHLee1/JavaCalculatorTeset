package day10;

public class MainTest {
  public static void main(String[] args) {
    Birthday bt = new Birthday();
    bt.setYear(2000);
    System.out.println(bt);
    bt.printThis();
  }
}


class Birthday {
  int day;
  int month;
  int year;

  public void setYear(int year) {
    this.year = year;

  }

  public void printThis() {
    System.out.println(this);
  }



}
