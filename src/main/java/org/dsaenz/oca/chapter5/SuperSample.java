package org.dsaenz.oca.chapter5;

import java.io.FileNotFoundException;

public class SuperSample {
        // Automatically called from subclass!!
        // Default implementation not available since we implemented
        // SuperSample(int age) constructor
        public SuperSample() {
                System.out.println("call super constructor");
        }

        protected Object getReference() throws FileNotFoundException {
                return null;
        }

        public SuperSample(int age) {
                System.out.println(age);
        }

        private void fly() {
                System.out.println("SuperSample is flying");
        }


        public static void main(String[] args) {
                SuperSample obj = new Sample();
                obj.fly(); // PRIVATE hided method accessible!
                ((Sample)obj).fly();
                ((Sample)obj).getReference();
        }
}

class Sample extends SuperSample {
        public Sample() {
                // When missing SuperSample() constructor:
                // error: constructor SuperSample in class SuperSample cannot be applied to given types;
                System.out.println("call Sample constructor");
        }

        // Override public/protected instance method
        // 1. (return type: covariant type)
        // 2. Relax method visibility (protected -> public)
        // 3. Relax declared Exceptions (even not declarations!)
        public String getReference() {
                return "reference";
        }

        // Hiding private instance method
        // It doesn't apply overriding rules
        protected void fly() {
                System.out.println("Sample is flying");
        }
}
