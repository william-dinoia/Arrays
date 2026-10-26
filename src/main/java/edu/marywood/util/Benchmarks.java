package edu.marywood.util;

import java.util.Arrays;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Defines {@link Benchmarks}.
 *
 * @author William DiNoia
 */
@State(Scope.Group)
@Fork(value = 1)
@Measurement(iterations = 1)
@Warmup(iterations = 1)
public class Benchmarks {
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
    private static final short[] RANGE_SHORT_ARRAY = new short[] {Short.MIN_VALUE, Short.MAX_VALUE};

    private boolean[] booleanArray;
    private byte[] byteArray;
    private char[] charArray;
    private double[] doubleArray;
    private float[] floatArray;
    private int[] intArray;
    private long[] longArray;
    private Object[] objectArray;
    private short[] shortArray;

    @Param({"0", "1", "10", "100", "1000", "10000", "100000", "1000000"})
    private int size;

    /**
     * The main method of {@link Benchmarks}.
     *
     * @param stringArray {@link String}{@code []}
     */
    public static void main(String[] stringArray) throws RunnerException {
        OptionsBuilder optionsBuilder = new OptionsBuilder();
        optionsBuilder.include(Benchmarks.class.getSimpleName());
        Runner runner = new Runner(optionsBuilder.build());
        runner.run();
    }

    /** The Marywood {@code Arrays.deepEquals(Object[], Object[])} benchmark. */
    @Benchmark
    @Group("deepEqualsObjectArrayObjectArray")
    public void marywoodDeepEqualsObjectArrayObjectArray() {
        edu.marywood.util.Arrays.deepEquals(
                this.objectArray, Arrays.copyOf(this.objectArray, this.objectArray.length));
    }

    /** The Marywood {@code Arrays.deepHashCode(Object[])} benchmark. */
    @Benchmark
    @Group("deepHashCodeObjectArray")
    public void marywoodDeepHashCodeObjectArray() {
        edu.marywood.util.Arrays.deepHashCode(this.objectArray);
    }

    /** The Marywood {@code Arrays.deepToString(Object[])} benchmark. */
    @Benchmark
    @Group("deepToStringObjectArray")
    public void marywoodDeepToStringObjectArray() {
        edu.marywood.util.Arrays.deepToString(this.objectArray);
    }

    /** The Marywood {@code Arrays.equals(boolean[], boolean[])} benchmark. */
    @Benchmark
    @Group("equalsBooleanArrayBooleanArray")
    public void marywoodEqualsBooleanArrayBooleanArray() {
        edu.marywood.util.Arrays.equals(
                this.booleanArray, Arrays.copyOf(this.booleanArray, this.booleanArray.length));
    }

    /** The Marywood {@code Arrays.equals(byte[], byte[])} benchmark. */
    @Benchmark
    @Group("equalsByteArrayByteArray")
    public void marywoodEqualsByteArrayByteArray() {
        edu.marywood.util.Arrays.equals(
                this.byteArray, Arrays.copyOf(this.byteArray, this.byteArray.length));
    }

    /** The Marywood {@code Arrays.equals(char[], char[])} benchmark. */
    @Benchmark
    @Group("equalsCharArrayCharArray")
    public void marywoodEqualsCharArrayCharArray() {
        edu.marywood.util.Arrays.equals(
                this.charArray, Arrays.copyOf(this.charArray, this.charArray.length));
    }

    /** The Marywood {@code Arrays.equals(double[], double[])} benchmark. */
    @Benchmark
    @Group("equalsDoubleArrayDoubleArray")
    public void marywoodEqualsDoubleArrayDoubleArray() {
        edu.marywood.util.Arrays.equals(
                this.doubleArray, Arrays.copyOf(this.doubleArray, this.doubleArray.length));
    }

    /** The Marywood {@code Arrays.equals(float[], float[])} benchmark. */
    @Benchmark
    @Group("equalsFloatArrayFloatArray")
    public void marywoodEqualsFloatArrayFloatArray() {
        edu.marywood.util.Arrays.equals(
                this.floatArray, Arrays.copyOf(this.floatArray, this.floatArray.length));
    }

