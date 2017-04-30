package org.dsaenz.oca.chapter1;
import static java.lang.System.out;

public class NumbersSample {
        // void probe(Integer... x) { out.println("Integer ..."); }
        void probe(int... x) { out.println("In ..."); }
        void probe(Integer x) { out.println("In Integer"); } // (1) commented
        void probe(long x) { out.println("In long"); }
        // void probe(double x) { out.println("In double"); }
        void probe(Long x) { out.println("In Long"); }

        public static void main(String[] args) {
                Integer a = 4; new NumbersSample().probe(a); // In Integer; (1): In long
                int b = 4; new NumbersSample().probe(b);     // In long

                // probe(int) is bound to probe(long), then to probe(Integer)
                // because boxing and int gives you an Integer, which matches
                // exactly to probe(Integer), and then to probe(int...)
                //
                // It is never bound to probe(Long) because int is not compatible with Long

                short s = 12;
                long g = 012;
                // values of type boolean cannot be converted to any other type
                // int i = (int) false;
                float f = -123;
                out.println(f);

                // double cannot be implicitly narrowed to float
                // float d = 0 * 1.5;
                // float f = 1.0;
                // float f = 43e1;
        }
}
