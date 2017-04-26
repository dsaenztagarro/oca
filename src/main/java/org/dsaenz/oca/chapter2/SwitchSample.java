package org.dsaenz.oca.chapter2;
import static java.lang.System.out;

public class SwitchSample {
        public static void main(String[] args) {
                int dayOfWeek = 11;
                switch(dayOfWeek) {
                        // error: cannot find symbol
                        // default: if (b = false) { out.print("Weekday"); }

                        // Once a branch is matched, all branches from that
                        // point are executed until a break is found.
                        // Because no case matches, we run the "default" case,
                        // and then all cases after default, until break is
                        // found.
                        default: out.print("Weekday");
                        case 0: boolean b = false; out.print("Sunday");
                        // error: variable b might not have been initialized
                        // case 6: if (b) out.print("Saturday");
                        case 6: if (b = false) out.print("Saturday**");
                        case 7: out.print("Holidays");
                } // Output: Weekday Sunday Holidays

                out.println();

                switch(dayOfWeek) {
                        // error: cannot find symbol
                        // default: if (b = false) { out.print("Weekday1"); }
                        case 0: out.print("Sunday");
                        case 6: out.print("Saturday");
                        case 7: out.print("Holidays");
                        default: out.print("Weekday");
                } // Output: Weekday

                switch(dayOfWeek) {} // empty switch

                out.println();

                // integral type
                // enum
                // string
                switch(dayOfWeek) {
                        // empty valid cases in a row
                        default: case (int)'a': case 2*3: case 5:
                        // error: duplicate case label
                        // case 5:
                        case 3: out.print("3");
                }
        }
}