    /** The Marywood {@code Arrays.equals(int[], int[])} benchmark. */
    @Benchmark
    @Group("equalsIntArrayIntArray")
    public void marywoodEqualsIntArrayIntArray() {
        edu.marywood.util.Arrays.equals(
                this.intArray, Arrays.copyOf(this.intArray, this.intArray.length));
    }

    /** The Marywood {@code Arrays.equals(long[], long[])} benchmark. */
    @Benchmark
    @Group("equalsLongArrayLongArray")
    public void marywoodEqualsLongArrayLongArray() {
        edu.marywood.util.Arrays.equals(
                this.longArray, Arrays.copyOf(this.longArray, this.longArray.length));
    }

    /** The Marywood {@code Arrays.equals(Object[], Object[])} benchmark. */
    @Benchmark
    @Group("equalsObjectArrayObjectArray")
    public void marywoodEqualsObjectArrayObjectArray() {
        edu.marywood.util.Arrays.equals(
                this.objectArray, Arrays.copyOf(this.objectArray, this.objectArray.length));
    }

    /** The Marywood {@code Arrays.equals(short[], short[])} benchmark. */
    @Benchmark
    @Group("equalsShortArrayShortArray")
    public void marywoodEqualsShortArrayShortArray() {
        edu.marywood.util.Arrays.equals(
                this.shortArray, Arrays.copyOf(this.shortArray, this.shortArray.length));
    }

    /** The Marywood {@code Arrays.hashCode(boolean[])} benchmark. */
    @Benchmark
    @Group("hashCodeBooleanArray")
    public void marywoodHashCodeBooleanArray() {
        edu.marywood.util.Arrays.hashCode(this.booleanArray);
    }

    /** The Marywood {@code Arrays.hashCode(byte[])} benchmark. */
    @Benchmark
    @Group("hashCodeByteArray")
    public void marywoodHashCodeByteArray() {
        edu.marywood.util.Arrays.hashCode(this.byteArray);
    }

    /** The Marywood {@code Arrays.hashCode(char[])} benchmark. */
    @Benchmark
    @Group("hashCodeCharArray")
    public void marywoodHashCodeCharArray() {
        edu.marywood.util.Arrays.hashCode(this.charArray);
    }

    /** The Marywood {@code Arrays.hashCode(double[])} benchmark. */
    @Benchmark
    @Group("hashCodeDoubleArray")
    public void marywoodHashCodeDoubleArray() {
        edu.marywood.util.Arrays.hashCode(this.doubleArray);
    }

    /** The Marywood {@code Arrays.hashCode(float[])} benchmark. */
    @Benchmark
    @Group("hashCodeFloatArray")
    public void marywoodHashCodeFloatArray() {
        edu.marywood.util.Arrays.hashCode(this.floatArray);
    }

    /** The Marywood {@code Arrays.hashCode(int[])} benchmark. */
    @Benchmark
    @Group("hashCodeIntArray")
    public void marywoodHashCodeIntArray() {
        edu.marywood.util.Arrays.hashCode(this.intArray);
    }

    /** The Marywood {@code Arrays.hashCode(long[])} benchmark. */
    @Benchmark
    @Group("hashCodeLongArray")
    public void marywoodHashCodeLongArray() {
        edu.marywood.util.Arrays.hashCode(this.longArray);
    }

    /** The Marywood {@code Arrays.hashCode(Object[])} benchmark. */
    @Benchmark
    @Group("hashCodeObjectArray")
    public void marywoodHashCodeObjectArray() {
        edu.marywood.util.Arrays.hashCode(this.objectArray);
    }

    /** The Marywood {@code Arrays.hashCode(short[])} benchmark. */
    @Benchmark
    @Group("hashCodeShortArray")
    public void marywoodHashCodeShortArray() {
        edu.marywood.util.Arrays.hashCode(this.shortArray);
    }

    /** The Marywood {@code Arrays.toString(boolean[])} benchmark. */
    @Benchmark
    @Group("toStringBooleanArray")
    public void marywoodToStringBooleanArray() {
        edu.marywood.util.Arrays.toString(this.booleanArray);
    }

