package org.dsaenz.oca.chapter3;

import java.util.List;
import java.util.ArrayList;

/*
 * Compile with
 *
 * $ javac -Xlint:unchecked -sourcepath src/main/java -d build/src/main/java/ src/main/java/org/dsaenz/oca/chapter3/ArrayListGenerics.java
 */
public final class ArrayListGenerics {

        public static void main(String[] args) {
                // warning: [unchecked] unchecked conversion
                List<Integer> l = new ArrayList();

                List<Integer> l2 = new ArrayList<>();

                // warning: [unchecked] unchecked conversion
                ArrayList<Integer> l3 = new ArrayList();

                ArrayList<Integer> l4 = new ArrayList<>();
        }
}
