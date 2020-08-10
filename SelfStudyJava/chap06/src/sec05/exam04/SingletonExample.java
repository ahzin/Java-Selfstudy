package sec05.exam04;

public class SingletonExample {
  public static void main(String[] args) {
    /*
     *new연산자로 만들지 못하게 private로 막힘
		Singleton obj1 = new Singleton();  //컴파일 에러
		Singleton obj2 = new Singleton();  //컴파일 에러
     */

    //싱글톤 변수 선언
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

    if(obj1 == obj2) {
      System.out.println("같은 Singleton 객체입니다.");
    } else {
      System.out.println("다른 Singleton 객체입니다.");
    }
    //같은 Singleton 객체입니다.
  }
}