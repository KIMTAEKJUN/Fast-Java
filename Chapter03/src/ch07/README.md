# 07. 상속은 언제 사용 할까?

## IS-A 관계(is a relationship : inheritance)

- 일반적인(general) 개념과 구체적인(specific) 개념과의 관계

- 상위 클래스 : 하위 클래스보다 일반적인 개념 ( 예: Employee )
- 하위 클래스 : 상위 클래스보다 구체적인 개념들이 더해짐 ( 예: Engineer, Manager...)

- 상속은 클래스간의 결합도가 높은 설계 

- 상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음

- 계층구조가 복잡하거나 hierarchy가 높으면 좋지 않음

## HAS-A 관계(composition) 

- 클래스가 다른 클래스를 포함하는 관계 ( 변수로 선언 )

- 코드 재사용의 가장 일반적인 방법

- Student가 Subject를 포함하는

- Library를 구현할 때 ArrayList 생성하여 사용

- 상속하지 않음