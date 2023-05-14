package ch3.ch3_06;

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
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
