package org.dsaenz.oca.chapter2;
import static java.lang.System.out;

public class AssignmentOperators {
        public static void main(String[] args) {
                int i, j, k;
                // Every expression has a value, in this case the value of the
                // expression is the value that is assigned to the right hand
                // side of the equation
                // k has a value of 9 which is assigned to j and i
                i = j = k = 9;
                out.println(i);

                int y = 5; y += ++y + y*2; out.println(y); // 23
                int z = 5; z += z*2 + ++z; out.println(z); // 21
        }
}
