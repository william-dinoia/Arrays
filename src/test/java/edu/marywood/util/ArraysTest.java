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
    static final char MAX_CHAR = Character.MAX_VALUE;
    static final double MAX_DOUBLE = Double.MAX_VALUE;
    static final float MAX_FLOAT = Float.MAX_VALUE;
    static final int MAX_INT = Integer.MAX_VALUE;
    static final long MAX_LONG = Long.MAX_VALUE;
    static final short MAX_SHORT = Short.MAX_VALUE;
    static final boolean MIN_BOOLEAN = false;
    static final byte MIN_BYTE = Byte.MIN_VALUE;
    static final char MIN_CHAR = Character.MIN_VALUE;
    static final double MIN_DOUBLE = Double.MIN_VALUE;
    static final float MIN_FLOAT = Float.MIN_VALUE;
    static final int MIN_INT = Integer.MIN_VALUE;
    static final long MIN_LONG = Long.MIN_VALUE;
    static final short MIN_SHORT = Short.MIN_VALUE;
    /**
     * Tests {@link Arrays.toString(boolean[])}.
     */
    @Test
    public void toStringBooleanArray() {
        boolean[] blankBooleanArray = null;
        boolean[] emptyBooleanArray = new boolean[] {};
        boolean[] lonerBooleanArray = new boolean[] {MIN_BOOLEAN};
        boolean[] rangeBooleanArray = new boolean[] {MIN_BOOLEAN, MAX_BOOLEAN};
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(blankBooleanArray)
                .equals(java.util.Arrays.toString(blankBooleanArray)));
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(emptyBooleanArray)
                .equals(java.util.Arrays.toString(emptyBooleanArray)));
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(lonerBooleanArray)
                .equals(java.util.Arrays.toString(lonerBooleanArray)));
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
        byte[] lonerByteArray = new byte[] {MIN_BYTE};
        byte[] rangeByteArray = new byte[] {MIN_BYTE, MAX_BYTE};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankByteArray).equals(java.util.Arrays.toString(blankByteArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyByteArray).equals(java.util.Arrays.toString(emptyByteArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerByteArray).equals(java.util.Arrays.toString(lonerByteArray)));
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
        char[] lonerCharArray = new char[] {MIN_CHAR};
        char[] rangeCharArray = new char[] {MIN_CHAR, MAX_CHAR};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankCharArray).equals(java.util.Arrays.toString(blankCharArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyCharArray).equals(java.util.Arrays.toString(emptyCharArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerCharArray).equals(java.util.Arrays.toString(lonerCharArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeCharArray).equals(java.util.Arrays.toString(rangeCharArray)));
    }
    /**
     * Tests {@link Arrays.toString(double[])}.
     */
    @Test
    public void toStringDoubleArray() {
        double[] blankDoubleArray = null;
        double[] emptyDoubleArray = new double[] {};
        double[] lonerDoubleArray = new double[] {MIN_DOUBLE};
        double[] rangeDoubleArray = new double[] {MIN_DOUBLE, MAX_DOUBLE};
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(blankDoubleArray)
                .equals(java.util.Arrays.toString(blankDoubleArray)));
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(emptyDoubleArray)
                .equals(java.util.Arrays.toString(emptyDoubleArray)));
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(lonerDoubleArray)
                .equals(java.util.Arrays.toString(lonerDoubleArray)));
        Assertions.assertTrue(edu.marywood.util.Arrays.toString(rangeDoubleArray)
                .equals(java.util.Arrays.toString(rangeDoubleArray)));
    }
    /**
     * Tests {@link Arrays.toString(float[])}.
     */
    @Test
    public void toStringFloatArray() {
        float[] blankFloatArray = null;
        float[] emptyFloatArray = new float[] {};
        float[] rangeFloatArray = new float[] {MIN_FLOAT, MAX_FLOAT};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankFloatArray).equals(java.util.Arrays.toString(blankFloatArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyFloatArray).equals(java.util.Arrays.toString(emptyFloatArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeFloatArray).equals(java.util.Arrays.toString(rangeFloatArray)));
    }
    /**
     * Tests {@link Arrays.toString(int[])}.
     */
    @Test
    public void toStringIntArray() {
        int[] blankIntArray = null;
        int[] emptyIntArray = new int[] {};
        int[] rangeIntArray = new int[] {MIN_INT, MAX_INT};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankIntArray).equals(java.util.Arrays.toString(blankIntArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyIntArray).equals(java.util.Arrays.toString(emptyIntArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeIntArray).equals(java.util.Arrays.toString(rangeIntArray)));
    }
    /**
     * Tests {@link Arrays.toString(long[])}.
     */
    @Test
    public void toStringLongArray() {
        long[] blankLongArray = null;
        long[] emptyLongArray = new long[] {};
        long[] rangeLongArray = new long[] {MIN_LONG, MAX_LONG};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankLongArray).equals(java.util.Arrays.toString(blankLongArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyLongArray).equals(java.util.Arrays.toString(emptyLongArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeLongArray).equals(java.util.Arrays.toString(rangeLongArray)));
    }
    /**
     * Tests {@link Arrays.toString(short[])}.
     */
    @Test
    public void toStringShortArray() {
        short[] blankShortArray = null;
        short[] emptyShortArray = new short[] {};
        short[] rangeShortArray = new short[] {MIN_SHORT, MAX_SHORT};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankShortArray).equals(java.util.Arrays.toString(blankShortArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyShortArray).equals(java.util.Arrays.toString(emptyShortArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeShortArray).equals(java.util.Arrays.toString(rangeShortArray)));
    }
}
