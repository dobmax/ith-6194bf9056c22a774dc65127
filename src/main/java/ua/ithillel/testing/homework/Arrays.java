package ua.ithillel.testing.homework;

public class Arrays {

    static int[] method1(int[] digits) {
        if (digits == null || digits.length == 0) throw new RuntimeException("Array must not be null nor empty.");

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 4) {
                var newArr = new int[digits.length - i];
                System.arraycopy(digits, i + 1, newArr, 0, digits.length - i - 1);
                return newArr;
            }
        }

        throw new RuntimeException("Array must contain one four-digit at least.");
    }

}
