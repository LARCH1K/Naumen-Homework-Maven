package naumen.edu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Овчинников Никита, вариант 5");
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("\nTask1:");
        Task1 task1 = new Task1();
        task1.findSumPositiveNumbers(n);

        System.out.println("\nTask2:");
        Task2 task2 = new Task2();
        task2.insertionSort(n);

        System.out.println("\nTask3:");
        Task3 task3 = new Task3();
        task3.isThereEmployeeWithSalaryMoreThan100000();

        System.out.println("\nTask4:");
        Task4 task4 = new Task4();
        task4.showHostFromResponse();

        System.out.println("\nTask5:");
        Task5 task5 = new Task5();
        task5.start();
        Thread.sleep(1000);
        task5.stop();
    }
}