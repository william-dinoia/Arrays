package edu.marywood.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Defines {@link ArraysTest}.
 *
 * @author William DiNoia
 */
public class ArraysTest {
    private static boolean[] blankBooleanArray;
    private static byte[] blankByteArray;
    private static char[] blankCharArray;
    private static double[] blankDoubleArray;
    private static float[] blankFloatArray;
    private static int[] blankIntArray;
    private static long[] blankLongArray;
    private static Object[] blankObjectArray;
    private static short[] blankShortArray;
    private static boolean[] emptyBooleanArray;
    private static byte[] emptyByteArray;
    private static char[] emptyCharArray;
    private static double[] emptyDoubleArray;
    private static float[] emptyFloatArray;
    private static int[] emptyIntArray;
    private static long[] emptyLongArray;
    private static Object[] emptyObjectArray;
    private static short[] emptyShortArray;
    private static boolean[] lonerBooleanArray;
    private static byte[] lonerByteArray;
    private static char[] lonerCharArray;
    private static double[] lonerDoubleArray;
    private static float[] lonerFloatArray;
    private static int[] lonerIntArray;
    private static long[] lonerLongArray;
    private static Object[] lonerObjectArray;
    private static short[] lonerShortArray;
    private static boolean[] rangeBooleanArray;
    private static byte[] rangeByteArray;
    private static char[] rangeCharArray;
    private static double[] rangeDoubleArray;
    private static float[] rangeFloatArray;
    private static int[] rangeIntArray;
    private static long[] rangeLongArray;
    private static Object[] rangeObjectArray;
    private static short[] rangeShortArray;

    /** The ``before all'' method of {@link ArraysTest}. */
    @BeforeAll
    public static void beforeAll() {
        blankBooleanArray = null;
        blankByteArray = null;
        blankCharArray = null;
        blankDoubleArray = null;
        blankFloatArray = null;
        blankIntArray = null;
        blankLongArray = null;
        blankObjectArray = null;
        blankShortArray = null;
        emptyBooleanArray = new boolean[] {};
        emptyByteArray = new byte[] {};
        emptyCharArray = new char[] {};
        emptyDoubleArray = new double[] {};
        emptyFloatArray = new float[] {};
        emptyIntArray = new int[] {};
        emptyLongArray = new long[] {};
        emptyObjectArray = new Object[] {};
        emptyShortArray = new short[] {};
        lonerBooleanArray = new boolean[] {false};
        lonerByteArray = new byte[] {Byte.MIN_VALUE};
        lonerCharArray = new char[] {Character.MIN_VALUE};
        lonerDoubleArray = new double[] {Double.MIN_VALUE};
        lonerFloatArray = new float[] {Float.MIN_VALUE};
        lonerIntArray = new int[] {Integer.MIN_VALUE};
        lonerLongArray = new long[] {Long.MIN_VALUE};
        lonerObjectArray = new Object[] {new Object()};
        lonerShortArray = new short[] {Short.MIN_VALUE};
        rangeBooleanArray = new boolean[] {false, true};
        rangeByteArray = new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE};
        rangeCharArray = new char[] {Character.MIN_VALUE, Character.MAX_VALUE};
        rangeDoubleArray = new double[] {Double.MIN_VALUE, Double.MAX_VALUE};
        rangeFloatArray = new float[] {Float.MIN_VALUE, Float.MAX_VALUE};
        rangeIntArray = new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE};
        rangeLongArray = new long[] {Long.MIN_VALUE, Long.MAX_VALUE};
        rangeObjectArray =
                new Object[] {
                    null,
                    new Object(),
                    new boolean[] {true, false},
                    new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE},
                    new char[] {Character.MIN_VALUE, Character.MAX_VALUE},
                    new double[] {Double.MIN_VALUE, Double.MAX_VALUE},
                    new float[] {Float.MIN_VALUE, Float.MAX_VALUE},
                    new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE},
                    new long[] {Long.MIN_VALUE, Long.MAX_VALUE},
                    new short[] {Short.MIN_VALUE, Short.MAX_VALUE}
                };
        rangeShortArray = new short[] {Short.MIN_VALUE, Short.MAX_VALUE};
    }

    /** Tests {@code Arrays.deepToString(Object[])}. */
    @Test
    public void deepToStringObjectArray() {
        Object[] omegaObjectArray = new Object[2];
        omegaObjectArray[0] = omegaObjectArray;
        omegaObjectArray[1] = rangeObjectArray;
        Assertions.assertEquals(
                java.util.Arrays.deepToString(blankObjectArray),
                edu.marywood.util.Arrays.deepToString(blankObjectArray));
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
                java.util.Arrays.hashCode(blankBooleanArray),
                edu.marywood.util.Arrays.hashCode(blankBooleanArray));
        Assertions.assertEquals(
                java.util.Arrays.hashCode(emptyBooleanArray),
                edu.marywood.util.Arrays.hashCode(emptyBooleanArray));
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
                java.util.Arrays.hashCode(blankByteArray),
                edu.marywood.util.Arrays.hashCode(blankByteArray));
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
                java.util.Arrays.hashCode(blankCharArray),
                edu.marywood.util.Arrays.hashCode(blankCharArray));
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
                java.util.Arrays.hashCode(blankDoubleArray),
                edu.marywood.util.Arrays.hashCode(blankDoubleArray));
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
                java.util.Arrays.hashCode(blankFloatArray),
                edu.marywood.util.Arrays.hashCode(blankFloatArray));
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
                java.util.Arrays.hashCode(blankIntArray),
                edu.marywood.util.Arrays.hashCode(blankIntArray));
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
                java.util.Arrays.hashCode(blankLongArray),
                edu.marywood.util.Arrays.hashCode(blankLongArray));
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
                java.util.Arrays.hashCode(blankObjectArray),
                edu.marywood.util.Arrays.hashCode(blankObjectArray));
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
                java.util.Arrays.hashCode(blankShortArray),
                edu.marywood.util.Arrays.hashCode(blankShortArray));
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
                java.util.Arrays.toString(blankBooleanArray),
                edu.marywood.util.Arrays.toString(blankBooleanArray));
        Assertions.assertEquals(
                java.util.Arrays.toString(emptyBooleanArray),
                edu.marywood.util.Arrays.toString(emptyBooleanArray));
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
                java.util.Arrays.toString(blankByteArray),
                edu.marywood.util.Arrays.toString(blankByteArray));
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
                java.util.Arrays.toString(blankCharArray),
                edu.marywood.util.Arrays.toString(blankCharArray));
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
                java.util.Arrays.toString(blankDoubleArray),
                edu.marywood.util.Arrays.toString(blankDoubleArray));
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
                java.util.Arrays.toString(blankFloatArray),
                edu.marywood.util.Arrays.toString(blankFloatArray));
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
                java.util.Arrays.toString(blankIntArray),
                edu.marywood.util.Arrays.toString(blankIntArray));
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
                java.util.Arrays.toString(blankLongArray),
                edu.marywood.util.Arrays.toString(blankLongArray));
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
                java.util.Arrays.toString(blankObjectArray),
                edu.marywood.util.Arrays.toString(blankObjectArray));
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
                java.util.Arrays.toString(blankShortArray),
                edu.marywood.util.Arrays.toString(blankShortArray));
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
