package org.dsaenz.oca.chapter3;

import java.util.Arrays;
import java.util.List;

public class ArraysEqualSample {
        public static void main(String[] args) {
                String[] array1 = { "Javier", "Mario", "Ivan" };
                String[] array2 = { "Javier", "Mario", "Ivan"};

                System.out.println(array1.equals(array2)); // false
                System.out.println(array1 == array2);      // false
                System.out.println(array1.length);         // 3

                // java.util.AbstractList
                //
                // public boolean equals(Object o)
                //
                // Compares the specified object with this list for equality. Returns true if and
                // only if the specified object is also a list, both lists have the same size, and
                // all corresponding pairs of elements in the two lists are equal. (Two elements
                // e1 and e2 are equal if (e1==null ? e2==null : e1.equals(e2)).) In other words,
                // two lists are defined to be equal if they contain the same elements in the same
                // order.
                //
                // This implementation first checks if the specified object is this list. If so,
                // it returns true; if not, it checks if the specified object is a list. If not,
                // it returns false; if so, it iterates over both lists, comparing corresponding
                // pairs of elements. If any comparison returns false, this method returns false.
                // If either iterator runs out of elements before the other it returns false (as
                // the lists are of unequal length); otherwise it returns true when the iterations
                // complete.

                List<String> list1 = Arrays.asList("David", "Blanca");
                List<String> list2 = Arrays.asList("David", "Blanca");
                List<String> list3 = Arrays.asList("Blanca", "David");

                System.out.println(list1.equals(list2)); // true
                System.out.println(list1.equals(list3)); // false
                System.out.println(list1 == list2);      // false
                System.out.println(list1.size());        // 2
        }
}
