package org.dsaenz.oca.chapter5;

public class SuperSample {
        // Automatically called from subclass!!
        // Default implementation not available since we implemented
        // SuperSample(int age) constructor
        public SuperSample() {
                System.out.println("call super constructor");
        }

        public SuperSample(int age) {
                System.out.println(age);
        }
}

class Sample extends SuperSample {
        public Sample() {
                // When missing SuperSample() constructor:
                // error: constructor SuperSample in class SuperSample cannot be applied to given types;
                System.out.println("Sample");
        }

        public static void main(String[] args) {
                new Sample();
        }
}
