# 10. 추상 클래스의 응용 - 템플릿 메서드 패턴

## 템플릿 메서드

- 추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드

- final로 선언하여 하위 클래스에서 재정의 할 수 없게 함

- 프레임워크에서 많이 사용되는 설계 패턴

- 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의 하고 하위 클래스에서 

&nbsp;&nbsp;다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현 하도록 함

## 템플릿 메서드 예제 

![car](./img/car.png)

Car.java
```
public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
			
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
```

ManualCar.java
```
public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");		
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 정지합니다.");		
	}

}
```

AICar.java
```
public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");		
	}
}
```

CarTest.java
```
public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("=================");
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
```

![output](./img/out.png)


## final 예약어

- final 변수 : 값이 변경될 수 없는 상수

&nbsp;&nbsp; public static final double PI = 3.14;

- final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드

- final 클래스 : 상속할 수 없는 클래스 

## 여러 자바 파일에서 사용하는 상수 값 정의

Define.java
```
public class Define {

	public static final int MIN = 1;
	public static final int MAX = 999999;
	public static final double PI = 3.14;
	public static final String GREETING = "Good Morning!";
	public static final int MATH_CODE = 1001;
	public static final int CHEMISTRY_CODE = 1002;
	
}
```

UsingDefine.java
```
public class UsingDefine {

	public static void main(String[] args) {

		System.out.println(Define.GREETING);
		System.out.println(Define.MIN);
		System.out.println(Define.MAX);
		System.out.println(Define.MATH_CODE);
		System.out.println(Define.CHEMISTRY_CODE);
		System.out.println("원주률은" + Define.PI + "입니다.");
	}

}
```