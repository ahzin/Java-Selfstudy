package sec06.exam05.package1;

public class B {
  public B() {

    A a = new A(); //A의 객체 생성
    //public A()이기 때문에 다 사용가능이지만,

    a.field1 = 1;
    //다른 패키지에서도 사용가능

    a.field2 = 1;
    //같은 패키지 내에서만 사용가능

    //a.field3 = 1; //private int field3;이기 떄문에 a.field3은 사용불


    //메소드도 마찬가지
    a.method1(); //public
    a.method2(); //default
    //a.method3(); //private
  }
}

