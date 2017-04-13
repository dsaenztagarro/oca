package org.dsaenz.oca.chapter4;

public class VarArgsSample {
        public static void main(String[] args) {
                VarArgsTest test = new VarArgsTest();
                System.out.println(test.howMany(true, true, true)); // => 2
                boolean[] list = { true, true };
                System.out.println(test.howMany(true, list)); // => 2
                // error: illegal start of expression
                // System.out.println(test.howMany(true, { true, true }));
        }
}

class VarArgsTest {
        public int howMany(boolean b, boolean... b2) {
                return b2.length;
        }
}
