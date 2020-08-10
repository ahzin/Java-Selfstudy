package sec05.exam04;

public class Singleton {
  private static Singleton singleton = new Singleton();
  //자기자신의 필드에 자기자신의 객체를 만듬

  private Singleton() {}

  //getInstance()로 자기 자신을 리턴(객체의 번지)
  static Singleton getInstance() {
    return singleton;
  }
}

