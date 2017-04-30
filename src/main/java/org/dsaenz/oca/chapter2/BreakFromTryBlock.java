package org.dsaenz.oca.chapter2;

public class BreakFromTryBlock {
        public static void main(String[] args) {
                block: {
                        try {
                                do {
                                        break block;
                                } while(true);
                        } finally {
                                System.out.println("finally called"); // called
                        }
                }
                System.out.println("after block"); //called
        }
}
