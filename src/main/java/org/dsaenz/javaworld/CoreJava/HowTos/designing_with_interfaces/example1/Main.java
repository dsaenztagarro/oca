package org.dsaenz.javaworld.CoreJava.HowTos.designing_with_interfaces.example1;

// A refresher on polymorphism
public class Main {
        public static void main(String[] args) {
                Animal animal = new Dog();
                Interrogator.makeItTalk(animal);
        }
}

abstract class Animal {
        abstract void talk();
}

class Dog extends Animal {
        void talk() {
                System.out.println("Woof!");
        }
}

class Cat extends Animal {
        void talk() {
                System.out.println("Meow");
        }
}

class Interrogator {
        static void makeItTalk(Animal subject) {
                subject.talk();
        }
}
