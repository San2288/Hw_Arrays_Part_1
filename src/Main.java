public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        // Задача 1.1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        // Задача 1.2
        double[] doubles = {1.57, 7.654, 9.986};
        // Задача 1.3
        int[] weights = {71, 70, 69, 68, 67, 66, 65};
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        // Задача 2.1
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 0; i < numbers1.length; i++) {
            if (i != numbers1.length - 1) {
                System.out.print(numbers1[i] + ", ");
            } else {
                System.out.println(numbers1[i]);
            }
        }

        // Задача 2.2
        double[] doubles1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubles1.length; i++) {
            if (i != doubles1.length - 1) {
                System.out.print(doubles1[i] + ", ");
            } else {
                System.out.println(doubles1[i]);
            }
        }

        // Задача 2.3
        int[] weights1 = {71, 70, 69, 68, 67, 66, 65};
        for (int i = 0; i < weights1.length; i++) {
            if (i != weights1.length - 1) {
                System.out.print(weights1[i] + ", ");
            } else {
                System.out.println(weights1[i]);
                System.out.println();
            }
        }

        // Задача 3
        System.out.println("Задача 3");
        // Задача 3.1
        int[] numbers2 = new int[3];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers2[i] + ", ");
            } else {
                System.out.println(numbers2[i]);
            }
        }

        // Задача 3.2
        double[] doubles2 = {1.57, 7.654, 9.986};
        for (int i = doubles2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(doubles2[i] + ", ");
            } else {
                System.out.println(doubles2[i]);
            }
        }

        // Задача 3.3
        int[] weights2 = {71, 70, 69, 68, 67, 66, 65};
        for (int i = weights2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weights2[i] + ", ");
            } else {
                System.out.println(weights2[i]);
                System.out.println();
            }
        }

        // Задача 4
        System.out.println("Задача 4");
        int[] numbers3 = new int[3];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] % 2 != 0) {
                numbers3[i] += 1;
                System.out.println(numbers3[i]);
            }
        }
    }
}
