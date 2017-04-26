package org.dsaenz.oca.chapter4;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class LambdaSample {
        public static boolean checkList(List list, Predicate<List> p) {
                return p.test(list);
        }

        public static void main(String[] args) {
                // error: incompatible types: incompatible parameter types in lambda expression
                // boolean b = checkList(new ArrayList(), (ArrayList a) -> a.add("hello"));

                List a;

                // EXTRA CARE: a lambda expression does not create a new scope
                // for variables. Therefore, you cannot reuse the variable names
                // that have already been used to define new variables in your
                // argument list

                // error: variable a is already defined in method main(String[])
                //boolean b = checkList(new ArrayList(), (List a) -> a.add("hello"));

                // warning: [unchecked] unchecked call to add(E) as a member of the raw type List
                boolean b = checkList(new ArrayList(), (List x) -> x.add("hello"));
                System.out.println(b);
        }
}
