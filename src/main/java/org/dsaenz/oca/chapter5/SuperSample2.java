package org.dsaenz.oca.chapter5;

public class SuperSample2 {
        public static void main(String[] args) {
                Rectangle r = new Rectangle(10, 20, 1),
                          r2 = new Rectangle(10, 20);
        }
}

class Shape {
        public Shape() {
                System.out.println("Shape init");
        }
}

class Rectangle extends Shape {
        private int width, height, color;

        public Rectangle(int width, int height, int color) {
                this(width, height);
                this.color = color;
                System.out.println("Rectangle init (3 args)");
        }

        public Rectangle(int width, int height) {
                this.width = width;
                this.height = height;
                System.out.println("Rectangle init (2 args)");
        }
}

/* Output:
 *
 * Shape init
 * Rectangle init (2 args)
 * Rectangle init (3 args)
 * Shape init
 * Rectangle init (2 args)
 */


