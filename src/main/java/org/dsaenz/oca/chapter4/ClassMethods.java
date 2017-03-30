package org.dsaenz.oca.chapter4;

import java.lang.invoke.MethodHandles;

public class ClassMethods {

        private static String className =
                MethodHandles.lookup().lookupClass().getName();

        private String name = "ClassMethodName";

        private static int COUNT = 0;

        {
                Printer.getInstancePrinter(className).print("count", COUNT);
                Printer.getInstancePrinter(className).print("name", name);
        }

        static { Printer.getStaticPrinter(className).print("count", COUNT); }

        public static void sayHello() {
                System.out.println("Hello world!");
        }
}
