package HomeWork2;

public class HomeWork {
    public static void main(String[] args) {

        //region Задача 1
        int[] Array = {1, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == 0) {
                Array[i] = 1;
                System.out.print(Array[i]);
            } else {
                Array[i] = 0;
                System.out.print(Array[i]);
            }
        }
        //endregion

        //region Задача 2
        int[] Array2 = new int[8];
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = i * 3;
            System.out.println(Array2[i]);
        }
        //endregion

        //region Задача 3
        int[] Array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < Array3.length; i++) {
            if (Array3[i] < 6) {
                Array3[i] = Array3[i] * 2;
            }
            System.out.println(Array3[i]);
        }
        //endregion

        //region Задача 4
        int[] array = {41, 211, 35, 402, 403, 179, 462};
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println("Максимальное число = " + maxNum);

        int[] array2 = {239, 49, 133, 158, 3, 269, 338, 442};
        int minNum = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < minNum) {
                minNum = array2[i];
            }
        }
        System.out.println("Минимальное число = " + minNum);
        //endregion

        //region Задача 5
        int[] arr = {5, 5, 10};
        boolean answ5 = q5(arr);
        System.out.println(answ5);
        //endregion
    }

    static boolean q5(int[] array1) {
        int sum = 0;
        int check = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        for (int j = 0; j < array1.length; j++) {
            check += array1[j];
            if (check == sum - check) {
                return true;
            }

        }
        return false;
    } //Функция задачи 5
}


