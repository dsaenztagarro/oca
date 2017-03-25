package org.dsaenz.javaworld.CoreJava.HowTos.designing_with_interfaces.example2;

// Getting more polymorphism
public class Main {
        public static void main(String[] args) {
                Animal animal = new Dog(), otherAnimal = new Cat();
                CuckooClock cc = new CuckooClock();
                Interrogator.makeItTalk(animal);
                Interrogator.makeItTalk(otherAnimal);
                Interrogator.makeItTalk(cc);
        }
}

interface Talkative {
        void talk();
}

abstract class Animal implements Talkative {
        abstract public void talk();
}

class Dog extends Animal {
        /* Without public modifier:
         * attempting to assign weaker access privileges; was public
         * src/main/java/org/dsaenz/javaworld/core_java/howto/designing_with_interfaces/example2/GettingMorePolymorphism.java:19: error: talk() in Dog cannot implement talk() in Talkative
         * void talk() {
         *      ^
         */
        public void talk() {
                System.out.println("Woof!");
        }
}

class Cat extends Animal {
        public void talk() {
                System.out.println("Meow");
        }
}

class CuckooClock implements Talkative {
        public void talk() {
                System.out.println("Cuckoo, cuckoo!");
        }
}

class Interrogator {
        static void makeItTalk(Talkative subject) {
                subject.talk();
        }
}
