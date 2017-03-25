package org.dsaenz.javaworld.CoreJava.HowTos.designing_with_interfaces.example3;

// The 'burden' of implementation inheritance
public class Main {
        public static void main(String[] args) {
                Apple apple = new Apple();
                Banana banana = new Banana();
                FoodProcessor.peelAnItem(apple);
                FoodProcessor.peelAnItem(banana);
        }
}

interface Peelable {
        int peel();
}

class Fruit {

        // Return int number of pieces of peel that resulted from the peeling
        // activity
        public int peel() {
                System.out.println("Peeling is appealing");
                return 1;
        }
}

class Apple implements Peelable {

        private Fruit fruit = new Fruit();

        public int peel() {
                return fruit.peel();
        }
}

class Banana implements Peelable {

        private Fruit fruit = new Fruit();

        public int peel() {
                return fruit.peel();
        }
}

class FoodProcessor {
        static void peelAnItem(Peelable item) {
                item.peel();
        }
}
