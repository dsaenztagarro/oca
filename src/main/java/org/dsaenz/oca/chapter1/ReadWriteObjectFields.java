package org.dsaenz.oca.chapter1;

class ReadWriteObjectFields {
        String first = "Sir David";
        String last = "Saenz";
        String full;

        {
                System.out.println("initializer block 1");
                StringBuffer sb = new StringBuffer();
                sb.append(first.substring(2,5)).append(" ").append(last);
                full = sb.toString();
        }

        public ReadWriteObjectFields() {
                { System.out.println("initializer block 3"); }
                System.out.println("from constructor");
                { System.out.println("initializer block 4"); }

        }

        public void doSomething() {
                { System.out.println("initializer block 5"); }
        }

        public static void main(String[] args) {
                ReadWriteObjectFields obj = new ReadWriteObjectFields();
                System.out.println(obj.full);
                ReadWriteObjectFields obj2 = new ReadWriteObjectFields();
                System.out.println(obj2.full);
        }

        { System.out.println("initializer block 2"); }
}
