package org.dsaenz.oca.chapter3;
import static java.lang.System.out;

public class StringConcatenation {
        public static void main(String[] args) {
                String String = "String"; // COMPILE
                out.println(String);
                // String concatenation cases
                out.println(null + "good"); // nullgood
                out.println("a" + 1 + 2); // a12
                out.println(1 + 2 + "a"); // 3a
                out.println('a' + 0);     // 97
                out.println('a' + 1 + 2 + "aaa"); // 100aaa
                out.println("a" + true + 2 + 'a'); //atrue2a

                // error: bad operand types for binary operator '+'
                // out.println('a' + true + 2 + "aaa");
                // out.println(1 + null + "good");
        }
}
