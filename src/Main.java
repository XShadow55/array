import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
        zd3();
        zd4();


    }

    public static void zd1() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] array1 = {1.57, 7.654, 9.986};
        int[] array2 = {13, 24, 35, 0, 0, 0, 0, 0, 0};


    }

    public static void zd2() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        double[] array1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array1.length; i++) {
            if (i != array1.length - 1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();
//

        int[] array2 = {13, 24, 35, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < array2.length; i++) {
            if (i != array2.length - 1) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.print(array2[i]);
            }
        }

//
    }

    public static void zd3() {
        System.out.println();
        System.out.println();
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        double[] array1 = {1.57, 7.654, 9.986};
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();
        int[] array2 = {13, 24, 35, 0, 0, 0, 0, 0, 0};
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.print(array2[i]);
            }
        }
    }

    public static void zd4() {
        System.out.println();
        System.out.println();
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i <=array.length-1; i ++) {
            if (array[i] % 2!=0){
                array[i] = array[i]+1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}