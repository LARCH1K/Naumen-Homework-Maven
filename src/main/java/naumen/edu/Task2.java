package naumen.edu;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public void insertionSort(int n) {
        Random random = new Random();
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            doubleArrayList.add(random.nextDouble(-1000, 1000));
        }
        System.out.println("Исходный список: " + doubleArrayList);

        for (int i = 1; i < doubleArrayList.size(); i++) {
            Double key = doubleArrayList.get(i);
            int j = i - 1;
            while (j >= 0 && doubleArrayList.get(j) > key) {
                doubleArrayList.set(j + 1, doubleArrayList.get(j));
                j--;
            }
            doubleArrayList.set(j + 1, key);
        }
        System.out.println("Список после сортировки: " + doubleArrayList);
    }
}
