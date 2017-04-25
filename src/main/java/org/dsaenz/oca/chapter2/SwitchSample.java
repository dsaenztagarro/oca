package org.dsaenz.oca.chapter2;

public class SwitchSample {
        public static void main(String[] args) {
                int dayOfWeek = 11;
                switch(dayOfWeek) {
                        // Once a branch is matched, all branches from that
                        // point are executed until a break is found.
                        //
                        // Because no case matches, we run the "default" case,
                        // and then all cases after default, until break is
                        // found.
                        default: System.out.print("Weekday");
                        case 0: System.out.print("Sunday");
                        case 6: System.out.print("Saturday");
                        case 7: System.out.print("Holidays");
                } // Output: Weekday Sunday Saturday Holidays

                switch(dayOfWeek) {
                        case 0: System.out.print("Sunday");
                        case 6: System.out.print("Saturday");
                        case 7: System.out.print("Holidays");
                        default: System.out.print("Weekday");
                } // Output: Weekday

                switch(dayOfWeek) {} // empty switch

                // integral type
                // enum
                // string
                switch(dayOfWeek) {
                        // empty valid cases in a row
                        default: case (int)'a': case 2*3: case 5:
                        // error: duplicate case label
                        // case 5:
                        case 3: System.out.print("3");
                }
        }
}
