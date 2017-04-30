package org.dsaenz.oca.chapter5;
import org.dsaenz.oca.chapter5.shared.hiding.*;
import static java.lang.System.out;

public class HidingWithPackages {
        public static void main(String[] args) {
                DummyInterface d = new DummyClass(); d.setLocation(220);
                out.println(d.getLocation()); // 220
                out.println(d.location);      // 0
                out.println(d.getClass());    // class org.dsaenz.oca.chapter5.shared.hiding.DummyClass

                DummyClass dd = new DummyClass(); dd.setLocation(220);
                out.println(dd.getLocation()); // 220
                out.println(dd.getClass());    // class org.dsaenz.oca.chapter5.shared.hiding.DummyClass
                // error: location is not public in DummyClass; cannot be accessed from outside package
                // out.println(dd.location);
        }
}
