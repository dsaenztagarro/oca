package org.dsaenz.oca.chapter5;
import static java.lang.System.out;

public class Hiding /* AKA shadowing */ {
        public static void main(String[] args) {
                C c = new C();
                // error: i has private access in B
                // out.println(c.i);
                out.println(((A)c).i); // 10
                // error: j has private access in A
                // out.println(c.j);
                out.println(c.k); // 40
        }
}

class A {
        public int i = 10;
        private int j = 20;
}
class B extends A {
        private int i = 30;
        public int k = 40;
}
class C extends B {}
