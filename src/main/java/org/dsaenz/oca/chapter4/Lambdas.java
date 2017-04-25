package org.dsaenz.oca.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public final class Lambdas {
        public static void main(String[] args) {
                ArrayList<Animal> list = new ArrayList<>();
                list.add(new Animal("Bo", true));
                list.add(new Animal("DjBo", true));
                list.add(new Animal("Miau", false));

                System.out.println("*** Print can swim");
                print(list, (Animal a) -> { return a.canSwim(); });

                System.out.println("*** Remove can swim");
                // integration OCA exam
                list.removeIf(a -> a.canSwim());

                printAll(list);
        }

        public static void print(ArrayList<Animal> list, Predicate<Animal> checker) {
                for (Animal a : list)
                        if (checker.test(a))
                                System.out.println(a.getName());
        }

        public static void printAll(List<Animal> list) {
                System.out.println("*** Print all");
                for (Animal a : list)
                        System.out.println(a);
        }
}

class Animal {
        private String name;
        private String race;
        private boolean canSwim;

        public Animal(String name, boolean canSwim) {
                this.name = name;
                this.canSwim = canSwim;
        }

        public String toString() {
                return name;
        }

        public String getName() {
                return name;
        }

        public boolean canSwim() {
                return canSwim;
        }
}