    /** The Marywood {@code Arrays.toString(byte[])} benchmark. */
    @Benchmark
    @Group("toStringByteArray")
    public void marywoodToStringByteArray() {
        edu.marywood.util.Arrays.toString(this.byteArray);
    }

    /** The Marywood {@code Arrays.toString(char[])} benchmark. */
    @Benchmark
    @Group("toStringCharArray")
    public void marywoodToStringCharArray() {
        edu.marywood.util.Arrays.toString(this.charArray);
    }

    /** The Marywood {@code Arrays.toString(double[])} benchmark. */
    @Benchmark
    @Group("toStringDoubleArray")
    public void marywoodToStringDoubleArray() {
        edu.marywood.util.Arrays.toString(this.doubleArray);
    }

    /** The Marywood {@code Arrays.toString(float[])} benchmark. */
    @Benchmark
    @Group("toStringFloatArray")
    public void marywoodToStringFloatArray() {
        edu.marywood.util.Arrays.toString(this.floatArray);
    }

    /** The Marywood {@code Arrays.toString(int[])} benchmark. */
    @Benchmark
    @Group("toStringIntArray")
    public void marywoodToStringIntArray() {
        edu.marywood.util.Arrays.toString(this.intArray);
    }

    /** The Marywood {@code Arrays.toString(long[])} benchmark. */
    @Benchmark
    @Group("toStringLongArray")
    public void marywoodToStringLongArray() {
        edu.marywood.util.Arrays.toString(this.longArray);
    }

    /** The Marywood {@code Arrays.toString(Object[])} benchmark. */
    @Benchmark
    @Group("toStringObjectArray")
    public void marywoodToStringObjectArray() {
        edu.marywood.util.Arrays.toString(this.objectArray);
    }

    /** The Marywood {@code Arrays.toString(short[])} benchmark. */
    @Benchmark
    @Group("toStringShortArray")
    public void marywoodToStringShortArray() {
        edu.marywood.util.Arrays.toString(this.shortArray);
    }

    /** The OpenJDK {@code Arrays.deepEquals(Object[], Object[])} benchmark. */
    @Benchmark
    @Group("deepEqualsObjectArrayObjectArray")
    public void openJDKDeepEqualsObjectArrayObjectArray() {
        java.util.Arrays.deepEquals(
                this.objectArray, Arrays.copyOf(this.objectArray, this.objectArray.length));
    }

    /** The OpenJDK {@code Arrays.deepHashCode(Object[])} benchmark. */
    @Benchmark
    @Group("deepHashCodeObjectArray")
    public void openJDKDeepHashCodeObjectArray() {
        java.util.Arrays.deepHashCode(this.objectArray);
    }

    /** The OpenJDK {@code Arrays.deepToString(Object[])} benchmark. */
    @Benchmark
    @Group("deepToStringObjectArray")
    public void openJDKDeepToStringObjectArray() {
        java.util.Arrays.deepToString(this.objectArray);
    }

    /** The OpenJDK {@code Arrays.equals(boolean[], boolean[])} benchmark. */
    @Benchmark
    @Group("equalsBooleanArrayBooleanArray")
    public void openJDKEqualsBooleanArrayBooleanArray() {
        java.util.Arrays.equals(
                this.booleanArray, Arrays.copyOf(this.booleanArray, this.booleanArray.length));
    }

    /** The OpenJDK {@code Arrays.equals(byte[], byte[])} benchmark. */
    @Benchmark
    @Group("equalsByteArrayByteArray")
    public void openJDKEqualsByteArrayByteArray() {
        java.util.Arrays.equals(
                this.byteArray, Arrays.copyOf(this.byteArray, this.byteArray.length));
    }

    /** The OpenJDK {@code Arrays.equals(char[], char[])} benchmark. */
    @Benchmark
    @Group("equalsCharArrayCharArray")
    public void openJDKEqualsCharArrayCharArray() {
        java.util.Arrays.equals(
                this.charArray, Arrays.copyOf(this.charArray, this.charArray.length));
    }

