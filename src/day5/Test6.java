package day5;

import java.util.Scanner;

public class Test6 {
  public static void main(String[] args) {
    /*
     * BMI 계산하기 BMI(체질량지수)는 몸무게를 키(미터단위)의 제곱으로 나누어서 계산 이계산 결과에 따라 다음과 같이 판단된다. 저체중 : 18.5미만
     * 정상:18.5이상, 23미만 과체중: 23이상 , 25미만 비만 : 25이상 출력결과 BMI지수: 18.0(저체중)
     */
    Scanner sc = new Scanner(System.in);

    System.out.println("몸무게를 입력하세요.");
    double kg = sc.nextDouble();

    System.out.println("미터단위의 키를 입력하세요");
    double height = sc.nextDouble();

    double bmi = kg / (height * height);
    String result = "";

    if (bmi < 18.5 && height < 2) {
      result = "저체중";
    } else if (bmi >= 18.5 && bmi < 23)
      result = "정상";
    else if (bmi >= 23 && bmi < 25)
      result = "과체중";
    else if (bmi >= 25)
      result = "비만";
    else
      System.out.println("몸무게와 키를 제대로 확인해주세요");

    System.out.printf("BMI지수: %.2f(%s)", bmi, result);
  }
}
