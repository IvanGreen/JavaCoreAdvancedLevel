package Lesson2;

import java.util.Random;


public class MainClass {

    public static void main(String[] args) {

        int size = 4;
        String[][] mas = new String[size][size];

        if(size != 4){
            try {
                throw new MyArraySizeException("You have gone beyond the array!");
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }else {

            randomMas(mas);

            printMas(mas);

            sum(mas);
        }
    }

    public static void randomMas(String[][] a){
        for(int x = 0; x < a.length; x++){
            for(int y = 0; y < a.length; y++){
                Random random = new Random();
                int num = 10 + random.nextInt(100 - 10);
                a[y][x] = Integer.toString(num);
            }
        }
    }

    public static void printMas(String[][] a){
        for(int x = 0; x < a.length; x++){
            for(int y = 0; y < a.length; y++){
                System.out.print(a[y][x] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void sum(String[][] a){

        int sum = 0;

        for(int x = 0; x < a.length; x++){
            for(int y = 0; y < a.length; y++) {
                try {
                    sum = sum + Integer.parseInt(a[y][x]);
                } catch (NumberFormatException e){
                    try {
                        throw new MyArrayDataException(y,x);
                    } catch (MyArrayDataException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
            System.out.println("Mas sum = " + sum);
        }
    }