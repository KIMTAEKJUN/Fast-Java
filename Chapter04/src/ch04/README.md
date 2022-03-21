# 04. Class 클래스 사용하기

## Class 클래스

- 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨

- Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됨

- Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함

```
Class c = Class.forName("java.lang.String");
```

- 클래스 이름으로 직접 Class 클래스 가져오기
```
Class c = String.class;
```

- 생성된 인스턴스에서 Class 클래스 가져오기
```
String s = new String();
Class c = s.getClass();  //Object 메서드
```

## 동적 로딩

- 컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime) 중에 데이터 타입을 binding 하는 방법

- 프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에 원하는 클래스를 로딩하여 binding 할 수 있다는 장점

- 컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램의 심각한 장애가 발생가능


## Class의 newInstance()메서드로 인스턴스 생성

- new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스를 생성할 수 있음

## 클래스 정보 알아보기

- reflection 프로그래밍 : Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드)등을 알 수 있고 인스턴스를 생성하고, 
메서드를 호출하는 방식의 프로그래밍

- 로컬 메모리에 객체 없는 경우, 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용

- java.lang.reflect 패키지에 있는 클래스를 활용하여 프로그래밍

- 일반적으로 자료형을 알고 있는 경우엔 사용하지 않음

StringTest.java
```
public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c3 =  Class.forName("java.lang.String");
		
		Constructor<String>[] cons =  c3.getConstructors();
		for(Constructor con: cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = c3.getMethods();
		for(Method  method : methods) {
			System.out.println(method);
		}
	}

}
```

Person.java
```
public class Person {
	private String name;
	private int age;
	
	public Person() {};
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name;
	}
}
```

ClassTest.java

```
public class ClassTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
						ClassNotFoundException, NoSuchMethodException, SecurityException {
		Person person = new Person("James");
		System.out.println(person);
		
		Class c1 = Class.forName("ch04.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"김유신"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
	}
}
```





