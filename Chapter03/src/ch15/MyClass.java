package ch15;

// Myinterface(상위) 클래스가 MyClass(하위) 클래스에게 상속한다.
public class MyClass implements Myinterface {
    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }
}
