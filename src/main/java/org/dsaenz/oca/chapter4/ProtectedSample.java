package org.dsaenz.oca.chapter4;
import org.dsaenz.oca.chapter4.animal.*;

public class ProtectedSample {}

class Tadpole extends Frog {
        public static void main(String[] args) {
                Tadpole t = new Tadpole();
                t.ribbit();
                Frog f = new Tadpole();
                // EXTRA CARE:
                // error: ribbit() has protected access in Frog
                // f.ribbit();
        }
}

