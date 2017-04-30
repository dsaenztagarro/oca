package org.dsaenz.oca.chapter4;
import org.dsaenz.oca.chapter4.shared.*;

public class ProtectedSample {}

class Tadpole extends Frog {
        public static void main(String[] args) {
                Tadpole t = new Tadpole();
                t.ribbit();
                Frog f = new Tadpole();
                // EXTRA CARE: Out of the package, the protected method only
                // can be invoked by subclasses!!!
                //
                // error: ribbit() has protected access in Frog
                // f.ribbit();
        }
}

