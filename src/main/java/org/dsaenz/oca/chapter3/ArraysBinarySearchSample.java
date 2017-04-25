package org.dsaenz.oca.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysBinarySearchSample {
        public static void main(String... args) {
                // Array to list conversion
                List<String> list1 = Arrays.asList(args);
                for(String arg : list1)
                        System.out.println(arg);

                // ArrayList to Array conversion
                ArrayList<String> list2 = new ArrayList<>();
                list2.add("Mario");
                list2.add("Javier");

                System.out.println(Collections.binarySearch(list2, "Javier")); // -1
                Collections.sort(list2);
                System.out.println(Collections.binarySearch(list2, "Javier")); // 0
                System.out.println(Collections.binarySearch(list2, "Zuma")); // -3 ( - <expected index> - 1 )

                String[] stringArray = new String[3];
                for(int i = 0; i < stringArray.length; i++)
                        stringArray[i] = "unknown";

                // If the list fits in the specified array with room to spare (i.e., the array has
                // more elements than the list), the element in the array immediately following
                // the end of the collection is set to null. (This is useful in determining the
                // length of the list only if the caller knows that the list does not contain any
                // null elements.)
                Object[] objectArray = list2.toArray(stringArray);
                for (int i = 0; i < objectArray.length; i++) {
                        System.out.println("objectArray[" + i + "] = " + objectArray[i]);
                }

                String[] objectArray2 = list2.toArray(stringArray);
                for (int i = 0; i < objectArray2.length; i++) {
                        System.out.println("objectArray2[" + i + "] = " + objectArray2[i]);
                }

                System.out.println(objectArray2);

                ArrayList<String> list3 = new ArrayList<>();
                list3.addAll(Arrays.asList("Mario", "Javier"));
                System.out.println(list3.equals(list2));
                System.out.println(list3.equals(list3));
                System.out.println(list3 == list3);
        }
}
