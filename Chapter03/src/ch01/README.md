# 01. 객체 간의 상속은 어떤 의미일까?

## 클래스 상속

- 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속(inheritance) 받아서 속성이나 기능을 확장하여 클래스를 구현함

- 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할때 기존 클래스를 상속함 

![inheritance](./img/inheritance.png)

    상속하는 클래스 : 상위 클래스, parent class, base class, super class

    상속받는 클래스 : 하위 클래스, child class, derived class, subclass

- 상속의 문법

class B extends A{

    
}
  
    extends 키워드 뒤에는 단 하나의 클래스만 올 수 있음
    
    자바는 단일 상속(single inheritance)만을 지원함

## 상속을 구현 하는 경우
 
 - 상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가짐

 - 하위 클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가짐

 - 하위 클래스가 상위 클래스의 속성과 기능을 확장 (extends)한다는 의미

![inheritance2](./img/inheritance2.png)

## 다음 강의
[02. 상속을 활용한 멤버십 클래스 구현하기](https://gitlab.com/easyspubjava/javacoursework/-/blob/master/Chapter3/3-02/README.md)
