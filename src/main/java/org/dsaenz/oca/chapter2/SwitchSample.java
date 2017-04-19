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
                        default:
                                System.out.println("Weekday");
                        case 0:
                                System.out.println("Sunday");
                        case 6:
                                System.out.println("Saturday");
                        case 7:
                                System.out.println("Holidays");
                }

                /* Output
                 *
                 * Weekday
                 * Sunday
                 * Saturday
                 * Holidays
                 */

                switch(dayOfWeek) {
                        case 0:
                                System.out.println("Sunday");
                        case 6:
                                System.out.println("Saturday");
                        case 7:
                                System.out.println("Holidays");
                        default:
                                System.out.println("Weekday");
                }

                /* Output
                 *
                 * Weekday
                 */

        }
}
