package org.dsaenz.oca.chapter5;

public class Interfaces {
        public static void main(String[] args) {
                new Car().typeNow();
                CanType.type();
                // error: cannot assign a value to final variable field
                // CanType.field = "Myname";
                System.out.println(CanType.field);
        }
}

class Car implements CanType {
        private final String name = "Buzz";

        public void typeNow() {
                System.out.println(name + " is typing");
        }
}

interface CanType {
        // constant variable! (public static final)
        String field = "Test";

        static void type() {
                System.out.println("typing");
        }

        // error: method type() is already defined in interface CanType
        // void type();
        void typeNow();
}
