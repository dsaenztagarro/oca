package org.dsaenz.oca.chapter5;

import static java.lang.System.out;

public class Interfaces {
        public static void main(String[] args) {
                RemoteDeveloper r = new RemoteDeveloper();
                r.now();
        }
}
// single inheritance
class Human {}
abstract class Developer extends Human implements IsAwesome {}
class RemoteDeveloper extends Developer {
        public void now() { System.out.println(THEME); };
        // attempting to assign weaker access privileges; was public
        // void now() { System.out.println(THEME); };
}

// multiple inheritance
interface IsAwesome extends CanType, CanLearn {
        String THEME = "Bazinga!";
        // error: illegal start of type
        // static { out.println("IsAwesome"); }
        // { out.println("IsAwesome"); }
}
abstract interface CanType {
        void now();
        default void type() { out.println("type"); } }
interface CanLearn {
        void now();
        default void learn() { out.println("learn"); } }
