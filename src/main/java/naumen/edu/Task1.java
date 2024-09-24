package naumen.edu;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public void findSumPositiveNumbers(int n) {
        Random random = new Random();

        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(-1000, 1000);
            if (array[i] > 0) {
                sum += array[i];
            }
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Сумма положительных элементов массива: " + sum);
    }
}
