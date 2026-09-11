package edu.marywood.util;
/**
 * Defines {@link Arrays}.
 *
 * @author William DiNoia
 */
public class Arrays {
    /**
     * Converts a {@code boolean[]} to a {@link String}.
     *
     * @param booleanArray {@code boolean[]}
     * @return {@link String}
     */
    public static String toString(boolean[] booleanArray) {
        String string;
        if (booleanArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[booleanArray.length];
            for (int index = 0; index < booleanArray.length; index += 1) {
                stringArray[index] = Boolean.toString(booleanArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
    /**
     * Converts a {@code byte[]} to a {@link String}.
     *
     * @param byteArray {@code byte[]}
     * @return {@link String}
     */
    public static String toString(byte[] byteArray) {
        String string;
        if (byteArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[byteArray.length];
            for (int index = 0; index < byteArray.length; index += 1) {
                stringArray[index] = Byte.toString(byteArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
    /**
     * Converts a {@code char[]} to a {@link String}.
     *
     * @param charArray {@code char[]}
     * @return {@link String}
     */
    public static String toString(char[] charArray) {
        String string;
        if (charArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[charArray.length];
            for (int index = 0; index < charArray.length; index += 1) {
                stringArray[index] = Character.toString(charArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
    /**
     * Converts a {@code double[]} to a {@link String}.
     *
     * @param doubleArray {@code double[]}
     * @return {@link String}
     */
    public static String toString(double[] doubleArray) {
        String string;
        if (doubleArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[doubleArray.length];
            for (int index = 0; index < doubleArray.length; index += 1) {
                stringArray[index] = Double.toString(doubleArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
    /**
     * Converts a {@code float[]} to a {@link String}.
     *
     * @param floatArray {@code float[]}
     * @return {@link String}
     */
    public static String toString(float[] floatArray) {
        String string;
        if (floatArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[floatArray.length];
            for (int index = 0; index < floatArray.length; index += 1) {
                stringArray[index] = Float.toString(floatArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
    /**
     * Converts a {@code int[]} to a {@link String}.
     *
     * @param intArray {@code int[]}
     * @return {@link String}
     */
    public static String toString(int[] intArray) {
        String string;
        if (intArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[intArray.length];
            for (int index = 0; index < intArray.length; index += 1) {
                stringArray[index] = Integer.toString(intArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
    /**
     * Converts a {@code long[]} to a {@link String}.
     *
     * @param longArray {@code long[]}
     * @return {@link String}
     */
    public static String toString(long[] longArray) {
        String string;
        if (longArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[longArray.length];
            for (int index = 0; index < longArray.length; index += 1) {
                stringArray[index] = Long.toString(longArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
}
