package org.dsaenz.oca.chapter1;

public class LocalVariables {
        private static int plus10(int i) {
                // error: variable base might not have been initialized
                // int base;
                int base = 0;
                if (i > 10)
                        base = 10;
                return base + i;
        }

        public static void main(String args[]) {
                // compiler raise error even with value that initializes local variable
                System.out.println(plus10(20));
        }
}
