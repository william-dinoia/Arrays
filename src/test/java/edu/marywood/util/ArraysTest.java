package edu.marywood.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Defines {@link ArraysTest}.
 *
 * @author William DiNoia
 */
public class ArraysTest {
    static final boolean MAX_BOOLEAN = Boolean.TRUE;
    static final byte MAX_BYTE = Byte.MAX_VALUE;
    static final char MAX_CHARACTER = Character.MAX_VALUE;
    static final boolean MIN_BOOLEAN = Boolean.FALSE;
    static final byte MIN_BYTE = Byte.MIN_VALUE;
    static final char MIN_CHARACTER = Character.MIN_VALUE;
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
    /**
     * Tests {@link Arrays.toString(byte[])}.
     */
    @Test
    public void toStringByteArray() {
        byte[] blankByteArray = null;
        byte[] emptyByteArray = new byte[] {};
        byte[] rangeByteArray = new byte[] {MIN_BYTE, MAX_BYTE};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankByteArray).equals(java.util.Arrays.toString(blankByteArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyByteArray).equals(java.util.Arrays.toString(emptyByteArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeByteArray).equals(java.util.Arrays.toString(rangeByteArray)));
    }
    /**
     * Tests {@link Arrays.toString(char[])}.
     */
    @Test
    public void toStringCharArray() {
        char[] blankCharArray = null;
        char[] emptyCharArray = new char[] {};
        char[] rangeCharArray = new char[] {MIN_CHAR, MAX_CHAR};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankCharArray).equals(java.util.Arrays.toString(blankCharArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyCharArray).equals(java.util.Arrays.toString(emptyCharArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeCharArray).equals(java.util.Arrays.toString(rangeCharArray)));
    }
}
