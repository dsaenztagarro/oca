package org.dsaenz.oca.chapter3;

import static java.lang.System.out;

public class StringPool {
        public static void main(String args) {
                String s = "Hello";
                String ss = "Hell" + "o";
                // Strings computed by constant expressions are computed at
                // compile time and then treated as if they were literals
                out.println(s == ss); // true

                // public String intern()
                // Returns a canonical representation for the string object.
                //
                // A pool of strings, initially empty, is maintained privately by the
                // class String.
                //
                // When the intern method is invoked, if the pool already contains a
                // string equal to this String object as determined by the
                // equals(Object) method, then the string from the pool is returned.
                // Otherwise, this String object is added to the pool and a reference
                // to this String object is returned.
                //
                // It follows that for any two strings s and t,
                // s.intern() == t.intern() is true if and only if s.equals(t) is true.
                //
                // Returns:
                //
                // a string that has the same contents as this string, but is
                // guaranteed to be from a pool of unique strings.

                String x = "Hel";
                String y = "lo";
                String xy = new String(x + y);
                out.println(s == xy); // false
                out.println(x == xy.intern()); // true
        }
}
