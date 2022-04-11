# 06. 무엇이든 담을 수 있는 제네릭(Generic) 프로그래밍

## 제네릭 자료형 정의

- 클래스에서 사용하는 변수의 자료형이 여러개 일수 있고, 그 기능(메서드)은 동일한 경우 클래스의 자료형을 특정하지 않고

추후 해당 클래스를 사용할 때 지정 할 수 있도록 선언

- 실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식

- 컬렉션 프레임워크에서 많이 사용되고 있음

- 제네릭 타입을 사용하지 않는 경우의 예

재료가 Powder인 경우
```
public class ThreeDPrinter1{
	private Powder material;
	
	public void setMaterial(Powder material) {
		this.material = material;
	}
	
	public Powder getMaterial() {
		return material;
	}
}
```

재료가 Plastic인 경우
```
public class ThreeDPrinter2{
	private Plastic material;
	
	public void setMaterial(Plastic material) {
		this.material = material;
	}
	
	public Plastic getMaterial() {
		return material;
	}

}
```

- 여러 타입을 대체하기 위해 Object를 사용할 수 있음
```
public class ThreeDPrinter{

	private Object material;
	
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
}
```

- Object를 사용하는 경우는 형 변환을 하여야 함
```
ThreeDPrinter printer = new ThreeDPrinter();

Powder powder = new Powder();
printer.setMaterial(powder);

Powder p = (Powder)printer.getMaterial();
```

- 제네릭 클래스 정의

GenericPrinter.java
```
public class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString(){
		return material.toString();
	}
}
```
- 자료형 매개변수 T(type parameter) : 이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정, static 변수는 사용할 수 없음

- GenericPrinter<T> : 제네릭 자료형

- E : element, K: key, V : value 등 여러 알파벳을 의미에 따라 사용 가능

## 제네릭 클래스 사용하기

Powder.java
```
public class Powder {
	
	public String toString() {
		return "재료는 Powder 입니다";
	}
}
```

Plastic.java
```
public class Plastic {

	public String toString() {
		return "재료는 Plastic 입니다";
	}
}
```
GenericPrinter.java
```
public class GenericPrinter<T> {
	private T material;   //T 자료형으로 선언한 변수
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {   //T 자료형을 반환하는 제네릭 메서드
		return material;
	}
	
	public String toString(){
		return material.toString();
	}
}
```

GenericPrinterTest.java
```
public class GeneriPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);
		
	}

}
```

## 다이아몬드 연산자 <>

- <T>에서 <>를 다이아몬드 연산자라 함

- ArrayList<String> list = new ArrayList<>();  //다이아몬든 연산자 내부에서 자료형은 생략가능 함

- 제네릭에서 자료형 추론(자바 10부터)

	ArrayList<String> list = new ArrayList<String>()  => var list = new ArrayList<String>();


