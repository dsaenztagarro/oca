package org.dsaenz.oca.chapter4;

// COMPILE and RUN!
//
// java -cp build/src/main/java/ org.dsaenz.oca.chapter4.Reptile
abstract class Reptile {
        public final void layEggs() {
                System.out.println("Reptile laying eggs");
        }

        public static void main(String[] args) {
                Reptile reptile = new Lizard();
                reptile.layEggs();
        }
}

public class Lizard extends Reptile {
        // error: layEggs() in Lizard cannot override layEggs() in Reptile
        // public void layEggs() {
        //         System.out.println("Lizard laying eggs");
        // }
}
