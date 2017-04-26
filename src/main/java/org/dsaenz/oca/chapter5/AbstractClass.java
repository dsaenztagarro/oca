package org.dsaenz.oca.chapter5;

// error: illegal combination of modifiers: abstract and final
// public final abstract class AbstractClass {

// error: modifier private not allowed here
// private abstract class AbstractClass {

public abstract class AbstractClass {
        // nor private nor final
        abstract void calculate();
        public static void main(String[] args) {
                System.out.println("calculating");
                AbstractClass x = null;
                // Exception in thread "main" java.lang.NullPointerException
                x.calculate();
        }
}
