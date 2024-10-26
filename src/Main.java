import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");

        int[] firstArrays = new int[]{1, 2, 3};
        double[] secondArrays = new double[]{1.57, 7.654, 9.986};
        char[] thirdArrays = new char[]{'h', 'e', 'l', 'l', 'o'};

        // task 2
        System.out.println("Задача 2");

        for (int i = 0; i < firstArrays.length; i++) {
            System.out.print(firstArrays[i]);

            if (i != firstArrays.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < secondArrays.length; i++) {
            System.out.print(secondArrays[i]);

            if (i != secondArrays.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < thirdArrays.length; i++) {
            System.out.print(thirdArrays[i]);

            if (i != thirdArrays.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // task 3
        System.out.println("Задача 3");

        for (int i = firstArrays.length - 1; i >= 0; i--) {
            System.out.print(firstArrays[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = secondArrays.length - 1; i >= 0; i--) {
            System.out.print(secondArrays[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = thirdArrays.length - 1; i >= 0; i--) {
            System.out.print(thirdArrays[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //  task 4
        System.out.println("Задача 4");

        for (int i = 0; i < firstArrays.length; i++) {
            if (firstArrays[i] % 2 != 0) {
                firstArrays[i]++;
            }
        }
        System.out.println(Arrays.toString(firstArrays));

    }
}