package org.dsaenz.oca.chapter4.lambdas;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TraditionalSearchWithLambdas {
        public static void main(String[] args) {
                List<Animal> animals = new ArrayList<Animal>();
                animals.add(new Animal("fish", false, true));
                animals.add(new Animal("kangaroo", true, false));
                animals.add(new Animal("rabbit", true, false));
                animals.add(new Animal("turtle", false, true));

                print(animals, a -> a.canHop());
                print(animals, a -> { return a.toString() == "fish"; });
        }

        private static void print(List<Animal> animals, Predicate<Animal> checker) {
                for (Animal animal : animals) {
                        if (checker.test(animal)) {
                                System.out.print(animal + " ");
                        }
                }
                System.out.println();
        }
}
