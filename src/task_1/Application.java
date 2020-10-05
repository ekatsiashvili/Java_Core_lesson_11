package task_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Please enter size of array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = getRandomValueFromRange(1, 100);
        }

        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Sorting: asc");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Sorting: desc");
        System.out.println(Arrays.toString(arr));
    }


    public static int getRandomValueFromRange(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value must be smaller than max value");
        }

        Random random = new Random();
        return random.nextInt((max - min + 1) + min);
    }

}