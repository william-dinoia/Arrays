package edu.marywood.util;

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

    @Param({"0", "1", "10", "100", "1000", "10000", "100000"})
    public int size;

    private boolean[] booleanArray;
    private byte[] byteArray;
    private char[] charArray;
    private double[] doubleArray;
    private float[] floatArray;
    private int[] intArray;
    private long[] longArray;
    private Object[] objectArray;
    private short[] shortArray;

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

    /** The Marywood deepHashCode(Object[]) Benchmark. */
    @Benchmark
    @Group("deepHashCodeObjectArray")
    public void marywoodDeepHashCodeObjectArray() {
        edu.marywood.util.Arrays.deepHashCode(this.objectArray);
    }

    /** The Marywood deepToString(Object[]) Benchmark. */
    @Benchmark
    @Group("deepToStringObjectArray")
    public void marywoodDeepToStringObjectArray() {
        edu.marywood.util.Arrays.deepToString(this.objectArray);
    }

    /** The Marywood hashCode(boolean[]) Benchmark. */
    @Benchmark
    @Group("hashCodeBooleanArray")
    public void marywoodHashCodeBooleanArray() {
        edu.marywood.util.Arrays.hashCode(this.booleanArray);
    }

    /** The Marywood hashCode(byte[]) Benchmark. */
    @Benchmark
    @Group("hashCodeByteArray")
    public void marywoodHashCodeByteArray() {
        edu.marywood.util.Arrays.hashCode(this.byteArray);
    }

    /** The Marywood hashCode(char[]) Benchmark. */
    @Benchmark
    @Group("hashCodeCharArray")
    public void marywoodHashCodeCharArray() {
        edu.marywood.util.Arrays.hashCode(this.charArray);
    }

    /** The Marywood hashCode(double[]) Benchmark. */
    @Benchmark
    @Group("hashCodeDoubleArray")
    public void marywoodHashCodeDoubleArray() {
        edu.marywood.util.Arrays.hashCode(this.doubleArray);
    }

    /** The Marywood hashCode(float[]) Benchmark. */
    @Benchmark
    @Group("hashCodeFloatArray")
    public void marywoodHashCodeFloatArray() {
        edu.marywood.util.Arrays.hashCode(this.floatArray);
    }

    /** The Marywood hashCode(int[]) Benchmark. */
    @Benchmark
    @Group("hashCodeIntArray")
    public void marywoodHashCodeIntArray() {
        edu.marywood.util.Arrays.hashCode(this.intArray);
    }

    /** The Marywood hashCode(long[]) Benchmark. */
    @Benchmark
    @Group("hashCodeLongArray")
    public void marywoodHashCodeLongArray() {
        edu.marywood.util.Arrays.hashCode(this.longArray);
    }

    /** The Marywood hashCode(Object[]) Benchmark. */
    @Benchmark
    @Group("hashCodeObjectArray")
    public void marywoodHashCodeObjectArray() {
        edu.marywood.util.Arrays.hashCode(this.objectArray);
    }

    /** The Marywood hashCode(short[]) Benchmark. */
    @Benchmark
    @Group("hashCodeShortArray")
    public void marywoodHashCodeShortArray() {
        edu.marywood.util.Arrays.hashCode(this.shortArray);
    }

    /** The Marywood toString(boolean[]) Benchmark. */
    @Benchmark
    @Group("toStringBooleanArray")
    public void marywoodToStringBooleanArray() {
        edu.marywood.util.Arrays.toString(this.booleanArray);
    }

    /** The Marywood toString(byte[]) Benchmark. */
    @Benchmark
    @Group("toStringByteArray")
    public void marywoodToStringByteArray() {
        edu.marywood.util.Arrays.toString(this.byteArray);
    }

    /** The Marywood toString(char[]) Benchmark. */
    @Benchmark
    @Group("toStringCharArray")
    public void marywoodToStringCharArray() {
        edu.marywood.util.Arrays.toString(this.charArray);
    }

    /** The Marywood toString(double[]) Benchmark. */
    @Benchmark
    @Group("toStringDoubleArray")
    public void marywoodToStringDoubleArray() {
        edu.marywood.util.Arrays.toString(this.doubleArray);
    }

    /** The Marywood toString(float[]) Benchmark. */
    @Benchmark
    @Group("toStringFloatArray")
    public void marywoodToStringFloatArray() {
        edu.marywood.util.Arrays.toString(this.floatArray);
    }

    /** The Marywood toString(int[]) Benchmark. */
    @Benchmark
    @Group("toStringIntArray")
    public void marywoodToStringIntArray() {
        edu.marywood.util.Arrays.toString(this.intArray);
    }

    /** The Marywood toString(long[]) Benchmark. */
    @Benchmark
    @Group("toStringLongArray")
    public void marywoodToStringLongArray() {
        edu.marywood.util.Arrays.toString(this.longArray);
    }

    /** The Marywood toString(Object[]) Benchmark. */
    @Benchmark
    @Group("toStringObjectArray")
    public void marywoodToStringObjectArray() {
        edu.marywood.util.Arrays.toString(this.objectArray);
    }

    /** The Marywood toString(short[]) Benchmark. */
    @Benchmark
    @Group("toStringShortArray")
    public void marywoodToStringShortArray() {
        edu.marywood.util.Arrays.toString(this.shortArray);
    }

    /** The OpenJDK deepHashCode(Object[]) Benchmark. */
    @Benchmark
    @Group("deepHashCodeObjectArray")
    public void openJDKDeepHashCodeObjectArray() {
        java.util.Arrays.deepHashCode(this.objectArray);
    }

    /** The OpenJDK deepToString(Object[]) Benchmark. */
    @Benchmark
    @Group("deepToStringObjectArray")
    public void openJDKDeepToStringObjectArray() {
        java.util.Arrays.deepToString(this.objectArray);
    }

    /** The OpenJDK hashCode(boolean[]) Benchmark. */
    @Benchmark
    @Group("hashCodeBooleanArray")
    public void openJDKHashCodeBooleanArray() {
        java.util.Arrays.hashCode(this.booleanArray);
    }

    /** The OpenJDK hashCode(byte[]) Benchmark. */
    @Benchmark
    @Group("hashCodeByteArray")
    public void openJDKHashCodeByteArray() {
        java.util.Arrays.hashCode(this.byteArray);
    }

    /** The OpenJDK hashCode(char[]) Benchmark. */
    @Benchmark
    @Group("hashCodeCharArray")
    public void openJDKHashCodeCharArray() {
        java.util.Arrays.hashCode(this.charArray);
    }

    /** OpenJDK hashCode(double[]) Benchmark. */
    @Benchmark
    @Group("hashCodeDoubleArray")
    public void openJDKHashCodeDoubleArray() {
        java.util.Arrays.hashCode(doubleArray);
    }

    /** OpenJDK hashCode(float[]) Benchmark. */
    @Benchmark
    @Group("hashCodeFloatArray")
    public void openJDKHashCodeFloatArray() {
        java.util.Arrays.hashCode(floatArray);
    }

    /** OpenJDK hashCode(int[]) Benchmark. */
    @Benchmark
    @Group("hashCodeIntArray")
    public void openJDKHashCodeIntArray() {
        java.util.Arrays.hashCode(intArray);
    }

    /** OpenJDK hashCode(long[]) Benchmark. */
    @Benchmark
    @Group("hashCodeLongArray")
    public void openJDKHashCodeLongArray() {
        java.util.Arrays.hashCode(longArray);
    }

    /** OpenJDK hashCode(Object[]) Benchmark. */
    @Benchmark
    @Group("hashCodeObjectArray")
    public void openJDKHashCodeObjectArray() {
        java.util.Arrays.hashCode(objectArray);
    }

    /** OpenJDK hashCode(short[]) Benchmark. */
    @Benchmark
    @Group("hashCodeShortArray")
    public void openJDKHashCodeShortArray() {
        java.util.Arrays.hashCode(shortArray);
    }

    /** OpenJDK toString(boolean[]) Benchmark. */
    @Benchmark
    @Group("toStringBooleanArray")
    public void openJDKToStringBooleanArray() {
        java.util.Arrays.toString(booleanArray);
    }

    /** OpenJDK toString(byte[]) Benchmark. */
    @Benchmark
    @Group("toStringByteArray")
    public void openJDKToStringByteArray() {
        java.util.Arrays.toString(byteArray);
    }

    /** OpenJDK toString(char[]) Benchmark. */
    @Benchmark
    @Group("toStringCharArray")
    public void openJDKToStringCharArray() {
        java.util.Arrays.toString(charArray);
    }

    /** OpenJDK toString(double[]) Benchmark. */
    @Benchmark
    @Group("toStringDoubleArray")
    public void openJDKToStringDoubleArray() {
        java.util.Arrays.toString(doubleArray);
    }

    /** OpenJDK toString(float[]) Benchmark. */
    @Benchmark
    @Group("toStringFloatArray")
    public void openJDKToStringFloatArray() {
        java.util.Arrays.toString(floatArray);
    }

    /** OpenJDK toString(int[]) Benchmark. */
    @Benchmark
    @Group("toStringIntArray")
    public void openJDKToStringIntArray() {
        java.util.Arrays.toString(intArray);
    }

    /** OpenJDK toString(long[]) Benchmark. */
    @Benchmark
    @Group("toStringLongArray")
    public void openJDKToStringLongArray() {
        java.util.Arrays.toString(longArray);
    }

    /** OpenJDK toString(Object[]) Benchmark. */
    @Benchmark
    @Group("toStringObjectArray")
    public void openJDKToStringObjectArray() {
        java.util.Arrays.toString(objectArray);
    }

    /** OpenJDK toString(short[]) Benchmark. */
    @Benchmark
    @Group("toStringShortArray")
    public void openJDKToStringShortArray() {
        java.util.Arrays.toString(shortArray);
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
            this.booleanArray[index] = rangeBooleanArray[index % rangeBooleanArray.length];
            this.byteArray[index] = rangeByteArray[index % rangeByteArray.length];
            this.charArray[index] = rangeCharArray[index % rangeCharArray.length];
            this.doubleArray[index] = rangeDoubleArray[index % rangeDoubleArray.length];
            this.floatArray[index] = rangeFloatArray[index % rangeFloatArray.length];
            this.intArray[index] = rangeIntArray[index % rangeIntArray.length];
            this.longArray[index] = rangeLongArray[index % rangeLongArray.length];
            this.objectArray[index] = rangeObjectArray[index % rangeObjectArray.length];
            this.shortArray[index] = rangeShortArray[index % rangeShortArray.length];
        }
    }
}
