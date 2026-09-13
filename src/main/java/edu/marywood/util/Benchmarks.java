package edu.marywood.util;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
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
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class Benchmarks {
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
        Options options =
                new OptionsBuilder().include(Benchmarks.class.getSimpleName()).build();
        Runner runner = new Runner(options);
        runner.run();
    }
    /**
     * The setup method of {@link Benchmarks}.
     */
    @Setup
    public void setup() {
        booleanArray = new boolean[100];
        for (int index = 0; index < booleanArray.length; index += 1) {
            booleanArray[index] = false;
        }
    }
    /**
     * Marywood toString(boolean[]) Benchmark.
     */
    @Benchmark
    @Group("toStringBooleanArray")
    public void marywoodToStringBooleanArray() {
        edu.marywood.util.Arrays.toString(booleanArray);
    }
    /**
     * OpenJDK toString(boolean[]) Benchmark.
     */
    @Benchmark
    @Group("toStringBooleanArray")
    public void openJDKToStringBooleanArray() {
        java.util.Arrays.toString(booleanArray);
    }
}
