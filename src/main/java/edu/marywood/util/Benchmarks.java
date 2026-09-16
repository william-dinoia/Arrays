package edu.marywood.util;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Defines {@link Benchmarks}.
 *
 * @author William DiNoia
 */
@State(Scope.Group)
@BenchmarkMode(Mode.AverageTime)
@Fork(value = 2)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 2)
@Warmup(iterations = 2)
public class Benchmarks {

    @Param("1000")
    private static int size;

    private boolean[] booleanArray;
    private byte[] byteArray;
    private char[] charArray;
    private double[] doubleArray;
    private float[] floatArray;
    private int[] intArray;
    private long[] longArray;
    private short[] shortArray;

    /**
     * The main method of {@link Benchmarks}.
     *
     * @param stringArray {@link String}{@code []}
     */
    public static void main(String[] stringArray) throws RunnerException {
        Options options = new OptionsBuilder().include(Benchmarks.class.getSimpleName()).build();
        Runner runner = new Runner(options);
        runner.run();
    }

    /** The setup method of {@link Benchmarks}. */
    @Setup
    public void setup() {
        booleanArray = new boolean[size];
        byteArray = new byte[size];
        charArray = new char[size];
        doubleArray = new double[size];
        for (int index = 0; index < size; index += 1) {
            booleanArray[index] = false;
            byteArray[index] = Byte.MIN_VALUE;
            charArray[index] = Character.MIN_VALUE;
            doubleArray[index] = Double.MIN_VALUE;
        }
    }

    /** Marywood toString(boolean[]) Benchmark. */
    @Benchmark
    @Group("toStringBooleanArray")
    public void marywoodToStringBooleanArray() {
        edu.marywood.util.Arrays.toString(booleanArray);
    }

    /** OpenJDK toString(boolean[]) Benchmark. */
    @Benchmark
    @Group("toStringBooleanArray")
    public void openJDKToStringBooleanArray() {
        java.util.Arrays.toString(booleanArray);
    }

    /** Marywood toString(byte[]) Benchmark. */
    @Benchmark
    @Group("toStringByteArray")
    public void marywoodToStringByteArray() {
        edu.marywood.util.Arrays.toString(byteArray);
    }

    /** OpenJDK toString(byte[]) Benchmark. */
    @Benchmark
    @Group("toStringByteArray")
    public void openJDKToStringByteArray() {
        java.util.Arrays.toString(byteArray);
    }

    /** Marywood toString(char[]) Benchmark. */
    @Benchmark
    @Group("toStringCharArray")
    public void marywoodToStringCharArray() {
        edu.marywood.util.Arrays.toString(charArray);
    }

    /** OpenJDK toString(char[]) Benchmark. */
    @Benchmark
    @Group("toStringCharArray")
    public void openJDKToStringCharArray() {
        java.util.Arrays.toString(charArray);
    }

    /** Marywood toString(double[]) Benchmark. */
    @Benchmark
    @Group("toStringDoubleArray")
    public void marywoodToStringDoubleArray() {
        edu.marywood.util.Arrays.toString(doubleArray);
    }

    /** OpenJDK toString(double[]) Benchmark. */
    @Benchmark
    @Group("toStringDoubleArray")
    public void openJDKToStringDoubleArray() {
        java.util.Arrays.toString(doubleArray);
    }

    /** Marywood toString(float[]) Benchmark. */
    @Benchmark
    @Group("toStringFloatArray")
    public void marywoodToStringFloatArray() {
        edu.marywood.util.Arrays.toString(floatArray);
    }

    /** OpenJDK toString(float[]) Benchmark. */
    @Benchmark
    @Group("toStringFloatArray")
    public void openJDKToStringFloatArray() {
        java.util.Arrays.toString(floatArray);
    }

    /** Marywood toString(int[]) Benchmark. */
    @Benchmark
    @Group("toStringIntArray")
    public void marywoodToStringIntArray() {
        edu.marywood.util.Arrays.toString(intArray);
    }

    /** OpenJDK toString(int[]) Benchmark. */
    @Benchmark
    @Group("toStringIntArray")
    public void openJDKToStringIntArray() {
        java.util.Arrays.toString(intArray);
    }

    /** Marywood toString(long[]) Benchmark. */
    @Benchmark
    @Group("toStringLongArray")
    public void marywoodToStringLongArray() {
        edu.marywood.util.Arrays.toString(longArray);
    }

    /** OpenJDK toString(long[]) Benchmark. */
    @Benchmark
    @Group("toStringLongArray")
    public void openJDKToStringLongArray() {
        java.util.Arrays.toString(longArray);
    }
}
