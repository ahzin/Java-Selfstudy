package sec04.exam01;

public class CalculatorExample {
  public static void main(String[] args) {
    Calculator myCalc = new Calculator();
    myCalc.powerOn(); //참조하는 객체로 가서 메소드를 실행

    int result1 = myCalc.plus(5, 6);
    System.out.println("result1: " + result1);

    byte x = 10;
    byte y = 4;
    double result2 = myCalc.divide(x, y);
    System.out.println("result2: " + result2);

    myCalc.powerOff();
  }
}
