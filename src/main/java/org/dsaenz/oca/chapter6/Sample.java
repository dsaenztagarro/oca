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
        // allow to declare all kind of exceptions
        public void call() throws Error, Exception, RuntimeException {
                // don't need to raise a declared exception
                throw new Error();
        }

        public void otherCall() { throw new RuntimeException(); }

        // error: unreported exception Exception; must be caught or declared to be thrown
        // public static void main(String[] args) {
        public static void main(String[] args) throws Exception {
                try {
                        Sample obj = new Sample();
                        obj.call();
                        obj.otherCall();
                } catch (RuntimeException error) {
                        System.out.println("RuntimeException catched!");
                } catch (Error error) {
                        System.out.println("Error catched!");
                } catch (MyException error) {
                }
        }
}

class MyException extends Exception {}
