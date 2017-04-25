package org.dsaenz.oca.chapter4;

public final class Return {
        public static void main(String[] args) {
                Alien a = new Alien();
                a.doSomething();

                a.look(true);
        }
}


// error: class Alien is public, should be declared in a file named Alien.java
// public class Alien {
class Alien {
        public void doSomething() {
                System.out.println("watch");
                return;
                // error: unreachable statement
                // System.out.println("run");
        }

        public void look(boolean isDark) {
                if (isDark) {
                        // error: incompatible types: unexpected return value
                        // return null;

                        return;
                }
                // else
                        // return;
                // error: unreachable statement
                System.out.println("run");
        }
}
