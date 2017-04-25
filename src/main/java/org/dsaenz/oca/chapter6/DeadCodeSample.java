package org.dsaenz.oca.chapter6;

import java.io.IOException;

class DeadCodeSample {
        private void split() throws HurtException {}

        public static void main(String[] args) {
                try {
                        new DeadCodeSample().split();
                } catch (HurtException error) {
                } catch (Exception error) {}

                // warning: unreachable catch clause
                // thrown type HurtException has already been caught
                // } catch(LimpException error) {}

                // error: exception IOException is never thrown in body of corresponding try statement
                // } catch (IOException error) {}
        }
}

class LimpException extends Exception {}
class HurtException extends LimpException {}
