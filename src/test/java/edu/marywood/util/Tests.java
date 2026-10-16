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
    private static byte[] emptyByteArray = new byte[] {};
    private static char[] emptyCharArray = new char[] {};
    private static double[] emptyDoubleArray = new double[] {};
    private static float[] emptyFloatArray = new float[] {};
    private static int[] emptyIntArray = new int[] {};
    private static long[] emptyLongArray = new long[] {};
    private static Object[] emptyObjectArray = new Object[] {};
    private static short[] emptyShortArray = new short[] {};
    private static boolean[] lonerBooleanArray = new boolean[] {false};
    private static byte[] lonerByteArray = new byte[] {Byte.MIN_VALUE};
    private static char[] lonerCharArray = new char[] {Character.MIN_VALUE};
    private static double[] lonerDoubleArray = new double[] {Double.MIN_VALUE};
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
                java.util.Arrays.deepHashCode(emptyObjectArray),
                edu.marywood.util.Arrays.deepHashCode(emptyObjectArray));
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
                java.util.Arrays.deepToString(emptyObjectArray),
                edu.marywood.util.Arrays.deepToString(emptyObjectArray));
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
                java.util.Arrays.hashCode(lonerBooleanArray),
                edu.marywood.util.Arrays.hashCode(lonerBooleanArray));
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
                java.util.Arrays.hashCode(emptyByteArray),
                edu.marywood.util.Arrays.hashCode(emptyByteArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(lonerByteArray),
                edu.marywood.util.Arrays.hashCode(lonerByteArray));
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
                java.util.Arrays.hashCode(emptyCharArray),
                edu.marywood.util.Arrays.hashCode(emptyCharArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(lonerCharArray),
                edu.marywood.util.Arrays.hashCode(lonerCharArray));
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
                java.util.Arrays.hashCode(emptyDoubleArray),
                edu.marywood.util.Arrays.hashCode(emptyDoubleArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(lonerDoubleArray),
                edu.marywood.util.Arrays.hashCode(lonerDoubleArray));
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
                java.util.Arrays.hashCode(emptyFloatArray),
                edu.marywood.util.Arrays.hashCode(emptyFloatArray));
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
                java.util.Arrays.hashCode(emptyIntArray),
                edu.marywood.util.Arrays.hashCode(emptyIntArray));
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
                java.util.Arrays.hashCode(emptyLongArray),
                edu.marywood.util.Arrays.hashCode(emptyLongArray));
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
                java.util.Arrays.hashCode(emptyObjectArray),
                edu.marywood.util.Arrays.hashCode(emptyObjectArray));
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
                java.util.Arrays.hashCode(emptyShortArray),
                edu.marywood.util.Arrays.hashCode(emptyShortArray));
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
                java.util.Arrays.toString(lonerBooleanArray),
                edu.marywood.util.Arrays.toString(lonerBooleanArray));
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
                java.util.Arrays.toString(emptyByteArray),
                edu.marywood.util.Arrays.toString(emptyByteArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerByteArray),
                edu.marywood.util.Arrays.toString(lonerByteArray));
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
                java.util.Arrays.toString(emptyCharArray),
                edu.marywood.util.Arrays.toString(emptyCharArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerCharArray),
                edu.marywood.util.Arrays.toString(lonerCharArray));
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
                java.util.Arrays.toString(emptyDoubleArray),
                edu.marywood.util.Arrays.toString(emptyDoubleArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerDoubleArray),
                edu.marywood.util.Arrays.toString(lonerDoubleArray));
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
                java.util.Arrays.toString(emptyFloatArray),
                edu.marywood.util.Arrays.toString(emptyFloatArray));
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
                java.util.Arrays.toString(emptyIntArray),
                edu.marywood.util.Arrays.toString(emptyIntArray));
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
                java.util.Arrays.toString(emptyLongArray),
                edu.marywood.util.Arrays.toString(emptyLongArray));
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
                java.util.Arrays.toString(emptyObjectArray),
                edu.marywood.util.Arrays.toString(emptyObjectArray));
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
                java.util.Arrays.toString(emptyShortArray),
                edu.marywood.util.Arrays.toString(emptyShortArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(lonerShortArray),
                edu.marywood.util.Arrays.toString(lonerShortArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(rangeShortArray),
                edu.marywood.util.Arrays.toString(rangeShortArray));
    }
}
