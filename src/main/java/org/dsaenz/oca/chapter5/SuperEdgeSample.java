package org.dsaenz.oca.chapter5;
import static java.lang.System.out;

public class SuperEdgeSample {
        public static void main(String[] args) {
                // when print is called first time (from A constructor), i has
                // not been initialized (because we are still initializing A at
                // this point), so its default value i.e. 0 is printed
                A a = new B();
                a.print();
        } // 0 4
}

class A {
        A() { print(); }
        void print() { out.print("A"); }
}

class B extends A {
        int i = 4;
        void print() { out.print(i); }
}