    /** The OpenJDK {@code Arrays.equals(double[], double[])} benchmark. */
    @Benchmark
    @Group("equalsDoubleArrayDoubleArray")
    public void openJDKEqualsDoubleArrayDoubleArray() {
        java.util.Arrays.equals(
                this.doubleArray, Arrays.copyOf(this.doubleArray, this.doubleArray.length));
    }

    /** The OpenJDK {@code Arrays.equals(float[], float[])} benchmark. */
    @Benchmark
    @Group("equalsFloatArrayFloatArray")
    public void openJDKEqualsFloatArrayFloatArray() {
        java.util.Arrays.equals(
                this.floatArray, Arrays.copyOf(this.floatArray, this.floatArray.length));
    }

    /** The OpenJDK {@code Arrays.equals(int[], int[])} benchmark. */
    @Benchmark
    @Group("equalsIntArrayIntArray")
    public void openJDKEqualsIntArrayIntArray() {
        java.util.Arrays.equals(this.intArray, Arrays.copyOf(this.intArray, this.intArray.length));
    }

    /** The OpenJDK {@code Arrays.equals(long[], long[])} benchmark. */
    @Benchmark
    @Group("equalsLongArrayLongArray")
    public void openJDKEqualsLongArrayLongArray() {
        java.util.Arrays.equals(
                this.longArray, Arrays.copyOf(this.longArray, this.longArray.length));
    }

    /** The OpenJDK {@code Arrays.equals(Object[], Object[])} benchmark. */
    @Benchmark
    @Group("equalsObjectArrayObjectArray")
    public void openJDKEqualsObjectArrayObjectArray() {
        java.util.Arrays.equals(
                this.objectArray, Arrays.copyOf(this.objectArray, this.objectArray.length));
    }

    /** The OpenJDK {@code Arrays.equals(short[], short[])} benchmark. */
    @Benchmark
    @Group("equalsShortArrayShortArray")
    public void openJDKEqualsShortArrayShortArray() {
        java.util.Arrays.equals(
                this.shortArray, Arrays.copyOf(this.shortArray, this.shortArray.length));
    }

    /** The OpenJDK {@code Arrays.hashCode(boolean[])} benchmark. */
    @Benchmark
    @Group("hashCodeBooleanArray")
    public void openJDKHashCodeBooleanArray() {
        java.util.Arrays.hashCode(this.booleanArray);
    }

    /** The OpenJDK {@code Arrays.hashCode(byte[])} benchmark. */
    @Benchmark
    @Group("hashCodeByteArray")
    public void openJDKHashCodeByteArray() {
        java.util.Arrays.hashCode(this.byteArray);
    }

    /** The OpenJDK {@code Arrays.hashCode(char[])} benchmark. */
    @Benchmark
    @Group("hashCodeCharArray")
    public void openJDKHashCodeCharArray() {
        java.util.Arrays.hashCode(this.charArray);
    }

    /** The OpenJDK {@code Arrays.hashCode(double[])} benchmark. */
    @Benchmark
    @Group("hashCodeDoubleArray")
    public void openJDKHashCodeDoubleArray() {
        java.util.Arrays.hashCode(this.doubleArray);
    }

    /** The OpenJDK {@code Arrays.hashCode(float[])} benchmark. */
    @Benchmark
    @Group("hashCodeFloatArray")
    public void openJDKHashCodeFloatArray() {
        java.util.Arrays.hashCode(this.floatArray);
    }

    /** The OpenJDK {@code Arrays.hashCode(int[])} benchmark. */
    @Benchmark
    @Group("hashCodeIntArray")
    public void openJDKHashCodeIntArray() {
        java.util.Arrays.hashCode(this.intArray);
    }

    /** The OpenJDK {@code Arrays.hashCode(long[])} benchmark. */
    @Benchmark
    @Group("hashCodeLongArray")
    public void openJDKHashCodeLongArray() {
        java.util.Arrays.hashCode(this.longArray);
    }

    /** The OpenJDK {@code Arrays.hashCode(Object[])} benchmark. */
    @Benchmark
    @Group("hashCodeObjectArray")
    public void openJDKHashCodeObjectArray() {
        java.util.Arrays.hashCode(this.objectArray);
    }

