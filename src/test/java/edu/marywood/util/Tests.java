package edu.marywood.util;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Defines {@link Tests}.
 *
 * @author William DiNoia
 */
public class Tests {
    private static final boolean[] BLANK_BOOLEAN_ARRAY = null;
    private static final byte[] BLANK_BYTE_ARRAY = null;
    private static final char[] BLANK_CHAR_ARRAY = null;
    private static final double[] BLANK_DOUBLE_ARRAY = null;
    private static final float[] BLANK_FLOAT_ARRAY = null;
    private static final int[] BLANK_INT_ARRAY = null;
    private static final long[] BLANK_LONG_ARRAY = null;
    private static final Object[] BLANK_OBJECT_ARRAY = null;
    private static final short[] BLANK_SHORT_ARRAY = null;
    private static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[] {};
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[] {};
    private static final char[] EMPTY_CHAR_ARRAY = new char[] {};
    private static final double[] EMPTY_DOUBLE_ARRAY = new double[] {};
    private static final float[] EMPTY_FLOAT_ARRAY = new float[] {};
    private static final int[] EMPTY_INT_ARRAY = new int[] {};
    private static final long[] EMPTY_LONG_ARRAY = new long[] {};
    private static final Object[] EMPTY_OBJECT_ARRAY = new Object[] {};
    private static final short[] EMPTY_SHORT_ARRAY = new short[] {};
    private static final boolean[] LONER_BOOLEAN_ARRAY = new boolean[] {false};
    private static final byte[] LONER_BYTE_ARRAY = new byte[] {Byte.MIN_VALUE};
    private static final char[] LONER_CHAR_ARRAY = new char[] {Character.MIN_VALUE};
    private static final double[] LONER_DOUBLE_ARRAY = new double[] {Double.MIN_VALUE};
    private static final float[] LONER_FLOAT_ARRAY = new float[] {Float.MIN_VALUE};
    private static final int[] LONER_INT_ARRAY = new int[] {Integer.MIN_VALUE};
    private static final long[] LONER_LONG_ARRAY = new long[] {Long.MIN_VALUE};
    private static final Object[] LONER_OBJECT_ARRAY = new Object[] {new Object()};
    private static final short[] LONER_SHORT_ARRAY = new short[] {Short.MIN_VALUE};
    private static final boolean[] RANGE_BOOLEAN_ARRAY = new boolean[] {false, true};
    private static final byte[] RANGE_BYTE_ARRAY = new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE};
    private static final char[] RANGE_CHAR_ARRAY =
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE};
    private static final double[] RANGE_DOUBLE_ARRAY =
            new double[] {Double.MIN_VALUE, Double.MAX_VALUE};
    private static final float[] RANGE_FLOAT_ARRAY = new float[] {Float.MIN_VALUE, Float.MAX_VALUE};
    private static final int[] RANGE_INT_ARRAY = new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE};
    private static final long[] RANGE_LONG_ARRAY = new long[] {Long.MIN_VALUE, Long.MAX_VALUE};
    private static final Object[] RANGE_OBJECT_ARRAY =
            new Object[] {
                "",
                new boolean[] {false, true},
                new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE},
                new char[] {Character.MIN_VALUE, Character.MAX_VALUE},
                new double[] {Double.MIN_VALUE, Double.MAX_VALUE},
                new float[] {Float.MIN_VALUE, Float.MAX_VALUE},
                new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE},
                new long[] {Long.MIN_VALUE, Long.MAX_VALUE},
                new short[] {Short.MIN_VALUE, Short.MAX_VALUE},
                null
            };
    private static final short[] RANGE_SHORT_ARRAY = new short[] {Short.MIN_VALUE, Short.MAX_VALUE};

    /** The {@code Arrays.deepEquals(Object[], Object[])} test. */
    @Test
    public void deepEqualsObjectArrayObjectArray() {
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(BLANK_OBJECT_ARRAY, BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(BLANK_OBJECT_ARRAY, BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(BLANK_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(BLANK_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(BLANK_OBJECT_ARRAY, LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(BLANK_OBJECT_ARRAY, LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(BLANK_OBJECT_ARRAY, RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(BLANK_OBJECT_ARRAY, RANGE_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(EMPTY_OBJECT_ARRAY, BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(EMPTY_OBJECT_ARRAY, BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(EMPTY_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(EMPTY_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(EMPTY_OBJECT_ARRAY, LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(EMPTY_OBJECT_ARRAY, LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(EMPTY_OBJECT_ARRAY, RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(EMPTY_OBJECT_ARRAY, RANGE_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(LONER_OBJECT_ARRAY, BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(LONER_OBJECT_ARRAY, BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(LONER_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(LONER_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(LONER_OBJECT_ARRAY, LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(LONER_OBJECT_ARRAY, LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(LONER_OBJECT_ARRAY, RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(LONER_OBJECT_ARRAY, RANGE_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(RANGE_OBJECT_ARRAY, BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(RANGE_OBJECT_ARRAY, BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(RANGE_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(RANGE_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(RANGE_OBJECT_ARRAY, LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(RANGE_OBJECT_ARRAY, LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepEquals(RANGE_OBJECT_ARRAY, RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepEquals(RANGE_OBJECT_ARRAY, RANGE_OBJECT_ARRAY));
    }

    /** The {@code Arrays.deepHashCode(Object[])} test. */
    @Test
    public void deepHashCodeObjectArray() {
        Assertions.assertEquals(
                java.util.Arrays.deepHashCode(BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepHashCode(BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepHashCode(EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepHashCode(EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepHashCode(LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepHashCode(LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepHashCode(RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepHashCode(RANGE_OBJECT_ARRAY));
        Object[] omegaObjectArray = new Object[2];
        omegaObjectArray[0] = omegaObjectArray;
        omegaObjectArray[1] = RANGE_OBJECT_ARRAY;
        Assertions.assertThrows(
                StackOverflowError.class,
                () -> {
                    java.util.Arrays.deepHashCode(omegaObjectArray);
                });
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    edu.marywood.util.Arrays.deepHashCode(omegaObjectArray);
                });
    }

    /** The {@code Arrays.deepToString(Object[])} test. */
    @Test
    public void deepToStringObjectArray() {
        Assertions.assertEquals(
                java.util.Arrays.deepToString(BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepToString(BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepToString(EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepToString(EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepToString(LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepToString(LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepToString(RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepToString(RANGE_OBJECT_ARRAY));
        Object[] omegaObjectArray = new Object[2];
        omegaObjectArray[0] = omegaObjectArray;
        omegaObjectArray[1] = RANGE_OBJECT_ARRAY;
        Assertions.assertEquals(
                java.util.Arrays.deepToString(omegaObjectArray),
                edu.marywood.util.Arrays.deepToString(omegaObjectArray));
    }

    /** The {@code Arrays.equals(boolean[], boolean[])} test. */
    @Test
    public void equalsBooleanArrayBooleanArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_BOOLEAN_ARRAY, BLANK_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_BOOLEAN_ARRAY, BLANK_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_BOOLEAN_ARRAY, EMPTY_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_BOOLEAN_ARRAY, EMPTY_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_BOOLEAN_ARRAY, LONER_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_BOOLEAN_ARRAY, LONER_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_BOOLEAN_ARRAY, RANGE_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_BOOLEAN_ARRAY, RANGE_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_BOOLEAN_ARRAY, BLANK_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_BOOLEAN_ARRAY, BLANK_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_BOOLEAN_ARRAY, EMPTY_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_BOOLEAN_ARRAY, EMPTY_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_BOOLEAN_ARRAY, LONER_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_BOOLEAN_ARRAY, LONER_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_BOOLEAN_ARRAY, RANGE_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_BOOLEAN_ARRAY, RANGE_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_BOOLEAN_ARRAY, BLANK_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_BOOLEAN_ARRAY, BLANK_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_BOOLEAN_ARRAY, EMPTY_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_BOOLEAN_ARRAY, EMPTY_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_BOOLEAN_ARRAY, LONER_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_BOOLEAN_ARRAY, LONER_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_BOOLEAN_ARRAY, RANGE_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_BOOLEAN_ARRAY, RANGE_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_BOOLEAN_ARRAY, BLANK_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_BOOLEAN_ARRAY, BLANK_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_BOOLEAN_ARRAY, EMPTY_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_BOOLEAN_ARRAY, EMPTY_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_BOOLEAN_ARRAY, LONER_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_BOOLEAN_ARRAY, LONER_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_BOOLEAN_ARRAY, RANGE_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_BOOLEAN_ARRAY, RANGE_BOOLEAN_ARRAY));
    }

    /** The {@code Arrays.equals(byte[], byte[])} test. */
    @Test
    public void equalsByteArrayByteArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_BYTE_ARRAY, BLANK_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_BYTE_ARRAY, BLANK_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_BYTE_ARRAY, EMPTY_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_BYTE_ARRAY, EMPTY_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_BYTE_ARRAY, LONER_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_BYTE_ARRAY, LONER_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_BYTE_ARRAY, RANGE_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_BYTE_ARRAY, RANGE_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_BYTE_ARRAY, BLANK_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_BYTE_ARRAY, BLANK_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_BYTE_ARRAY, EMPTY_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_BYTE_ARRAY, EMPTY_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_BYTE_ARRAY, LONER_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_BYTE_ARRAY, LONER_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_BYTE_ARRAY, RANGE_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_BYTE_ARRAY, RANGE_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_BYTE_ARRAY, BLANK_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_BYTE_ARRAY, BLANK_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_BYTE_ARRAY, EMPTY_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_BYTE_ARRAY, EMPTY_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_BYTE_ARRAY, LONER_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_BYTE_ARRAY, LONER_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_BYTE_ARRAY, RANGE_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_BYTE_ARRAY, RANGE_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_BYTE_ARRAY, BLANK_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_BYTE_ARRAY, BLANK_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_BYTE_ARRAY, EMPTY_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_BYTE_ARRAY, EMPTY_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_BYTE_ARRAY, LONER_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_BYTE_ARRAY, LONER_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_BYTE_ARRAY, RANGE_BYTE_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_BYTE_ARRAY, RANGE_BYTE_ARRAY));
    }

    /** The {@code Arrays.equals(char[], char[])} test. */
    @Test
    public void equalsCharArrayCharArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_CHAR_ARRAY, BLANK_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_CHAR_ARRAY, BLANK_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_CHAR_ARRAY, EMPTY_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_CHAR_ARRAY, EMPTY_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_CHAR_ARRAY, LONER_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_CHAR_ARRAY, LONER_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_CHAR_ARRAY, RANGE_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_CHAR_ARRAY, RANGE_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_CHAR_ARRAY, BLANK_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_CHAR_ARRAY, BLANK_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_CHAR_ARRAY, EMPTY_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_CHAR_ARRAY, EMPTY_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_CHAR_ARRAY, LONER_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_CHAR_ARRAY, LONER_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_CHAR_ARRAY, RANGE_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_CHAR_ARRAY, RANGE_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_CHAR_ARRAY, BLANK_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_CHAR_ARRAY, BLANK_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_CHAR_ARRAY, EMPTY_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_CHAR_ARRAY, EMPTY_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_CHAR_ARRAY, LONER_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_CHAR_ARRAY, LONER_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_CHAR_ARRAY, RANGE_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_CHAR_ARRAY, RANGE_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_CHAR_ARRAY, BLANK_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_CHAR_ARRAY, BLANK_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_CHAR_ARRAY, EMPTY_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_CHAR_ARRAY, EMPTY_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_CHAR_ARRAY, LONER_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_CHAR_ARRAY, LONER_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_CHAR_ARRAY, RANGE_CHAR_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_CHAR_ARRAY, RANGE_CHAR_ARRAY));
    }

    /** The {@code Arrays.equals(double[], double[])} test. */
    @Test
    public void equalsDoubleArrayDoubleArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_DOUBLE_ARRAY, BLANK_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_DOUBLE_ARRAY, BLANK_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_DOUBLE_ARRAY, LONER_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_DOUBLE_ARRAY, LONER_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_DOUBLE_ARRAY, RANGE_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_DOUBLE_ARRAY, RANGE_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_DOUBLE_ARRAY, BLANK_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_DOUBLE_ARRAY, BLANK_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_DOUBLE_ARRAY, LONER_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_DOUBLE_ARRAY, LONER_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_DOUBLE_ARRAY, RANGE_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_DOUBLE_ARRAY, RANGE_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_DOUBLE_ARRAY, BLANK_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_DOUBLE_ARRAY, BLANK_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_DOUBLE_ARRAY, LONER_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_DOUBLE_ARRAY, LONER_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_DOUBLE_ARRAY, RANGE_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_DOUBLE_ARRAY, RANGE_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_DOUBLE_ARRAY, BLANK_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_DOUBLE_ARRAY, BLANK_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_DOUBLE_ARRAY, LONER_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_DOUBLE_ARRAY, LONER_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_DOUBLE_ARRAY, RANGE_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_DOUBLE_ARRAY, RANGE_DOUBLE_ARRAY));
    }

    /** The {@code Arrays.equals(float[], float[])} test. */
    @Test
    public void equalsFloatArrayFloatArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_FLOAT_ARRAY, BLANK_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_FLOAT_ARRAY, BLANK_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_FLOAT_ARRAY, LONER_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_FLOAT_ARRAY, LONER_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_FLOAT_ARRAY, RANGE_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_FLOAT_ARRAY, RANGE_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_FLOAT_ARRAY, BLANK_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_FLOAT_ARRAY, BLANK_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_FLOAT_ARRAY, LONER_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_FLOAT_ARRAY, LONER_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_FLOAT_ARRAY, RANGE_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_FLOAT_ARRAY, RANGE_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_FLOAT_ARRAY, BLANK_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_FLOAT_ARRAY, BLANK_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_FLOAT_ARRAY, LONER_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_FLOAT_ARRAY, LONER_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_FLOAT_ARRAY, RANGE_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_FLOAT_ARRAY, RANGE_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_FLOAT_ARRAY, BLANK_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_FLOAT_ARRAY, BLANK_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_FLOAT_ARRAY, LONER_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_FLOAT_ARRAY, LONER_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_FLOAT_ARRAY, RANGE_FLOAT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_FLOAT_ARRAY, RANGE_FLOAT_ARRAY));
    }

    /** The {@code Arrays.equals(int[], int[])} test. */
    @Test
    public void equalsIntArrayIntArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_INT_ARRAY, BLANK_INT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_INT_ARRAY, BLANK_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_INT_ARRAY, EMPTY_INT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_INT_ARRAY, EMPTY_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_INT_ARRAY, LONER_INT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_INT_ARRAY, LONER_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_INT_ARRAY, RANGE_INT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_INT_ARRAY, RANGE_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_INT_ARRAY, BLANK_INT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_INT_ARRAY, BLANK_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_INT_ARRAY, EMPTY_INT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_INT_ARRAY, EMPTY_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_INT_ARRAY, LONER_INT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_INT_ARRAY, LONER_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_INT_ARRAY, RANGE_INT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_INT_ARRAY, RANGE_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_INT_ARRAY, BLANK_INT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_INT_ARRAY, BLANK_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_INT_ARRAY, EMPTY_INT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_INT_ARRAY, EMPTY_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_INT_ARRAY, LONER_INT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_INT_ARRAY, LONER_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_INT_ARRAY, RANGE_INT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_INT_ARRAY, RANGE_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_INT_ARRAY, BLANK_INT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_INT_ARRAY, BLANK_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_INT_ARRAY, EMPTY_INT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_INT_ARRAY, EMPTY_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_INT_ARRAY, LONER_INT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_INT_ARRAY, LONER_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_INT_ARRAY, RANGE_INT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_INT_ARRAY, RANGE_INT_ARRAY));
    }

    /** The {@code Arrays.equals(long[], long[])} test. */
    @Test
    public void equalsLongArrayLongArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_LONG_ARRAY, BLANK_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_LONG_ARRAY, BLANK_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_LONG_ARRAY, EMPTY_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_LONG_ARRAY, EMPTY_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_LONG_ARRAY, LONER_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_LONG_ARRAY, LONER_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_LONG_ARRAY, RANGE_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_LONG_ARRAY, RANGE_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_LONG_ARRAY, BLANK_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_LONG_ARRAY, BLANK_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_LONG_ARRAY, EMPTY_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_LONG_ARRAY, EMPTY_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_LONG_ARRAY, LONER_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_LONG_ARRAY, LONER_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_LONG_ARRAY, RANGE_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_LONG_ARRAY, RANGE_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_LONG_ARRAY, BLANK_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_LONG_ARRAY, BLANK_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_LONG_ARRAY, EMPTY_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_LONG_ARRAY, EMPTY_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_LONG_ARRAY, LONER_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_LONG_ARRAY, LONER_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_LONG_ARRAY, RANGE_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_LONG_ARRAY, RANGE_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_LONG_ARRAY, BLANK_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_LONG_ARRAY, BLANK_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_LONG_ARRAY, EMPTY_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_LONG_ARRAY, EMPTY_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_LONG_ARRAY, LONER_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_LONG_ARRAY, LONER_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_LONG_ARRAY, RANGE_LONG_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_LONG_ARRAY, RANGE_LONG_ARRAY));
    }

    /** The {@code Arrays.equals(Object[], Object[])} test. */
    @Test
    public void equalsObjectArrayObjectArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_OBJECT_ARRAY, BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_OBJECT_ARRAY, BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_OBJECT_ARRAY, LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_OBJECT_ARRAY, LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_OBJECT_ARRAY, RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_OBJECT_ARRAY, RANGE_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_OBJECT_ARRAY, BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_OBJECT_ARRAY, BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_OBJECT_ARRAY, LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_OBJECT_ARRAY, LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_OBJECT_ARRAY, RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_OBJECT_ARRAY, RANGE_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_OBJECT_ARRAY, BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_OBJECT_ARRAY, BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_OBJECT_ARRAY, LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_OBJECT_ARRAY, LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_OBJECT_ARRAY, RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_OBJECT_ARRAY, RANGE_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_OBJECT_ARRAY, BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_OBJECT_ARRAY, BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_OBJECT_ARRAY, EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_OBJECT_ARRAY, LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_OBJECT_ARRAY, LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_OBJECT_ARRAY, RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_OBJECT_ARRAY, RANGE_OBJECT_ARRAY));
    }

    /** The {@code Arrays.equals(short[], short[])} test. */
    @Test
    public void equalsShortArrayShortArray() {
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_SHORT_ARRAY, BLANK_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_SHORT_ARRAY, BLANK_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_SHORT_ARRAY, EMPTY_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_SHORT_ARRAY, EMPTY_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_SHORT_ARRAY, LONER_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_SHORT_ARRAY, LONER_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(BLANK_SHORT_ARRAY, RANGE_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(BLANK_SHORT_ARRAY, RANGE_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_SHORT_ARRAY, BLANK_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_SHORT_ARRAY, BLANK_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_SHORT_ARRAY, EMPTY_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_SHORT_ARRAY, EMPTY_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_SHORT_ARRAY, LONER_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_SHORT_ARRAY, LONER_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(EMPTY_SHORT_ARRAY, RANGE_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(EMPTY_SHORT_ARRAY, RANGE_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_SHORT_ARRAY, BLANK_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_SHORT_ARRAY, BLANK_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_SHORT_ARRAY, EMPTY_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_SHORT_ARRAY, EMPTY_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_SHORT_ARRAY, LONER_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_SHORT_ARRAY, LONER_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(LONER_SHORT_ARRAY, RANGE_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(LONER_SHORT_ARRAY, RANGE_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_SHORT_ARRAY, BLANK_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_SHORT_ARRAY, BLANK_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_SHORT_ARRAY, EMPTY_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_SHORT_ARRAY, EMPTY_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_SHORT_ARRAY, LONER_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_SHORT_ARRAY, LONER_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.equals(RANGE_SHORT_ARRAY, RANGE_SHORT_ARRAY),
                edu.marywood.util.Arrays.equals(RANGE_SHORT_ARRAY, RANGE_SHORT_ARRAY));
    }

    /** The {@code Arrays.hashCode(boolean[])} test. */
    @Test
    public void hashCodeBooleanArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_BOOLEAN_ARRAY));
    }

    /** The {@code Arrays.hashCode(byte[])} test. */
    @Test
    public void hashCodeByteArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_BYTE_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_BYTE_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_BYTE_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_BYTE_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_BYTE_ARRAY));
    }

    /** The {@code Arrays.hashCode(char[])} test. */
    @Test
    public void hashCodeCharArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_CHAR_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_CHAR_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_CHAR_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_CHAR_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_CHAR_ARRAY));
    }

    /** The {@code Arrays.hashCode(double[])} test. */
    @Test
    public void hashCodeDoubleArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_DOUBLE_ARRAY));
    }

    /** The {@code Arrays.hashCode(float[])} test. */
    @Test
    public void hashCodeFloatArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_FLOAT_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_FLOAT_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_FLOAT_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_FLOAT_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_FLOAT_ARRAY));
    }

    /** The {@code Arrays.hashCode(int[])} test. */
    @Test
    public void hashCodeIntArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_INT_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_INT_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_INT_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_INT_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_INT_ARRAY));
    }

    /** The {@code Arrays.hashCode(long[])} test. */
    @Test
    public void hashCodeLongArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_LONG_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_LONG_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_LONG_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_LONG_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_LONG_ARRAY));
    }

    /** The {@code Arrays.hashCode(Object[])} test. */
    @Test
    public void hashCodeObjectArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_OBJECT_ARRAY));
    }

    /** The {@code Arrays.hashCode(short[])} test. */
    @Test
    public void hashCodeShortArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_SHORT_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_SHORT_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(LONER_SHORT_ARRAY),
                edu.marywood.util.Arrays.hashCode(LONER_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(RANGE_SHORT_ARRAY),
                edu.marywood.util.Arrays.hashCode(RANGE_SHORT_ARRAY));
    }

    /** The {@code Arrays.toString(boolean[])} test. */
    @Test
    public void toStringBooleanArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_BOOLEAN_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_BOOLEAN_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_BOOLEAN_ARRAY));
    }

    /** The {@code Arrays.toString(byte[])} test. */
    @Test
    public void toStringByteArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_BYTE_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_BYTE_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_BYTE_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_BYTE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_BYTE_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_BYTE_ARRAY));
    }

    /** The {@code Arrays.toString(char[])} test. */
    @Test
    public void toStringCharArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_CHAR_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_CHAR_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_CHAR_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_CHAR_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_CHAR_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_CHAR_ARRAY));
    }

    /** The {@code Arrays.toString(double[])} test. */
    @Test
    public void toStringDoubleArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_DOUBLE_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_DOUBLE_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_DOUBLE_ARRAY));
    }

    /** The {@code Arrays.toString(float[])} test. */
    @Test
    public void toStringFloatArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_FLOAT_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_FLOAT_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_FLOAT_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_FLOAT_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_FLOAT_ARRAY));
    }

    /** The {@code Arrays.toString(int[])} test. */
    @Test
    public void toStringIntArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_INT_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_INT_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_INT_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_INT_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_INT_ARRAY));
    }

    /** The {@code Arrays.toString(long[])} test. */
    @Test
    public void toStringLongArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_LONG_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_LONG_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_LONG_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_LONG_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_LONG_ARRAY));
    }

    /** The {@code Arrays.toString(Object[])} test. */
    @Test
    public void toStringObjectArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_OBJECT_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_OBJECT_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_OBJECT_ARRAY));
    }

    /** The {@code Arrays.toString(short[])} test. */
    @Test
    public void toStringShortArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_SHORT_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_SHORT_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(LONER_SHORT_ARRAY),
                edu.marywood.util.Arrays.toString(LONER_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(RANGE_SHORT_ARRAY),
                edu.marywood.util.Arrays.toString(RANGE_SHORT_ARRAY));
    }
}
