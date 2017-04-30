package org.dsaenz.oca.chapter3;
import static java.lang.System.out;

public class ArrayAssignmentSample {
        public static int getIndex() { throw new IllegalStateException(); }
        public static void main(String[] args) {
                try { int[] l1 = null; l1[getIndex()] = 0; } catch(Exception e) { e.printStackTrace(); }
                // java.lang.IllegalStateException
                //         at org.dsaenz.oca.chapter3.ArrayAssignmentSample.getIndex(ArrayAssignmentSample.java:5)
                //         at org.dsaenz.oca.chapter3.ArrayAssignmentSample.main(ArrayAssignmentSample.java:8)

                try { int[] l2 = null; l2[1] = 0; } catch(Exception e) { out.println(e); } // java.lang.NullPointerException
        }
}
