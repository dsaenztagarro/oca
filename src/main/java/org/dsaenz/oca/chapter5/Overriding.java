package org.dsaenz.oca.chapter5;

import static java.lang.System.out;

// Remember: variables are SHADOWED and methods are OVERRIDEN

public class Overriding {
}

class Animal {
        private String sleep() { return "animal sleep"; }
        String dream() { return "animal dream"; }
        protected String walk() { return "animal walk"; }
        public String run() { return "animal run"; }

        public static void main(String[] args) {
                Animal a = new Dog(); // no required cast
                Dog dog = (Dog)a;     // cast to more specific

                out.println(a.sleep());    // animal sleep
                out.println(a.dream());    // dog dream
                out.println(a.walk());     // dog walk; option: animal walk
                out.println(a.run());      // dog run
                out.println(a.search());   // animal static search
                out.println(a.find());     // animal static find
                out.println(dog.sleep());  // dog sleep
                out.println(dog.dream());  // dog dream
                out.println(dog.walk());   // dog walk; option: animal walk
                out.println(dog.run());    // dog run
                out.println(dog.search()); // dog static search
                out.println(dog.find());   // dog static find
        }

        protected static String search() { return "animal static search"; }
        public static String find() { return "animal static find"; }
}

class Dog extends Animal {
        // error: method does not override or implement a method from a supertype
        // @Override
        protected String sleep() { return "dog sleep"; } // hiding!
        @Override
        String dream() { return "dog dream"; }
        // error: walk() in Dog cannot override walk() in Animal
        // attempting to assign weaker access privileges; was protected
        // @Override
        // String walk() { return "dog walk"; }
        @Override
        protected String walk() { return "dog walk"; }
        // Option:
        // protected String walk() { return super.walk(); }
        @Override
        public String run() { return "dog run"; }

        protected static String search() { return "dog static search"; }
        public static String find() { return "dog static find"; }
        // error: method walk() is already defined in class Dog
        // public static String walk() {};
}
