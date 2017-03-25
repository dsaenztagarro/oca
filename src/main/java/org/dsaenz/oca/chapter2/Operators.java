package org.dsaenz.oca.chapter2;

public class Operators {
        public static void main(String[] args) {
                System.out.println("byte max value: " + Byte.MAX_VALUE);
                System.out.println("short max value: " + Short.MAX_VALUE);
                System.out.println("char max value (cast short): " + (short)Character.MAX_VALUE);
                System.out.println("char max value (cast int): " + (int)Character.MAX_VALUE);
                System.out.println("int max value: " + Integer.MAX_VALUE);
                // promotion to int even using casting
                System.out.println("short promotion to int: " + (((short)Short.MAX_VALUE) + ((short)2)));

                long maxLongValue = Long.MAX_VALUE;
                System.out.println("long max value: " + maxLongValue);
                System.out.println("long overflow: " + (maxLongValue + 1));
                System.out.println("long underflow: " + (Long.MIN_VALUE - 1));

                short n = 10;
                short m = 3;
                // error: incompatible types: possible lossy conversion from int to short
                // m = m + n;
                m += n;
                System.out.println("casting final int to short: " + m);
                boolean test = true & false ^ true;
                System.out.println(test);
        }
}
