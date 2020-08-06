package sec04.exam06;
//매개변수의 타입, 개수, 순서 중 하나만 다르면 됨.
//단, 매개변수의 이름이 다르면 메소드 오버로딩이 아님.
public class Calculator {
  //정사각형의 넓이
  double areaRectangle(double width) {
    return width * width;
  }

  //직사각형의 넓이
  double areaRectangle(double width, double height) {
    return width * height;
  }
}
//매개변수의 수만 다름
