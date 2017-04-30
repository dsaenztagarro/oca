package org.dsaenz.oca.chapter2;
import static java.lang.System.out;

public class For {
        // shadowing instance variable in loop
        public int i;
        public void call() {
                // int i = 2;
                // error: variable i is already defined in method call()
                //
                OUTER_BLOCK: {
                        // label LOOP already in use
                        // LOOP: {
                                LOOP: for(int i=0; i<10; i++) {
                                        INNER_BLOCK: out.print(i);
                                        INNER_BLOCK: { out.print(i); }
                                        // error: undefined label: INNER_BLOCK
                                        // if(i==5) break INNER_BLOCK;
                                        // error: undefined label: POST_LOOP
                                        // if(i==5) break POST_LOOP;
                                        if(i==5) break LOOP;
                                        if(i==5) break OUTER_BLOCK;
                                }
                                POST_LOOP: { out.println(); out.println("post loop"); }
                        // }
                }
        }
        public static void main(String[] args) {
                new For().call();
        }
}
