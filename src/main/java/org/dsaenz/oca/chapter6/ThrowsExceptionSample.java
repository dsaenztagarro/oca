package org.dsaenz.oca.chapter6;

class MyException extends Exception {}

public class ThrowsExceptionSample {
        public static void main(String[] args) throws java.lang.Throwable {
                Animal a = new Animal(); a.method1();
        }

}

class Animal {
        public void method1() throws MyException { method2(); }
        public void method2() throws MyException { throw new MyException(); }
        private static void call1() {
                try { call2(); } catch (MyException e) {}
        }
        private static void call2() throws MyException { throw new MyException(); }

        // error: unreported exception MyException; must be caught or declared to be thrown
        // public void method2() { throw new MyException(); }
}
