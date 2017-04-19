package org.dsaenz.oca.chapter3;

import java.util.Arrays;
import java.util.List;

public class ArraysEqualSample {
        public static void main(String[] args) {
                String[] array1 = { "Javier", "Mario", "Ivan" };
                String[] array2 = { "Javier", "Mario", "Ivan"};

                System.out.println(array1.equals(array2));
                System.out.println(array1 == array2);
                System.out.println(array1.length);

                List<String> list1 = Arrays.asList("David", "Blanca");
                List<String> list2 = Arrays.asList("David", "Blanca");

                System.out.println(list1.equals(list2));
                System.out.println(list1 == list2);
                System.out.println(list1.size());
        }
}

/* Output
 *
 * false
 * false
 * 3
 * true
 * false
 * 2
 */
