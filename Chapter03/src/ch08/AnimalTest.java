package ch08;

import java.util.ArrayList;

// Animal 이란 상위 클래스를 만듬
class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

    }
}

// Animal(상위) 클래스가 Human(하위) 클래스에게 상속한다.
class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

// Animal(상위) 클래스가 Tiger(하위) 클래스에게 상속한다.
class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

// Animal(상위) 클래스가 Eagle(하위) 클래스에게 상속한다.
class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }

    public void flying() {
        System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        /* test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal); */

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for( Animal animal : animalList ) {
            animal.move();
        }
        test.testDownCasting(animalList);
    }

    // 다운캐스팅(DownCasting) 구현
    public void testDownCasting(ArrayList<Animal> list) {
        for( int i = 0; i < list.size(); i++ ) {
            Animal animal = list.get(i);

            if( animal instanceof Human ) {
                Human human = (Human) animal;
                human.readBook();
            }
            else if( animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            else if( animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }
            else {
                System.out.println("unsupported type");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
