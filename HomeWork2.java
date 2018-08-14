/**
 * Java 1 HomeWork 2
 *
 * @author Elizaveta Elyashova
 * @version 13.08.2018
 */
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args){
        //Создать массив из 0 и 1, заменить все 0 на 1, все 1 на 0
        System.out.print ("Задача 1: ");
        changeArray();
        System.out.println(""); //использовано только для более читабельного вывода проверок задач

        //Создать пустой массив длиной 8, заполнить значениями 0, 3, 6, 9, 12, 15, 18, 21
        System.out.print ("Задача 2: ");
        fillArray();
        System.out.println("");

        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], числа меньшие 6 умножить на 2
        System.out.print ("Задача 3: ");
        changeSomeElements();
        System.out.println("");

        //Заполнить диагонали квадратного массива единицами
        System.out.println ("Задача 4: ");
        fillDiagonals();
        System.out.println("");

        //Задать массив, найти минимальный и максимальный элементы
        System.out.println ("Задача 5: ");
        findMin_Max();
        System.out.println("");

        //Проверить, есть ли в массиве место, в котором сумма левой и правой части массива равны
        //Создадим несколько массивов для проверки работы метода
        int[] arr1 = {1, 1, 1, 2, 1};
        int[] arr2 = {2, 1, 1, 2, 1};
        int[] arr3 = {10, 10};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 21};
        System.out.println ("Задача 6, проверка 1 (должно быть true): " + checkBalance(arr1));
        System.out.println ("Задача 6, проверка 2 (должно быть false): " + checkBalance(arr2));
        System.out.println ("Задача 6, проверка 3 (должно быть true): " + checkBalance(arr3));
        System.out.println ("Задача 6, проверка 4 (должно быть true): " + checkBalance(arr4));
        System.out.println("");

        //Метод, которому на вход подается одномерный массив и число n (положительное или отрицательно)
        //Метод должен сместить все элементы массива на n позиций
        System.out.println ("Задача 7, проверка 1 (n положительное): ");
        moveArray(arr4, 3); //используем для проверки ранее созданный массив
        System.out.println ("Задача 7, проверка 2 (n отрицательное): ");
        moveArray(arr2, -2);
    }

    private static void changeArray() {
        int[] arr = {1, 1, 0, 0, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }

        //Выведем массив на экран для проверки работы цикла
        System.out.println (Arrays.toString(arr));
    }

    private static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) arr[i] = i*3;

        //Выведем массив на экран для проверки работы цикла
        System.out.println (Arrays.toString(arr));
    }

    private static void changeSomeElements() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6) arr[i] = arr[i] * 2;

        //Выведем массив на экран для проверки работы цикла
        System.out.println (Arrays.toString(arr));
    }

    private static void fillDiagonals() {
        int[][] arr = new int[9][9];
        for (int i = 0, j = 8; i < 9; i++, j--) {
            arr[i][i] = 1;
            arr[i][j] = 1;
        }

        //Выведем массив на экран для проверки работы цикла
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }

    private static void findMin_Max() {
        int[] arr = {3, 6, 8, 2, 10, 56, 34, 2, 9, 102};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }

        //Выведем найденные минимальное и максимальное значения
        System.out.println("Минимальный элемент массива равен " + min);
        System.out.println("Максимальный элемент массива равен " + max);
    }

    private static boolean checkBalance(int[] arr) {
        int sum_left = 0;
        int sum_right = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) sum_left = sum_left + arr[j];
            for (int k = i + 1; k < arr.length; k++) sum_right = sum_right + arr[k];
            if (sum_left == sum_right) return true;
            sum_left = 0;
            sum_right = 0;
        }
        return false;
    }

    private static void moveArray(int[] arr, int n) {
        int lastelem;
        int n1;
        System.out.println("Начальный массив " + Arrays.toString(arr));
        //для проверки работы метода выведем начальный массив и после окончания работы цикла выведем измененный
        if (n > 0) n1 = n;
        //если n положительное, то массив должен будет сдвигаться вперед, а, значит, n1 должно быть просто равно n
        else n1 = arr.length + n;
        //если n отрицательное, то массив нужно сдвигать назад; наш цикл умеет сдвигать только вперед
        //чтобы получить сдвинутый на n элементов назад массив, нужно сдвинуть его вперед на (длина массива - n) элементов
        //т.к. в этом случае n заведомо отрицательно число, ставим в формуле знак сложения

        for (int j = 0; j < n1; j++) { //этот цикл повторяет операцию сдвига массива на один позицию вперед n1 раз
            lastelem = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; --i) //этот цикл сдвигает все эелементы массива на одну позицию вперед
                arr[i] = arr[i - 1];
            arr[0] = lastelem;
        }

        System.out.println("Сдвинутый на " + n + " позиций массив " + Arrays.toString(arr));
    }
}