    /** The OpenJDK {@code Arrays.hashCode(short[])} benchmark. */
    @Benchmark
    @Group("hashCodeShortArray")
    public void openJDKHashCodeShortArray() {
        java.util.Arrays.hashCode(this.shortArray);
    }

    /** The OpenJDK {@code Arrays.toString(boolean[])} benchmark. */
    @Benchmark
    @Group("toStringBooleanArray")
    public void openJDKToStringBooleanArray() {
        java.util.Arrays.toString(this.booleanArray);
    }

    /** The OpenJDK {@code Arrays.toString(byte[])} benchmark. */
    @Benchmark
    @Group("toStringByteArray")
    public void openJDKToStringByteArray() {
        java.util.Arrays.toString(this.byteArray);
    }

    /** The OpenJDK {@code Arrays.toString(char[])} benchmark. */
    @Benchmark
    @Group("toStringCharArray")
    public void openJDKToStringCharArray() {
        java.util.Arrays.toString(this.charArray);
    }

    /** The OpenJDK {@code Arrays.toString(double[])} benchmark. */
    @Benchmark
    @Group("toStringDoubleArray")
    public void openJDKToStringDoubleArray() {
        java.util.Arrays.toString(this.doubleArray);
    }

    /** The OpenJDK {@code Arrays.toString(float[])} benchmark. */
    @Benchmark
    @Group("toStringFloatArray")
    public void openJDKToStringFloatArray() {
        java.util.Arrays.toString(this.floatArray);
    }

    /** The OpenJDK {@code Arrays.toString(int[])} benchmark. */
    @Benchmark
    @Group("toStringIntArray")
    public void openJDKToStringIntArray() {
        java.util.Arrays.toString(this.intArray);
    }

    /** The OpenJDK {@code Arrays.toString(long[])} benchmark. */
    @Benchmark
    @Group("toStringLongArray")
    public void openJDKToStringLongArray() {
        java.util.Arrays.toString(this.longArray);
    }

    /** The OpenJDK {@code Arrays.toString(Object[])} benchmark. */
    @Benchmark
    @Group("toStringObjectArray")
    public void openJDKToStringObjectArray() {
        java.util.Arrays.toString(this.objectArray);
    }

    /** The OpenJDK {@code Arrays.toString(short[])} benchmark. */
    @Benchmark
    @Group("toStringShortArray")
    public void openJDKToStringShortArray() {
        java.util.Arrays.toString(this.shortArray);
    }

    /** The setup method of {@link Benchmarks}. */
    @Setup
    public void setup() {
        this.booleanArray = new boolean[this.size];
        this.byteArray = new byte[this.size];
        this.charArray = new char[this.size];
        this.doubleArray = new double[this.size];
        this.floatArray = new float[this.size];
        this.intArray = new int[this.size];
        this.longArray = new long[this.size];
        this.objectArray = new Object[this.size];
        this.shortArray = new short[this.size];
        for (int index = 0; index < this.size; index += 1) {
            this.booleanArray[index] = RANGE_BOOLEAN_ARRAY[index % RANGE_BOOLEAN_ARRAY.length];
            this.byteArray[index] = RANGE_BYTE_ARRAY[index % RANGE_BYTE_ARRAY.length];
            this.charArray[index] = RANGE_CHAR_ARRAY[index % RANGE_CHAR_ARRAY.length];
            this.doubleArray[index] = RANGE_DOUBLE_ARRAY[index % RANGE_DOUBLE_ARRAY.length];
            this.floatArray[index] = RANGE_FLOAT_ARRAY[index % RANGE_FLOAT_ARRAY.length];
            this.intArray[index] = RANGE_INT_ARRAY[index % RANGE_INT_ARRAY.length];
            this.longArray[index] = RANGE_LONG_ARRAY[index % RANGE_LONG_ARRAY.length];
            this.objectArray[index] = RANGE_OBJECT_ARRAY[index % RANGE_OBJECT_ARRAY.length];
            this.shortArray[index] = RANGE_SHORT_ARRAY[index % RANGE_SHORT_ARRAY.length];
        }
    }
}
