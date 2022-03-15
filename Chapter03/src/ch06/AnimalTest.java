package ch06;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 움직입니다.");
    }
}

public class AnimalTest {
}
