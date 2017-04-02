package org.dsaenz.oca.chapter4;

import java.lang.Override;
// error: method does not override or implement a method from a supertype
// When missing overridden method and Override annotation present

public class Inheritance extends Parent {
        // error: methodOne(int) in Inheritance cannot override methodOne(int) in Parent
        // Overriding method is static
        //
        // public static void methodOne(int i) {
        //         System.out.println("static: " + i);
        // }

        // Overrides method in super class
        @Override
        public void methodTwo(int i) {
                System.out.println("instance: " + i);
        }

        // error: methodThree(int) in Inheritance cannot override methodThree(int) in Parent
        // Overridden method is static
        //
        // public void methodThree(int i) {
        //         System.out.println("instance: " + i);
        // }

        // Hides method in super class
        public static void methodFour(int i) {
                // non-static variable super cannot be referenced from a static context
                // super.methodFour(i);
                System.out.println("static: " + i);
        }

        // error: methodFive() in Inheritance cannot override methodFive() in Parent
        // public void methodFive() {
        //         System.out.println("five");
        // }

        public static void main(String[] args) {
                Inheritance obj = new Inheritance();
                obj.methodOne(1);
                obj.methodTwo(2);
                Inheritance.methodThree(3);
                Inheritance.methodFour(4);
        }

}

class Parent {
        public void methodOne(int i) {
                System.out.println("instance (parent): " + i);
        }

        public void methodTwo(int i) {
                System.out.println("instance (parent): " + i);
        }

        public static void methodThree(int i) {
                System.out.println("static (parent): " + i);
        }

        public static void methodFour(int i) {
                System.out.println("static (parent): " + i);
        }

        public final void methodFive() {
                System.out.println("final five");
        }
}

// Output:
//
// instance (parent): 1
// instance: 2
// static (parent): 3
// static: 4

