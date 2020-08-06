package sec04.exam04;

public class Calculator {
  //Method만 선언
  int plus(int x, int y) {
    int result = x + y;
    return result;
  }

  double avg(int x, int y) {
    double sum = plus(x, y); //plus 메서드 호출
    double result = sum / 2;
    return result;
  }

  void execute() {
    double result = avg(7, 8); //x=7, y=10
    println("실행결과: " + result);
  }

  void println(String message) {
    System.out.println(message);
  }
}

