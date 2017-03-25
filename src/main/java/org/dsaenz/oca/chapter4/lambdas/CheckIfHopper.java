package org.dsaenz.oca.chapter4.lambdas;

public class CheckIfHopper implements CheckTrait {
        public boolean test(Animal a) {
                return a.canHop();
        }
}
