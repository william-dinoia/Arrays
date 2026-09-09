package edu.marywood.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Defines {@link ArraysTest}.
 *
 * @author William DiNoia
 */
public class ArraysTest {
    static final boolean MAX_BOOLEAN = true;
    static final byte MAX_BYTE = Byte.MAX_VALUE;
    static final boolean MIN_BOOLEAN = false;
    static final byte MIN_BYTE = Byte.MIN_VALUE;
    /**
     * Tests {@link Arrays.toString(boolean[])}.
     */
    @Test
    public void toStringBooleanArray() {
        boolean[] blankBooleanArray = null;
        boolean[] emptyBooleanArray = new boolean[] {};
        boolean[] rangeBooleanArray = new boolean[] {MIN_BOOLEAN, MAX_BOOLEAN};
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(blankBooleanArray)
                .equals(java.util.Arrays.toString(blankBooleanArray)));
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(emptyBooleanArray)
                .equals(java.util.Arrays.toString(emptyBooleanArray)));
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(rangeBooleanArray)
                .equals(java.util.Arrays.toString(rangeBooleanArray)));
    }
}
