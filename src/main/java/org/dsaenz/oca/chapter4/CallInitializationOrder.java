package org.dsaenz.oca.chapter4;

import static org.dsaenz.oca.chapter4.ClassMethods.*;

import java.lang.invoke.MethodHandles;

public class CallInitializationOrder {
        public static void main(String[] args) {
                InitializationOrder init = new InitializationOrder("HitGirl");
        }
}

class InitializationOrder extends InitializationOrderParent {

        private static String className =
                MethodHandles.lookup().lookupClass().getName();

        private String name = "MainClass";

        {
                Printer.getInstancePrinter(className).print("count", COUNT);
                Printer.getInstancePrinter(className).print("name", name);
        }


        static { Printer.getStaticPrinter(className).print("count", COUNT); }

        static {
                COUNT += 10;
                Printer.getStaticPrinter(className).print("count", COUNT);
        }

        public InitializationOrder(String name) {
                // If no super() call is declared in a constructor, Java will
                // insert a no-argument super() as the first statement of the
                // constructor
                //
                // If parent doesn't define constructor without parameters then
                // this will not compile
                this.name = name;
                Printer.getInstancePrinter(className).print("constructor name", name);
                ClassMethods obj = new ClassMethods();
        }
}

class InitializationOrderParent {

        private static String className =
                MethodHandles.lookup().lookupClass().getName();

        private String name = "ParentName";

        protected static int COUNT = 0;

        {
                Printer.getInstancePrinter(className).print("count", COUNT);
                sayHello();
                Printer.getInstancePrinter(className).print("name", name);
        }

        static { Printer.getStaticPrinter(className).print("count", COUNT); }

        static {
                COUNT += 5;
                Printer.getStaticPrinter(className).print("count", COUNT);
        }

        public InitializationOrderParent() {
                Printer.getInstancePrinter(className).print("constructor name", name);
        }

        public InitializationOrderParent(String field) {
                Printer.getInstancePrinter(className).print("constructor name", name);
        }
}

class Printer {
        private String className;
        private String scope;

        private Printer(String className, String scope) {
                this.className = className;
                this.scope = scope;
        }

        public static Printer getStaticPrinter(String className) {
                return new Printer(className, "static");
        }

        public static Printer getInstancePrinter(String className) {
                return new Printer(className, "instance");
        }

        void print(String field, int value) {
                print(field, Integer.toString(value));
        }

        void print(String field, String value) {
                String message =
                        "[" + scope + "][" + className + "] " + field + ": " + value;
                System.out.println(message);

        }
}

// Output:
//
// [static][org.dsaenz.oca.chapter4.InitializationOrderParent] count: 0
// [static][org.dsaenz.oca.chapter4.InitializationOrderParent] count: 5
// [static][org.dsaenz.oca.chapter4.InitializationOrder] count: 5
// [static][org.dsaenz.oca.chapter4.InitializationOrder] count: 15
// [instance][org.dsaenz.oca.chapter4.InitializationOrderParent] count: 15
// [instance][org.dsaenz.oca.chapter4.InitializationOrderParent] name: ParentName
// [instance][org.dsaenz.oca.chapter4.InitializationOrderParent] constructor name: ParentName
// [instance][org.dsaenz.oca.chapter4.InitializationOrder] count: 15
// [instance][org.dsaenz.oca.chapter4.InitializationOrder] name: MainClass
// [instance][org.dsaenz.oca.chapter4.InitializationOrder] constructor name: HitGirl

