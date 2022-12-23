package day5;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    // 태어난 해를 정수형으로 받아 해당 년도의 띠를 출력switch
    Scanner sc = new Scanner(System.in);

    System.out.println("태어난 년도를 입력하시오");
    int year = sc.nextInt();
    // System.out.println(2001 % 12);

    int 띠 = year % 12;
    String result = "동물";
    switch (띠) {
      case 4:
        result = "쥐";
        break;
      case 5:
        result = "소";
        break;
      case 6:
        result = "호랑이";
        break;
      case 7:
        result = "토끼";
        break;
      case 8:
        result = "용";
        break;
      case 9:
        result = "뱀";
        break;
      case 10:
        result = "말";
        break;
      case 11:
        result = "양";
        break;
      case 0:
        result = "원숭이";
        break;
      case 1:
        result = "닭";
        break;
      case 2:
        result = "개";
        break;
      case 3:
        result = "돼지";
        break;
      default:
        System.out.println("년도를 정확히 입력해주세요.");

    }
    System.out.println(year + "년생은" + result + "띠입니다");


  }
}
