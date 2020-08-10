package sec05.exam05;

public class Person {
  //한번 값이 정해지면 바꿀 수 없음
  final String nation = "Korea"; //국적을 모두 korea라는 가정
  final String ssn; //주민번호, 사람마다 다름, 생성자에서 값을 받아야함
  String name;

  public Person(String ssn, String name) {
    this.ssn = ssn;
    this.name = name;
  }
}

