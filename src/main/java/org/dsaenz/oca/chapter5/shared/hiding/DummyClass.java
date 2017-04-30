package org.dsaenz.oca.chapter5.shared.hiding;

public class DummyClass implements DummyInterface {
        int location = 200;
        public void setLocation(int location) { this.location = location; }
        public int getLocation() { return location; }
}
