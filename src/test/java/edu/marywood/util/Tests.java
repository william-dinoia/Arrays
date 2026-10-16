package edu.marywood.util;

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
    private static float[] lonerFloatArray = new float[] {Float.MIN_VALUE};
    private static int[] lonerIntArray = new int[] {Integer.MIN_VALUE};
    private static long[] lonerLongArray = new long[] {Long.MIN_VALUE};
    private static Object[] lonerObjectArray = new Object[] {new Object()};
    private static short[] lonerShortArray = new short[] {Short.MIN_VALUE};
    private static boolean[] rangeBooleanArray = new boolean[] {false, true};
    private static byte[] rangeByteArray = new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE};
    private static char[] rangeCharArray = new char[] {Character.MIN_VALUE, Character.MAX_VALUE};
    private static double[] rangeDoubleArray = new double[] {Double.MIN_VALUE, Double.MAX_VALUE};
    private static float[] rangeFloatArray = new float[] {Float.MIN_VALUE, Float.MAX_VALUE};
    private static int[] rangeIntArray = new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE};
    private static long[] rangeLongArray = new long[] {Long.MIN_VALUE, Long.MAX_VALUE};
    private static Object[] rangeObjectArray =
            new Object[] {
                new Object(),
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
    private static short[] rangeShortArray = new short[] {Short.MIN_VALUE, Short.MAX_VALUE};

    /** Tests {@code Arrays.deepHashCode(Object[])}. */
    @Test
    public void deepHashCodeObjectArray() {
        Object[] omegaObjectArray = new Object[2];
        omegaObjectArray[0] = omegaObjectArray;
        omegaObjectArray[1] = rangeObjectArray;
        Assertions.assertEquals(
                java.util.Arrays.deepHashCode(BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepHashCode(BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepHashCode(EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepHashCode(EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepHashCode(lonerObjectArray),
                edu.marywood.util.Arrays.deepHashCode(lonerObjectArray));
        Assertions.assertEquals(
                java.util.Arrays.deepHashCode(rangeObjectArray),
                edu.marywood.util.Arrays.deepHashCode(rangeObjectArray));
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

    /** Tests {@code Arrays.deepToString(Object[])}. */
    @Test
    public void deepToStringObjectArray() {
        Object[] omegaObjectArray = new Object[2];
        omegaObjectArray[0] = omegaObjectArray;
        omegaObjectArray[1] = rangeObjectArray;
        Assertions.assertEquals(
                java.util.Arrays.deepToString(BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepToString(BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepToString(EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.deepToString(EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.deepToString(lonerObjectArray),
                edu.marywood.util.Arrays.deepToString(lonerObjectArray));
        Assertions.assertEquals(
                java.util.Arrays.deepToString(omegaObjectArray),
                edu.marywood.util.Arrays.deepToString(omegaObjectArray));
        Assertions.assertEquals(
                java.util.Arrays.deepToString(rangeObjectArray),
                edu.marywood.util.Arrays.deepToString(rangeObjectArray));
    }

    /** Tests {@code Arrays.hashCode(boolean[])}. */
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
                java.util.Arrays.hashCode(rangeBooleanArray),
                edu.marywood.util.Arrays.hashCode(rangeBooleanArray));
    }

    /** Tests {@code Arrays.hashCode(byte[])}. */
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
                java.util.Arrays.hashCode(rangeByteArray),
                edu.marywood.util.Arrays.hashCode(rangeByteArray));
    }

    /** Tests {@code Arrays.hashCode(char[])}. */
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
                java.util.Arrays.hashCode(rangeCharArray),
                edu.marywood.util.Arrays.hashCode(rangeCharArray));
    }

    /** Tests {@code Arrays.hashCode(double[])}. */
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
                java.util.Arrays.hashCode(rangeDoubleArray),
                edu.marywood.util.Arrays.hashCode(rangeDoubleArray));
    }

    /** Tests {@code Arrays.hashCode(float[])}. */
    @Test
    public void hashCodeFloatArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_FLOAT_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_FLOAT_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(lonerFloatArray),
                edu.marywood.util.Arrays.hashCode(lonerFloatArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(rangeFloatArray),
                edu.marywood.util.Arrays.hashCode(rangeFloatArray));
    }

    /** Tests {@code Arrays.hashCode(int[])}. */
    @Test
    public void hashCodeIntArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_INT_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_INT_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(lonerIntArray),
                edu.marywood.util.Arrays.hashCode(lonerIntArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(rangeIntArray),
                edu.marywood.util.Arrays.hashCode(rangeIntArray));
    }

    /** Tests {@code Arrays.hashCode(long[])}. */
    @Test
    public void hashCodeLongArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_LONG_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_LONG_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(lonerLongArray),
                edu.marywood.util.Arrays.hashCode(lonerLongArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(rangeLongArray),
                edu.marywood.util.Arrays.hashCode(rangeLongArray));
    }

    /** Tests {@code Arrays.hashCode(Object[])}. */
    @Test
    public void hashCodeObjectArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(lonerObjectArray),
                edu.marywood.util.Arrays.hashCode(lonerObjectArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(rangeObjectArray),
                edu.marywood.util.Arrays.hashCode(rangeObjectArray));
    }

    /** Tests {@code Arrays.hashCode(short[])}. */
    @Test
    public void hashCodeShortArray() {
        Assertions.assertEquals(
                java.util.Arrays.hashCode(BLANK_SHORT_ARRAY),
                edu.marywood.util.Arrays.hashCode(BLANK_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(EMPTY_SHORT_ARRAY),
                edu.marywood.util.Arrays.hashCode(EMPTY_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(lonerShortArray),
                edu.marywood.util.Arrays.hashCode(lonerShortArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(rangeShortArray),
                edu.marywood.util.Arrays.hashCode(rangeShortArray));
    }

    /** Tests {@code Arrays.toString(boolean[])}. */
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
                java.util.Arrays.toString(rangeBooleanArray),
                edu.marywood.util.Arrays.toString(rangeBooleanArray));
    }

    /** Tests {@code Arrays.toString(byte[])}. */
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
                java.util.Arrays.toString(rangeByteArray),
                edu.marywood.util.Arrays.toString(rangeByteArray));
    }

    /** Tests {@code Arrays.toString(char[])}. */
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
                java.util.Arrays.toString(rangeCharArray),
                edu.marywood.util.Arrays.toString(rangeCharArray));
    }

    /** Tests {@code Arrays.toString(double[])}. */
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
                java.util.Arrays.toString(rangeDoubleArray),
                edu.marywood.util.Arrays.toString(rangeDoubleArray));
    }

    /** Tests {@code Arrays.toString(float[])}. */
    @Test
    public void toStringFloatArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_FLOAT_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_FLOAT_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_FLOAT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerFloatArray),
                edu.marywood.util.Arrays.toString(lonerFloatArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(rangeFloatArray),
                edu.marywood.util.Arrays.toString(rangeFloatArray));
    }

    /** Tests {@code Arrays.toString(int[])}. */
    @Test
    public void toStringIntArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_INT_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_INT_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_INT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerIntArray),
                edu.marywood.util.Arrays.toString(lonerIntArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(rangeIntArray),
                edu.marywood.util.Arrays.toString(rangeIntArray));
    }

    /** Tests {@code Arrays.toString(long[])}. */
    @Test
    public void toStringLongArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_LONG_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_LONG_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_LONG_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerLongArray),
                edu.marywood.util.Arrays.toString(lonerLongArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(rangeLongArray),
                edu.marywood.util.Arrays.toString(rangeLongArray));
    }

    /** Tests {@code Arrays.toString(Object[])}. */
    @Test
    public void toStringObjectArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_OBJECT_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_OBJECT_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_OBJECT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerObjectArray),
                edu.marywood.util.Arrays.toString(lonerObjectArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(rangeObjectArray),
                edu.marywood.util.Arrays.toString(rangeObjectArray));
    }

    /** Tests {@code Arrays.toString(short[])}. */
    @Test
    public void toStringShortArray() {
        Assertions.assertEquals(
                java.util.Arrays.toString(BLANK_SHORT_ARRAY),
                edu.marywood.util.Arrays.toString(BLANK_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(EMPTY_SHORT_ARRAY),
                edu.marywood.util.Arrays.toString(EMPTY_SHORT_ARRAY));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerShortArray),
                edu.marywood.util.Arrays.toString(lonerShortArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(rangeShortArray),
                edu.marywood.util.Arrays.toString(rangeShortArray));
    }
}
