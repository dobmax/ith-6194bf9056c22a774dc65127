package ua.ithillel.exceptions.homework;

public class ArrayValueCalculator {
    public int calc(String[][] values) {
        checkSize(values.length);

        for (int i = 0; i < values.length; i++) {
            checkSize(values[i].length);
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    String message = String.format("IntString value is corrupted. [%s][%s]", i, j);
                    throw new MyArrayDataException(message, e);
                }
            }
        }

        return sum;
    }

    private void checkSize(int size) {
        if (size != 4) {
            throw new MyArraySizeException("Array size must be 4.");
        }
    }
}
