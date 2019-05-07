package Lesson4;

public class MainClass {

    static final int size = 1000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {

        first(arr);
        second(arr);

    }

    public static void first(float[] arr){

        for (int i = 0; i < size; i++){
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }

        System.out.println("The first method is past: " + (System.currentTimeMillis() - a));
    }

    public static void second(float[] arr){

        for (int i = 0; i < size; i++){
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        new Thread(new cutMassiveOne()).start();
        new Thread(new cutMassiveTwo()).start();

        System.out.println("The second method is past: " + (System.currentTimeMillis() - a));

    }

    private static class cutMassiveOne implements Runnable {
        @Override
        public void run() {

            float[] a1 = new float[h];

            long a = System.currentTimeMillis();

            System.arraycopy(arr, 0, a1, 0, h);

            for (int i = 0; i < size; i++){

                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(a1, 0, arr, 0, h);

            System.out.println("1: " + (System.currentTimeMillis() - a));
        }

    }

    private static class cutMassiveTwo implements Runnable {
        @Override
        public void run() {
            float[] a2 = new float[h];

            long a = System.currentTimeMillis();
            System.arraycopy(arr, h, a2, 0, h);

            for (int i = 0; i < size; i++){

                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(a2, 0, arr, h, h);

            System.out.println("2: " + (System.currentTimeMillis() - a));
        }
    }
}
