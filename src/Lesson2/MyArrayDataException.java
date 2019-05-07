package Lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int a, int b) {
        System.err.println("In the cell " + a + "" + b + " invalid character entered");
    }

}
