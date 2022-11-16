package ua.profitsoft.zakharov.tasks.solution1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class PositiveAndSortedArray {
    public static int[] getSortedAndPositiveArray(int[] array) {
        if (array == null) {
            return new int[]{};
        }
        return Arrays.stream(array).boxed()
                .filter(x -> x >= 0)
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer :: intValue)
                .toArray();
    }
}