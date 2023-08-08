import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        double[] numbers = {-2.5, 4.7, -1.2, 6.3, -3.8, 8.1, 2.9, -9.4, 7.6, -5.0, 3.2, -6.7, 1.8, -0.5, 5.4};

        double sum = 0;
        int positiveCount = 0;
        boolean foundNegative = false;

        for (double num : numbers) {
            if (foundNegative) {
                if (num > 0) {
                    sum += num;
                    positiveCount++;
                }
            } else {
                if (num < 0) {
                    foundNegative = true;
                }
            }
        }

        double average = positiveCount > 0 ? sum / positiveCount : 0;
        System.out.println("Среднее положительных чисел после первого отрицательного: " + average);
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        sortArray(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }

    public static void sortArray(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println("Итерация " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }
}
