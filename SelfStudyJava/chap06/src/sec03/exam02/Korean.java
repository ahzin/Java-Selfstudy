package sec03.exam02;

public class Korean {
  //필드
  String nation = "대한민국";
  String name; //이름과 주민번호는
  String ssn; //사람마다 고유의 값을 가지고 있다.

  //생성자
  public Korean(String n, String s) {
    name = n; //따라서 외부에서 받아서
    ssn = s; //필드에 저장할 수 있도록 한다.
  }

  //매개변수와 필드의 변수명이 같을땐,
  //매개변수가 우선적으로 사용된다.
  //name = name <= 매개변수에 매개변수 저장하는 것과 같음
  //그래서 this.를 사용한다. => 내가 가지고 있는 필드
  //나의 필드에 있는 this.를 사용해라!

  /*public Korean(String name, String ssn) {
	  this.name = name;
	  this.ssn = ssn;
	}*/
}

