package ch3.ch3_08;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("Animal moves.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("Human moves.");
    }

    public void readBook() {
        System.out.println("Human reads book.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("Tiger jumps.");
    }

    public void hunt() {
        System.out.println("Tiger hunts.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("Eagle flies.");
    }

    public void hunt() {
        System.out.println("Eagle hunts.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal h = new Human();
        Animal t = new Tiger();
        Animal e = new Eagle();

        AnimalTest test = new AnimalTest();
        // 상위 클래스로 자동 형변환이 됨.
        test.moveAnimal(h);
        test.moveAnimal(t);
        test.moveAnimal(e);

        System.out.println("--------------------------------");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(h);
        animals.add(t);
        animals.add(e);

        for (Animal animal : animals) {
            animal.move();
        }

        System.out.println("--------------------------------");
        test.testDownCasting(animals);
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            }
            else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunt();
            }
            else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.hunt();
            }
            else {
                System.out.println("Unsupported type of animal");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
