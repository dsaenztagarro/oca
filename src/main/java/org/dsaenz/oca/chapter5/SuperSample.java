package org.dsaenz.oca.chapter5;
import java.io.FileNotFoundException;
import static java.lang.System.out;

public class SuperSample {}

class Frog {
        // Automatically called from subclass!!
        // Default implementation not available since we implemented
        // Frog(int age) constructor
        public Frog() { out.println("constructor frog"); }
        public Frog(int age) { out.println(age); }

        protected Object getReference() throws FileNotFoundException { return null; }
        private void fly() { out.println("frog fly"); }

        public static void main(String[] args) {
                Frog obj = new Tadpole();
                obj.fly(); // PRIVATE hided method accessible!
                ((Tadpole)obj).fly();
                ((Tadpole)obj).getReference();
        }
}

class Tadpole extends Frog {
        private String name = "TADPOLE";
        public Tadpole() {
                // When missing Frog() constructor:
                // error: constructor Frog in class Frog cannot be applied to given types;
                out.println("constructor tadpole");
        }

        // Override public/protected instance method
        // 1. (return type: covariant type)
        // 2. Relax method visibility (default > protected > public)
        // 3. More concrete Exception or no declarations
        public String getReference() { out.println(name + " reference"); return null; }

        // Hiding private instance method
        // It doesn't apply overriding rules
        protected void fly() { out.println(name + " fly"); }
}
