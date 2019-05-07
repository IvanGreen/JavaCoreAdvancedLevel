package Lesson2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String text) {
        System.err.println(text);
    }
}
