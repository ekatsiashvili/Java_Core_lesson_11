package task_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        int n = getRandomValueFromRange(1, 10);
        int m = getRandomValueFromRange(1, 10);

        Car[][] arrayOfCars = new Car[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayOfCars[i][j] = new Car(getRandomNumberInRange(1100, 5400), getRandomNumberInRange(1990, 2018), new Helm(getRandomNumberInRange(10, 20), "skin"),
                        new Engine(getRandomNumberInRange(3, 6)));
            }
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            switch (sc.next()) {
                case "1": {
                    System.out.println("Array of cars = " + Arrays.deepToString(arrayOfCars));
                    break;
                }
                case "2": {
                    for (int i = 0; i < n; i++) {
                        Arrays.fill(arrayOfCars[i], (new Car(1800, 2005, new Helm(16, "skin"), new Engine(4))));
                    }
                    System.out.println("Array of cars = " + Arrays.deepToString(arrayOfCars));
                    break;
                }
            }

        }

    }

    // Menu
    static void menu() {
        System.out.println("Press 1 for output data of array");
        System.out.println("Press 2 for set all field of Object Car default values");
    }

    public static int getRandomValueFromRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Min value must be smaller than max value");
        }

        Random r = new Random();
        return r.nextInt((max - min + 1) + min);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Min value must be smaller than max value");
        }

        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

}