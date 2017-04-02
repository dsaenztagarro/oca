package org.dsaenz.oca.chapter6;

import java.lang.Error;
import java.lang.Exception;
import java.lang.RuntimeException;

/*
 * Checked exceptions: throwed by developer
 * Unchecked exceptions:
 *  - IllegalArgumentException, NumberFormatException: throwed by developer
 *  - Others: throwed by JVM
 * Errors: throwed by JVM
 *
 * System.exit(0) skips finally
 */

public class Sample {
        public static void main(String[] args) throws Exception {
                try {
                        MyClass obj = new MyClass();
                        new MyClass().otherMethod(); // COMPILE
                        obj.myMethod(); // main must declare or catch Exception
                        obj.otherMethod();
                } catch (RuntimeException error) {
                        System.out.println("RuntimeException catched!");
                } catch (Error error) {
                        System.out.println("Error catched!");
                } catch (MyException error) {
                }
        }
}

class MyException extends Exception {
}

class MyClass {
        public void myMethod() throws Error, Exception, RuntimeException {
                throw new Error();
        }

        public void otherMethod() {
                throw new RuntimeException();
        }
}
