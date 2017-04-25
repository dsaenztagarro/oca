package org.dsaenz.oca.chapter1;

import java.util.Arrays;
import java.util.List;

class Wrappers {
        public static void main(String[] args) {
                List<String> list = Arrays.asList("True", "true", "False", "other");
                for (String s : list)
                        System.out.println(new Boolean(s)); // true true false false

                System.out.println(!new Boolean(null)); // true
        }
}
