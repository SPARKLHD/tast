package org.softwaretechnologies;

public final class ArrayFunctions {

    private ArrayFunctions() {
    }

    /**
     * Функция, меняющая порядок элементов в массиве array на обратный.
     * @param array массив, который будет перевернут.
     */
    public static void reverse(int[] array) {
        if (array == null || array.length <= 1) {
            return; 
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Функция, заменяющая строки матрицы на столбцы матрицы. Пример:
       1  2  3     1  4  7
       4  5  6     2  5  8
       7  8  9     3  6  9
     * Функция работает только с квадратными матрицами.
     * Если матрица не квадратная, то выведете на экран сообщение:
       Матрица не квадратная
     * @param matrix матрица, в которой столбцы будут заменены на строки.
     */
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int i = 0;
        if (n != matrix[0].lenght) {
            System.out.println("The matrix is not square");
        }
        else
        {
            while (i*i != (n-1)*(n-1))
                {
                    int j = n;
                    while (j != i)
                        {
                            int m = matrix[i][j-1];
                            matrix[i][j-1] = matrix[j-1][i];
                            matrix[j-1][i] = m;
                            j--;
                        }
                    i++;
                }
        }
    }
}
