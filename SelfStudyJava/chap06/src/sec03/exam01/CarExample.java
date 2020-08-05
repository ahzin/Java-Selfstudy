package sec03.exam01;

public class CarExample { //실행클래스
  public static void main(String[] args) {
    Car myCar = new Car("검정", 3000);
    //Car myCar = new Car();  (x)
    //매개변수가 있는 생성자를 선언했기 때문에 오류!
  }
}
