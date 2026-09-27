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
        emptyBooleanArray = new boolean[] {};
        lonerBooleanArray = new boolean[] {false};
        rangeBooleanArray = new boolean[] {false, true};
        blankByteArray = null;
        emptyByteArray = new byte[] {};
        lonerByteArray = new byte[] {Byte.MIN_VALUE};
        rangeByteArray = new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE};
        blankCharArray = null;
        emptyCharArray = new char[] {};
        lonerCharArray = new char[] {Character.MIN_VALUE};
        rangeCharArray = new char[] {Character.MIN_VALUE, Character.MAX_VALUE};
        blankDoubleArray = null;
        emptyDoubleArray = new double[] {};
        lonerDoubleArray = new double[] {Double.MIN_VALUE};
        rangeDoubleArray = new double[] {Double.MIN_VALUE, Double.MAX_VALUE};
        blankFloatArray = null;
        emptyFloatArray = new float[] {};
        lonerFloatArray = new float[] {Float.MIN_VALUE};
        rangeFloatArray = new float[] {Float.MIN_VALUE, Float.MAX_VALUE};
        blankIntArray = null;
        emptyIntArray = new int[] {};
        lonerIntArray = new int[] {Integer.MIN_VALUE};
        rangeIntArray = new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE};
        blankLongArray = null;
        emptyLongArray = new long[] {};
        lonerLongArray = new long[] {Long.MIN_VALUE};
        rangeLongArray = new long[] {Long.MIN_VALUE, Long.MAX_VALUE};
        blankObjectArray = null;
        emptyObjectArray = new Object[] {};
        lonerObjectArray = new Object[] {new Object()};
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
        blankShortArray = null;
        emptyShortArray = new short[] {};
        lonerShortArray = new short[] {Short.MIN_VALUE};
        rangeShortArray = new short[] {Short.MIN_VALUE, Short.MAX_VALUE};
    }

    /** Tests {@code Arrays.deepToString(Object[])}. */
    @Test
    public void deepToStringObjectArray() {
        Object[] blankObjectArray = null;
        Object[] emptyObjectArray = new Object[] {};
        Object[] lonerObjectArray = new Object[] {new Object()};
        Object[] omegaObjectArray = new Object[1];
        Object[] rangeObjectArray =
                new Object[] {
                    null,
                    emptyObjectArray,
                    new boolean[] {true, false},
                    new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE},
                    new char[] {Character.MIN_VALUE, Character.MAX_VALUE},
                    new double[] {Double.MIN_VALUE, Double.MAX_VALUE},
                    new float[] {Float.MIN_VALUE, Float.MAX_VALUE},
                    new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE},
                    new long[] {Long.MIN_VALUE, Long.MAX_VALUE},
                    new short[] {Short.MIN_VALUE, Short.MAX_VALUE},
                    true,
                    Byte.MIN_VALUE,
                    Character.MIN_VALUE,
                    Double.MIN_VALUE,
                    Float.MIN_VALUE,
                    Integer.MIN_VALUE,
                    Long.MIN_VALUE,
                    Short.MIN_VALUE
                };
        omegaObjectArray[0] = new Object[] {null, new Object[] {null, omegaObjectArray}};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.deepToString(blankObjectArray)
                        .equals(java.util.Arrays.deepToString(blankObjectArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.deepToString(emptyObjectArray)
                        .equals(java.util.Arrays.deepToString(emptyObjectArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.deepToString(lonerObjectArray)
                        .equals(java.util.Arrays.deepToString(lonerObjectArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.deepToString(omegaObjectArray)
                        .equals(java.util.Arrays.deepToString(omegaObjectArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.deepToString(rangeObjectArray)
                        .equals(java.util.Arrays.deepToString(rangeObjectArray)));
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
        long[] blankLongArray = null;
        long[] emptyLongArray = new long[] {};
        long[] lonerLongArray = new long[] {Long.MIN_VALUE};
        long[] rangeLongArray = new long[] {Long.MIN_VALUE, Long.MAX_VALUE};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankLongArray)
                        .equals(java.util.Arrays.toString(blankLongArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyLongArray)
                        .equals(java.util.Arrays.toString(emptyLongArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerLongArray)
                        .equals(java.util.Arrays.toString(lonerLongArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeLongArray)
                        .equals(java.util.Arrays.toString(rangeLongArray)));
    }

    /** Tests {@code Arrays.toString(Object[])}. */
    @Test
    public void toStringObjectArray() {
        Object[] blankObjectArray = null;
        Object[] emptyObjectArray = new Object[] {};
        Object[] lonerObjectArray = new Object[] {new Object()};
        Object[] rangeObjectArray =
                new Object[] {
                    null,
                    emptyObjectArray,
                    new boolean[] {true, false},
                    new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE},
                    new char[] {Character.MIN_VALUE, Character.MAX_VALUE},
                    new double[] {Double.MIN_VALUE, Double.MAX_VALUE},
                    new float[] {Float.MIN_VALUE, Float.MAX_VALUE},
                    new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE},
                    new long[] {Long.MIN_VALUE, Long.MAX_VALUE},
                    new short[] {Short.MIN_VALUE, Short.MAX_VALUE},
                    true,
                    Byte.MIN_VALUE,
                    Character.MIN_VALUE,
                    Double.MIN_VALUE,
                    Float.MIN_VALUE,
                    Integer.MIN_VALUE,
                    Long.MIN_VALUE,
                    Short.MIN_VALUE
                };
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankObjectArray)
                        .equals(java.util.Arrays.toString(blankObjectArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyObjectArray)
                        .equals(java.util.Arrays.toString(emptyObjectArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerObjectArray)
                        .equals(java.util.Arrays.toString(lonerObjectArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeObjectArray)
                        .equals(java.util.Arrays.toString(rangeObjectArray)));
    }

    /** Tests {@code Arrays.toString(short[])}. */
    @Test
    public void toStringShortArray() {
        short[] blankShortArray = null;
        short[] emptyShortArray = new short[] {};
        short[] lonerShortArray = new short[] {Short.MIN_VALUE};
        short[] rangeShortArray = new short[] {Short.MIN_VALUE, Short.MAX_VALUE};
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(blankShortArray)
                        .equals(java.util.Arrays.toString(blankShortArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(emptyShortArray)
                        .equals(java.util.Arrays.toString(emptyShortArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(lonerShortArray)
                        .equals(java.util.Arrays.toString(lonerShortArray)));
        Assertions.assertTrue(
                edu.marywood.util.Arrays.toString(rangeShortArray)
                        .equals(java.util.Arrays.toString(rangeShortArray)));
    }
}
