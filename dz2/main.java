package dz2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 9, 1};
        boolean isSorted = false;
        int temp;
        int iterations = 0;

        try {
            FileWriter logFile = new FileWriter("sort.log");

            while (!isSorted) {
                isSorted = true;
                iterations++;

                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        isSorted = false;
                    }
                }

                logFile.write("Итерация " + iterations + ": " + Arrays.toString(arr) + "\n");
            }

            logFile.close();

        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
