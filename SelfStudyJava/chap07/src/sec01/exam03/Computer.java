package sec01.exam03;

public class Computer extends Calculator { //Calculator을 상속
  @Override
  //public(좀 더 넓은 범위의 접근제한자)은 붙일 수 있으나, private은 컴파일 오류!
  double areaCircle(double r) { //부모와 똑같은 선언부가 있어야 한다.
    /*
     * 재정의
     *  System.out.println("Calculator 객체의 areaCircle(double r) 실행");
     *  return 3.14159 * r * r;
     */
    System.out.println("Computer 객체의 areaCircle() 실행");
    return Math.PI * r * r;
  }
}


