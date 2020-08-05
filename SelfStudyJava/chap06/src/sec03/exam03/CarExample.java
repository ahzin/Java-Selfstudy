package sec03.exam03;

public class CarExample {
  public static void main(String[] args) {
    Car car1 = new Car(); //필드 값은 기본값으로 들어갈 것
    System.out.println(car1.company); //현대자동차
    System.out.println(car1.model); //null
    System.out.println(car1.color); //null
    System.out.println(car1.maxSpeed); //0
    System.out.println();

    Car car2 = new Car("자가용");
    System.out.println(car2.company);
    System.out.println(car2.model);
    System.out.println();
    /*
       Car(String model) {
        this.model = model;
        }
     */

    Car car3 = new Car("자가용", "빨강");
    System.out.println(car3.company);
    System.out.println(car3.model);
    System.out.println(car3.color);
    System.out.println();
    /*
       Car(String model, String color) {
        this.model = model;
        this.color = color;
        }
     */

    Car car4 = new Car("택시", "검정", 200);
    System.out.println(car4.company);
    System.out.println(car4.model);
    System.out.println(car4.color);
    System.out.println(car4.maxSpeed);
    /*
       Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        }
     */

  }
}

