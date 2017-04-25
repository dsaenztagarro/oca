package org.dsaenz.oca.chapter4;
import static java.lang.System.out;

public final class InitializerBlocks {
        public static void main(String[] args) {
                { out.println("block main"); }
                out.println(new Dummy("Kelly").getName());
        }
}

class Dummy {
        // error: variable species might not have been initialized
        // static final String species;
        // error: cannot assign a value to final variable species
        // { species = "Raptor"; }

        // error: unreachable statement (see 1)
        String name; { out.println("instance block 1"); }

        public Dummy(String name) {
                this.name = name;
                // nested initialization blocks
                { { { out.println("instance block 3"); } } } }

        { out.println("instance block 2"); }

        public String getName() {
                { out.println("instance block 4"); return name; } }

        static { field1 = getValue("field1", "value1"); }
        static final String field1;
        static { out.println("static block after field1"); }
        static final String field2 = getValue("field2", "value2");
        static { out.println("static block after field2"); }

        // error: initializer must be able to complete normally (1)
        // static { throw new NullPointerException(); }

        // Exception in thread "main" java.lang.ExceptionInInitializerError
        // Caused by: java.lang.NullPointerException
        // static { if (field1 != null) throw new NullPointerException(); }

        public static String getValue(String field, String value) {
                out.println("static " + field + " " + value); return value; }
}
