package edu.marywood.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Defines {@link ArraysTest}.
 *
 * @author William DiNoia
 */
public class ArraysTest {
    static final short MIN_SHORT = Short.MIN_VALUE;
    /**
     * Tests {@link Arrays.toString(boolean[])}.
     */
    @Test
    public void toStringBooleanArray() {
        boolean[] blankBooleanArray = null;
        boolean[] emptyBooleanArray = new boolean[] {};
        boolean[] lonerBooleanArray = new boolean[] {false};
        boolean[] rangeBooleanArray = new boolean[] {false, true};
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
        byte[] lonerByteArray = new byte[] {Byte.MIN_VALUE};
        byte[] rangeByteArray = new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE};
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
        char[] lonerCharArray = new char[] {Character.MIN_VALUE};
        char[] rangeCharArray = new char[] {Character.MIN_VALUE, Character.MAX_VALUE};
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
        double[] lonerDoubleArray = new double[] {Double.MIN_VALUE};
        double[] rangeDoubleArray = new double[] {Double.MIN_VALUE, Double.MAX_VALUE};
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
        float[] lonerFloatArray = new float[] {Float.MIN_VALUE};
        float[] rangeFloatArray = new float[] {Float.MIN_VALUE, Float.MAX_VALUE};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankFloatArray).equals(java.util.Arrays.toString(blankFloatArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyFloatArray).equals(java.util.Arrays.toString(emptyFloatArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerFloatArray).equals(java.util.Arrays.toString(lonerFloatArray)));
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
        int[] lonerIntArray = new int[] {Integer.MIN_VALUE};
        int[] rangeIntArray = new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankIntArray).equals(java.util.Arrays.toString(blankIntArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyIntArray).equals(java.util.Arrays.toString(emptyIntArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerIntArray).equals(java.util.Arrays.toString(lonerIntArray)));
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
        long[] lonerLongArray = new long[] {Long.MIN_VALUE};
        long[] rangeLongArray = new long[] {Long.MIN_VALUE, Long.MAX_VALUE};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankLongArray).equals(java.util.Arrays.toString(blankLongArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyLongArray).equals(java.util.Arrays.toString(emptyLongArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerLongArray).equals(java.util.Arrays.toString(lonerLongArray)));
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
        short[] lonerShortArray = new short[] {MIN_SHORT};
        short[] rangeShortArray = new short[] {MIN_SHORT, Short.MAX_VALUE};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankShortArray).equals(java.util.Arrays.toString(blankShortArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyShortArray).equals(java.util.Arrays.toString(emptyShortArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerShortArray).equals(java.util.Arrays.toString(lonerShortArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeShortArray).equals(java.util.Arrays.toString(rangeShortArray)));
    }
}
