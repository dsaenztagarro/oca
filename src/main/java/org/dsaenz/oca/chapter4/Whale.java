package org.dsaenz.oca.chapter4;

public abstract class Whale {

        // error: dive(int) in Orca cannot override dive(int) in Whale
        // public abstract int dive(int depth);

        public abstract void dive(int depth);

        public static void main(String[] args) {
                // Using abstract class like an interface
                Whale whale = new Orca();
                whale.dive(3);
        }
}

class Orca extends Whale {
        public void dive(int depth) {
                System.out.println("Orca diving");
        }
}
