# 04. 메서드 재정의하기(overring)

## 하위 클래스에서 메서드 재정의 하기

- 오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 
하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음 

- VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음

- 재정의 하여 구현해야 함

VIPCustomer.java
```
@Override
public int calcPrice(int price) {
	bonusPoint += price * bonusRatio;
	return price - (int)(price * salesRatio);
}
```

## @overriding 애노테이션 (annotation)

- 애노테이션은 원래 주석이라는 의미

- 컴파일러에게 특별한 정보를 제공해주는 역할 

![annotation](./img/annotation.png)

- @overriding 애노테이션은 재정의 된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러가 남



## 형 변환과 오버라이딩 메서드 호출

   Customer vc = new VIPCustomer();

   vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 임
   
   자바에서는 항상 인스턴스의 메서드가 호출 됨 (가상메서드의 원리)

   자바의 모든 메서드는 가상 메서드(virtual method) 임

CustomerTest.java
```
public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
		
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		int priceNo = customerNo.calcPrice(10000);
		System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo  + "원 입니다.");

	}
}
```