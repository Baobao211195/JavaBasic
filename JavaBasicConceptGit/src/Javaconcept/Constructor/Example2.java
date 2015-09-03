package Javaconcept.Constructor;


public class Example2 {

    public Example2() {
        // this(10); ----> error
    }
    public Example2(int i) {
        this();
    }
}
