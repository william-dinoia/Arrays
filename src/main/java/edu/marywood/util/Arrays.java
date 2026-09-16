package edu.marywood.util;
/**
 * Defines {@link Arrays}.
 *
 * @author William DiNoia
 */
public class Arrays {
    private static final char[] DELIMITER = {',', ' '};
    private static final char LEFT_SQUARE_BRACKET = '[';
    private static final String NULL = "null";
    private static final char RIGHT_SQUARE_BRACKET = ']';
    /**
     * Converts a {@code boolean[]} to a {@link String}.
     *
     * @param booleanArray {@code boolean[]}
     * @return {@link String}
     */
    public static String toString(boolean[] booleanArray) {
        if (booleanArray == null) {
            return NULL;
        } else {
            StringBuilder stringBuilder = new StringBuilder().append(LEFT_SQUARE_BRACKET);
            switch (booleanArray.length) {
                case 0:
                    break;
                case 1:
                    stringBuilder.append(booleanArray[0]);
                    break;
                default:
                    stringBuilder.append(booleanArray[0]);
                    for (int index = 1; index < booleanArray.length; index += 1) {
                        stringBuilder.append(DELIMITER).append(booleanArray[index]);
                    }
                    break;
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }
    /**
     * Converts a {@code byte[]} to a {@link String}.
     *
     * @param byteArray {@code byte[]}
     * @return {@link String}
     */
    public static String toString(byte[] byteArray) {
        if (byteArray == null) {
            return NULL;
        } else {
            StringBuilder stringBuilder = new StringBuilder().append(LEFT_SQUARE_BRACKET);
            switch (byteArray.length) {
                case 0:
                    break;
                case 1:
                    stringBuilder.append(byteArray[0]);
                    break;
                default:
                    stringBuilder.append(byteArray[0]);
                    for (int index = 1; index < byteArray.length; index += 1) {
                        stringBuilder.append(DELIMITER).append(byteArray[index]);
                    }
                    break;
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
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
            return NULL;
        } else {
            StringBuilder stringBuilder = new StringBuilder().append(LEFT_SQUARE_BRACKET);
            switch (charArray.length) {
                case 0:
                    break;
                case 1:
                    stringBuilder.append(charArray[0]);
                    break;
                default:
                    stringBuilder.append(charArray[0]);
                    for (int index = 1; index < charArray.length; index += 1) {
                        stringBuilder.append(DELIMITER).append(charArray[index]);
                    }
                    break;
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
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
    /**
     * Converts a {@code short[]} to a {@link String}.
     *
     * @param shortArray {@code short[]}
     * @return {@link String}
     */
    public static String toString(short[] shortArray) {
        String string;
        if (shortArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[shortArray.length];
            for (int index = 0; index < shortArray.length; index += 1) {
                stringArray[index] = Short.toString(shortArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
}
