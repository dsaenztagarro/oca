package org.dsaenz.oca.chapter5;
import static java.lang.System.out;

public class Interfaces {
        public static void main(String[] args) {
                RemoteDeveloper r = new RemoteDeveloper();
                r.now();
                CanType ct = (CanType)r; out.println(ct.VALUE);
                CanLearn cl = (CanLearn)r; out.println(cl.VALUE);
        }
}
// single inheritance
class Human {}
// (1) error: class Developer inherits unrelated defaults for never() from types CanType and CanLearn
abstract class Developer extends Human implements IsAwesome {}
class RemoteDeveloper extends Developer {
        public void now() { out.println(NOW); };
        public void never() { out.println("never"); }
        // attempting to assign weaker access privileges; was public
        // void now() { System.out.println(THEME); };
}

// (1) error: interface IsAwesome inherits unrelated defaults for never() from types CanType and CanLearn
// multiple inheritance
interface IsAwesome extends CanType, CanLearn {
        String NOW = "now";
        // error: illegal start of type
        // static { out.println("IsAwesome"); }
        // { out.println("IsAwesome"); }
}
abstract interface CanType {
        int VALUE = 1;
        void now();
        default void type() { out.println("type"); }

        // default void never() { out.println("never type"); } (1)
}
interface CanLearn {
        int VALUE = 2;
        void now();
        default void learn() { out.println("learn"); }
        // default void never() { out.println("never learn"); } (1)
}
