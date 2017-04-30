package org.dsaenz.oca.chapter1;
import static java.lang.System.out;

class BooleanSample {
        public static void main(String[] args) {
                System.out.println(new java.lang.Boolean(true)); // true

                // When you use the equality operator (==) with booleans, if
                // exactly one of the operands is a Boolean wrapper, it is first
                // unboxed into a boolean primitive and then the two are
                // compared (JLS 15.21.2).
                // If both are Boolean wrappers, then their references are
                // compared just like in the case of other objects. Thus:

                out.println(new Boolean("true") == new Boolean("true")); // false
                out.println(new Boolean("true") == Boolean.parseBoolean("true")); // true
        }
}
