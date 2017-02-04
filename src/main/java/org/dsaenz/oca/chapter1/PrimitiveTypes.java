package org.dsaenz.oca.chapter1;

class PrimitiveTypes {
        // 8 primitive types
        boolean bVal;
        byte byteVal; // 8 bit integral value
        short sVal;
        int iVal;
        long lVal;
        float fVal;
        double dVal;
        char cVal; // 16 bit unicode value

        public PrimitiveTypes() {

        }

        public static void main(String[] args) {
                PrimitiveTypes test = new PrimitiveTypes();
                System.out.println(">> Default values");
                System.out.println(test.bVal);
                System.out.println(test.dVal);

                System.out.println(">> Examples");
                test.lVal = 0x1_3 + 0_1_0 - 2;
                System.out.println(test.lVal); // 19 + 8 - 2 = 25
                test.cVal = 98;
                test.iVal = 'a';
                System.out.println(test.cVal); // b
                System.out.println(test.iVal); // 97 (ascii table)
                System.out.println(test.iVal * 10); // 970
                System.out.println(test.cVal * 10); // 980
                test.fVal = (float)3.4; // cast needed
                test.fVal = 3.1F * 2;

                System.out.println(test.fVal);

                // error: incompatible types: possible lossy conversion from double to float
                // test.fVal = 3.1F * 2.2;

                test.dVal = 3.1F * 2.2;
                System.out.println(test.dVal); // 6.819999790191651
                test.iVal = (int)2f;
        }
}
