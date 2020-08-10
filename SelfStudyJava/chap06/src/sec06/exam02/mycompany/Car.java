package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyndai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
  //Field
  Engine engine = new Engine();
  SnowTire tire1 = new SnowTire();
  BigWidthTire tire2 = new BigWidthTire();

  //클래스 이름이 중복할 때는
  //경로를 직접 클래스에 명시하는 것이 더 명확해진다.
  sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
  sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}
