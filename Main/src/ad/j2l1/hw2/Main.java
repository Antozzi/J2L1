package ad.j2l1.hw2;

/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
 * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 */

public class Main {

    static int checkresult = 0;

    public static void main(String[] args) {

        String[][] rightArray = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] wrongArray = {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5", "6"}};
        String[][] wrongDataArray = {{"1", "2", "3", "4x4",}, {"1", "2", "3", "4"}};

        System.out.println("Right array");
        arrays(rightArray);
        System.out.println("Wrong array");
        arrays(wrongArray);
        System.out.println("Wrong data array");
        arrays(wrongDataArray);

    }

    public static void arrays(String[][] stringArray) {

        try {
            checkresult = 0;
            checkresult = checkArrays(stringArray);
        } catch (MyArrSizeExcep | MyArrDataExcept e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Total Sum of Array = " + checkresult);
        }
    }

    public static int checkArrays(String[][] array) throws MyArrSizeExcep, MyArrDataExcept {
        int total = 0;
        int value;
        int row;
        int cell;

        if (array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArrSizeExcep();
        }

        for (int i = 1; i < 3; i++) {
            row = i;
            for (int j = 1; j < 5; j++) {
                cell = j;
                try {
                    value = Integer.parseInt(array[i - 1][j - 1]);
                    total += value;
                } catch (IllegalArgumentException e) {
                    String message = "in row " + row + ", cell " + cell;
                    throw new MyArrDataExcept(message);
                }
            }
        }
        return total;
    }
}

