package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
  public C() {
    //public은 다른 패키지에서도 사용가능
    A a = new A();
    a.field1 = 1;

    //a.field2 = 1; //다른 패키지이므로, default 사용불가

    //a.field3 = 1; //private으로 사용불가

    a.method1();
    //a.method2(); //다른 패키지이므로, default 사용불가
    //a.method3(); //private으로 사용불가
  }
}


