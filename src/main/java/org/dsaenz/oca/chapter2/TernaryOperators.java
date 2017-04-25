package org.dsaenz.oca.chapter2;

import static java.lang.System.out;

// Operator precedence
// Ternary operators > Assignment operators
public class TernaryOperators {
        public static void main(String[] args) {
                String tiger = "Tiger";
                String lion = "Lion";
                // error: unexpected type
                // required: variable
                // found: value
                // final String statement = 250 > 360 ? lion : tiger = "is Bigger";
                final String statement = 250 > 360 ? lion : (tiger = "is Bigger");
                out.println(statement);

                TernaryOperators t = new TernaryOperators();
                // data types of the two expresions on the right-hand side of
                // the equation can be completely different
                out.println("Here you get " + (true ? "a string" : 2));
                out.println("Here you get " + (false ? "a string" : 2));
        }
}
