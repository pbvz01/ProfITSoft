package ua.profitsoft.zakharov.tasks.solution1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveAndSortedArrayTest {
    private int[] sourceArray = new int[] { 5, 2, -1, 3, -25, 0, 3};
    private int[] sortedArray = new int[] { 5, 3, 3, 2, 0};

        @Test
        void successPassGetSortedAndPositiveArray() {
        Assertions.assertArrayEquals(sortedArray,
                PositiveAndSortedArray.getSortedAndPositiveArray(sourceArray));
        }

        @Test
        void checkNullGetSortedAndPositiveArray() {
            assertNotNull(PositiveAndSortedArray.getSortedAndPositiveArray(null));
        }
}